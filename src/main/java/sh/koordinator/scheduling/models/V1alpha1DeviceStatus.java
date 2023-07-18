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
import sh.koordinator.scheduling.models.V1alpha1DeviceStatusAllocations;

/**
 * V1alpha1DeviceStatus
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2023-07-17T16:52:33.676Z[Etc/UTC]")
public class V1alpha1DeviceStatus {
  public static final String SERIALIZED_NAME_ALLOCATIONS = "allocations";
  @SerializedName(SERIALIZED_NAME_ALLOCATIONS)
  private List<V1alpha1DeviceStatusAllocations> allocations = null;


  public V1alpha1DeviceStatus allocations(List<V1alpha1DeviceStatusAllocations> allocations) {
    
    this.allocations = allocations;
    return this;
  }

  public V1alpha1DeviceStatus addAllocationsItem(V1alpha1DeviceStatusAllocations allocationsItem) {
    if (this.allocations == null) {
      this.allocations = new ArrayList<>();
    }
    this.allocations.add(allocationsItem);
    return this;
  }

   /**
   * Get allocations
   * @return allocations
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public List<V1alpha1DeviceStatusAllocations> getAllocations() {
    return allocations;
  }


  public void setAllocations(List<V1alpha1DeviceStatusAllocations> allocations) {
    this.allocations = allocations;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    V1alpha1DeviceStatus v1alpha1DeviceStatus = (V1alpha1DeviceStatus) o;
    return Objects.equals(this.allocations, v1alpha1DeviceStatus.allocations);
  }

  @Override
  public int hashCode() {
    return Objects.hash(allocations);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class V1alpha1DeviceStatus {\n");
    sb.append("    allocations: ").append(toIndentedString(allocations)).append("\n");
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

