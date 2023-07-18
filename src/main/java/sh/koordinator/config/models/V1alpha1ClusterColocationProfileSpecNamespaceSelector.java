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


package sh.koordinator.config.models;

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
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import sh.koordinator.config.models.V1alpha1ClusterColocationProfileSpecNamespaceSelectorMatchExpressions;

/**
 * NamespaceSelector decides whether to mutate/validate Pods if the namespace matches the selector. Default to the empty LabelSelector, which matches everything.
 */
@ApiModel(description = "NamespaceSelector decides whether to mutate/validate Pods if the namespace matches the selector. Default to the empty LabelSelector, which matches everything.")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2023-07-17T16:55:20.989Z[Etc/UTC]")
public class V1alpha1ClusterColocationProfileSpecNamespaceSelector {
  public static final String SERIALIZED_NAME_MATCH_EXPRESSIONS = "matchExpressions";
  @SerializedName(SERIALIZED_NAME_MATCH_EXPRESSIONS)
  private List<V1alpha1ClusterColocationProfileSpecNamespaceSelectorMatchExpressions> matchExpressions = null;

  public static final String SERIALIZED_NAME_MATCH_LABELS = "matchLabels";
  @SerializedName(SERIALIZED_NAME_MATCH_LABELS)
  private Map<String, String> matchLabels = null;


  public V1alpha1ClusterColocationProfileSpecNamespaceSelector matchExpressions(List<V1alpha1ClusterColocationProfileSpecNamespaceSelectorMatchExpressions> matchExpressions) {
    
    this.matchExpressions = matchExpressions;
    return this;
  }

  public V1alpha1ClusterColocationProfileSpecNamespaceSelector addMatchExpressionsItem(V1alpha1ClusterColocationProfileSpecNamespaceSelectorMatchExpressions matchExpressionsItem) {
    if (this.matchExpressions == null) {
      this.matchExpressions = new ArrayList<>();
    }
    this.matchExpressions.add(matchExpressionsItem);
    return this;
  }

   /**
   * matchExpressions is a list of label selector requirements. The requirements are ANDed.
   * @return matchExpressions
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "matchExpressions is a list of label selector requirements. The requirements are ANDed.")

  public List<V1alpha1ClusterColocationProfileSpecNamespaceSelectorMatchExpressions> getMatchExpressions() {
    return matchExpressions;
  }


  public void setMatchExpressions(List<V1alpha1ClusterColocationProfileSpecNamespaceSelectorMatchExpressions> matchExpressions) {
    this.matchExpressions = matchExpressions;
  }


  public V1alpha1ClusterColocationProfileSpecNamespaceSelector matchLabels(Map<String, String> matchLabels) {
    
    this.matchLabels = matchLabels;
    return this;
  }

  public V1alpha1ClusterColocationProfileSpecNamespaceSelector putMatchLabelsItem(String key, String matchLabelsItem) {
    if (this.matchLabels == null) {
      this.matchLabels = new HashMap<>();
    }
    this.matchLabels.put(key, matchLabelsItem);
    return this;
  }

   /**
   * matchLabels is a map of {key,value} pairs. A single {key,value} in the matchLabels map is equivalent to an element of matchExpressions, whose key field is \&quot;key\&quot;, the operator is \&quot;In\&quot;, and the values array contains only \&quot;value\&quot;. The requirements are ANDed.
   * @return matchLabels
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "matchLabels is a map of {key,value} pairs. A single {key,value} in the matchLabels map is equivalent to an element of matchExpressions, whose key field is \"key\", the operator is \"In\", and the values array contains only \"value\". The requirements are ANDed.")

  public Map<String, String> getMatchLabels() {
    return matchLabels;
  }


  public void setMatchLabels(Map<String, String> matchLabels) {
    this.matchLabels = matchLabels;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    V1alpha1ClusterColocationProfileSpecNamespaceSelector v1alpha1ClusterColocationProfileSpecNamespaceSelector = (V1alpha1ClusterColocationProfileSpecNamespaceSelector) o;
    return Objects.equals(this.matchExpressions, v1alpha1ClusterColocationProfileSpecNamespaceSelector.matchExpressions) &&
        Objects.equals(this.matchLabels, v1alpha1ClusterColocationProfileSpecNamespaceSelector.matchLabels);
  }

  @Override
  public int hashCode() {
    return Objects.hash(matchExpressions, matchLabels);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class V1alpha1ClusterColocationProfileSpecNamespaceSelector {\n");
    sb.append("    matchExpressions: ").append(toIndentedString(matchExpressions)).append("\n");
    sb.append("    matchLabels: ").append(toIndentedString(matchLabels)).append("\n");
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

