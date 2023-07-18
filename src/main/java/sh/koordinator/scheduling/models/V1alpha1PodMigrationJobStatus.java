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
import java.util.ArrayList;
import java.util.List;
import sh.koordinator.scheduling.models.V1alpha1PodMigrationJobStatusConditions;
import sh.koordinator.scheduling.models.V1alpha1PodMigrationJobStatusPodRef;
import sh.koordinator.scheduling.models.V1alpha1PodMigrationJobStatusPreemptedPodsRef;
import sh.koordinator.scheduling.models.V1alpha1PodMigrationJobStatusPreemptedPodsReservation;

/**
 * V1alpha1PodMigrationJobStatus
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2023-07-17T16:51:22.964Z[Etc/UTC]")
public class V1alpha1PodMigrationJobStatus {
  public static final String SERIALIZED_NAME_CONDITIONS = "conditions";
  @SerializedName(SERIALIZED_NAME_CONDITIONS)
  private List<V1alpha1PodMigrationJobStatusConditions> conditions = null;

  public static final String SERIALIZED_NAME_MESSAGE = "message";
  @SerializedName(SERIALIZED_NAME_MESSAGE)
  private String message;

  public static final String SERIALIZED_NAME_NODE_NAME = "nodeName";
  @SerializedName(SERIALIZED_NAME_NODE_NAME)
  private String nodeName;

  public static final String SERIALIZED_NAME_PHASE = "phase";
  @SerializedName(SERIALIZED_NAME_PHASE)
  private String phase;

  public static final String SERIALIZED_NAME_POD_REF = "podRef";
  @SerializedName(SERIALIZED_NAME_POD_REF)
  private V1alpha1PodMigrationJobStatusPodRef podRef;

  public static final String SERIALIZED_NAME_PREEMPTED_PODS_REF = "preemptedPodsRef";
  @SerializedName(SERIALIZED_NAME_PREEMPTED_PODS_REF)
  private List<V1alpha1PodMigrationJobStatusPreemptedPodsRef> preemptedPodsRef = null;

  public static final String SERIALIZED_NAME_PREEMPTED_PODS_RESERVATION = "preemptedPodsReservation";
  @SerializedName(SERIALIZED_NAME_PREEMPTED_PODS_RESERVATION)
  private List<V1alpha1PodMigrationJobStatusPreemptedPodsReservation> preemptedPodsReservation = null;

  public static final String SERIALIZED_NAME_REASON = "reason";
  @SerializedName(SERIALIZED_NAME_REASON)
  private String reason;

  public static final String SERIALIZED_NAME_STATUS = "status";
  @SerializedName(SERIALIZED_NAME_STATUS)
  private String status;


  public V1alpha1PodMigrationJobStatus conditions(List<V1alpha1PodMigrationJobStatusConditions> conditions) {
    
    this.conditions = conditions;
    return this;
  }

  public V1alpha1PodMigrationJobStatus addConditionsItem(V1alpha1PodMigrationJobStatusConditions conditionsItem) {
    if (this.conditions == null) {
      this.conditions = new ArrayList<>();
    }
    this.conditions.add(conditionsItem);
    return this;
  }

   /**
   * Conditions records the stats of PodMigrationJob
   * @return conditions
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Conditions records the stats of PodMigrationJob")

  public List<V1alpha1PodMigrationJobStatusConditions> getConditions() {
    return conditions;
  }


  public void setConditions(List<V1alpha1PodMigrationJobStatusConditions> conditions) {
    this.conditions = conditions;
  }


  public V1alpha1PodMigrationJobStatus message(String message) {
    
    this.message = message;
    return this;
  }

   /**
   * Message represents a human-readable message indicating details about why the PodMigrationJob is in this state.
   * @return message
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Message represents a human-readable message indicating details about why the PodMigrationJob is in this state.")

  public String getMessage() {
    return message;
  }


  public void setMessage(String message) {
    this.message = message;
  }


  public V1alpha1PodMigrationJobStatus nodeName(String nodeName) {
    
    this.nodeName = nodeName;
    return this;
  }

   /**
   * NodeName represents the node&#39;s name of migrated Pod
   * @return nodeName
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "NodeName represents the node's name of migrated Pod")

  public String getNodeName() {
    return nodeName;
  }


  public void setNodeName(String nodeName) {
    this.nodeName = nodeName;
  }


  public V1alpha1PodMigrationJobStatus phase(String phase) {
    
    this.phase = phase;
    return this;
  }

   /**
   * PodMigrationJobPhase represents the phase of a PodMigrationJob is a simple, high-level summary of where the PodMigrationJob is in its lifecycle. e.g. Pending/Running/Failed
   * @return phase
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "PodMigrationJobPhase represents the phase of a PodMigrationJob is a simple, high-level summary of where the PodMigrationJob is in its lifecycle. e.g. Pending/Running/Failed")

  public String getPhase() {
    return phase;
  }


  public void setPhase(String phase) {
    this.phase = phase;
  }


  public V1alpha1PodMigrationJobStatus podRef(V1alpha1PodMigrationJobStatusPodRef podRef) {
    
    this.podRef = podRef;
    return this;
  }

   /**
   * Get podRef
   * @return podRef
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public V1alpha1PodMigrationJobStatusPodRef getPodRef() {
    return podRef;
  }


  public void setPodRef(V1alpha1PodMigrationJobStatusPodRef podRef) {
    this.podRef = podRef;
  }


  public V1alpha1PodMigrationJobStatus preemptedPodsRef(List<V1alpha1PodMigrationJobStatusPreemptedPodsRef> preemptedPodsRef) {
    
    this.preemptedPodsRef = preemptedPodsRef;
    return this;
  }

  public V1alpha1PodMigrationJobStatus addPreemptedPodsRefItem(V1alpha1PodMigrationJobStatusPreemptedPodsRef preemptedPodsRefItem) {
    if (this.preemptedPodsRef == null) {
      this.preemptedPodsRef = new ArrayList<>();
    }
    this.preemptedPodsRef.add(preemptedPodsRefItem);
    return this;
  }

   /**
   * PreemptedPodsRef represents the Pods that be preempted
   * @return preemptedPodsRef
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "PreemptedPodsRef represents the Pods that be preempted")

  public List<V1alpha1PodMigrationJobStatusPreemptedPodsRef> getPreemptedPodsRef() {
    return preemptedPodsRef;
  }


  public void setPreemptedPodsRef(List<V1alpha1PodMigrationJobStatusPreemptedPodsRef> preemptedPodsRef) {
    this.preemptedPodsRef = preemptedPodsRef;
  }


  public V1alpha1PodMigrationJobStatus preemptedPodsReservation(List<V1alpha1PodMigrationJobStatusPreemptedPodsReservation> preemptedPodsReservation) {
    
    this.preemptedPodsReservation = preemptedPodsReservation;
    return this;
  }

  public V1alpha1PodMigrationJobStatus addPreemptedPodsReservationItem(V1alpha1PodMigrationJobStatusPreemptedPodsReservation preemptedPodsReservationItem) {
    if (this.preemptedPodsReservation == null) {
      this.preemptedPodsReservation = new ArrayList<>();
    }
    this.preemptedPodsReservation.add(preemptedPodsReservationItem);
    return this;
  }

   /**
   * PreemptedPodsReservations records information about Reservations created due to preemption
   * @return preemptedPodsReservation
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "PreemptedPodsReservations records information about Reservations created due to preemption")

  public List<V1alpha1PodMigrationJobStatusPreemptedPodsReservation> getPreemptedPodsReservation() {
    return preemptedPodsReservation;
  }


  public void setPreemptedPodsReservation(List<V1alpha1PodMigrationJobStatusPreemptedPodsReservation> preemptedPodsReservation) {
    this.preemptedPodsReservation = preemptedPodsReservation;
  }


  public V1alpha1PodMigrationJobStatus reason(String reason) {
    
    this.reason = reason;
    return this;
  }

   /**
   * Reason represents a brief CamelCase message indicating details about why the PodMigrationJob is in this state.
   * @return reason
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Reason represents a brief CamelCase message indicating details about why the PodMigrationJob is in this state.")

  public String getReason() {
    return reason;
  }


  public void setReason(String reason) {
    this.reason = reason;
  }


  public V1alpha1PodMigrationJobStatus status(String status) {
    
    this.status = status;
    return this;
  }

   /**
   * Status represents the current status of PodMigrationJob e.g. ReservationCreated
   * @return status
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Status represents the current status of PodMigrationJob e.g. ReservationCreated")

  public String getStatus() {
    return status;
  }


  public void setStatus(String status) {
    this.status = status;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    V1alpha1PodMigrationJobStatus v1alpha1PodMigrationJobStatus = (V1alpha1PodMigrationJobStatus) o;
    return Objects.equals(this.conditions, v1alpha1PodMigrationJobStatus.conditions) &&
        Objects.equals(this.message, v1alpha1PodMigrationJobStatus.message) &&
        Objects.equals(this.nodeName, v1alpha1PodMigrationJobStatus.nodeName) &&
        Objects.equals(this.phase, v1alpha1PodMigrationJobStatus.phase) &&
        Objects.equals(this.podRef, v1alpha1PodMigrationJobStatus.podRef) &&
        Objects.equals(this.preemptedPodsRef, v1alpha1PodMigrationJobStatus.preemptedPodsRef) &&
        Objects.equals(this.preemptedPodsReservation, v1alpha1PodMigrationJobStatus.preemptedPodsReservation) &&
        Objects.equals(this.reason, v1alpha1PodMigrationJobStatus.reason) &&
        Objects.equals(this.status, v1alpha1PodMigrationJobStatus.status);
  }

  @Override
  public int hashCode() {
    return Objects.hash(conditions, message, nodeName, phase, podRef, preemptedPodsRef, preemptedPodsReservation, reason, status);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class V1alpha1PodMigrationJobStatus {\n");
    sb.append("    conditions: ").append(toIndentedString(conditions)).append("\n");
    sb.append("    message: ").append(toIndentedString(message)).append("\n");
    sb.append("    nodeName: ").append(toIndentedString(nodeName)).append("\n");
    sb.append("    phase: ").append(toIndentedString(phase)).append("\n");
    sb.append("    podRef: ").append(toIndentedString(podRef)).append("\n");
    sb.append("    preemptedPodsRef: ").append(toIndentedString(preemptedPodsRef)).append("\n");
    sb.append("    preemptedPodsReservation: ").append(toIndentedString(preemptedPodsReservation)).append("\n");
    sb.append("    reason: ").append(toIndentedString(reason)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
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

