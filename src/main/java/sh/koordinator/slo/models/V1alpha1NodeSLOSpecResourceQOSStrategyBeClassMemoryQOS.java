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
 * MemoryQOSCfg stores node-level config of memory qos
 */
@ApiModel(description = "MemoryQOSCfg stores node-level config of memory qos")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2023-07-17T16:57:54.694Z[Etc/UTC]")
public class V1alpha1NodeSLOSpecResourceQOSStrategyBeClassMemoryQOS {
  public static final String SERIALIZED_NAME_ENABLE = "enable";
  @SerializedName(SERIALIZED_NAME_ENABLE)
  private Boolean enable;

  public static final String SERIALIZED_NAME_LOW_LIMIT_PERCENT = "lowLimitPercent";
  @SerializedName(SERIALIZED_NAME_LOW_LIMIT_PERCENT)
  private Long lowLimitPercent;

  public static final String SERIALIZED_NAME_MIN_LIMIT_PERCENT = "minLimitPercent";
  @SerializedName(SERIALIZED_NAME_MIN_LIMIT_PERCENT)
  private Long minLimitPercent;

  public static final String SERIALIZED_NAME_OOM_KILL_GROUP = "oomKillGroup";
  @SerializedName(SERIALIZED_NAME_OOM_KILL_GROUP)
  private Long oomKillGroup;

  public static final String SERIALIZED_NAME_PRIORITY = "priority";
  @SerializedName(SERIALIZED_NAME_PRIORITY)
  private Long priority;

  public static final String SERIALIZED_NAME_PRIORITY_ENABLE = "priorityEnable";
  @SerializedName(SERIALIZED_NAME_PRIORITY_ENABLE)
  private Long priorityEnable;

  public static final String SERIALIZED_NAME_THROTTLING_PERCENT = "throttlingPercent";
  @SerializedName(SERIALIZED_NAME_THROTTLING_PERCENT)
  private Long throttlingPercent;

  public static final String SERIALIZED_NAME_WMARK_MIN_ADJ = "wmarkMinAdj";
  @SerializedName(SERIALIZED_NAME_WMARK_MIN_ADJ)
  private Long wmarkMinAdj;

  public static final String SERIALIZED_NAME_WMARK_RATIO = "wmarkRatio";
  @SerializedName(SERIALIZED_NAME_WMARK_RATIO)
  private Long wmarkRatio;

  public static final String SERIALIZED_NAME_WMARK_SCALE_PERMILL = "wmarkScalePermill";
  @SerializedName(SERIALIZED_NAME_WMARK_SCALE_PERMILL)
  private Long wmarkScalePermill;


  public V1alpha1NodeSLOSpecResourceQOSStrategyBeClassMemoryQOS enable(Boolean enable) {
    
    this.enable = enable;
    return this;
  }

   /**
   * Enable indicates whether the memory qos is enabled (default: false). This field is used for node-level control, while pod-level configuration is done with MemoryQOS and &#x60;Policy&#x60; instead of an &#x60;Enable&#x60; option. Please view the differences between MemoryQOSCfg and PodMemoryQOSConfig structs.
   * @return enable
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Enable indicates whether the memory qos is enabled (default: false). This field is used for node-level control, while pod-level configuration is done with MemoryQOS and `Policy` instead of an `Enable` option. Please view the differences between MemoryQOSCfg and PodMemoryQOSConfig structs.")

  public Boolean getEnable() {
    return enable;
  }


  public void setEnable(Boolean enable) {
    this.enable = enable;
  }


  public V1alpha1NodeSLOSpecResourceQOSStrategyBeClassMemoryQOS lowLimitPercent(Long lowLimitPercent) {
    
    this.lowLimitPercent = lowLimitPercent;
    return this;
  }

   /**
   * LowLimitPercent specifies the lowLimitFactor percentage to calculate &#x60;memory.low&#x60;, which TRIES BEST protecting memory from global reclamation when memory usage does not exceed the low limit unless no unprotected memcg can be reclaimed. NOTE: &#x60;memory.low&#x60; should be larger than &#x60;memory.min&#x60;. If spec.requests.memory &#x3D;&#x3D; spec.limits.memory, pod &#x60;memory.low&#x60; and &#x60;memory.high&#x60; become invalid, while &#x60;memory.wmark_ratio&#x60; is still in effect. Close: 0.
   * minimum: 0
   * @return lowLimitPercent
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "LowLimitPercent specifies the lowLimitFactor percentage to calculate `memory.low`, which TRIES BEST protecting memory from global reclamation when memory usage does not exceed the low limit unless no unprotected memcg can be reclaimed. NOTE: `memory.low` should be larger than `memory.min`. If spec.requests.memory == spec.limits.memory, pod `memory.low` and `memory.high` become invalid, while `memory.wmark_ratio` is still in effect. Close: 0.")

  public Long getLowLimitPercent() {
    return lowLimitPercent;
  }


  public void setLowLimitPercent(Long lowLimitPercent) {
    this.lowLimitPercent = lowLimitPercent;
  }


  public V1alpha1NodeSLOSpecResourceQOSStrategyBeClassMemoryQOS minLimitPercent(Long minLimitPercent) {
    
    this.minLimitPercent = minLimitPercent;
    return this;
  }

   /**
   * memcg qos If enabled, memcg qos will be set by the agent, where some fields are implicitly calculated from pod spec. 1. &#x60;memory.min&#x60; :&#x3D; spec.requests.memory * minLimitFactor / 100 (use 0 if requests.memory is not set) 2. &#x60;memory.low&#x60; :&#x3D; spec.requests.memory * lowLimitFactor / 100 (use 0 if requests.memory is not set) 3. &#x60;memory.limit_in_bytes&#x60; :&#x3D; spec.limits.memory (set $node.allocatable.memory if limits.memory is not set) 4. &#x60;memory.high&#x60; :&#x3D; floor[(spec.requests.memory + throttlingFactor / 100 * (memory.limit_in_bytes or node allocatable memory - spec.requests.memory))/pageSize] * pageSize MinLimitPercent specifies the minLimitFactor percentage to calculate &#x60;memory.min&#x60;, which protects memory from global reclamation when memory usage does not exceed the min limit. Close: 0.
   * minimum: 0
   * @return minLimitPercent
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "memcg qos If enabled, memcg qos will be set by the agent, where some fields are implicitly calculated from pod spec. 1. `memory.min` := spec.requests.memory * minLimitFactor / 100 (use 0 if requests.memory is not set) 2. `memory.low` := spec.requests.memory * lowLimitFactor / 100 (use 0 if requests.memory is not set) 3. `memory.limit_in_bytes` := spec.limits.memory (set $node.allocatable.memory if limits.memory is not set) 4. `memory.high` := floor[(spec.requests.memory + throttlingFactor / 100 * (memory.limit_in_bytes or node allocatable memory - spec.requests.memory))/pageSize] * pageSize MinLimitPercent specifies the minLimitFactor percentage to calculate `memory.min`, which protects memory from global reclamation when memory usage does not exceed the min limit. Close: 0.")

  public Long getMinLimitPercent() {
    return minLimitPercent;
  }


  public void setMinLimitPercent(Long minLimitPercent) {
    this.minLimitPercent = minLimitPercent;
  }


  public V1alpha1NodeSLOSpecResourceQOSStrategyBeClassMemoryQOS oomKillGroup(Long oomKillGroup) {
    
    this.oomKillGroup = oomKillGroup;
    return this;
  }

   /**
   * Get oomKillGroup
   * @return oomKillGroup
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Long getOomKillGroup() {
    return oomKillGroup;
  }


  public void setOomKillGroup(Long oomKillGroup) {
    this.oomKillGroup = oomKillGroup;
  }


  public V1alpha1NodeSLOSpecResourceQOSStrategyBeClassMemoryQOS priority(Long priority) {
    
    this.priority = priority;
    return this;
  }

   /**
   * Get priority
   * @return priority
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Long getPriority() {
    return priority;
  }


  public void setPriority(Long priority) {
    this.priority = priority;
  }


  public V1alpha1NodeSLOSpecResourceQOSStrategyBeClassMemoryQOS priorityEnable(Long priorityEnable) {
    
    this.priorityEnable = priorityEnable;
    return this;
  }

   /**
   * TODO: enhance the usages of oom priority and oom kill group
   * @return priorityEnable
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "TODO: enhance the usages of oom priority and oom kill group")

  public Long getPriorityEnable() {
    return priorityEnable;
  }


  public void setPriorityEnable(Long priorityEnable) {
    this.priorityEnable = priorityEnable;
  }


  public V1alpha1NodeSLOSpecResourceQOSStrategyBeClassMemoryQOS throttlingPercent(Long throttlingPercent) {
    
    this.throttlingPercent = throttlingPercent;
    return this;
  }

   /**
   * ThrottlingPercent specifies the throttlingFactor percentage to calculate &#x60;memory.high&#x60; with pod memory.limits or node allocatable memory, which triggers memcg direct reclamation when memory usage exceeds. Lower the factor brings more heavier reclaim pressure. Close: 0.
   * minimum: 0
   * @return throttlingPercent
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "ThrottlingPercent specifies the throttlingFactor percentage to calculate `memory.high` with pod memory.limits or node allocatable memory, which triggers memcg direct reclamation when memory usage exceeds. Lower the factor brings more heavier reclaim pressure. Close: 0.")

  public Long getThrottlingPercent() {
    return throttlingPercent;
  }


  public void setThrottlingPercent(Long throttlingPercent) {
    this.throttlingPercent = throttlingPercent;
  }


  public V1alpha1NodeSLOSpecResourceQOSStrategyBeClassMemoryQOS wmarkMinAdj(Long wmarkMinAdj) {
    
    this.wmarkMinAdj = wmarkMinAdj;
    return this;
  }

   /**
   * wmark_min_adj (Anolis OS required) WmarkMinAdj specifies &#x60;memory.wmark_min_adj&#x60; which adjusts per-memcg threshold for global memory reclamation. Lower the factor brings later reclamation. The adjustment uses different formula for different value range. [-25, 0)：global_wmark_min&#39; &#x3D; global_wmark_min + (global_wmark_min - 0) * wmarkMinAdj (0, 50]：global_wmark_min&#39; &#x3D; global_wmark_min + (global_wmark_low - global_wmark_min) * wmarkMinAdj Close: [LSR:0, LS:0, BE:0]. Recommended: [LSR:-25, LS:-25, BE:50].
   * minimum: -25
   * maximum: 50
   * @return wmarkMinAdj
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "wmark_min_adj (Anolis OS required) WmarkMinAdj specifies `memory.wmark_min_adj` which adjusts per-memcg threshold for global memory reclamation. Lower the factor brings later reclamation. The adjustment uses different formula for different value range. [-25, 0)：global_wmark_min' = global_wmark_min + (global_wmark_min - 0) * wmarkMinAdj (0, 50]：global_wmark_min' = global_wmark_min + (global_wmark_low - global_wmark_min) * wmarkMinAdj Close: [LSR:0, LS:0, BE:0]. Recommended: [LSR:-25, LS:-25, BE:50].")

  public Long getWmarkMinAdj() {
    return wmarkMinAdj;
  }


  public void setWmarkMinAdj(Long wmarkMinAdj) {
    this.wmarkMinAdj = wmarkMinAdj;
  }


  public V1alpha1NodeSLOSpecResourceQOSStrategyBeClassMemoryQOS wmarkRatio(Long wmarkRatio) {
    
    this.wmarkRatio = wmarkRatio;
    return this;
  }

   /**
   * wmark_ratio (Anolis OS required) Async memory reclamation is triggered when cgroup memory usage exceeds &#x60;memory.wmark_high&#x60; and the reclamation stops when usage is below &#x60;memory.wmark_low&#x60;. Basically, &#x60;memory.wmark_high&#x60; :&#x3D; min(memory.high, memory.limit_in_bytes) * memory.memory.wmark_ratio &#x60;memory.wmark_low&#x60; :&#x3D; min(memory.high, memory.limit_in_bytes) * (memory.wmark_ratio - memory.wmark_scale_factor) WmarkRatio specifies &#x60;memory.wmark_ratio&#x60; that help calculate &#x60;memory.wmark_high&#x60;, which triggers async memory reclamation when memory usage exceeds. Close: 0. Recommended: 95.
   * minimum: 0
   * maximum: 100
   * @return wmarkRatio
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "wmark_ratio (Anolis OS required) Async memory reclamation is triggered when cgroup memory usage exceeds `memory.wmark_high` and the reclamation stops when usage is below `memory.wmark_low`. Basically, `memory.wmark_high` := min(memory.high, memory.limit_in_bytes) * memory.memory.wmark_ratio `memory.wmark_low` := min(memory.high, memory.limit_in_bytes) * (memory.wmark_ratio - memory.wmark_scale_factor) WmarkRatio specifies `memory.wmark_ratio` that help calculate `memory.wmark_high`, which triggers async memory reclamation when memory usage exceeds. Close: 0. Recommended: 95.")

  public Long getWmarkRatio() {
    return wmarkRatio;
  }


  public void setWmarkRatio(Long wmarkRatio) {
    this.wmarkRatio = wmarkRatio;
  }


  public V1alpha1NodeSLOSpecResourceQOSStrategyBeClassMemoryQOS wmarkScalePermill(Long wmarkScalePermill) {
    
    this.wmarkScalePermill = wmarkScalePermill;
    return this;
  }

   /**
   * WmarkScalePermill specifies &#x60;memory.wmark_scale_factor&#x60; that helps calculate &#x60;memory.wmark_low&#x60;, which stops async memory reclamation when memory usage belows. Close: 50. Recommended: 20.
   * minimum: 1
   * maximum: 1000
   * @return wmarkScalePermill
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "WmarkScalePermill specifies `memory.wmark_scale_factor` that helps calculate `memory.wmark_low`, which stops async memory reclamation when memory usage belows. Close: 50. Recommended: 20.")

  public Long getWmarkScalePermill() {
    return wmarkScalePermill;
  }


  public void setWmarkScalePermill(Long wmarkScalePermill) {
    this.wmarkScalePermill = wmarkScalePermill;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    V1alpha1NodeSLOSpecResourceQOSStrategyBeClassMemoryQOS v1alpha1NodeSLOSpecResourceQOSStrategyBeClassMemoryQOS = (V1alpha1NodeSLOSpecResourceQOSStrategyBeClassMemoryQOS) o;
    return Objects.equals(this.enable, v1alpha1NodeSLOSpecResourceQOSStrategyBeClassMemoryQOS.enable) &&
        Objects.equals(this.lowLimitPercent, v1alpha1NodeSLOSpecResourceQOSStrategyBeClassMemoryQOS.lowLimitPercent) &&
        Objects.equals(this.minLimitPercent, v1alpha1NodeSLOSpecResourceQOSStrategyBeClassMemoryQOS.minLimitPercent) &&
        Objects.equals(this.oomKillGroup, v1alpha1NodeSLOSpecResourceQOSStrategyBeClassMemoryQOS.oomKillGroup) &&
        Objects.equals(this.priority, v1alpha1NodeSLOSpecResourceQOSStrategyBeClassMemoryQOS.priority) &&
        Objects.equals(this.priorityEnable, v1alpha1NodeSLOSpecResourceQOSStrategyBeClassMemoryQOS.priorityEnable) &&
        Objects.equals(this.throttlingPercent, v1alpha1NodeSLOSpecResourceQOSStrategyBeClassMemoryQOS.throttlingPercent) &&
        Objects.equals(this.wmarkMinAdj, v1alpha1NodeSLOSpecResourceQOSStrategyBeClassMemoryQOS.wmarkMinAdj) &&
        Objects.equals(this.wmarkRatio, v1alpha1NodeSLOSpecResourceQOSStrategyBeClassMemoryQOS.wmarkRatio) &&
        Objects.equals(this.wmarkScalePermill, v1alpha1NodeSLOSpecResourceQOSStrategyBeClassMemoryQOS.wmarkScalePermill);
  }

  @Override
  public int hashCode() {
    return Objects.hash(enable, lowLimitPercent, minLimitPercent, oomKillGroup, priority, priorityEnable, throttlingPercent, wmarkMinAdj, wmarkRatio, wmarkScalePermill);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class V1alpha1NodeSLOSpecResourceQOSStrategyBeClassMemoryQOS {\n");
    sb.append("    enable: ").append(toIndentedString(enable)).append("\n");
    sb.append("    lowLimitPercent: ").append(toIndentedString(lowLimitPercent)).append("\n");
    sb.append("    minLimitPercent: ").append(toIndentedString(minLimitPercent)).append("\n");
    sb.append("    oomKillGroup: ").append(toIndentedString(oomKillGroup)).append("\n");
    sb.append("    priority: ").append(toIndentedString(priority)).append("\n");
    sb.append("    priorityEnable: ").append(toIndentedString(priorityEnable)).append("\n");
    sb.append("    throttlingPercent: ").append(toIndentedString(throttlingPercent)).append("\n");
    sb.append("    wmarkMinAdj: ").append(toIndentedString(wmarkMinAdj)).append("\n");
    sb.append("    wmarkRatio: ").append(toIndentedString(wmarkRatio)).append("\n");
    sb.append("    wmarkScalePermill: ").append(toIndentedString(wmarkScalePermill)).append("\n");
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

