/*
Copyright 2022 The Koordinator Authors.

Licensed under the Apache License, Version 2.0 (the "License");
you may not use this file except in compliance with the License.
You may obtain a copy of the License at

    http://www.apache.org/licenses/LICENSE-2.0

Unless required by applicable law or agreed to in writing, software
distributed under the License is distributed on an "AS IS" BASIS,
WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
See the License for the specific language governing permissions and
limitations under the License.
*/

package sh.koordinator.scheduling.models;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;

import io.kubernetes.client.custom.Quantity;
import io.kubernetes.client.openapi.ApiClient;
import io.kubernetes.client.openapi.models.V1Container;
import io.kubernetes.client.openapi.models.V1ObjectMeta;
import io.kubernetes.client.openapi.models.V1PodSpec;
import io.kubernetes.client.openapi.models.V1PodTemplateSpec;
import io.kubernetes.client.openapi.models.V1ResourceRequirements;
import io.kubernetes.client.util.Config;
import io.kubernetes.client.util.generic.GenericKubernetesApi;
import io.kubernetes.client.util.generic.KubernetesApiResponse;
import org.junit.Test;
import sh.koordinator.scheduling.models.V1alpha1ReservationSpec.AllocatePolicyEnum;

public class V1alpha1ReservationTest {
    private static final String API_GROUP = "scheduling.koordinator.sh";
    private static final String API_VERSION = "v1alpha1";
    private static final String RESOURCE_PLURAL = "reservations";
    private static final String API_VERSION_DETAIL = API_GROUP + "/" + API_VERSION;
    private static final String API_KIND = "Reservation";

    @Test
    public void testCreateReservation() throws IOException {
        V1ObjectMeta objectMeta = new V1ObjectMeta().name("test-reservation");
        V1alpha1ReservationSpecOwners owners = new V1alpha1ReservationSpecOwners()
            .labelSelector(
                new V1alpha1ReservationSpecLabelSelector()
                    .matchLabels(
                        new HashMap<String, String>(){{
                            put("app", "test");
                        }}
                    )
            );
        List<V1Container> containerList = new ArrayList<>(
            Collections.singletonList(
                new V1Container()
                    .name("main")
                    .resources(
                        new V1ResourceRequirements()
                            .limits(
                                new HashMap<String, Quantity>() {{
                                    put("cpu", Quantity.fromString("2"));
                                    put("memory", Quantity.fromString("4Gi"));
                                }}
                            )
                    )
            )
        );
        V1alpha1ReservationSpec reservationSpec = new V1alpha1ReservationSpec()
            .allocateOnce(false)
            .addOwnersItem(owners)
            .allocatePolicy(AllocatePolicyEnum.RESTRICTED)
            .template(new V1PodTemplateSpec().spec(new V1PodSpec().containers(containerList)));
        V1alpha1Reservation reservation = new V1alpha1Reservation()
            .apiVersion(API_VERSION_DETAIL)
            .kind(API_KIND)
            .metadata(objectMeta)
            .spec(reservationSpec);

        ApiClient apiClient = Config.defaultClient();
        GenericKubernetesApi<V1alpha1Reservation, V1alpha1ReservationList> reservationClient = new GenericKubernetesApi<>(
            V1alpha1Reservation.class,
            V1alpha1ReservationList.class,
            API_GROUP,
            API_VERSION,
            RESOURCE_PLURAL,
            apiClient);
        KubernetesApiResponse<V1alpha1Reservation> response = reservationClient.create(reservation);
        System.out.println(response.getStatus());
        System.out.println(response.getObject());
        assert reservation.getMetadata() != null;
        reservationClient.delete(reservation.getMetadata().getName());
    }
}