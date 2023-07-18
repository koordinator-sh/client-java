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


package sh.koordinator.scheduling.models;

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
import sh.koordinator.scheduling.models.V1alpha1PodMigrationJobStatusPreemptedPodRef;
import sh.koordinator.scheduling.models.V1alpha1PodMigrationJobStatusPreemptedPodsRef;

/**
 * V1alpha1PodMigrationJobStatusPreemptedPodsReservation
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2023-07-17T16:51:22.964Z[Etc/UTC]")
public class V1alpha1PodMigrationJobStatusPreemptedPodsReservation {
  public static final String SERIALIZED_NAME_NAME = "name";
  @SerializedName(SERIALIZED_NAME_NAME)
  private String name;

  public static final String SERIALIZED_NAME_NAMESPACE = "namespace";
  @SerializedName(SERIALIZED_NAME_NAMESPACE)
  private String namespace;

  public static final String SERIALIZED_NAME_NODE_NAME = "nodeName";
  @SerializedName(SERIALIZED_NAME_NODE_NAME)
  private String nodeName;

  public static final String SERIALIZED_NAME_PHASE = "phase";
  @SerializedName(SERIALIZED_NAME_PHASE)
  private String phase;

  public static final String SERIALIZED_NAME_PODS_REF = "podsRef";
  @SerializedName(SERIALIZED_NAME_PODS_REF)
  private List<V1alpha1PodMigrationJobStatusPreemptedPodsRef> podsRef = null;

  public static final String SERIALIZED_NAME_PREEMPTED_POD_REF = "preemptedPodRef";
  @SerializedName(SERIALIZED_NAME_PREEMPTED_POD_REF)
  private V1alpha1PodMigrationJobStatusPreemptedPodRef preemptedPodRef;


  public V1alpha1PodMigrationJobStatusPreemptedPodsReservation name(String name) {
    
    this.name = name;
    return this;
  }

   /**
   * Name represents the name of Reservation
   * @return name
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Name represents the name of Reservation")

  public String getName() {
    return name;
  }


  public void setName(String name) {
    this.name = name;
  }


  public V1alpha1PodMigrationJobStatusPreemptedPodsReservation namespace(String namespace) {
    
    this.namespace = namespace;
    return this;
  }

   /**
   * Namespace represents the namespace of Reservation
   * @return namespace
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Namespace represents the namespace of Reservation")

  public String getNamespace() {
    return namespace;
  }


  public void setNamespace(String namespace) {
    this.namespace = namespace;
  }


  public V1alpha1PodMigrationJobStatusPreemptedPodsReservation nodeName(String nodeName) {
    
    this.nodeName = nodeName;
    return this;
  }

   /**
   * NodeName represents the assigned node for Reservation by scheduler
   * @return nodeName
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "NodeName represents the assigned node for Reservation by scheduler")

  public String getNodeName() {
    return nodeName;
  }


  public void setNodeName(String nodeName) {
    this.nodeName = nodeName;
  }


  public V1alpha1PodMigrationJobStatusPreemptedPodsReservation phase(String phase) {
    
    this.phase = phase;
    return this;
  }

   /**
   * Phase represents the Phase of Reservation
   * @return phase
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Phase represents the Phase of Reservation")

  public String getPhase() {
    return phase;
  }


  public void setPhase(String phase) {
    this.phase = phase;
  }


  public V1alpha1PodMigrationJobStatusPreemptedPodsReservation podsRef(List<V1alpha1PodMigrationJobStatusPreemptedPodsRef> podsRef) {
    
    this.podsRef = podsRef;
    return this;
  }

  public V1alpha1PodMigrationJobStatusPreemptedPodsReservation addPodsRefItem(V1alpha1PodMigrationJobStatusPreemptedPodsRef podsRefItem) {
    if (this.podsRef == null) {
      this.podsRef = new ArrayList<>();
    }
    this.podsRef.add(podsRefItem);
    return this;
  }

   /**
   * PodsRef represents the newly created Pods after being preempted
   * @return podsRef
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "PodsRef represents the newly created Pods after being preempted")

  public List<V1alpha1PodMigrationJobStatusPreemptedPodsRef> getPodsRef() {
    return podsRef;
  }


  public void setPodsRef(List<V1alpha1PodMigrationJobStatusPreemptedPodsRef> podsRef) {
    this.podsRef = podsRef;
  }


  public V1alpha1PodMigrationJobStatusPreemptedPodsReservation preemptedPodRef(V1alpha1PodMigrationJobStatusPreemptedPodRef preemptedPodRef) {
    
    this.preemptedPodRef = preemptedPodRef;
    return this;
  }

   /**
   * Get preemptedPodRef
   * @return preemptedPodRef
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public V1alpha1PodMigrationJobStatusPreemptedPodRef getPreemptedPodRef() {
    return preemptedPodRef;
  }


  public void setPreemptedPodRef(V1alpha1PodMigrationJobStatusPreemptedPodRef preemptedPodRef) {
    this.preemptedPodRef = preemptedPodRef;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    V1alpha1PodMigrationJobStatusPreemptedPodsReservation v1alpha1PodMigrationJobStatusPreemptedPodsReservation = (V1alpha1PodMigrationJobStatusPreemptedPodsReservation) o;
    return Objects.equals(this.name, v1alpha1PodMigrationJobStatusPreemptedPodsReservation.name) &&
        Objects.equals(this.namespace, v1alpha1PodMigrationJobStatusPreemptedPodsReservation.namespace) &&
        Objects.equals(this.nodeName, v1alpha1PodMigrationJobStatusPreemptedPodsReservation.nodeName) &&
        Objects.equals(this.phase, v1alpha1PodMigrationJobStatusPreemptedPodsReservation.phase) &&
        Objects.equals(this.podsRef, v1alpha1PodMigrationJobStatusPreemptedPodsReservation.podsRef) &&
        Objects.equals(this.preemptedPodRef, v1alpha1PodMigrationJobStatusPreemptedPodsReservation.preemptedPodRef);
  }

  @Override
  public int hashCode() {
    return Objects.hash(name, namespace, nodeName, phase, podsRef, preemptedPodRef);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class V1alpha1PodMigrationJobStatusPreemptedPodsReservation {\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    namespace: ").append(toIndentedString(namespace)).append("\n");
    sb.append("    nodeName: ").append(toIndentedString(nodeName)).append("\n");
    sb.append("    phase: ").append(toIndentedString(phase)).append("\n");
    sb.append("    podsRef: ").append(toIndentedString(podsRef)).append("\n");
    sb.append("    preemptedPodRef: ").append(toIndentedString(preemptedPodRef)).append("\n");
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

