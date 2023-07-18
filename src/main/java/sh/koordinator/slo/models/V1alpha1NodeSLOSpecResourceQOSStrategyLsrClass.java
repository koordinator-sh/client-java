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
import sh.koordinator.slo.models.V1alpha1NodeSLOSpecResourceQOSStrategyBeClassBlkioQOS;
import sh.koordinator.slo.models.V1alpha1NodeSLOSpecResourceQOSStrategyBeClassCpuQOS;
import sh.koordinator.slo.models.V1alpha1NodeSLOSpecResourceQOSStrategyBeClassMemoryQOS;
import sh.koordinator.slo.models.V1alpha1NodeSLOSpecResourceQOSStrategyBeClassResctrlQOS;

/**
 * ResourceQOS for LSR pods.
 */
@ApiModel(description = "ResourceQOS for LSR pods.")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2023-07-17T16:57:54.694Z[Etc/UTC]")
public class V1alpha1NodeSLOSpecResourceQOSStrategyLsrClass {
  public static final String SERIALIZED_NAME_BLKIO_Q_O_S = "blkioQOS";
  @SerializedName(SERIALIZED_NAME_BLKIO_Q_O_S)
  private V1alpha1NodeSLOSpecResourceQOSStrategyBeClassBlkioQOS blkioQOS;

  public static final String SERIALIZED_NAME_CPU_Q_O_S = "cpuQOS";
  @SerializedName(SERIALIZED_NAME_CPU_Q_O_S)
  private V1alpha1NodeSLOSpecResourceQOSStrategyBeClassCpuQOS cpuQOS;

  public static final String SERIALIZED_NAME_MEMORY_Q_O_S = "memoryQOS";
  @SerializedName(SERIALIZED_NAME_MEMORY_Q_O_S)
  private V1alpha1NodeSLOSpecResourceQOSStrategyBeClassMemoryQOS memoryQOS;

  public static final String SERIALIZED_NAME_RESCTRL_Q_O_S = "resctrlQOS";
  @SerializedName(SERIALIZED_NAME_RESCTRL_Q_O_S)
  private V1alpha1NodeSLOSpecResourceQOSStrategyBeClassResctrlQOS resctrlQOS;


  public V1alpha1NodeSLOSpecResourceQOSStrategyLsrClass blkioQOS(V1alpha1NodeSLOSpecResourceQOSStrategyBeClassBlkioQOS blkioQOS) {
    
    this.blkioQOS = blkioQOS;
    return this;
  }

   /**
   * Get blkioQOS
   * @return blkioQOS
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public V1alpha1NodeSLOSpecResourceQOSStrategyBeClassBlkioQOS getBlkioQOS() {
    return blkioQOS;
  }


  public void setBlkioQOS(V1alpha1NodeSLOSpecResourceQOSStrategyBeClassBlkioQOS blkioQOS) {
    this.blkioQOS = blkioQOS;
  }


  public V1alpha1NodeSLOSpecResourceQOSStrategyLsrClass cpuQOS(V1alpha1NodeSLOSpecResourceQOSStrategyBeClassCpuQOS cpuQOS) {
    
    this.cpuQOS = cpuQOS;
    return this;
  }

   /**
   * Get cpuQOS
   * @return cpuQOS
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public V1alpha1NodeSLOSpecResourceQOSStrategyBeClassCpuQOS getCpuQOS() {
    return cpuQOS;
  }


  public void setCpuQOS(V1alpha1NodeSLOSpecResourceQOSStrategyBeClassCpuQOS cpuQOS) {
    this.cpuQOS = cpuQOS;
  }


  public V1alpha1NodeSLOSpecResourceQOSStrategyLsrClass memoryQOS(V1alpha1NodeSLOSpecResourceQOSStrategyBeClassMemoryQOS memoryQOS) {
    
    this.memoryQOS = memoryQOS;
    return this;
  }

   /**
   * Get memoryQOS
   * @return memoryQOS
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public V1alpha1NodeSLOSpecResourceQOSStrategyBeClassMemoryQOS getMemoryQOS() {
    return memoryQOS;
  }


  public void setMemoryQOS(V1alpha1NodeSLOSpecResourceQOSStrategyBeClassMemoryQOS memoryQOS) {
    this.memoryQOS = memoryQOS;
  }


  public V1alpha1NodeSLOSpecResourceQOSStrategyLsrClass resctrlQOS(V1alpha1NodeSLOSpecResourceQOSStrategyBeClassResctrlQOS resctrlQOS) {
    
    this.resctrlQOS = resctrlQOS;
    return this;
  }

   /**
   * Get resctrlQOS
   * @return resctrlQOS
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public V1alpha1NodeSLOSpecResourceQOSStrategyBeClassResctrlQOS getResctrlQOS() {
    return resctrlQOS;
  }


  public void setResctrlQOS(V1alpha1NodeSLOSpecResourceQOSStrategyBeClassResctrlQOS resctrlQOS) {
    this.resctrlQOS = resctrlQOS;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    V1alpha1NodeSLOSpecResourceQOSStrategyLsrClass v1alpha1NodeSLOSpecResourceQOSStrategyLsrClass = (V1alpha1NodeSLOSpecResourceQOSStrategyLsrClass) o;
    return Objects.equals(this.blkioQOS, v1alpha1NodeSLOSpecResourceQOSStrategyLsrClass.blkioQOS) &&
        Objects.equals(this.cpuQOS, v1alpha1NodeSLOSpecResourceQOSStrategyLsrClass.cpuQOS) &&
        Objects.equals(this.memoryQOS, v1alpha1NodeSLOSpecResourceQOSStrategyLsrClass.memoryQOS) &&
        Objects.equals(this.resctrlQOS, v1alpha1NodeSLOSpecResourceQOSStrategyLsrClass.resctrlQOS);
  }

  @Override
  public int hashCode() {
    return Objects.hash(blkioQOS, cpuQOS, memoryQOS, resctrlQOS);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class V1alpha1NodeSLOSpecResourceQOSStrategyLsrClass {\n");
    sb.append("    blkioQOS: ").append(toIndentedString(blkioQOS)).append("\n");
    sb.append("    cpuQOS: ").append(toIndentedString(cpuQOS)).append("\n");
    sb.append("    memoryQOS: ").append(toIndentedString(memoryQOS)).append("\n");
    sb.append("    resctrlQOS: ").append(toIndentedString(resctrlQOS)).append("\n");
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

