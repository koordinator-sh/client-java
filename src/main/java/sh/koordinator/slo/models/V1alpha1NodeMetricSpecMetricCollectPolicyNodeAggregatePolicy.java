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

/**
 * NodeAggregatePolicy represents the target grain of node aggregated usage
 */
@ApiModel(description = "NodeAggregatePolicy represents the target grain of node aggregated usage")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2023-07-17T16:56:51.835Z[Etc/UTC]")
public class V1alpha1NodeMetricSpecMetricCollectPolicyNodeAggregatePolicy {
  public static final String SERIALIZED_NAME_DURATIONS = "durations";
  @SerializedName(SERIALIZED_NAME_DURATIONS)
  private List<String> durations = null;


  public V1alpha1NodeMetricSpecMetricCollectPolicyNodeAggregatePolicy durations(List<String> durations) {
    
    this.durations = durations;
    return this;
  }

  public V1alpha1NodeMetricSpecMetricCollectPolicyNodeAggregatePolicy addDurationsItem(String durationsItem) {
    if (this.durations == null) {
      this.durations = new ArrayList<>();
    }
    this.durations.add(durationsItem);
    return this;
  }

   /**
   * Get durations
   * @return durations
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public List<String> getDurations() {
    return durations;
  }


  public void setDurations(List<String> durations) {
    this.durations = durations;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    V1alpha1NodeMetricSpecMetricCollectPolicyNodeAggregatePolicy v1alpha1NodeMetricSpecMetricCollectPolicyNodeAggregatePolicy = (V1alpha1NodeMetricSpecMetricCollectPolicyNodeAggregatePolicy) o;
    return Objects.equals(this.durations, v1alpha1NodeMetricSpecMetricCollectPolicyNodeAggregatePolicy.durations);
  }

  @Override
  public int hashCode() {
    return Objects.hash(durations);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class V1alpha1NodeMetricSpecMetricCollectPolicyNodeAggregatePolicy {\n");
    sb.append("    durations: ").append(toIndentedString(durations)).append("\n");
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

