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
import io.kubernetes.client.custom.IntOrString;
import io.kubernetes.client.proto.Meta.Patch;
import io.kubernetes.client.proto.Runtime.RawExtension;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import sh.koordinator.config.models.V1alpha1ClusterColocationProfileSpecNamespaceSelector;
import sh.koordinator.config.models.V1alpha1ClusterColocationProfileSpecSelector;

/**
 * ClusterColocationProfileSpec is a description of a ClusterColocationProfile.
 */
@ApiModel(description = "ClusterColocationProfileSpec is a description of a ClusterColocationProfile.")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2023-07-17T16:55:20.989Z[Etc/UTC]")
public class V1alpha1ClusterColocationProfileSpec {
  public static final String SERIALIZED_NAME_ANNOTATIONS = "annotations";
  @SerializedName(SERIALIZED_NAME_ANNOTATIONS)
  private Map<String, String> annotations = null;

  public static final String SERIALIZED_NAME_KOORDINATOR_PRIORITY = "koordinatorPriority";
  @SerializedName(SERIALIZED_NAME_KOORDINATOR_PRIORITY)
  private Integer koordinatorPriority;

  public static final String SERIALIZED_NAME_LABELS = "labels";
  @SerializedName(SERIALIZED_NAME_LABELS)
  private Map<String, String> labels = null;

  public static final String SERIALIZED_NAME_NAMESPACE_SELECTOR = "namespaceSelector";
  @SerializedName(SERIALIZED_NAME_NAMESPACE_SELECTOR)
  private V1alpha1ClusterColocationProfileSpecNamespaceSelector namespaceSelector;

  public static final String SERIALIZED_NAME_PATCH = "patch";
  @SerializedName(SERIALIZED_NAME_PATCH)
  private RawExtension patch;

  public static final String SERIALIZED_NAME_PRIORITY_CLASS_NAME = "priorityClassName";
  @SerializedName(SERIALIZED_NAME_PRIORITY_CLASS_NAME)
  private String priorityClassName;

  public static final String SERIALIZED_NAME_PROBABILITY = "probability";
  @SerializedName(SERIALIZED_NAME_PROBABILITY)
  private IntOrString probability;

  /**
   * QoSClass describes the type of Koordinator QoS that the Pod is running. The value will be injected into Pod as label koordinator.sh/qosClass. Options are LSE/LSR/LS/BE/SYSTEM.
   */
  @JsonAdapter(QosClassEnum.Adapter.class)
  public enum QosClassEnum {
    LSE("LSE"),
    
    LSR("LSR"),
    
    LS("LS"),
    
    BE("BE"),
    
    SYSTEM("SYSTEM");

    private String value;

    QosClassEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static QosClassEnum fromValue(String value) {
      for (QosClassEnum b : QosClassEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }

    public static class Adapter extends TypeAdapter<QosClassEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final QosClassEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public QosClassEnum read(final JsonReader jsonReader) throws IOException {
        String value =  jsonReader.nextString();
        return QosClassEnum.fromValue(value);
      }
    }
  }

  public static final String SERIALIZED_NAME_QOS_CLASS = "qosClass";
  @SerializedName(SERIALIZED_NAME_QOS_CLASS)
  private QosClassEnum qosClass;

  public static final String SERIALIZED_NAME_SCHEDULER_NAME = "schedulerName";
  @SerializedName(SERIALIZED_NAME_SCHEDULER_NAME)
  private String schedulerName;

  public static final String SERIALIZED_NAME_SELECTOR = "selector";
  @SerializedName(SERIALIZED_NAME_SELECTOR)
  private V1alpha1ClusterColocationProfileSpecSelector selector;


  public V1alpha1ClusterColocationProfileSpec annotations(Map<String, String> annotations) {
    
    this.annotations = annotations;
    return this;
  }

  public V1alpha1ClusterColocationProfileSpec putAnnotationsItem(String key, String annotationsItem) {
    if (this.annotations == null) {
      this.annotations = new HashMap<>();
    }
    this.annotations.put(key, annotationsItem);
    return this;
  }

   /**
   * Annotations describes the k/v pair that needs to inject into Pod.Annotations
   * @return annotations
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Annotations describes the k/v pair that needs to inject into Pod.Annotations")

  public Map<String, String> getAnnotations() {
    return annotations;
  }


  public void setAnnotations(Map<String, String> annotations) {
    this.annotations = annotations;
  }


  public V1alpha1ClusterColocationProfileSpec koordinatorPriority(Integer koordinatorPriority) {
    
    this.koordinatorPriority = koordinatorPriority;
    return this;
  }

   /**
   * KoordinatorPriority defines the Pod sub-priority in Koordinator. The priority value will be injected into Pod as label koordinator.sh/priority. Various Koordinator components determine the priority of the Pod in the Koordinator through KoordinatorPriority and the priority value in PriorityClassName. The higher the value, the higher the priority.
   * @return koordinatorPriority
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "KoordinatorPriority defines the Pod sub-priority in Koordinator. The priority value will be injected into Pod as label koordinator.sh/priority. Various Koordinator components determine the priority of the Pod in the Koordinator through KoordinatorPriority and the priority value in PriorityClassName. The higher the value, the higher the priority.")

  public Integer getKoordinatorPriority() {
    return koordinatorPriority;
  }


  public void setKoordinatorPriority(Integer koordinatorPriority) {
    this.koordinatorPriority = koordinatorPriority;
  }


  public V1alpha1ClusterColocationProfileSpec labels(Map<String, String> labels) {
    
    this.labels = labels;
    return this;
  }

  public V1alpha1ClusterColocationProfileSpec putLabelsItem(String key, String labelsItem) {
    if (this.labels == null) {
      this.labels = new HashMap<>();
    }
    this.labels.put(key, labelsItem);
    return this;
  }

   /**
   * Labels describes the k/v pair that needs to inject into Pod.Labels
   * @return labels
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Labels describes the k/v pair that needs to inject into Pod.Labels")

  public Map<String, String> getLabels() {
    return labels;
  }


  public void setLabels(Map<String, String> labels) {
    this.labels = labels;
  }


  public V1alpha1ClusterColocationProfileSpec namespaceSelector(V1alpha1ClusterColocationProfileSpecNamespaceSelector namespaceSelector) {
    
    this.namespaceSelector = namespaceSelector;
    return this;
  }

   /**
   * Get namespaceSelector
   * @return namespaceSelector
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public V1alpha1ClusterColocationProfileSpecNamespaceSelector getNamespaceSelector() {
    return namespaceSelector;
  }


  public void setNamespaceSelector(V1alpha1ClusterColocationProfileSpecNamespaceSelector namespaceSelector) {
    this.namespaceSelector = namespaceSelector;
  }


  public V1alpha1ClusterColocationProfileSpec patch(RawExtension patch) {
    
    this.patch = patch;
    return this;
  }

   /**
   * Patch indicates patching podTemplate that will be injected to the Pod.
   * @return patch
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Patch indicates patching podTemplate that will be injected to the Pod.")

  public RawExtension getPatch() {
    return patch;
  }


  public void setPatch(RawExtension patch) {
    this.patch = patch;
  }


  public V1alpha1ClusterColocationProfileSpec priorityClassName(String priorityClassName) {
    
    this.priorityClassName = priorityClassName;
    return this;
  }

   /**
   * If specified, the priorityClassName and the priority value defined in PriorityClass will be injected into the Pod. The PriorityClassName, priority value in PriorityClassName and KoordinatorPriority will affect the scheduling, preemption and other behaviors of Koordinator system.
   * @return priorityClassName
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "If specified, the priorityClassName and the priority value defined in PriorityClass will be injected into the Pod. The PriorityClassName, priority value in PriorityClassName and KoordinatorPriority will affect the scheduling, preemption and other behaviors of Koordinator system.")

  public String getPriorityClassName() {
    return priorityClassName;
  }


  public void setPriorityClassName(String priorityClassName) {
    this.priorityClassName = priorityClassName;
  }


  public V1alpha1ClusterColocationProfileSpec probability(IntOrString probability) {
    
    this.probability = probability;
    return this;
  }

   /**
   * Probability indicates profile will make effect with a probability.
   * @return probability
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Probability indicates profile will make effect with a probability.")

  public IntOrString getProbability() {
    return probability;
  }


  public void setProbability(IntOrString probability) {
    this.probability = probability;
  }


  public V1alpha1ClusterColocationProfileSpec qosClass(QosClassEnum qosClass) {
    
    this.qosClass = qosClass;
    return this;
  }

   /**
   * QoSClass describes the type of Koordinator QoS that the Pod is running. The value will be injected into Pod as label koordinator.sh/qosClass. Options are LSE/LSR/LS/BE/SYSTEM.
   * @return qosClass
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "QoSClass describes the type of Koordinator QoS that the Pod is running. The value will be injected into Pod as label koordinator.sh/qosClass. Options are LSE/LSR/LS/BE/SYSTEM.")

  public QosClassEnum getQosClass() {
    return qosClass;
  }


  public void setQosClass(QosClassEnum qosClass) {
    this.qosClass = qosClass;
  }


  public V1alpha1ClusterColocationProfileSpec schedulerName(String schedulerName) {
    
    this.schedulerName = schedulerName;
    return this;
  }

   /**
   * If specified, the pod will be dispatched by specified scheduler.
   * @return schedulerName
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "If specified, the pod will be dispatched by specified scheduler.")

  public String getSchedulerName() {
    return schedulerName;
  }


  public void setSchedulerName(String schedulerName) {
    this.schedulerName = schedulerName;
  }


  public V1alpha1ClusterColocationProfileSpec selector(V1alpha1ClusterColocationProfileSpecSelector selector) {
    
    this.selector = selector;
    return this;
  }

   /**
   * Get selector
   * @return selector
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public V1alpha1ClusterColocationProfileSpecSelector getSelector() {
    return selector;
  }


  public void setSelector(V1alpha1ClusterColocationProfileSpecSelector selector) {
    this.selector = selector;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    V1alpha1ClusterColocationProfileSpec v1alpha1ClusterColocationProfileSpec = (V1alpha1ClusterColocationProfileSpec) o;
    return Objects.equals(this.annotations, v1alpha1ClusterColocationProfileSpec.annotations) &&
        Objects.equals(this.koordinatorPriority, v1alpha1ClusterColocationProfileSpec.koordinatorPriority) &&
        Objects.equals(this.labels, v1alpha1ClusterColocationProfileSpec.labels) &&
        Objects.equals(this.namespaceSelector, v1alpha1ClusterColocationProfileSpec.namespaceSelector) &&
        Objects.equals(this.patch, v1alpha1ClusterColocationProfileSpec.patch) &&
        Objects.equals(this.priorityClassName, v1alpha1ClusterColocationProfileSpec.priorityClassName) &&
        Objects.equals(this.probability, v1alpha1ClusterColocationProfileSpec.probability) &&
        Objects.equals(this.qosClass, v1alpha1ClusterColocationProfileSpec.qosClass) &&
        Objects.equals(this.schedulerName, v1alpha1ClusterColocationProfileSpec.schedulerName) &&
        Objects.equals(this.selector, v1alpha1ClusterColocationProfileSpec.selector);
  }

  @Override
  public int hashCode() {
    return Objects.hash(annotations, koordinatorPriority, labels, namespaceSelector, patch, priorityClassName, probability, qosClass, schedulerName, selector);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class V1alpha1ClusterColocationProfileSpec {\n");
    sb.append("    annotations: ").append(toIndentedString(annotations)).append("\n");
    sb.append("    koordinatorPriority: ").append(toIndentedString(koordinatorPriority)).append("\n");
    sb.append("    labels: ").append(toIndentedString(labels)).append("\n");
    sb.append("    namespaceSelector: ").append(toIndentedString(namespaceSelector)).append("\n");
    sb.append("    patch: ").append(toIndentedString(patch)).append("\n");
    sb.append("    priorityClassName: ").append(toIndentedString(priorityClassName)).append("\n");
    sb.append("    probability: ").append(toIndentedString(probability)).append("\n");
    sb.append("    qosClass: ").append(toIndentedString(qosClass)).append("\n");
    sb.append("    schedulerName: ").append(toIndentedString(schedulerName)).append("\n");
    sb.append("    selector: ").append(toIndentedString(selector)).append("\n");
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

