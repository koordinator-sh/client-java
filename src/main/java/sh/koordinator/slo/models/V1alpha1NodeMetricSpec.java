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
import sh.koordinator.slo.models.V1alpha1NodeMetricSpecMetricCollectPolicy;

/**
 * NodeMetricSpec defines the desired state of NodeMetric
 */
@ApiModel(description = "NodeMetricSpec defines the desired state of NodeMetric")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2023-07-17T16:56:51.835Z[Etc/UTC]")
public class V1alpha1NodeMetricSpec {
  public static final String SERIALIZED_NAME_METRIC_COLLECT_POLICY = "metricCollectPolicy";
  @SerializedName(SERIALIZED_NAME_METRIC_COLLECT_POLICY)
  private V1alpha1NodeMetricSpecMetricCollectPolicy metricCollectPolicy;


  public V1alpha1NodeMetricSpec metricCollectPolicy(V1alpha1NodeMetricSpecMetricCollectPolicy metricCollectPolicy) {
    
    this.metricCollectPolicy = metricCollectPolicy;
    return this;
  }

   /**
   * Get metricCollectPolicy
   * @return metricCollectPolicy
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public V1alpha1NodeMetricSpecMetricCollectPolicy getMetricCollectPolicy() {
    return metricCollectPolicy;
  }


  public void setMetricCollectPolicy(V1alpha1NodeMetricSpecMetricCollectPolicy metricCollectPolicy) {
    this.metricCollectPolicy = metricCollectPolicy;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    V1alpha1NodeMetricSpec v1alpha1NodeMetricSpec = (V1alpha1NodeMetricSpec) o;
    return Objects.equals(this.metricCollectPolicy, v1alpha1NodeMetricSpec.metricCollectPolicy);
  }

  @Override
  public int hashCode() {
    return Objects.hash(metricCollectPolicy);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class V1alpha1NodeMetricSpec {\n");
    sb.append("    metricCollectPolicy: ").append(toIndentedString(metricCollectPolicy)).append("\n");
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

