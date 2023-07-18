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
import sh.koordinator.scheduling.models.V1alpha1PodMigrationJobSpecDeleteOptions;
import sh.koordinator.scheduling.models.V1alpha1PodMigrationJobSpecPodRef;
import sh.koordinator.scheduling.models.V1alpha1PodMigrationJobSpecReservationOptions;

/**
 * V1alpha1PodMigrationJobSpec
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2023-07-17T16:51:22.964Z[Etc/UTC]")
public class V1alpha1PodMigrationJobSpec {
  public static final String SERIALIZED_NAME_DELETE_OPTIONS = "deleteOptions";
  @SerializedName(SERIALIZED_NAME_DELETE_OPTIONS)
  private V1alpha1PodMigrationJobSpecDeleteOptions deleteOptions;

  public static final String SERIALIZED_NAME_MODE = "mode";
  @SerializedName(SERIALIZED_NAME_MODE)
  private String mode;

  public static final String SERIALIZED_NAME_PAUSED = "paused";
  @SerializedName(SERIALIZED_NAME_PAUSED)
  private Boolean paused;

  public static final String SERIALIZED_NAME_POD_REF = "podRef";
  @SerializedName(SERIALIZED_NAME_POD_REF)
  private V1alpha1PodMigrationJobSpecPodRef podRef;

  public static final String SERIALIZED_NAME_RESERVATION_OPTIONS = "reservationOptions";
  @SerializedName(SERIALIZED_NAME_RESERVATION_OPTIONS)
  private V1alpha1PodMigrationJobSpecReservationOptions reservationOptions;

  public static final String SERIALIZED_NAME_TTL = "ttl";
  @SerializedName(SERIALIZED_NAME_TTL)
  private String ttl;


  public V1alpha1PodMigrationJobSpec deleteOptions(V1alpha1PodMigrationJobSpecDeleteOptions deleteOptions) {
    
    this.deleteOptions = deleteOptions;
    return this;
  }

   /**
   * Get deleteOptions
   * @return deleteOptions
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public V1alpha1PodMigrationJobSpecDeleteOptions getDeleteOptions() {
    return deleteOptions;
  }


  public void setDeleteOptions(V1alpha1PodMigrationJobSpecDeleteOptions deleteOptions) {
    this.deleteOptions = deleteOptions;
  }


  public V1alpha1PodMigrationJobSpec mode(String mode) {
    
    this.mode = mode;
    return this;
  }

   /**
   * Mode represents the operating mode of the Job Default is PodMigrationJobModeReservationFirst
   * @return mode
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Mode represents the operating mode of the Job Default is PodMigrationJobModeReservationFirst")

  public String getMode() {
    return mode;
  }


  public void setMode(String mode) {
    this.mode = mode;
  }


  public V1alpha1PodMigrationJobSpec paused(Boolean paused) {
    
    this.paused = paused;
    return this;
  }

   /**
   * Paused indicates whether the PodMigrationJob should to work or not. Default is false
   * @return paused
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Paused indicates whether the PodMigrationJob should to work or not. Default is false")

  public Boolean getPaused() {
    return paused;
  }


  public void setPaused(Boolean paused) {
    this.paused = paused;
  }


  public V1alpha1PodMigrationJobSpec podRef(V1alpha1PodMigrationJobSpecPodRef podRef) {
    
    this.podRef = podRef;
    return this;
  }

   /**
   * Get podRef
   * @return podRef
  **/
  @ApiModelProperty(required = true, value = "")

  public V1alpha1PodMigrationJobSpecPodRef getPodRef() {
    return podRef;
  }


  public void setPodRef(V1alpha1PodMigrationJobSpecPodRef podRef) {
    this.podRef = podRef;
  }


  public V1alpha1PodMigrationJobSpec reservationOptions(V1alpha1PodMigrationJobSpecReservationOptions reservationOptions) {
    
    this.reservationOptions = reservationOptions;
    return this;
  }

   /**
   * Get reservationOptions
   * @return reservationOptions
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public V1alpha1PodMigrationJobSpecReservationOptions getReservationOptions() {
    return reservationOptions;
  }


  public void setReservationOptions(V1alpha1PodMigrationJobSpecReservationOptions reservationOptions) {
    this.reservationOptions = reservationOptions;
  }


  public V1alpha1PodMigrationJobSpec ttl(String ttl) {
    
    this.ttl = ttl;
    return this;
  }

   /**
   * TTL controls the PodMigrationJob timeout duration.
   * @return ttl
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "TTL controls the PodMigrationJob timeout duration.")

  public String getTtl() {
    return ttl;
  }


  public void setTtl(String ttl) {
    this.ttl = ttl;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    V1alpha1PodMigrationJobSpec v1alpha1PodMigrationJobSpec = (V1alpha1PodMigrationJobSpec) o;
    return Objects.equals(this.deleteOptions, v1alpha1PodMigrationJobSpec.deleteOptions) &&
        Objects.equals(this.mode, v1alpha1PodMigrationJobSpec.mode) &&
        Objects.equals(this.paused, v1alpha1PodMigrationJobSpec.paused) &&
        Objects.equals(this.podRef, v1alpha1PodMigrationJobSpec.podRef) &&
        Objects.equals(this.reservationOptions, v1alpha1PodMigrationJobSpec.reservationOptions) &&
        Objects.equals(this.ttl, v1alpha1PodMigrationJobSpec.ttl);
  }

  @Override
  public int hashCode() {
    return Objects.hash(deleteOptions, mode, paused, podRef, reservationOptions, ttl);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class V1alpha1PodMigrationJobSpec {\n");
    sb.append("    deleteOptions: ").append(toIndentedString(deleteOptions)).append("\n");
    sb.append("    mode: ").append(toIndentedString(mode)).append("\n");
    sb.append("    paused: ").append(toIndentedString(paused)).append("\n");
    sb.append("    podRef: ").append(toIndentedString(podRef)).append("\n");
    sb.append("    reservationOptions: ").append(toIndentedString(reservationOptions)).append("\n");
    sb.append("    ttl: ").append(toIndentedString(ttl)).append("\n");
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

