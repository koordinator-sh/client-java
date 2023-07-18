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
import java.util.ArrayList;
import java.util.List;
import sh.koordinator.slo.models.V1alpha1NodeMetricStatusNodeMetricAggregatedNodeUsages;
import sh.koordinator.slo.models.V1alpha1NodeMetricStatusNodeMetricNodeUsage;
import sh.koordinator.slo.models.V1alpha1NodeMetricStatusNodeMetricSystemUsage;

/**
 * NodeMetric contains the metrics for this node.
 */
@ApiModel(description = "NodeMetric contains the metrics for this node.")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2023-07-17T16:56:51.835Z[Etc/UTC]")
public class V1alpha1NodeMetricStatusNodeMetric {
  public static final String SERIALIZED_NAME_AGGREGATED_NODE_USAGES = "aggregatedNodeUsages";
  @SerializedName(SERIALIZED_NAME_AGGREGATED_NODE_USAGES)
  private List<V1alpha1NodeMetricStatusNodeMetricAggregatedNodeUsages> aggregatedNodeUsages = null;

  public static final String SERIALIZED_NAME_AGGREGATED_SYSTEM_USAGES = "aggregatedSystemUsages";
  @SerializedName(SERIALIZED_NAME_AGGREGATED_SYSTEM_USAGES)
  private List<V1alpha1NodeMetricStatusNodeMetricAggregatedNodeUsages> aggregatedSystemUsages = null;

  public static final String SERIALIZED_NAME_NODE_USAGE = "nodeUsage";
  @SerializedName(SERIALIZED_NAME_NODE_USAGE)
  private V1alpha1NodeMetricStatusNodeMetricNodeUsage nodeUsage;

  public static final String SERIALIZED_NAME_SYSTEM_USAGE = "systemUsage";
  @SerializedName(SERIALIZED_NAME_SYSTEM_USAGE)
  private V1alpha1NodeMetricStatusNodeMetricSystemUsage systemUsage;


  public V1alpha1NodeMetricStatusNodeMetric aggregatedNodeUsages(List<V1alpha1NodeMetricStatusNodeMetricAggregatedNodeUsages> aggregatedNodeUsages) {
    
    this.aggregatedNodeUsages = aggregatedNodeUsages;
    return this;
  }

  public V1alpha1NodeMetricStatusNodeMetric addAggregatedNodeUsagesItem(V1alpha1NodeMetricStatusNodeMetricAggregatedNodeUsages aggregatedNodeUsagesItem) {
    if (this.aggregatedNodeUsages == null) {
      this.aggregatedNodeUsages = new ArrayList<>();
    }
    this.aggregatedNodeUsages.add(aggregatedNodeUsagesItem);
    return this;
  }

   /**
   * AggregatedNodeUsages will report only if there are enough samples
   * @return aggregatedNodeUsages
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "AggregatedNodeUsages will report only if there are enough samples")

  public List<V1alpha1NodeMetricStatusNodeMetricAggregatedNodeUsages> getAggregatedNodeUsages() {
    return aggregatedNodeUsages;
  }


  public void setAggregatedNodeUsages(List<V1alpha1NodeMetricStatusNodeMetricAggregatedNodeUsages> aggregatedNodeUsages) {
    this.aggregatedNodeUsages = aggregatedNodeUsages;
  }


  public V1alpha1NodeMetricStatusNodeMetric aggregatedSystemUsages(List<V1alpha1NodeMetricStatusNodeMetricAggregatedNodeUsages> aggregatedSystemUsages) {
    
    this.aggregatedSystemUsages = aggregatedSystemUsages;
    return this;
  }

  public V1alpha1NodeMetricStatusNodeMetric addAggregatedSystemUsagesItem(V1alpha1NodeMetricStatusNodeMetricAggregatedNodeUsages aggregatedSystemUsagesItem) {
    if (this.aggregatedSystemUsages == null) {
      this.aggregatedSystemUsages = new ArrayList<>();
    }
    this.aggregatedSystemUsages.add(aggregatedSystemUsagesItem);
    return this;
  }

   /**
   * AggregatedSystemUsages will report only if there are enough samples Deleted pods will be excluded during aggregation
   * @return aggregatedSystemUsages
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "AggregatedSystemUsages will report only if there are enough samples Deleted pods will be excluded during aggregation")

  public List<V1alpha1NodeMetricStatusNodeMetricAggregatedNodeUsages> getAggregatedSystemUsages() {
    return aggregatedSystemUsages;
  }


  public void setAggregatedSystemUsages(List<V1alpha1NodeMetricStatusNodeMetricAggregatedNodeUsages> aggregatedSystemUsages) {
    this.aggregatedSystemUsages = aggregatedSystemUsages;
  }


  public V1alpha1NodeMetricStatusNodeMetric nodeUsage(V1alpha1NodeMetricStatusNodeMetricNodeUsage nodeUsage) {
    
    this.nodeUsage = nodeUsage;
    return this;
  }

   /**
   * Get nodeUsage
   * @return nodeUsage
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public V1alpha1NodeMetricStatusNodeMetricNodeUsage getNodeUsage() {
    return nodeUsage;
  }


  public void setNodeUsage(V1alpha1NodeMetricStatusNodeMetricNodeUsage nodeUsage) {
    this.nodeUsage = nodeUsage;
  }


  public V1alpha1NodeMetricStatusNodeMetric systemUsage(V1alpha1NodeMetricStatusNodeMetricSystemUsage systemUsage) {
    
    this.systemUsage = systemUsage;
    return this;
  }

   /**
   * Get systemUsage
   * @return systemUsage
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public V1alpha1NodeMetricStatusNodeMetricSystemUsage getSystemUsage() {
    return systemUsage;
  }


  public void setSystemUsage(V1alpha1NodeMetricStatusNodeMetricSystemUsage systemUsage) {
    this.systemUsage = systemUsage;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    V1alpha1NodeMetricStatusNodeMetric v1alpha1NodeMetricStatusNodeMetric = (V1alpha1NodeMetricStatusNodeMetric) o;
    return Objects.equals(this.aggregatedNodeUsages, v1alpha1NodeMetricStatusNodeMetric.aggregatedNodeUsages) &&
        Objects.equals(this.aggregatedSystemUsages, v1alpha1NodeMetricStatusNodeMetric.aggregatedSystemUsages) &&
        Objects.equals(this.nodeUsage, v1alpha1NodeMetricStatusNodeMetric.nodeUsage) &&
        Objects.equals(this.systemUsage, v1alpha1NodeMetricStatusNodeMetric.systemUsage);
  }

  @Override
  public int hashCode() {
    return Objects.hash(aggregatedNodeUsages, aggregatedSystemUsages, nodeUsage, systemUsage);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class V1alpha1NodeMetricStatusNodeMetric {\n");
    sb.append("    aggregatedNodeUsages: ").append(toIndentedString(aggregatedNodeUsages)).append("\n");
    sb.append("    aggregatedSystemUsages: ").append(toIndentedString(aggregatedSystemUsages)).append("\n");
    sb.append("    nodeUsage: ").append(toIndentedString(nodeUsage)).append("\n");
    sb.append("    systemUsage: ").append(toIndentedString(systemUsage)).append("\n");
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

