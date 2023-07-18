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
import sh.koordinator.slo.models.V1alpha1NodeSLOSpecCpuBurstStrategy;
import sh.koordinator.slo.models.V1alpha1NodeSLOSpecResourceQOSStrategy;
import sh.koordinator.slo.models.V1alpha1NodeSLOSpecResourceUsedThresholdWithBE;
import sh.koordinator.slo.models.V1alpha1NodeSLOSpecSystemStrategy;

/**
 * NodeSLOSpec defines the desired state of NodeSLO
 */
@ApiModel(description = "NodeSLOSpec defines the desired state of NodeSLO")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2023-07-17T16:57:54.694Z[Etc/UTC]")
public class V1alpha1NodeSLOSpec {
  public static final String SERIALIZED_NAME_CPU_BURST_STRATEGY = "cpuBurstStrategy";
  @SerializedName(SERIALIZED_NAME_CPU_BURST_STRATEGY)
  private V1alpha1NodeSLOSpecCpuBurstStrategy cpuBurstStrategy;

  public static final String SERIALIZED_NAME_EXTENSIONS = "extensions";
  @SerializedName(SERIALIZED_NAME_EXTENSIONS)
  private Object extensions;

  public static final String SERIALIZED_NAME_RESOURCE_Q_O_S_STRATEGY = "resourceQOSStrategy";
  @SerializedName(SERIALIZED_NAME_RESOURCE_Q_O_S_STRATEGY)
  private V1alpha1NodeSLOSpecResourceQOSStrategy resourceQOSStrategy;

  public static final String SERIALIZED_NAME_RESOURCE_USED_THRESHOLD_WITH_B_E = "resourceUsedThresholdWithBE";
  @SerializedName(SERIALIZED_NAME_RESOURCE_USED_THRESHOLD_WITH_B_E)
  private V1alpha1NodeSLOSpecResourceUsedThresholdWithBE resourceUsedThresholdWithBE;

  public static final String SERIALIZED_NAME_SYSTEM_STRATEGY = "systemStrategy";
  @SerializedName(SERIALIZED_NAME_SYSTEM_STRATEGY)
  private V1alpha1NodeSLOSpecSystemStrategy systemStrategy;


  public V1alpha1NodeSLOSpec cpuBurstStrategy(V1alpha1NodeSLOSpecCpuBurstStrategy cpuBurstStrategy) {
    
    this.cpuBurstStrategy = cpuBurstStrategy;
    return this;
  }

   /**
   * Get cpuBurstStrategy
   * @return cpuBurstStrategy
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public V1alpha1NodeSLOSpecCpuBurstStrategy getCpuBurstStrategy() {
    return cpuBurstStrategy;
  }


  public void setCpuBurstStrategy(V1alpha1NodeSLOSpecCpuBurstStrategy cpuBurstStrategy) {
    this.cpuBurstStrategy = cpuBurstStrategy;
  }


  public V1alpha1NodeSLOSpec extensions(Object extensions) {
    
    this.extensions = extensions;
    return this;
  }

   /**
   * Third party extensions for NodeSLO
   * @return extensions
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Third party extensions for NodeSLO")

  public Object getExtensions() {
    return extensions;
  }


  public void setExtensions(Object extensions) {
    this.extensions = extensions;
  }


  public V1alpha1NodeSLOSpec resourceQOSStrategy(V1alpha1NodeSLOSpecResourceQOSStrategy resourceQOSStrategy) {
    
    this.resourceQOSStrategy = resourceQOSStrategy;
    return this;
  }

   /**
   * Get resourceQOSStrategy
   * @return resourceQOSStrategy
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public V1alpha1NodeSLOSpecResourceQOSStrategy getResourceQOSStrategy() {
    return resourceQOSStrategy;
  }


  public void setResourceQOSStrategy(V1alpha1NodeSLOSpecResourceQOSStrategy resourceQOSStrategy) {
    this.resourceQOSStrategy = resourceQOSStrategy;
  }


  public V1alpha1NodeSLOSpec resourceUsedThresholdWithBE(V1alpha1NodeSLOSpecResourceUsedThresholdWithBE resourceUsedThresholdWithBE) {
    
    this.resourceUsedThresholdWithBE = resourceUsedThresholdWithBE;
    return this;
  }

   /**
   * Get resourceUsedThresholdWithBE
   * @return resourceUsedThresholdWithBE
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public V1alpha1NodeSLOSpecResourceUsedThresholdWithBE getResourceUsedThresholdWithBE() {
    return resourceUsedThresholdWithBE;
  }


  public void setResourceUsedThresholdWithBE(V1alpha1NodeSLOSpecResourceUsedThresholdWithBE resourceUsedThresholdWithBE) {
    this.resourceUsedThresholdWithBE = resourceUsedThresholdWithBE;
  }


  public V1alpha1NodeSLOSpec systemStrategy(V1alpha1NodeSLOSpecSystemStrategy systemStrategy) {
    
    this.systemStrategy = systemStrategy;
    return this;
  }

   /**
   * Get systemStrategy
   * @return systemStrategy
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public V1alpha1NodeSLOSpecSystemStrategy getSystemStrategy() {
    return systemStrategy;
  }


  public void setSystemStrategy(V1alpha1NodeSLOSpecSystemStrategy systemStrategy) {
    this.systemStrategy = systemStrategy;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    V1alpha1NodeSLOSpec v1alpha1NodeSLOSpec = (V1alpha1NodeSLOSpec) o;
    return Objects.equals(this.cpuBurstStrategy, v1alpha1NodeSLOSpec.cpuBurstStrategy) &&
        Objects.equals(this.extensions, v1alpha1NodeSLOSpec.extensions) &&
        Objects.equals(this.resourceQOSStrategy, v1alpha1NodeSLOSpec.resourceQOSStrategy) &&
        Objects.equals(this.resourceUsedThresholdWithBE, v1alpha1NodeSLOSpec.resourceUsedThresholdWithBE) &&
        Objects.equals(this.systemStrategy, v1alpha1NodeSLOSpec.systemStrategy);
  }

  @Override
  public int hashCode() {
    return Objects.hash(cpuBurstStrategy, extensions, resourceQOSStrategy, resourceUsedThresholdWithBE, systemStrategy);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class V1alpha1NodeSLOSpec {\n");
    sb.append("    cpuBurstStrategy: ").append(toIndentedString(cpuBurstStrategy)).append("\n");
    sb.append("    extensions: ").append(toIndentedString(extensions)).append("\n");
    sb.append("    resourceQOSStrategy: ").append(toIndentedString(resourceQOSStrategy)).append("\n");
    sb.append("    resourceUsedThresholdWithBE: ").append(toIndentedString(resourceUsedThresholdWithBE)).append("\n");
    sb.append("    systemStrategy: ").append(toIndentedString(systemStrategy)).append("\n");
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

