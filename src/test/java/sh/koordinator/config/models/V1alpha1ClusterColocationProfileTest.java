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

package sh.koordinator.config.models;

import java.io.IOException;

import io.kubernetes.client.openapi.ApiClient;
import io.kubernetes.client.openapi.models.V1ObjectMeta;
import io.kubernetes.client.util.Config;
import io.kubernetes.client.util.generic.GenericKubernetesApi;
import io.kubernetes.client.util.generic.KubernetesApiResponse;
import org.junit.Test;
import sh.koordinator.config.models.V1alpha1ClusterColocationProfileSpec.QosClassEnum;

public class V1alpha1ClusterColocationProfileTest {
    private static final String API_GROUP = "config.koordinator.sh";
    private static final String API_VERSION = "v1alpha1";
    private static final String RESOURCE_PLURAL = "clustercolocationprofiles";
    private static final String API_VERSION_DETAIL = API_GROUP + "/" + API_VERSION;
    private static final String API_KIND = "ClusterColocationProfile";

    @Test
    public void testCreateClusterColocationProfile() throws IOException {
        V1ObjectMeta objectMeta = new V1ObjectMeta().name("test-profile");
        V1alpha1ClusterColocationProfileSpec profileSpec = new V1alpha1ClusterColocationProfileSpec()
            .priorityClassName("koord-batch")
            .schedulerName("koord-scheduler")
            .qosClass(QosClassEnum.BE);
        V1alpha1ClusterColocationProfile profile = new V1alpha1ClusterColocationProfile()
            .apiVersion(API_VERSION_DETAIL)
            .kind(API_KIND)
            .metadata(objectMeta)
            .spec(profileSpec);

        ApiClient apiClient = Config.defaultClient();
        GenericKubernetesApi<V1alpha1ClusterColocationProfile, V1alpha1ClusterColocationProfileList> profileClient = new GenericKubernetesApi<>(
            V1alpha1ClusterColocationProfile.class,
            V1alpha1ClusterColocationProfileList.class,
            API_GROUP,
            API_VERSION,
            RESOURCE_PLURAL,
            apiClient);
        KubernetesApiResponse<V1alpha1ClusterColocationProfile> response = profileClient.create(profile);
        System.out.println(response.getStatus());
        System.out.println(response.getObject());
        assert profile.getMetadata() != null;
        profileClient.delete(profile.getMetadata().getName());
    }
}