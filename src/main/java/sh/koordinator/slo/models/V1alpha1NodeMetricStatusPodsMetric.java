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
import sh.koordinator.slo.models.V1alpha1NodeMetricStatusNodeMetricUsage;

/**
 * V1alpha1NodeMetricStatusPodsMetric
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2023-07-17T16:56:51.835Z[Etc/UTC]")
public class V1alpha1NodeMetricStatusPodsMetric {
  public static final String SERIALIZED_NAME_EXTENSIONS = "extensions";
  @SerializedName(SERIALIZED_NAME_EXTENSIONS)
  private Object extensions;

  public static final String SERIALIZED_NAME_NAME = "name";
  @SerializedName(SERIALIZED_NAME_NAME)
  private String name;

  public static final String SERIALIZED_NAME_NAMESPACE = "namespace";
  @SerializedName(SERIALIZED_NAME_NAMESPACE)
  private String namespace;

  public static final String SERIALIZED_NAME_POD_USAGE = "podUsage";
  @SerializedName(SERIALIZED_NAME_POD_USAGE)
  private V1alpha1NodeMetricStatusNodeMetricUsage podUsage;


  public V1alpha1NodeMetricStatusPodsMetric extensions(Object extensions) {
    
    this.extensions = extensions;
    return this;
  }

   /**
   * Third party extensions for PodMetric
   * @return extensions
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Third party extensions for PodMetric")

  public Object getExtensions() {
    return extensions;
  }


  public void setExtensions(Object extensions) {
    this.extensions = extensions;
  }


  public V1alpha1NodeMetricStatusPodsMetric name(String name) {
    
    this.name = name;
    return this;
  }

   /**
   * Get name
   * @return name
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getName() {
    return name;
  }


  public void setName(String name) {
    this.name = name;
  }


  public V1alpha1NodeMetricStatusPodsMetric namespace(String namespace) {
    
    this.namespace = namespace;
    return this;
  }

   /**
   * Get namespace
   * @return namespace
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getNamespace() {
    return namespace;
  }


  public void setNamespace(String namespace) {
    this.namespace = namespace;
  }


  public V1alpha1NodeMetricStatusPodsMetric podUsage(V1alpha1NodeMetricStatusNodeMetricUsage podUsage) {
    
    this.podUsage = podUsage;
    return this;
  }

   /**
   * Get podUsage
   * @return podUsage
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public V1alpha1NodeMetricStatusNodeMetricUsage getPodUsage() {
    return podUsage;
  }


  public void setPodUsage(V1alpha1NodeMetricStatusNodeMetricUsage podUsage) {
    this.podUsage = podUsage;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    V1alpha1NodeMetricStatusPodsMetric v1alpha1NodeMetricStatusPodsMetric = (V1alpha1NodeMetricStatusPodsMetric) o;
    return Objects.equals(this.extensions, v1alpha1NodeMetricStatusPodsMetric.extensions) &&
        Objects.equals(this.name, v1alpha1NodeMetricStatusPodsMetric.name) &&
        Objects.equals(this.namespace, v1alpha1NodeMetricStatusPodsMetric.namespace) &&
        Objects.equals(this.podUsage, v1alpha1NodeMetricStatusPodsMetric.podUsage);
  }

  @Override
  public int hashCode() {
    return Objects.hash(extensions, name, namespace, podUsage);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class V1alpha1NodeMetricStatusPodsMetric {\n");
    sb.append("    extensions: ").append(toIndentedString(extensions)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    namespace: ").append(toIndentedString(namespace)).append("\n");
    sb.append("    podUsage: ").append(toIndentedString(podUsage)).append("\n");
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

