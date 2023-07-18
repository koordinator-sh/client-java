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
import sh.koordinator.slo.models.V1alpha1NodeMetricSpecMetricCollectPolicyNodeAggregatePolicy;

/**
 * CollectPolicy defines the Metric collection policy
 */
@ApiModel(description = "CollectPolicy defines the Metric collection policy")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2023-07-17T16:56:51.835Z[Etc/UTC]")
public class V1alpha1NodeMetricSpecMetricCollectPolicy {
  public static final String SERIALIZED_NAME_AGGREGATE_DURATION_SECONDS = "aggregateDurationSeconds";
  @SerializedName(SERIALIZED_NAME_AGGREGATE_DURATION_SECONDS)
  private Long aggregateDurationSeconds;

  public static final String SERIALIZED_NAME_NODE_AGGREGATE_POLICY = "nodeAggregatePolicy";
  @SerializedName(SERIALIZED_NAME_NODE_AGGREGATE_POLICY)
  private V1alpha1NodeMetricSpecMetricCollectPolicyNodeAggregatePolicy nodeAggregatePolicy;

  public static final String SERIALIZED_NAME_REPORT_INTERVAL_SECONDS = "reportIntervalSeconds";
  @SerializedName(SERIALIZED_NAME_REPORT_INTERVAL_SECONDS)
  private Long reportIntervalSeconds;


  public V1alpha1NodeMetricSpecMetricCollectPolicy aggregateDurationSeconds(Long aggregateDurationSeconds) {
    
    this.aggregateDurationSeconds = aggregateDurationSeconds;
    return this;
  }

   /**
   * AggregateDurationSeconds represents the aggregation period in seconds
   * @return aggregateDurationSeconds
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "AggregateDurationSeconds represents the aggregation period in seconds")

  public Long getAggregateDurationSeconds() {
    return aggregateDurationSeconds;
  }


  public void setAggregateDurationSeconds(Long aggregateDurationSeconds) {
    this.aggregateDurationSeconds = aggregateDurationSeconds;
  }


  public V1alpha1NodeMetricSpecMetricCollectPolicy nodeAggregatePolicy(V1alpha1NodeMetricSpecMetricCollectPolicyNodeAggregatePolicy nodeAggregatePolicy) {
    
    this.nodeAggregatePolicy = nodeAggregatePolicy;
    return this;
  }

   /**
   * Get nodeAggregatePolicy
   * @return nodeAggregatePolicy
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public V1alpha1NodeMetricSpecMetricCollectPolicyNodeAggregatePolicy getNodeAggregatePolicy() {
    return nodeAggregatePolicy;
  }


  public void setNodeAggregatePolicy(V1alpha1NodeMetricSpecMetricCollectPolicyNodeAggregatePolicy nodeAggregatePolicy) {
    this.nodeAggregatePolicy = nodeAggregatePolicy;
  }


  public V1alpha1NodeMetricSpecMetricCollectPolicy reportIntervalSeconds(Long reportIntervalSeconds) {
    
    this.reportIntervalSeconds = reportIntervalSeconds;
    return this;
  }

   /**
   * ReportIntervalSeconds represents the report period in seconds
   * @return reportIntervalSeconds
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "ReportIntervalSeconds represents the report period in seconds")

  public Long getReportIntervalSeconds() {
    return reportIntervalSeconds;
  }


  public void setReportIntervalSeconds(Long reportIntervalSeconds) {
    this.reportIntervalSeconds = reportIntervalSeconds;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    V1alpha1NodeMetricSpecMetricCollectPolicy v1alpha1NodeMetricSpecMetricCollectPolicy = (V1alpha1NodeMetricSpecMetricCollectPolicy) o;
    return Objects.equals(this.aggregateDurationSeconds, v1alpha1NodeMetricSpecMetricCollectPolicy.aggregateDurationSeconds) &&
        Objects.equals(this.nodeAggregatePolicy, v1alpha1NodeMetricSpecMetricCollectPolicy.nodeAggregatePolicy) &&
        Objects.equals(this.reportIntervalSeconds, v1alpha1NodeMetricSpecMetricCollectPolicy.reportIntervalSeconds);
  }

  @Override
  public int hashCode() {
    return Objects.hash(aggregateDurationSeconds, nodeAggregatePolicy, reportIntervalSeconds);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class V1alpha1NodeMetricSpecMetricCollectPolicy {\n");
    sb.append("    aggregateDurationSeconds: ").append(toIndentedString(aggregateDurationSeconds)).append("\n");
    sb.append("    nodeAggregatePolicy: ").append(toIndentedString(nodeAggregatePolicy)).append("\n");
    sb.append("    reportIntervalSeconds: ").append(toIndentedString(reportIntervalSeconds)).append("\n");
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

