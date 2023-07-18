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
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import sh.koordinator.scheduling.models.V1alpha1ReservationStatusConditions;
import sh.koordinator.scheduling.models.V1alpha1ReservationStatusCurrentOwners;

/**
 * V1alpha1ReservationStatus
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2023-07-17T16:42:15.030Z[Etc/UTC]")
public class V1alpha1ReservationStatus {
  public static final String SERIALIZED_NAME_ALLOCATABLE = "allocatable";
  @SerializedName(SERIALIZED_NAME_ALLOCATABLE)
  private Map<String, Object> allocatable = null;

  public static final String SERIALIZED_NAME_ALLOCATED = "allocated";
  @SerializedName(SERIALIZED_NAME_ALLOCATED)
  private Map<String, Object> allocated = null;

  public static final String SERIALIZED_NAME_CONDITIONS = "conditions";
  @SerializedName(SERIALIZED_NAME_CONDITIONS)
  private List<V1alpha1ReservationStatusConditions> conditions = null;

  public static final String SERIALIZED_NAME_CURRENT_OWNERS = "currentOwners";
  @SerializedName(SERIALIZED_NAME_CURRENT_OWNERS)
  private List<V1alpha1ReservationStatusCurrentOwners> currentOwners = null;

  public static final String SERIALIZED_NAME_NODE_NAME = "nodeName";
  @SerializedName(SERIALIZED_NAME_NODE_NAME)
  private String nodeName;

  public static final String SERIALIZED_NAME_PHASE = "phase";
  @SerializedName(SERIALIZED_NAME_PHASE)
  private String phase;


  public V1alpha1ReservationStatus allocatable(Map<String, Object> allocatable) {
    
    this.allocatable = allocatable;
    return this;
  }

  public V1alpha1ReservationStatus putAllocatableItem(String key, Object allocatableItem) {
    if (this.allocatable == null) {
      this.allocatable = new HashMap<>();
    }
    this.allocatable.put(key, allocatableItem);
    return this;
  }

   /**
   * Resource reserved and allocatable for owners.
   * @return allocatable
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Resource reserved and allocatable for owners.")

  public Map<String, Object> getAllocatable() {
    return allocatable;
  }


  public void setAllocatable(Map<String, Object> allocatable) {
    this.allocatable = allocatable;
  }


  public V1alpha1ReservationStatus allocated(Map<String, Object> allocated) {
    
    this.allocated = allocated;
    return this;
  }

  public V1alpha1ReservationStatus putAllocatedItem(String key, Object allocatedItem) {
    if (this.allocated == null) {
      this.allocated = new HashMap<>();
    }
    this.allocated.put(key, allocatedItem);
    return this;
  }

   /**
   * Resource allocated by current owners.
   * @return allocated
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Resource allocated by current owners.")

  public Map<String, Object> getAllocated() {
    return allocated;
  }


  public void setAllocated(Map<String, Object> allocated) {
    this.allocated = allocated;
  }


  public V1alpha1ReservationStatus conditions(List<V1alpha1ReservationStatusConditions> conditions) {
    
    this.conditions = conditions;
    return this;
  }

  public V1alpha1ReservationStatus addConditionsItem(V1alpha1ReservationStatusConditions conditionsItem) {
    if (this.conditions == null) {
      this.conditions = new ArrayList<>();
    }
    this.conditions.add(conditionsItem);
    return this;
  }

   /**
   * The &#x60;conditions&#x60; indicate the messages of reason why the reservation is still pending.
   * @return conditions
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The `conditions` indicate the messages of reason why the reservation is still pending.")

  public List<V1alpha1ReservationStatusConditions> getConditions() {
    return conditions;
  }


  public void setConditions(List<V1alpha1ReservationStatusConditions> conditions) {
    this.conditions = conditions;
  }


  public V1alpha1ReservationStatus currentOwners(List<V1alpha1ReservationStatusCurrentOwners> currentOwners) {
    
    this.currentOwners = currentOwners;
    return this;
  }

  public V1alpha1ReservationStatus addCurrentOwnersItem(V1alpha1ReservationStatusCurrentOwners currentOwnersItem) {
    if (this.currentOwners == null) {
      this.currentOwners = new ArrayList<>();
    }
    this.currentOwners.add(currentOwnersItem);
    return this;
  }

   /**
   * Current resource owners which allocated the reservation resources.
   * @return currentOwners
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Current resource owners which allocated the reservation resources.")

  public List<V1alpha1ReservationStatusCurrentOwners> getCurrentOwners() {
    return currentOwners;
  }


  public void setCurrentOwners(List<V1alpha1ReservationStatusCurrentOwners> currentOwners) {
    this.currentOwners = currentOwners;
  }


  public V1alpha1ReservationStatus nodeName(String nodeName) {
    
    this.nodeName = nodeName;
    return this;
  }

   /**
   * Name of node the reservation is scheduled on.
   * @return nodeName
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Name of node the reservation is scheduled on.")

  public String getNodeName() {
    return nodeName;
  }


  public void setNodeName(String nodeName) {
    this.nodeName = nodeName;
  }


  public V1alpha1ReservationStatus phase(String phase) {
    
    this.phase = phase;
    return this;
  }

   /**
   * The &#x60;phase&#x60; indicates whether is reservation is waiting for process, available to allocate or failed/expired to get cleanup.
   * @return phase
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The `phase` indicates whether is reservation is waiting for process, available to allocate or failed/expired to get cleanup.")

  public String getPhase() {
    return phase;
  }


  public void setPhase(String phase) {
    this.phase = phase;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    V1alpha1ReservationStatus v1alpha1ReservationStatus = (V1alpha1ReservationStatus) o;
    return Objects.equals(this.allocatable, v1alpha1ReservationStatus.allocatable) &&
        Objects.equals(this.allocated, v1alpha1ReservationStatus.allocated) &&
        Objects.equals(this.conditions, v1alpha1ReservationStatus.conditions) &&
        Objects.equals(this.currentOwners, v1alpha1ReservationStatus.currentOwners) &&
        Objects.equals(this.nodeName, v1alpha1ReservationStatus.nodeName) &&
        Objects.equals(this.phase, v1alpha1ReservationStatus.phase);
  }

  @Override
  public int hashCode() {
    return Objects.hash(allocatable, allocated, conditions, currentOwners, nodeName, phase);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class V1alpha1ReservationStatus {\n");
    sb.append("    allocatable: ").append(toIndentedString(allocatable)).append("\n");
    sb.append("    allocated: ").append(toIndentedString(allocated)).append("\n");
    sb.append("    conditions: ").append(toIndentedString(conditions)).append("\n");
    sb.append("    currentOwners: ").append(toIndentedString(currentOwners)).append("\n");
    sb.append("    nodeName: ").append(toIndentedString(nodeName)).append("\n");
    sb.append("    phase: ").append(toIndentedString(phase)).append("\n");
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

