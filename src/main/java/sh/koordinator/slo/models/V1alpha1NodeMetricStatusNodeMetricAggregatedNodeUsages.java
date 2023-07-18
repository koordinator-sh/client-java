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
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import sh.koordinator.slo.models.V1alpha1NodeMetricStatusNodeMetricUsage;

/**
 * V1alpha1NodeMetricStatusNodeMetricAggregatedNodeUsages
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2023-07-17T16:56:51.835Z[Etc/UTC]")
public class V1alpha1NodeMetricStatusNodeMetricAggregatedNodeUsages {
  public static final String SERIALIZED_NAME_DURATION = "duration";
  @SerializedName(SERIALIZED_NAME_DURATION)
  private String duration;

  public static final String SERIALIZED_NAME_USAGE = "usage";
  @SerializedName(SERIALIZED_NAME_USAGE)
  private Map<String, V1alpha1NodeMetricStatusNodeMetricUsage> usage = null;


  public V1alpha1NodeMetricStatusNodeMetricAggregatedNodeUsages duration(String duration) {
    
    this.duration = duration;
    return this;
  }

   /**
   * Get duration
   * @return duration
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getDuration() {
    return duration;
  }


  public void setDuration(String duration) {
    this.duration = duration;
  }


  public V1alpha1NodeMetricStatusNodeMetricAggregatedNodeUsages usage(Map<String, V1alpha1NodeMetricStatusNodeMetricUsage> usage) {
    
    this.usage = usage;
    return this;
  }

  public V1alpha1NodeMetricStatusNodeMetricAggregatedNodeUsages putUsageItem(String key, V1alpha1NodeMetricStatusNodeMetricUsage usageItem) {
    if (this.usage == null) {
      this.usage = new HashMap<>();
    }
    this.usage.put(key, usageItem);
    return this;
  }

   /**
   * Get usage
   * @return usage
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Map<String, V1alpha1NodeMetricStatusNodeMetricUsage> getUsage() {
    return usage;
  }


  public void setUsage(Map<String, V1alpha1NodeMetricStatusNodeMetricUsage> usage) {
    this.usage = usage;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    V1alpha1NodeMetricStatusNodeMetricAggregatedNodeUsages v1alpha1NodeMetricStatusNodeMetricAggregatedNodeUsages = (V1alpha1NodeMetricStatusNodeMetricAggregatedNodeUsages) o;
    return Objects.equals(this.duration, v1alpha1NodeMetricStatusNodeMetricAggregatedNodeUsages.duration) &&
        Objects.equals(this.usage, v1alpha1NodeMetricStatusNodeMetricAggregatedNodeUsages.usage);
  }

  @Override
  public int hashCode() {
    return Objects.hash(duration, usage);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class V1alpha1NodeMetricStatusNodeMetricAggregatedNodeUsages {\n");
    sb.append("    duration: ").append(toIndentedString(duration)).append("\n");
    sb.append("    usage: ").append(toIndentedString(usage)).append("\n");
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

