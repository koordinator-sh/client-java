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

/**
 * V1alpha1PodMigrationJobStatusConditions
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2023-07-17T16:51:22.964Z[Etc/UTC]")
public class V1alpha1PodMigrationJobStatusConditions {
  public static final String SERIALIZED_NAME_LAST_PROBE_TIME = "lastProbeTime";
  @SerializedName(SERIALIZED_NAME_LAST_PROBE_TIME)
  private Object lastProbeTime;

  public static final String SERIALIZED_NAME_LAST_TRANSITION_TIME = "lastTransitionTime";
  @SerializedName(SERIALIZED_NAME_LAST_TRANSITION_TIME)
  private Object lastTransitionTime;

  public static final String SERIALIZED_NAME_MESSAGE = "message";
  @SerializedName(SERIALIZED_NAME_MESSAGE)
  private String message;

  public static final String SERIALIZED_NAME_REASON = "reason";
  @SerializedName(SERIALIZED_NAME_REASON)
  private String reason;

  public static final String SERIALIZED_NAME_STATUS = "status";
  @SerializedName(SERIALIZED_NAME_STATUS)
  private String status;

  public static final String SERIALIZED_NAME_TYPE = "type";
  @SerializedName(SERIALIZED_NAME_TYPE)
  private String type;


  public V1alpha1PodMigrationJobStatusConditions lastProbeTime(Object lastProbeTime) {
    
    this.lastProbeTime = lastProbeTime;
    return this;
  }

   /**
   * Last time we probed the condition.
   * @return lastProbeTime
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Last time we probed the condition.")

  public Object getLastProbeTime() {
    return lastProbeTime;
  }


  public void setLastProbeTime(Object lastProbeTime) {
    this.lastProbeTime = lastProbeTime;
  }


  public V1alpha1PodMigrationJobStatusConditions lastTransitionTime(Object lastTransitionTime) {
    
    this.lastTransitionTime = lastTransitionTime;
    return this;
  }

   /**
   * Last time the condition transitioned from one status to another.
   * @return lastTransitionTime
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Last time the condition transitioned from one status to another.")

  public Object getLastTransitionTime() {
    return lastTransitionTime;
  }


  public void setLastTransitionTime(Object lastTransitionTime) {
    this.lastTransitionTime = lastTransitionTime;
  }


  public V1alpha1PodMigrationJobStatusConditions message(String message) {
    
    this.message = message;
    return this;
  }

   /**
   * Human-readable message indicating details about last transition.
   * @return message
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Human-readable message indicating details about last transition.")

  public String getMessage() {
    return message;
  }


  public void setMessage(String message) {
    this.message = message;
  }


  public V1alpha1PodMigrationJobStatusConditions reason(String reason) {
    
    this.reason = reason;
    return this;
  }

   /**
   * Unique, one-word, CamelCase reason for the condition&#39;s last transition.
   * @return reason
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Unique, one-word, CamelCase reason for the condition's last transition.")

  public String getReason() {
    return reason;
  }


  public void setReason(String reason) {
    this.reason = reason;
  }


  public V1alpha1PodMigrationJobStatusConditions status(String status) {
    
    this.status = status;
    return this;
  }

   /**
   * Status is the status of the condition. Can be True, False, Unknown.
   * @return status
  **/
  @ApiModelProperty(required = true, value = "Status is the status of the condition. Can be True, False, Unknown.")

  public String getStatus() {
    return status;
  }


  public void setStatus(String status) {
    this.status = status;
  }


  public V1alpha1PodMigrationJobStatusConditions type(String type) {
    
    this.type = type;
    return this;
  }

   /**
   * Type is the type of the condition.
   * @return type
  **/
  @ApiModelProperty(required = true, value = "Type is the type of the condition.")

  public String getType() {
    return type;
  }


  public void setType(String type) {
    this.type = type;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    V1alpha1PodMigrationJobStatusConditions v1alpha1PodMigrationJobStatusConditions = (V1alpha1PodMigrationJobStatusConditions) o;
    return Objects.equals(this.lastProbeTime, v1alpha1PodMigrationJobStatusConditions.lastProbeTime) &&
        Objects.equals(this.lastTransitionTime, v1alpha1PodMigrationJobStatusConditions.lastTransitionTime) &&
        Objects.equals(this.message, v1alpha1PodMigrationJobStatusConditions.message) &&
        Objects.equals(this.reason, v1alpha1PodMigrationJobStatusConditions.reason) &&
        Objects.equals(this.status, v1alpha1PodMigrationJobStatusConditions.status) &&
        Objects.equals(this.type, v1alpha1PodMigrationJobStatusConditions.type);
  }

  @Override
  public int hashCode() {
    return Objects.hash(lastProbeTime, lastTransitionTime, message, reason, status, type);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class V1alpha1PodMigrationJobStatusConditions {\n");
    sb.append("    lastProbeTime: ").append(toIndentedString(lastProbeTime)).append("\n");
    sb.append("    lastTransitionTime: ").append(toIndentedString(lastTransitionTime)).append("\n");
    sb.append("    message: ").append(toIndentedString(message)).append("\n");
    sb.append("    reason: ").append(toIndentedString(reason)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
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
