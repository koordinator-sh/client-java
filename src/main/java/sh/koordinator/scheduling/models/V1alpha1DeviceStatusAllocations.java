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
import sh.koordinator.scheduling.models.V1alpha1DeviceStatusEntries;

/**
 * V1alpha1DeviceStatusAllocations
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2023-07-17T16:52:33.676Z[Etc/UTC]")
public class V1alpha1DeviceStatusAllocations {
  public static final String SERIALIZED_NAME_ENTRIES = "entries";
  @SerializedName(SERIALIZED_NAME_ENTRIES)
  private List<V1alpha1DeviceStatusEntries> entries = null;

  public static final String SERIALIZED_NAME_TYPE = "type";
  @SerializedName(SERIALIZED_NAME_TYPE)
  private String type;


  public V1alpha1DeviceStatusAllocations entries(List<V1alpha1DeviceStatusEntries> entries) {
    
    this.entries = entries;
    return this;
  }

  public V1alpha1DeviceStatusAllocations addEntriesItem(V1alpha1DeviceStatusEntries entriesItem) {
    if (this.entries == null) {
      this.entries = new ArrayList<>();
    }
    this.entries.add(entriesItem);
    return this;
  }

   /**
   * Get entries
   * @return entries
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public List<V1alpha1DeviceStatusEntries> getEntries() {
    return entries;
  }


  public void setEntries(List<V1alpha1DeviceStatusEntries> entries) {
    this.entries = entries;
  }


  public V1alpha1DeviceStatusAllocations type(String type) {
    
    this.type = type;
    return this;
  }

   /**
   * Get type
   * @return type
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

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
    V1alpha1DeviceStatusAllocations v1alpha1DeviceStatusAllocations = (V1alpha1DeviceStatusAllocations) o;
    return Objects.equals(this.entries, v1alpha1DeviceStatusAllocations.entries) &&
        Objects.equals(this.type, v1alpha1DeviceStatusAllocations.type);
  }

  @Override
  public int hashCode() {
    return Objects.hash(entries, type);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class V1alpha1DeviceStatusAllocations {\n");
    sb.append("    entries: ").append(toIndentedString(entries)).append("\n");
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

