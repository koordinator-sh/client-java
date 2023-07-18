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


package sh.koordinator.slo.models;

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
 * CPUQOSCfg stores node-level config of cpu qos
 */
@ApiModel(description = "CPUQOSCfg stores node-level config of cpu qos")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2023-07-17T16:57:54.694Z[Etc/UTC]")
public class V1alpha1NodeSLOSpecResourceQOSStrategyBeClassCpuQOS {
  public static final String SERIALIZED_NAME_ENABLE = "enable";
  @SerializedName(SERIALIZED_NAME_ENABLE)
  private Boolean enable;

  public static final String SERIALIZED_NAME_GROUP_IDENTITY = "groupIdentity";
  @SerializedName(SERIALIZED_NAME_GROUP_IDENTITY)
  private Long groupIdentity;


  public V1alpha1NodeSLOSpecResourceQOSStrategyBeClassCpuQOS enable(Boolean enable) {
    
    this.enable = enable;
    return this;
  }

   /**
   * Enable indicates whether the cpu qos is enabled.
   * @return enable
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Enable indicates whether the cpu qos is enabled.")

  public Boolean getEnable() {
    return enable;
  }


  public void setEnable(Boolean enable) {
    this.enable = enable;
  }


  public V1alpha1NodeSLOSpecResourceQOSStrategyBeClassCpuQOS groupIdentity(Long groupIdentity) {
    
    this.groupIdentity = groupIdentity;
    return this;
  }

   /**
   * group identity value for pods, default &#x3D; 0
   * @return groupIdentity
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "group identity value for pods, default = 0")

  public Long getGroupIdentity() {
    return groupIdentity;
  }


  public void setGroupIdentity(Long groupIdentity) {
    this.groupIdentity = groupIdentity;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    V1alpha1NodeSLOSpecResourceQOSStrategyBeClassCpuQOS v1alpha1NodeSLOSpecResourceQOSStrategyBeClassCpuQOS = (V1alpha1NodeSLOSpecResourceQOSStrategyBeClassCpuQOS) o;
    return Objects.equals(this.enable, v1alpha1NodeSLOSpecResourceQOSStrategyBeClassCpuQOS.enable) &&
        Objects.equals(this.groupIdentity, v1alpha1NodeSLOSpecResourceQOSStrategyBeClassCpuQOS.groupIdentity);
  }

  @Override
  public int hashCode() {
    return Objects.hash(enable, groupIdentity);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class V1alpha1NodeSLOSpecResourceQOSStrategyBeClassCpuQOS {\n");
    sb.append("    enable: ").append(toIndentedString(enable)).append("\n");
    sb.append("    groupIdentity: ").append(toIndentedString(groupIdentity)).append("\n");
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

