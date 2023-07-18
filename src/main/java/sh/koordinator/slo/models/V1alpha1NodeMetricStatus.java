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
import java.time.OffsetDateTime;
import java.util.ArrayList;
import java.util.List;
import sh.koordinator.slo.models.V1alpha1NodeMetricStatusNodeMetric;
import sh.koordinator.slo.models.V1alpha1NodeMetricStatusPodsMetric;
import sh.koordinator.slo.models.V1alpha1NodeMetricStatusProdReclaimableMetric;

/**
 * NodeMetricStatus defines the observed state of NodeMetric
 */
@ApiModel(description = "NodeMetricStatus defines the observed state of NodeMetric")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2023-07-17T16:56:51.835Z[Etc/UTC]")
public class V1alpha1NodeMetricStatus {
  public static final String SERIALIZED_NAME_NODE_METRIC = "nodeMetric";
  @SerializedName(SERIALIZED_NAME_NODE_METRIC)
  private V1alpha1NodeMetricStatusNodeMetric nodeMetric;

  public static final String SERIALIZED_NAME_PODS_METRIC = "podsMetric";
  @SerializedName(SERIALIZED_NAME_PODS_METRIC)
  private List<V1alpha1NodeMetricStatusPodsMetric> podsMetric = null;

  public static final String SERIALIZED_NAME_PROD_RECLAIMABLE_METRIC = "prodReclaimableMetric";
  @SerializedName(SERIALIZED_NAME_PROD_RECLAIMABLE_METRIC)
  private V1alpha1NodeMetricStatusProdReclaimableMetric prodReclaimableMetric;

  public static final String SERIALIZED_NAME_UPDATE_TIME = "updateTime";
  @SerializedName(SERIALIZED_NAME_UPDATE_TIME)
  private OffsetDateTime updateTime;


  public V1alpha1NodeMetricStatus nodeMetric(V1alpha1NodeMetricStatusNodeMetric nodeMetric) {
    
    this.nodeMetric = nodeMetric;
    return this;
  }

   /**
   * Get nodeMetric
   * @return nodeMetric
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public V1alpha1NodeMetricStatusNodeMetric getNodeMetric() {
    return nodeMetric;
  }


  public void setNodeMetric(V1alpha1NodeMetricStatusNodeMetric nodeMetric) {
    this.nodeMetric = nodeMetric;
  }


  public V1alpha1NodeMetricStatus podsMetric(List<V1alpha1NodeMetricStatusPodsMetric> podsMetric) {
    
    this.podsMetric = podsMetric;
    return this;
  }

  public V1alpha1NodeMetricStatus addPodsMetricItem(V1alpha1NodeMetricStatusPodsMetric podsMetricItem) {
    if (this.podsMetric == null) {
      this.podsMetric = new ArrayList<>();
    }
    this.podsMetric.add(podsMetricItem);
    return this;
  }

   /**
   * PodsMetric contains the metrics for pods belong to this node.
   * @return podsMetric
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "PodsMetric contains the metrics for pods belong to this node.")

  public List<V1alpha1NodeMetricStatusPodsMetric> getPodsMetric() {
    return podsMetric;
  }


  public void setPodsMetric(List<V1alpha1NodeMetricStatusPodsMetric> podsMetric) {
    this.podsMetric = podsMetric;
  }


  public V1alpha1NodeMetricStatus prodReclaimableMetric(V1alpha1NodeMetricStatusProdReclaimableMetric prodReclaimableMetric) {
    
    this.prodReclaimableMetric = prodReclaimableMetric;
    return this;
  }

   /**
   * Get prodReclaimableMetric
   * @return prodReclaimableMetric
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public V1alpha1NodeMetricStatusProdReclaimableMetric getProdReclaimableMetric() {
    return prodReclaimableMetric;
  }


  public void setProdReclaimableMetric(V1alpha1NodeMetricStatusProdReclaimableMetric prodReclaimableMetric) {
    this.prodReclaimableMetric = prodReclaimableMetric;
  }


  public V1alpha1NodeMetricStatus updateTime(OffsetDateTime updateTime) {
    
    this.updateTime = updateTime;
    return this;
  }

   /**
   * UpdateTime is the last time this NodeMetric was updated.
   * @return updateTime
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "UpdateTime is the last time this NodeMetric was updated.")

  public OffsetDateTime getUpdateTime() {
    return updateTime;
  }


  public void setUpdateTime(OffsetDateTime updateTime) {
    this.updateTime = updateTime;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    V1alpha1NodeMetricStatus v1alpha1NodeMetricStatus = (V1alpha1NodeMetricStatus) o;
    return Objects.equals(this.nodeMetric, v1alpha1NodeMetricStatus.nodeMetric) &&
        Objects.equals(this.podsMetric, v1alpha1NodeMetricStatus.podsMetric) &&
        Objects.equals(this.prodReclaimableMetric, v1alpha1NodeMetricStatus.prodReclaimableMetric) &&
        Objects.equals(this.updateTime, v1alpha1NodeMetricStatus.updateTime);
  }

  @Override
  public int hashCode() {
    return Objects.hash(nodeMetric, podsMetric, prodReclaimableMetric, updateTime);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class V1alpha1NodeMetricStatus {\n");
    sb.append("    nodeMetric: ").append(toIndentedString(nodeMetric)).append("\n");
    sb.append("    podsMetric: ").append(toIndentedString(podsMetric)).append("\n");
    sb.append("    prodReclaimableMetric: ").append(toIndentedString(prodReclaimableMetric)).append("\n");
    sb.append("    updateTime: ").append(toIndentedString(updateTime)).append("\n");
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

