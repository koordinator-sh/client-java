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
import sh.koordinator.slo.models.V1alpha1NodeSLOSpecResourceQOSStrategyBeClass;
import sh.koordinator.slo.models.V1alpha1NodeSLOSpecResourceQOSStrategyCgroupRoot;
import sh.koordinator.slo.models.V1alpha1NodeSLOSpecResourceQOSStrategyLsClass;
import sh.koordinator.slo.models.V1alpha1NodeSLOSpecResourceQOSStrategyLsrClass;
import sh.koordinator.slo.models.V1alpha1NodeSLOSpecResourceQOSStrategySystemClass;

/**
 * QoS config strategy for pods of different qos-class
 */
@ApiModel(description = "QoS config strategy for pods of different qos-class")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2023-07-17T16:57:54.694Z[Etc/UTC]")
public class V1alpha1NodeSLOSpecResourceQOSStrategy {
  public static final String SERIALIZED_NAME_BE_CLASS = "beClass";
  @SerializedName(SERIALIZED_NAME_BE_CLASS)
  private V1alpha1NodeSLOSpecResourceQOSStrategyBeClass beClass;

  public static final String SERIALIZED_NAME_CGROUP_ROOT = "cgroupRoot";
  @SerializedName(SERIALIZED_NAME_CGROUP_ROOT)
  private V1alpha1NodeSLOSpecResourceQOSStrategyCgroupRoot cgroupRoot;

  public static final String SERIALIZED_NAME_LS_CLASS = "lsClass";
  @SerializedName(SERIALIZED_NAME_LS_CLASS)
  private V1alpha1NodeSLOSpecResourceQOSStrategyLsClass lsClass;

  public static final String SERIALIZED_NAME_LSR_CLASS = "lsrClass";
  @SerializedName(SERIALIZED_NAME_LSR_CLASS)
  private V1alpha1NodeSLOSpecResourceQOSStrategyLsrClass lsrClass;

  public static final String SERIALIZED_NAME_SYSTEM_CLASS = "systemClass";
  @SerializedName(SERIALIZED_NAME_SYSTEM_CLASS)
  private V1alpha1NodeSLOSpecResourceQOSStrategySystemClass systemClass;


  public V1alpha1NodeSLOSpecResourceQOSStrategy beClass(V1alpha1NodeSLOSpecResourceQOSStrategyBeClass beClass) {
    
    this.beClass = beClass;
    return this;
  }

   /**
   * Get beClass
   * @return beClass
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public V1alpha1NodeSLOSpecResourceQOSStrategyBeClass getBeClass() {
    return beClass;
  }


  public void setBeClass(V1alpha1NodeSLOSpecResourceQOSStrategyBeClass beClass) {
    this.beClass = beClass;
  }


  public V1alpha1NodeSLOSpecResourceQOSStrategy cgroupRoot(V1alpha1NodeSLOSpecResourceQOSStrategyCgroupRoot cgroupRoot) {
    
    this.cgroupRoot = cgroupRoot;
    return this;
  }

   /**
   * Get cgroupRoot
   * @return cgroupRoot
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public V1alpha1NodeSLOSpecResourceQOSStrategyCgroupRoot getCgroupRoot() {
    return cgroupRoot;
  }


  public void setCgroupRoot(V1alpha1NodeSLOSpecResourceQOSStrategyCgroupRoot cgroupRoot) {
    this.cgroupRoot = cgroupRoot;
  }


  public V1alpha1NodeSLOSpecResourceQOSStrategy lsClass(V1alpha1NodeSLOSpecResourceQOSStrategyLsClass lsClass) {
    
    this.lsClass = lsClass;
    return this;
  }

   /**
   * Get lsClass
   * @return lsClass
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public V1alpha1NodeSLOSpecResourceQOSStrategyLsClass getLsClass() {
    return lsClass;
  }


  public void setLsClass(V1alpha1NodeSLOSpecResourceQOSStrategyLsClass lsClass) {
    this.lsClass = lsClass;
  }


  public V1alpha1NodeSLOSpecResourceQOSStrategy lsrClass(V1alpha1NodeSLOSpecResourceQOSStrategyLsrClass lsrClass) {
    
    this.lsrClass = lsrClass;
    return this;
  }

   /**
   * Get lsrClass
   * @return lsrClass
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public V1alpha1NodeSLOSpecResourceQOSStrategyLsrClass getLsrClass() {
    return lsrClass;
  }


  public void setLsrClass(V1alpha1NodeSLOSpecResourceQOSStrategyLsrClass lsrClass) {
    this.lsrClass = lsrClass;
  }


  public V1alpha1NodeSLOSpecResourceQOSStrategy systemClass(V1alpha1NodeSLOSpecResourceQOSStrategySystemClass systemClass) {
    
    this.systemClass = systemClass;
    return this;
  }

   /**
   * Get systemClass
   * @return systemClass
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public V1alpha1NodeSLOSpecResourceQOSStrategySystemClass getSystemClass() {
    return systemClass;
  }


  public void setSystemClass(V1alpha1NodeSLOSpecResourceQOSStrategySystemClass systemClass) {
    this.systemClass = systemClass;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    V1alpha1NodeSLOSpecResourceQOSStrategy v1alpha1NodeSLOSpecResourceQOSStrategy = (V1alpha1NodeSLOSpecResourceQOSStrategy) o;
    return Objects.equals(this.beClass, v1alpha1NodeSLOSpecResourceQOSStrategy.beClass) &&
        Objects.equals(this.cgroupRoot, v1alpha1NodeSLOSpecResourceQOSStrategy.cgroupRoot) &&
        Objects.equals(this.lsClass, v1alpha1NodeSLOSpecResourceQOSStrategy.lsClass) &&
        Objects.equals(this.lsrClass, v1alpha1NodeSLOSpecResourceQOSStrategy.lsrClass) &&
        Objects.equals(this.systemClass, v1alpha1NodeSLOSpecResourceQOSStrategy.systemClass);
  }

  @Override
  public int hashCode() {
    return Objects.hash(beClass, cgroupRoot, lsClass, lsrClass, systemClass);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class V1alpha1NodeSLOSpecResourceQOSStrategy {\n");
    sb.append("    beClass: ").append(toIndentedString(beClass)).append("\n");
    sb.append("    cgroupRoot: ").append(toIndentedString(cgroupRoot)).append("\n");
    sb.append("    lsClass: ").append(toIndentedString(lsClass)).append("\n");
    sb.append("    lsrClass: ").append(toIndentedString(lsrClass)).append("\n");
    sb.append("    systemClass: ").append(toIndentedString(systemClass)).append("\n");
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

