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
 * V1alpha1NodeSLOSpecResourceQOSStrategyBeClassBlkioQOSIoCfg
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2023-07-17T16:57:54.694Z[Etc/UTC]")
public class V1alpha1NodeSLOSpecResourceQOSStrategyBeClassBlkioQOSIoCfg {
  public static final String SERIALIZED_NAME_IO_WEIGHT_PERCENT = "ioWeightPercent";
  @SerializedName(SERIALIZED_NAME_IO_WEIGHT_PERCENT)
  private Long ioWeightPercent;

  public static final String SERIALIZED_NAME_READ_B_P_S = "readBPS";
  @SerializedName(SERIALIZED_NAME_READ_B_P_S)
  private Long readBPS;

  public static final String SERIALIZED_NAME_READ_I_O_P_S = "readIOPS";
  @SerializedName(SERIALIZED_NAME_READ_I_O_P_S)
  private Long readIOPS;

  public static final String SERIALIZED_NAME_READ_LATENCY = "readLatency";
  @SerializedName(SERIALIZED_NAME_READ_LATENCY)
  private Long readLatency;

  public static final String SERIALIZED_NAME_WRITE_B_P_S = "writeBPS";
  @SerializedName(SERIALIZED_NAME_WRITE_B_P_S)
  private Long writeBPS;

  public static final String SERIALIZED_NAME_WRITE_I_O_P_S = "writeIOPS";
  @SerializedName(SERIALIZED_NAME_WRITE_I_O_P_S)
  private Long writeIOPS;

  public static final String SERIALIZED_NAME_WRITE_LATENCY = "writeLatency";
  @SerializedName(SERIALIZED_NAME_WRITE_LATENCY)
  private Long writeLatency;


  public V1alpha1NodeSLOSpecResourceQOSStrategyBeClassBlkioQOSIoCfg ioWeightPercent(Long ioWeightPercent) {
    
    this.ioWeightPercent = ioWeightPercent;
    return this;
  }

   /**
   * This field is used to set the weight of a sub-group. Default value: 100. Valid values: 1 to 100.
   * minimum: 1
   * maximum: 100
   * @return ioWeightPercent
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "This field is used to set the weight of a sub-group. Default value: 100. Valid values: 1 to 100.")

  public Long getIoWeightPercent() {
    return ioWeightPercent;
  }


  public void setIoWeightPercent(Long ioWeightPercent) {
    this.ioWeightPercent = ioWeightPercent;
  }


  public V1alpha1NodeSLOSpecResourceQOSStrategyBeClassBlkioQOSIoCfg readBPS(Long readBPS) {
    
    this.readBPS = readBPS;
    return this;
  }

   /**
   * Throttling of throughput The value is set to 0, which indicates that the feature is disabled.
   * minimum: 0
   * @return readBPS
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Throttling of throughput The value is set to 0, which indicates that the feature is disabled.")

  public Long getReadBPS() {
    return readBPS;
  }


  public void setReadBPS(Long readBPS) {
    this.readBPS = readBPS;
  }


  public V1alpha1NodeSLOSpecResourceQOSStrategyBeClassBlkioQOSIoCfg readIOPS(Long readIOPS) {
    
    this.readIOPS = readIOPS;
    return this;
  }

   /**
   * Throttling of IOPS The value is set to 0, which indicates that the feature is disabled.
   * minimum: 0
   * @return readIOPS
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Throttling of IOPS The value is set to 0, which indicates that the feature is disabled.")

  public Long getReadIOPS() {
    return readIOPS;
  }


  public void setReadIOPS(Long readIOPS) {
    this.readIOPS = readIOPS;
  }


  public V1alpha1NodeSLOSpecResourceQOSStrategyBeClassBlkioQOSIoCfg readLatency(Long readLatency) {
    
    this.readLatency = readLatency;
    return this;
  }

   /**
   * Configure the weight-based throttling feature of blk-iocost Only used for RootClass After blk-iocost is enabled, the kernel calculates the proportion of requests that exceed the read or write latency threshold out of all requests. When the proportion is greater than the read or write latency percentile (95%), the kernel considers the disk to be saturated and reduces the rate at which requests are sent to the disk. the read latency threshold. Unit: microseconds.
   * @return readLatency
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Configure the weight-based throttling feature of blk-iocost Only used for RootClass After blk-iocost is enabled, the kernel calculates the proportion of requests that exceed the read or write latency threshold out of all requests. When the proportion is greater than the read or write latency percentile (95%), the kernel considers the disk to be saturated and reduces the rate at which requests are sent to the disk. the read latency threshold. Unit: microseconds.")

  public Long getReadLatency() {
    return readLatency;
  }


  public void setReadLatency(Long readLatency) {
    this.readLatency = readLatency;
  }


  public V1alpha1NodeSLOSpecResourceQOSStrategyBeClassBlkioQOSIoCfg writeBPS(Long writeBPS) {
    
    this.writeBPS = writeBPS;
    return this;
  }

   /**
   * Get writeBPS
   * minimum: 0
   * @return writeBPS
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Long getWriteBPS() {
    return writeBPS;
  }


  public void setWriteBPS(Long writeBPS) {
    this.writeBPS = writeBPS;
  }


  public V1alpha1NodeSLOSpecResourceQOSStrategyBeClassBlkioQOSIoCfg writeIOPS(Long writeIOPS) {
    
    this.writeIOPS = writeIOPS;
    return this;
  }

   /**
   * Get writeIOPS
   * minimum: 0
   * @return writeIOPS
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Long getWriteIOPS() {
    return writeIOPS;
  }


  public void setWriteIOPS(Long writeIOPS) {
    this.writeIOPS = writeIOPS;
  }


  public V1alpha1NodeSLOSpecResourceQOSStrategyBeClassBlkioQOSIoCfg writeLatency(Long writeLatency) {
    
    this.writeLatency = writeLatency;
    return this;
  }

   /**
   * the write latency threshold. Unit: microseconds.
   * @return writeLatency
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "the write latency threshold. Unit: microseconds.")

  public Long getWriteLatency() {
    return writeLatency;
  }


  public void setWriteLatency(Long writeLatency) {
    this.writeLatency = writeLatency;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    V1alpha1NodeSLOSpecResourceQOSStrategyBeClassBlkioQOSIoCfg v1alpha1NodeSLOSpecResourceQOSStrategyBeClassBlkioQOSIoCfg = (V1alpha1NodeSLOSpecResourceQOSStrategyBeClassBlkioQOSIoCfg) o;
    return Objects.equals(this.ioWeightPercent, v1alpha1NodeSLOSpecResourceQOSStrategyBeClassBlkioQOSIoCfg.ioWeightPercent) &&
        Objects.equals(this.readBPS, v1alpha1NodeSLOSpecResourceQOSStrategyBeClassBlkioQOSIoCfg.readBPS) &&
        Objects.equals(this.readIOPS, v1alpha1NodeSLOSpecResourceQOSStrategyBeClassBlkioQOSIoCfg.readIOPS) &&
        Objects.equals(this.readLatency, v1alpha1NodeSLOSpecResourceQOSStrategyBeClassBlkioQOSIoCfg.readLatency) &&
        Objects.equals(this.writeBPS, v1alpha1NodeSLOSpecResourceQOSStrategyBeClassBlkioQOSIoCfg.writeBPS) &&
        Objects.equals(this.writeIOPS, v1alpha1NodeSLOSpecResourceQOSStrategyBeClassBlkioQOSIoCfg.writeIOPS) &&
        Objects.equals(this.writeLatency, v1alpha1NodeSLOSpecResourceQOSStrategyBeClassBlkioQOSIoCfg.writeLatency);
  }

  @Override
  public int hashCode() {
    return Objects.hash(ioWeightPercent, readBPS, readIOPS, readLatency, writeBPS, writeIOPS, writeLatency);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class V1alpha1NodeSLOSpecResourceQOSStrategyBeClassBlkioQOSIoCfg {\n");
    sb.append("    ioWeightPercent: ").append(toIndentedString(ioWeightPercent)).append("\n");
    sb.append("    readBPS: ").append(toIndentedString(readBPS)).append("\n");
    sb.append("    readIOPS: ").append(toIndentedString(readIOPS)).append("\n");
    sb.append("    readLatency: ").append(toIndentedString(readLatency)).append("\n");
    sb.append("    writeBPS: ").append(toIndentedString(writeBPS)).append("\n");
    sb.append("    writeIOPS: ").append(toIndentedString(writeIOPS)).append("\n");
    sb.append("    writeLatency: ").append(toIndentedString(writeLatency)).append("\n");
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

