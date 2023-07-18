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
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * V1alpha1DeviceSpecDevices
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2023-07-17T16:52:33.676Z[Etc/UTC]")
public class V1alpha1DeviceSpecDevices {
  public static final String SERIALIZED_NAME_HEALTH = "health";
  @SerializedName(SERIALIZED_NAME_HEALTH)
  private Boolean health;

  public static final String SERIALIZED_NAME_ID = "id";
  @SerializedName(SERIALIZED_NAME_ID)
  private String id;

  public static final String SERIALIZED_NAME_MINOR = "minor";
  @SerializedName(SERIALIZED_NAME_MINOR)
  private Integer minor;

  public static final String SERIALIZED_NAME_MODULE_I_D = "moduleID";
  @SerializedName(SERIALIZED_NAME_MODULE_I_D)
  private Integer moduleID;

  public static final String SERIALIZED_NAME_RESOURCES = "resources";
  @SerializedName(SERIALIZED_NAME_RESOURCES)
  private Map<String, Object> resources = null;

  public static final String SERIALIZED_NAME_TYPE = "type";
  @SerializedName(SERIALIZED_NAME_TYPE)
  private String type;


  public V1alpha1DeviceSpecDevices health(Boolean health) {
    
    this.health = health;
    return this;
  }

   /**
   * Health indicates whether the device is normal
   * @return health
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Health indicates whether the device is normal")

  public Boolean getHealth() {
    return health;
  }


  public void setHealth(Boolean health) {
    this.health = health;
  }


  public V1alpha1DeviceSpecDevices id(String id) {
    
    this.id = id;
    return this;
  }

   /**
   * UUID represents the UUID of device
   * @return id
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "UUID represents the UUID of device")

  public String getId() {
    return id;
  }


  public void setId(String id) {
    this.id = id;
  }


  public V1alpha1DeviceSpecDevices minor(Integer minor) {
    
    this.minor = minor;
    return this;
  }

   /**
   * Minor represents the Minor number of Device, starting from 0
   * @return minor
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Minor represents the Minor number of Device, starting from 0")

  public Integer getMinor() {
    return minor;
  }


  public void setMinor(Integer minor) {
    this.minor = minor;
  }


  public V1alpha1DeviceSpecDevices moduleID(Integer moduleID) {
    
    this.moduleID = moduleID;
    return this;
  }

   /**
   * ModuleID represents the physical id of Device
   * @return moduleID
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "ModuleID represents the physical id of Device")

  public Integer getModuleID() {
    return moduleID;
  }


  public void setModuleID(Integer moduleID) {
    this.moduleID = moduleID;
  }


  public V1alpha1DeviceSpecDevices resources(Map<String, Object> resources) {
    
    this.resources = resources;
    return this;
  }

  public V1alpha1DeviceSpecDevices putResourcesItem(String key, Object resourcesItem) {
    if (this.resources == null) {
      this.resources = new HashMap<>();
    }
    this.resources.put(key, resourcesItem);
    return this;
  }

   /**
   * Resources is a set of (resource name, quantity) pairs
   * @return resources
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Resources is a set of (resource name, quantity) pairs")

  public Map<String, Object> getResources() {
    return resources;
  }


  public void setResources(Map<String, Object> resources) {
    this.resources = resources;
  }


  public V1alpha1DeviceSpecDevices type(String type) {
    
    this.type = type;
    return this;
  }

   /**
   * Type represents the type of device
   * @return type
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Type represents the type of device")

  public String getType() {
    return type;
  }


  public void setType(String type) {
    this.type = type;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    V1alpha1DeviceSpecDevices v1alpha1DeviceSpecDevices = (V1alpha1DeviceSpecDevices) o;
    return Objects.equals(this.health, v1alpha1DeviceSpecDevices.health) &&
        Objects.equals(this.id, v1alpha1DeviceSpecDevices.id) &&
        Objects.equals(this.minor, v1alpha1DeviceSpecDevices.minor) &&
        Objects.equals(this.moduleID, v1alpha1DeviceSpecDevices.moduleID) &&
        Objects.equals(this.resources, v1alpha1DeviceSpecDevices.resources) &&
        Objects.equals(this.type, v1alpha1DeviceSpecDevices.type);
  }

  @Override
  public int hashCode() {
    return Objects.hash(health, id, minor, moduleID, resources, type);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class V1alpha1DeviceSpecDevices {\n");
    sb.append("    health: ").append(toIndentedString(health)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    minor: ").append(toIndentedString(minor)).append("\n");
    sb.append("    moduleID: ").append(toIndentedString(moduleID)).append("\n");
    sb.append("    resources: ").append(toIndentedString(resources)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
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

