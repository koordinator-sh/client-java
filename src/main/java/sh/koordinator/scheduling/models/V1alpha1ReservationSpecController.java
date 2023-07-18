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

/**
 * V1alpha1ReservationSpecController
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2023-07-17T16:42:15.030Z[Etc/UTC]")
public class V1alpha1ReservationSpecController {
  public static final String SERIALIZED_NAME_API_VERSION = "apiVersion";
  @SerializedName(SERIALIZED_NAME_API_VERSION)
  private String apiVersion;

  public static final String SERIALIZED_NAME_BLOCK_OWNER_DELETION = "blockOwnerDeletion";
  @SerializedName(SERIALIZED_NAME_BLOCK_OWNER_DELETION)
  private Boolean blockOwnerDeletion;

  public static final String SERIALIZED_NAME_CONTROLLER = "controller";
  @SerializedName(SERIALIZED_NAME_CONTROLLER)
  private Boolean controller;

  public static final String SERIALIZED_NAME_KIND = "kind";
  @SerializedName(SERIALIZED_NAME_KIND)
  private String kind;

  public static final String SERIALIZED_NAME_NAME = "name";
  @SerializedName(SERIALIZED_NAME_NAME)
  private String name;

  public static final String SERIALIZED_NAME_NAMESPACE = "namespace";
  @SerializedName(SERIALIZED_NAME_NAMESPACE)
  private String namespace;

  public static final String SERIALIZED_NAME_UID = "uid";
  @SerializedName(SERIALIZED_NAME_UID)
  private String uid;


  public V1alpha1ReservationSpecController apiVersion(String apiVersion) {
    
    this.apiVersion = apiVersion;
    return this;
  }

   /**
   * API version of the referent.
   * @return apiVersion
  **/
  @ApiModelProperty(required = true, value = "API version of the referent.")

  public String getApiVersion() {
    return apiVersion;
  }


  public void setApiVersion(String apiVersion) {
    this.apiVersion = apiVersion;
  }


  public V1alpha1ReservationSpecController blockOwnerDeletion(Boolean blockOwnerDeletion) {
    
    this.blockOwnerDeletion = blockOwnerDeletion;
    return this;
  }

   /**
   * If true, AND if the owner has the \&quot;foregroundDeletion\&quot; finalizer, then the owner cannot be deleted from the key-value store until this reference is removed. See https://kubernetes.io/docs/concepts/architecture/garbage-collection/#foreground-deletion for how the garbage collector interacts with this field and enforces the foreground deletion. Defaults to false. To set this field, a user needs \&quot;delete\&quot; permission of the owner, otherwise 422 (Unprocessable Entity) will be returned.
   * @return blockOwnerDeletion
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "If true, AND if the owner has the \"foregroundDeletion\" finalizer, then the owner cannot be deleted from the key-value store until this reference is removed. See https://kubernetes.io/docs/concepts/architecture/garbage-collection/#foreground-deletion for how the garbage collector interacts with this field and enforces the foreground deletion. Defaults to false. To set this field, a user needs \"delete\" permission of the owner, otherwise 422 (Unprocessable Entity) will be returned.")

  public Boolean getBlockOwnerDeletion() {
    return blockOwnerDeletion;
  }


  public void setBlockOwnerDeletion(Boolean blockOwnerDeletion) {
    this.blockOwnerDeletion = blockOwnerDeletion;
  }


  public V1alpha1ReservationSpecController controller(Boolean controller) {
    
    this.controller = controller;
    return this;
  }

   /**
   * If true, this reference points to the managing controller.
   * @return controller
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "If true, this reference points to the managing controller.")

  public Boolean getController() {
    return controller;
  }


  public void setController(Boolean controller) {
    this.controller = controller;
  }


  public V1alpha1ReservationSpecController kind(String kind) {
    
    this.kind = kind;
    return this;
  }

   /**
   * Kind of the referent. More info: https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#types-kinds
   * @return kind
  **/
  @ApiModelProperty(required = true, value = "Kind of the referent. More info: https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#types-kinds")

  public String getKind() {
    return kind;
  }


  public void setKind(String kind) {
    this.kind = kind;
  }


  public V1alpha1ReservationSpecController name(String name) {
    
    this.name = name;
    return this;
  }

   /**
   * Name of the referent. More info: http://kubernetes.io/docs/user-guide/identifiers#names
   * @return name
  **/
  @ApiModelProperty(required = true, value = "Name of the referent. More info: http://kubernetes.io/docs/user-guide/identifiers#names")

  public String getName() {
    return name;
  }


  public void setName(String name) {
    this.name = name;
  }


  public V1alpha1ReservationSpecController namespace(String namespace) {
    
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


  public V1alpha1ReservationSpecController uid(String uid) {
    
    this.uid = uid;
    return this;
  }

   /**
   * UID of the referent. More info: http://kubernetes.io/docs/user-guide/identifiers#uids
   * @return uid
  **/
  @ApiModelProperty(required = true, value = "UID of the referent. More info: http://kubernetes.io/docs/user-guide/identifiers#uids")

  public String getUid() {
    return uid;
  }


  public void setUid(String uid) {
    this.uid = uid;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    V1alpha1ReservationSpecController v1alpha1ReservationSpecController = (V1alpha1ReservationSpecController) o;
    return Objects.equals(this.apiVersion, v1alpha1ReservationSpecController.apiVersion) &&
        Objects.equals(this.blockOwnerDeletion, v1alpha1ReservationSpecController.blockOwnerDeletion) &&
        Objects.equals(this.controller, v1alpha1ReservationSpecController.controller) &&
        Objects.equals(this.kind, v1alpha1ReservationSpecController.kind) &&
        Objects.equals(this.name, v1alpha1ReservationSpecController.name) &&
        Objects.equals(this.namespace, v1alpha1ReservationSpecController.namespace) &&
        Objects.equals(this.uid, v1alpha1ReservationSpecController.uid);
  }

  @Override
  public int hashCode() {
    return Objects.hash(apiVersion, blockOwnerDeletion, controller, kind, name, namespace, uid);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class V1alpha1ReservationSpecController {\n");
    sb.append("    apiVersion: ").append(toIndentedString(apiVersion)).append("\n");
    sb.append("    blockOwnerDeletion: ").append(toIndentedString(blockOwnerDeletion)).append("\n");
    sb.append("    controller: ").append(toIndentedString(controller)).append("\n");
    sb.append("    kind: ").append(toIndentedString(kind)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    namespace: ").append(toIndentedString(namespace)).append("\n");
    sb.append("    uid: ").append(toIndentedString(uid)).append("\n");
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

