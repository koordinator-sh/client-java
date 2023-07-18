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
 * BE pods will be limited if node resource usage overload
 */
@ApiModel(description = "BE pods will be limited if node resource usage overload")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2023-07-17T16:57:54.694Z[Etc/UTC]")
public class V1alpha1NodeSLOSpecResourceUsedThresholdWithBE {
  public static final String SERIALIZED_NAME_CPU_EVICT_B_E_SATISFACTION_LOWER_PERCENT = "cpuEvictBESatisfactionLowerPercent";
  @SerializedName(SERIALIZED_NAME_CPU_EVICT_B_E_SATISFACTION_LOWER_PERCENT)
  private Long cpuEvictBESatisfactionLowerPercent;

  public static final String SERIALIZED_NAME_CPU_EVICT_B_E_SATISFACTION_UPPER_PERCENT = "cpuEvictBESatisfactionUpperPercent";
  @SerializedName(SERIALIZED_NAME_CPU_EVICT_B_E_SATISFACTION_UPPER_PERCENT)
  private Long cpuEvictBESatisfactionUpperPercent;

  public static final String SERIALIZED_NAME_CPU_EVICT_B_E_USAGE_THRESHOLD_PERCENT = "cpuEvictBEUsageThresholdPercent";
  @SerializedName(SERIALIZED_NAME_CPU_EVICT_B_E_USAGE_THRESHOLD_PERCENT)
  private Long cpuEvictBEUsageThresholdPercent;

  public static final String SERIALIZED_NAME_CPU_EVICT_TIME_WINDOW_SECONDS = "cpuEvictTimeWindowSeconds";
  @SerializedName(SERIALIZED_NAME_CPU_EVICT_TIME_WINDOW_SECONDS)
  private Long cpuEvictTimeWindowSeconds;

  public static final String SERIALIZED_NAME_CPU_SUPPRESS_POLICY = "cpuSuppressPolicy";
  @SerializedName(SERIALIZED_NAME_CPU_SUPPRESS_POLICY)
  private String cpuSuppressPolicy;

  public static final String SERIALIZED_NAME_CPU_SUPPRESS_THRESHOLD_PERCENT = "cpuSuppressThresholdPercent";
  @SerializedName(SERIALIZED_NAME_CPU_SUPPRESS_THRESHOLD_PERCENT)
  private Long cpuSuppressThresholdPercent;

  public static final String SERIALIZED_NAME_ENABLE = "enable";
  @SerializedName(SERIALIZED_NAME_ENABLE)
  private Boolean enable;

  public static final String SERIALIZED_NAME_MEMORY_EVICT_LOWER_PERCENT = "memoryEvictLowerPercent";
  @SerializedName(SERIALIZED_NAME_MEMORY_EVICT_LOWER_PERCENT)
  private Long memoryEvictLowerPercent;

  public static final String SERIALIZED_NAME_MEMORY_EVICT_THRESHOLD_PERCENT = "memoryEvictThresholdPercent";
  @SerializedName(SERIALIZED_NAME_MEMORY_EVICT_THRESHOLD_PERCENT)
  private Long memoryEvictThresholdPercent;


  public V1alpha1NodeSLOSpecResourceUsedThresholdWithBE cpuEvictBESatisfactionLowerPercent(Long cpuEvictBESatisfactionLowerPercent) {
    
    this.cpuEvictBESatisfactionLowerPercent = cpuEvictBESatisfactionLowerPercent;
    return this;
  }

   /**
   * be.satisfactionRate &#x3D; be.CPURealLimit/be.CPURequest; be.cpuUsage &#x3D; be.CPUUsed/be.CPURealLimit if be.satisfactionRate &lt; CPUEvictBESatisfactionLowerPercent/100 &amp;&amp; be.usage &gt;&#x3D; CPUEvictBEUsageThresholdPercent/100, then start to evict pod, and will evict to ${CPUEvictBESatisfactionUpperPercent}
   * @return cpuEvictBESatisfactionLowerPercent
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "be.satisfactionRate = be.CPURealLimit/be.CPURequest; be.cpuUsage = be.CPUUsed/be.CPURealLimit if be.satisfactionRate < CPUEvictBESatisfactionLowerPercent/100 && be.usage >= CPUEvictBEUsageThresholdPercent/100, then start to evict pod, and will evict to ${CPUEvictBESatisfactionUpperPercent}")

  public Long getCpuEvictBESatisfactionLowerPercent() {
    return cpuEvictBESatisfactionLowerPercent;
  }


  public void setCpuEvictBESatisfactionLowerPercent(Long cpuEvictBESatisfactionLowerPercent) {
    this.cpuEvictBESatisfactionLowerPercent = cpuEvictBESatisfactionLowerPercent;
  }


  public V1alpha1NodeSLOSpecResourceUsedThresholdWithBE cpuEvictBESatisfactionUpperPercent(Long cpuEvictBESatisfactionUpperPercent) {
    
    this.cpuEvictBESatisfactionUpperPercent = cpuEvictBESatisfactionUpperPercent;
    return this;
  }

   /**
   * be.satisfactionRate &#x3D; be.CPURealLimit/be.CPURequest if be.satisfactionRate &gt; CPUEvictBESatisfactionUpperPercent/100, then stop to evict.
   * @return cpuEvictBESatisfactionUpperPercent
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "be.satisfactionRate = be.CPURealLimit/be.CPURequest if be.satisfactionRate > CPUEvictBESatisfactionUpperPercent/100, then stop to evict.")

  public Long getCpuEvictBESatisfactionUpperPercent() {
    return cpuEvictBESatisfactionUpperPercent;
  }


  public void setCpuEvictBESatisfactionUpperPercent(Long cpuEvictBESatisfactionUpperPercent) {
    this.cpuEvictBESatisfactionUpperPercent = cpuEvictBESatisfactionUpperPercent;
  }


  public V1alpha1NodeSLOSpecResourceUsedThresholdWithBE cpuEvictBEUsageThresholdPercent(Long cpuEvictBEUsageThresholdPercent) {
    
    this.cpuEvictBEUsageThresholdPercent = cpuEvictBEUsageThresholdPercent;
    return this;
  }

   /**
   * if be.cpuUsage &gt;&#x3D; CPUEvictBEUsageThresholdPercent/100, then start to calculate the resources need to be released.
   * @return cpuEvictBEUsageThresholdPercent
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "if be.cpuUsage >= CPUEvictBEUsageThresholdPercent/100, then start to calculate the resources need to be released.")

  public Long getCpuEvictBEUsageThresholdPercent() {
    return cpuEvictBEUsageThresholdPercent;
  }


  public void setCpuEvictBEUsageThresholdPercent(Long cpuEvictBEUsageThresholdPercent) {
    this.cpuEvictBEUsageThresholdPercent = cpuEvictBEUsageThresholdPercent;
  }


  public V1alpha1NodeSLOSpecResourceUsedThresholdWithBE cpuEvictTimeWindowSeconds(Long cpuEvictTimeWindowSeconds) {
    
    this.cpuEvictTimeWindowSeconds = cpuEvictTimeWindowSeconds;
    return this;
  }

   /**
   * when avg(cpuusage) &gt; CPUEvictThresholdPercent, will start to evict pod by cpu, and avg(cpuusage) is calculated based on the most recent CPUEvictTimeWindowSeconds data
   * @return cpuEvictTimeWindowSeconds
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "when avg(cpuusage) > CPUEvictThresholdPercent, will start to evict pod by cpu, and avg(cpuusage) is calculated based on the most recent CPUEvictTimeWindowSeconds data")

  public Long getCpuEvictTimeWindowSeconds() {
    return cpuEvictTimeWindowSeconds;
  }


  public void setCpuEvictTimeWindowSeconds(Long cpuEvictTimeWindowSeconds) {
    this.cpuEvictTimeWindowSeconds = cpuEvictTimeWindowSeconds;
  }


  public V1alpha1NodeSLOSpecResourceUsedThresholdWithBE cpuSuppressPolicy(String cpuSuppressPolicy) {
    
    this.cpuSuppressPolicy = cpuSuppressPolicy;
    return this;
  }

   /**
   * CPUSuppressPolicy
   * @return cpuSuppressPolicy
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "CPUSuppressPolicy")

  public String getCpuSuppressPolicy() {
    return cpuSuppressPolicy;
  }


  public void setCpuSuppressPolicy(String cpuSuppressPolicy) {
    this.cpuSuppressPolicy = cpuSuppressPolicy;
  }


  public V1alpha1NodeSLOSpecResourceUsedThresholdWithBE cpuSuppressThresholdPercent(Long cpuSuppressThresholdPercent) {
    
    this.cpuSuppressThresholdPercent = cpuSuppressThresholdPercent;
    return this;
  }

   /**
   * cpu suppress threshold percentage (0,100), default &#x3D; 65
   * minimum: 0
   * maximum: 100
   * @return cpuSuppressThresholdPercent
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "cpu suppress threshold percentage (0,100), default = 65")

  public Long getCpuSuppressThresholdPercent() {
    return cpuSuppressThresholdPercent;
  }


  public void setCpuSuppressThresholdPercent(Long cpuSuppressThresholdPercent) {
    this.cpuSuppressThresholdPercent = cpuSuppressThresholdPercent;
  }


  public V1alpha1NodeSLOSpecResourceUsedThresholdWithBE enable(Boolean enable) {
    
    this.enable = enable;
    return this;
  }

   /**
   * whether the strategy is enabled, default &#x3D; false
   * @return enable
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "whether the strategy is enabled, default = false")

  public Boolean getEnable() {
    return enable;
  }


  public void setEnable(Boolean enable) {
    this.enable = enable;
  }


  public V1alpha1NodeSLOSpecResourceUsedThresholdWithBE memoryEvictLowerPercent(Long memoryEvictLowerPercent) {
    
    this.memoryEvictLowerPercent = memoryEvictLowerPercent;
    return this;
  }

   /**
   * lower: memory release util usage under MemoryEvictLowerPercent, default &#x3D; MemoryEvictThresholdPercent - 2
   * minimum: 0
   * maximum: 100
   * @return memoryEvictLowerPercent
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "lower: memory release util usage under MemoryEvictLowerPercent, default = MemoryEvictThresholdPercent - 2")

  public Long getMemoryEvictLowerPercent() {
    return memoryEvictLowerPercent;
  }


  public void setMemoryEvictLowerPercent(Long memoryEvictLowerPercent) {
    this.memoryEvictLowerPercent = memoryEvictLowerPercent;
  }


  public V1alpha1NodeSLOSpecResourceUsedThresholdWithBE memoryEvictThresholdPercent(Long memoryEvictThresholdPercent) {
    
    this.memoryEvictThresholdPercent = memoryEvictThresholdPercent;
    return this;
  }

   /**
   * upper: memory evict threshold percentage (0,100), default &#x3D; 70
   * minimum: 0
   * maximum: 100
   * @return memoryEvictThresholdPercent
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "upper: memory evict threshold percentage (0,100), default = 70")

  public Long getMemoryEvictThresholdPercent() {
    return memoryEvictThresholdPercent;
  }


  public void setMemoryEvictThresholdPercent(Long memoryEvictThresholdPercent) {
    this.memoryEvictThresholdPercent = memoryEvictThresholdPercent;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    V1alpha1NodeSLOSpecResourceUsedThresholdWithBE v1alpha1NodeSLOSpecResourceUsedThresholdWithBE = (V1alpha1NodeSLOSpecResourceUsedThresholdWithBE) o;
    return Objects.equals(this.cpuEvictBESatisfactionLowerPercent, v1alpha1NodeSLOSpecResourceUsedThresholdWithBE.cpuEvictBESatisfactionLowerPercent) &&
        Objects.equals(this.cpuEvictBESatisfactionUpperPercent, v1alpha1NodeSLOSpecResourceUsedThresholdWithBE.cpuEvictBESatisfactionUpperPercent) &&
        Objects.equals(this.cpuEvictBEUsageThresholdPercent, v1alpha1NodeSLOSpecResourceUsedThresholdWithBE.cpuEvictBEUsageThresholdPercent) &&
        Objects.equals(this.cpuEvictTimeWindowSeconds, v1alpha1NodeSLOSpecResourceUsedThresholdWithBE.cpuEvictTimeWindowSeconds) &&
        Objects.equals(this.cpuSuppressPolicy, v1alpha1NodeSLOSpecResourceUsedThresholdWithBE.cpuSuppressPolicy) &&
        Objects.equals(this.cpuSuppressThresholdPercent, v1alpha1NodeSLOSpecResourceUsedThresholdWithBE.cpuSuppressThresholdPercent) &&
        Objects.equals(this.enable, v1alpha1NodeSLOSpecResourceUsedThresholdWithBE.enable) &&
        Objects.equals(this.memoryEvictLowerPercent, v1alpha1NodeSLOSpecResourceUsedThresholdWithBE.memoryEvictLowerPercent) &&
        Objects.equals(this.memoryEvictThresholdPercent, v1alpha1NodeSLOSpecResourceUsedThresholdWithBE.memoryEvictThresholdPercent);
  }

  @Override
  public int hashCode() {
    return Objects.hash(cpuEvictBESatisfactionLowerPercent, cpuEvictBESatisfactionUpperPercent, cpuEvictBEUsageThresholdPercent, cpuEvictTimeWindowSeconds, cpuSuppressPolicy, cpuSuppressThresholdPercent, enable, memoryEvictLowerPercent, memoryEvictThresholdPercent);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class V1alpha1NodeSLOSpecResourceUsedThresholdWithBE {\n");
    sb.append("    cpuEvictBESatisfactionLowerPercent: ").append(toIndentedString(cpuEvictBESatisfactionLowerPercent)).append("\n");
    sb.append("    cpuEvictBESatisfactionUpperPercent: ").append(toIndentedString(cpuEvictBESatisfactionUpperPercent)).append("\n");
    sb.append("    cpuEvictBEUsageThresholdPercent: ").append(toIndentedString(cpuEvictBEUsageThresholdPercent)).append("\n");
    sb.append("    cpuEvictTimeWindowSeconds: ").append(toIndentedString(cpuEvictTimeWindowSeconds)).append("\n");
    sb.append("    cpuSuppressPolicy: ").append(toIndentedString(cpuSuppressPolicy)).append("\n");
    sb.append("    cpuSuppressThresholdPercent: ").append(toIndentedString(cpuSuppressThresholdPercent)).append("\n");
    sb.append("    enable: ").append(toIndentedString(enable)).append("\n");
    sb.append("    memoryEvictLowerPercent: ").append(toIndentedString(memoryEvictLowerPercent)).append("\n");
    sb.append("    memoryEvictThresholdPercent: ").append(toIndentedString(memoryEvictThresholdPercent)).append("\n");
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

