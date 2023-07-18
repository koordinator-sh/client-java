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
import sh.koordinator.scheduling.models.V1alpha1ReservationSpecController;
import sh.koordinator.scheduling.models.V1alpha1ReservationSpecLabelSelector;
import sh.koordinator.scheduling.models.V1alpha1ReservationSpecObject;

/**
 * ReservationOwner indicates the owner specification which can allocate reserved resources.
 */
@ApiModel(description = "ReservationOwner indicates the owner specification which can allocate reserved resources.")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2023-07-17T16:42:15.030Z[Etc/UTC]")
public class V1alpha1ReservationSpecOwners {
  public static final String SERIALIZED_NAME_CONTROLLER = "controller";
  @SerializedName(SERIALIZED_NAME_CONTROLLER)
  private V1alpha1ReservationSpecController controller;

  public static final String SERIALIZED_NAME_LABEL_SELECTOR = "labelSelector";
  @SerializedName(SERIALIZED_NAME_LABEL_SELECTOR)
  private V1alpha1ReservationSpecLabelSelector labelSelector;

  public static final String SERIALIZED_NAME_OBJECT = "object";
  @SerializedName(SERIALIZED_NAME_OBJECT)
  private V1alpha1ReservationSpecObject _object;


  public V1alpha1ReservationSpecOwners controller(V1alpha1ReservationSpecController controller) {
    
    this.controller = controller;
    return this;
  }

   /**
   * Get controller
   * @return controller
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public V1alpha1ReservationSpecController getController() {
    return controller;
  }


  public void setController(V1alpha1ReservationSpecController controller) {
    this.controller = controller;
  }


  public V1alpha1ReservationSpecOwners labelSelector(V1alpha1ReservationSpecLabelSelector labelSelector) {
    
    this.labelSelector = labelSelector;
    return this;
  }

   /**
   * Get labelSelector
   * @return labelSelector
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public V1alpha1ReservationSpecLabelSelector getLabelSelector() {
    return labelSelector;
  }


  public void setLabelSelector(V1alpha1ReservationSpecLabelSelector labelSelector) {
    this.labelSelector = labelSelector;
  }


  public V1alpha1ReservationSpecOwners _object(V1alpha1ReservationSpecObject _object) {
    
    this._object = _object;
    return this;
  }

   /**
   * Get _object
   * @return _object
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public V1alpha1ReservationSpecObject getObject() {
    return _object;
  }


  public void setObject(V1alpha1ReservationSpecObject _object) {
    this._object = _object;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    V1alpha1ReservationSpecOwners v1alpha1ReservationSpecOwners = (V1alpha1ReservationSpecOwners) o;
    return Objects.equals(this.controller, v1alpha1ReservationSpecOwners.controller) &&
        Objects.equals(this.labelSelector, v1alpha1ReservationSpecOwners.labelSelector) &&
        Objects.equals(this._object, v1alpha1ReservationSpecOwners._object);
  }

  @Override
  public int hashCode() {
    return Objects.hash(controller, labelSelector, _object);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class V1alpha1ReservationSpecOwners {\n");
    sb.append("    controller: ").append(toIndentedString(controller)).append("\n");
    sb.append("    labelSelector: ").append(toIndentedString(labelSelector)).append("\n");
    sb.append("    _object: ").append(toIndentedString(_object)).append("\n");
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

