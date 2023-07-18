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
 * CPU Burst Strategy
 */
@ApiModel(description = "CPU Burst Strategy")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2023-07-17T16:57:54.694Z[Etc/UTC]")
public class V1alpha1NodeSLOSpecCpuBurstStrategy {
  public static final String SERIALIZED_NAME_CFS_QUOTA_BURST_PERCENT = "cfsQuotaBurstPercent";
  @SerializedName(SERIALIZED_NAME_CFS_QUOTA_BURST_PERCENT)
  private Long cfsQuotaBurstPercent;

  public static final String SERIALIZED_NAME_CFS_QUOTA_BURST_PERIOD_SECONDS = "cfsQuotaBurstPeriodSeconds";
  @SerializedName(SERIALIZED_NAME_CFS_QUOTA_BURST_PERIOD_SECONDS)
  private Long cfsQuotaBurstPeriodSeconds;

  public static final String SERIALIZED_NAME_CPU_BURST_PERCENT = "cpuBurstPercent";
  @SerializedName(SERIALIZED_NAME_CPU_BURST_PERCENT)
  private Long cpuBurstPercent;

  public static final String SERIALIZED_NAME_POLICY = "policy";
  @SerializedName(SERIALIZED_NAME_POLICY)
  private String policy;

  public static final String SERIALIZED_NAME_SHARE_POOL_THRESHOLD_PERCENT = "sharePoolThresholdPercent";
  @SerializedName(SERIALIZED_NAME_SHARE_POOL_THRESHOLD_PERCENT)
  private Long sharePoolThresholdPercent;


  public V1alpha1NodeSLOSpecCpuBurstStrategy cfsQuotaBurstPercent(Long cfsQuotaBurstPercent) {
    
    this.cfsQuotaBurstPercent = cfsQuotaBurstPercent;
    return this;
  }

   /**
   * pod cfs quota scale up ceil percentage, default &#x3D; 300 (300%)
   * @return cfsQuotaBurstPercent
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "pod cfs quota scale up ceil percentage, default = 300 (300%)")

  public Long getCfsQuotaBurstPercent() {
    return cfsQuotaBurstPercent;
  }


  public void setCfsQuotaBurstPercent(Long cfsQuotaBurstPercent) {
    this.cfsQuotaBurstPercent = cfsQuotaBurstPercent;
  }


  public V1alpha1NodeSLOSpecCpuBurstStrategy cfsQuotaBurstPeriodSeconds(Long cfsQuotaBurstPeriodSeconds) {
    
    this.cfsQuotaBurstPeriodSeconds = cfsQuotaBurstPeriodSeconds;
    return this;
  }

   /**
   * specifies a period of time for pod can use at burst, default &#x3D; -1 (unlimited)
   * @return cfsQuotaBurstPeriodSeconds
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "specifies a period of time for pod can use at burst, default = -1 (unlimited)")

  public Long getCfsQuotaBurstPeriodSeconds() {
    return cfsQuotaBurstPeriodSeconds;
  }


  public void setCfsQuotaBurstPeriodSeconds(Long cfsQuotaBurstPeriodSeconds) {
    this.cfsQuotaBurstPeriodSeconds = cfsQuotaBurstPeriodSeconds;
  }


  public V1alpha1NodeSLOSpecCpuBurstStrategy cpuBurstPercent(Long cpuBurstPercent) {
    
    this.cpuBurstPercent = cpuBurstPercent;
    return this;
  }

   /**
   * cpu burst percentage for setting cpu.cfs_burst_us, legal range: [0, 10000], default as 1000 (1000%)
   * minimum: 0
   * maximum: 10000
   * @return cpuBurstPercent
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "cpu burst percentage for setting cpu.cfs_burst_us, legal range: [0, 10000], default as 1000 (1000%)")

  public Long getCpuBurstPercent() {
    return cpuBurstPercent;
  }


  public void setCpuBurstPercent(Long cpuBurstPercent) {
    this.cpuBurstPercent = cpuBurstPercent;
  }


  public V1alpha1NodeSLOSpecCpuBurstStrategy policy(String policy) {
    
    this.policy = policy;
    return this;
  }

   /**
   * Get policy
   * @return policy
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getPolicy() {
    return policy;
  }


  public void setPolicy(String policy) {
    this.policy = policy;
  }


  public V1alpha1NodeSLOSpecCpuBurstStrategy sharePoolThresholdPercent(Long sharePoolThresholdPercent) {
    
    this.sharePoolThresholdPercent = sharePoolThresholdPercent;
    return this;
  }

   /**
   * scale down cfs quota if node cpu overload, default &#x3D; 50
   * @return sharePoolThresholdPercent
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "scale down cfs quota if node cpu overload, default = 50")

  public Long getSharePoolThresholdPercent() {
    return sharePoolThresholdPercent;
  }


  public void setSharePoolThresholdPercent(Long sharePoolThresholdPercent) {
    this.sharePoolThresholdPercent = sharePoolThresholdPercent;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    V1alpha1NodeSLOSpecCpuBurstStrategy v1alpha1NodeSLOSpecCpuBurstStrategy = (V1alpha1NodeSLOSpecCpuBurstStrategy) o;
    return Objects.equals(this.cfsQuotaBurstPercent, v1alpha1NodeSLOSpecCpuBurstStrategy.cfsQuotaBurstPercent) &&
        Objects.equals(this.cfsQuotaBurstPeriodSeconds, v1alpha1NodeSLOSpecCpuBurstStrategy.cfsQuotaBurstPeriodSeconds) &&
        Objects.equals(this.cpuBurstPercent, v1alpha1NodeSLOSpecCpuBurstStrategy.cpuBurstPercent) &&
        Objects.equals(this.policy, v1alpha1NodeSLOSpecCpuBurstStrategy.policy) &&
        Objects.equals(this.sharePoolThresholdPercent, v1alpha1NodeSLOSpecCpuBurstStrategy.sharePoolThresholdPercent);
  }

  @Override
  public int hashCode() {
    return Objects.hash(cfsQuotaBurstPercent, cfsQuotaBurstPeriodSeconds, cpuBurstPercent, policy, sharePoolThresholdPercent);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class V1alpha1NodeSLOSpecCpuBurstStrategy {\n");
    sb.append("    cfsQuotaBurstPercent: ").append(toIndentedString(cfsQuotaBurstPercent)).append("\n");
    sb.append("    cfsQuotaBurstPeriodSeconds: ").append(toIndentedString(cfsQuotaBurstPeriodSeconds)).append("\n");
    sb.append("    cpuBurstPercent: ").append(toIndentedString(cpuBurstPercent)).append("\n");
    sb.append("    policy: ").append(toIndentedString(policy)).append("\n");
    sb.append("    sharePoolThresholdPercent: ").append(toIndentedString(sharePoolThresholdPercent)).append("\n");
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

