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

import java.util.Objects;
import java.util.Arrays;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import sh.koordinator.scheduling.models.V1alpha1PodMigrationJobSpecReservationOptionsReservationRef;

/**
 * ReservationOptions defines the Reservation options for migrated Pod
 */
@ApiModel(description = "ReservationOptions defines the Reservation options for migrated Pod")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2023-07-17T16:51:22.964Z[Etc/UTC]")
public class V1alpha1PodMigrationJobSpecReservationOptions {
  public static final String SERIALIZED_NAME_PREEMPTION_OPTIONS = "preemptionOptions";
  @SerializedName(SERIALIZED_NAME_PREEMPTION_OPTIONS)
  private Object preemptionOptions;

  public static final String SERIALIZED_NAME_RESERVATION_REF = "reservationRef";
  @SerializedName(SERIALIZED_NAME_RESERVATION_REF)
  private V1alpha1PodMigrationJobSpecReservationOptionsReservationRef reservationRef;

  public static final String SERIALIZED_NAME_TEMPLATE = "template";
  @SerializedName(SERIALIZED_NAME_TEMPLATE)
  private Object template;


  public V1alpha1PodMigrationJobSpecReservationOptions preemptionOptions(Object preemptionOptions) {
    
    this.preemptionOptions = preemptionOptions;
    return this;
  }

   /**
   * PreemptionOption decides whether to preempt other Pods. The preemption is safe and reserves resources for preempted Pods.
   * @return preemptionOptions
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "PreemptionOption decides whether to preempt other Pods. The preemption is safe and reserves resources for preempted Pods.")

  public Object getPreemptionOptions() {
    return preemptionOptions;
  }


  public void setPreemptionOptions(Object preemptionOptions) {
    this.preemptionOptions = preemptionOptions;
  }


  public V1alpha1PodMigrationJobSpecReservationOptions reservationRef(V1alpha1PodMigrationJobSpecReservationOptionsReservationRef reservationRef) {
    
    this.reservationRef = reservationRef;
    return this;
  }

   /**
   * Get reservationRef
   * @return reservationRef
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public V1alpha1PodMigrationJobSpecReservationOptionsReservationRef getReservationRef() {
    return reservationRef;
  }


  public void setReservationRef(V1alpha1PodMigrationJobSpecReservationOptionsReservationRef reservationRef) {
    this.reservationRef = reservationRef;
  }


  public V1alpha1PodMigrationJobSpecReservationOptions template(Object template) {
    
    this.template = template;
    return this;
  }

   /**
   * Template is the object that describes the Reservation that will be created if not specified ReservationRef
   * @return template
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Template is the object that describes the Reservation that will be created if not specified ReservationRef")

  public Object getTemplate() {
    return template;
  }


  public void setTemplate(Object template) {
    this.template = template;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    V1alpha1PodMigrationJobSpecReservationOptions v1alpha1PodMigrationJobSpecReservationOptions = (V1alpha1PodMigrationJobSpecReservationOptions) o;
    return Objects.equals(this.preemptionOptions, v1alpha1PodMigrationJobSpecReservationOptions.preemptionOptions) &&
        Objects.equals(this.reservationRef, v1alpha1PodMigrationJobSpecReservationOptions.reservationRef) &&
        Objects.equals(this.template, v1alpha1PodMigrationJobSpecReservationOptions.template);
  }

  @Override
  public int hashCode() {
    return Objects.hash(preemptionOptions, reservationRef, template);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class V1alpha1PodMigrationJobSpecReservationOptions {\n");
    sb.append("    preemptionOptions: ").append(toIndentedString(preemptionOptions)).append("\n");
    sb.append("    reservationRef: ").append(toIndentedString(reservationRef)).append("\n");
    sb.append("    template: ").append(toIndentedString(template)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }

}

