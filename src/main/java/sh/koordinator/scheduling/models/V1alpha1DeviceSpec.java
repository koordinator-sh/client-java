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
import sh.koordinator.scheduling.models.V1alpha1DeviceSpecDevices;

/**
 * V1alpha1DeviceSpec
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2023-07-17T16:52:33.676Z[Etc/UTC]")
public class V1alpha1DeviceSpec {
  public static final String SERIALIZED_NAME_DEVICES = "devices";
  @SerializedName(SERIALIZED_NAME_DEVICES)
  private List<V1alpha1DeviceSpecDevices> devices = null;


  public V1alpha1DeviceSpec devices(List<V1alpha1DeviceSpecDevices> devices) {
    
    this.devices = devices;
    return this;
  }

  public V1alpha1DeviceSpec addDevicesItem(V1alpha1DeviceSpecDevices devicesItem) {
    if (this.devices == null) {
      this.devices = new ArrayList<>();
    }
    this.devices.add(devicesItem);
    return this;
  }

   /**
   * Get devices
   * @return devices
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public List<V1alpha1DeviceSpecDevices> getDevices() {
    return devices;
  }


  public void setDevices(List<V1alpha1DeviceSpecDevices> devices) {
    this.devices = devices;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    V1alpha1DeviceSpec v1alpha1DeviceSpec = (V1alpha1DeviceSpec) o;
    return Objects.equals(this.devices, v1alpha1DeviceSpec.devices);
  }

  @Override
  public int hashCode() {
    return Objects.hash(devices);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class V1alpha1DeviceSpec {\n");
    sb.append("    devices: ").append(toIndentedString(devices)).append("\n");
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

