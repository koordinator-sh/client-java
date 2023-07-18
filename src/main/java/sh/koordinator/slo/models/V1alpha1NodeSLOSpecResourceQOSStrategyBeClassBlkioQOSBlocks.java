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
import sh.koordinator.slo.models.V1alpha1NodeSLOSpecResourceQOSStrategyBeClassBlkioQOSIoCfg;

/**
 * V1alpha1NodeSLOSpecResourceQOSStrategyBeClassBlkioQOSBlocks
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2023-07-17T16:57:54.694Z[Etc/UTC]")
public class V1alpha1NodeSLOSpecResourceQOSStrategyBeClassBlkioQOSBlocks {
  public static final String SERIALIZED_NAME_IO_CFG = "ioCfg";
  @SerializedName(SERIALIZED_NAME_IO_CFG)
  private V1alpha1NodeSLOSpecResourceQOSStrategyBeClassBlkioQOSIoCfg ioCfg;

  public static final String SERIALIZED_NAME_NAME = "name";
  @SerializedName(SERIALIZED_NAME_NAME)
  private String name;

  public static final String SERIALIZED_NAME_TYPE = "type";
  @SerializedName(SERIALIZED_NAME_TYPE)
  private String type;


  public V1alpha1NodeSLOSpecResourceQOSStrategyBeClassBlkioQOSBlocks ioCfg(V1alpha1NodeSLOSpecResourceQOSStrategyBeClassBlkioQOSIoCfg ioCfg) {
    
    this.ioCfg = ioCfg;
    return this;
  }

   /**
   * Get ioCfg
   * @return ioCfg
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public V1alpha1NodeSLOSpecResourceQOSStrategyBeClassBlkioQOSIoCfg getIoCfg() {
    return ioCfg;
  }


  public void setIoCfg(V1alpha1NodeSLOSpecResourceQOSStrategyBeClassBlkioQOSIoCfg ioCfg) {
    this.ioCfg = ioCfg;
  }


  public V1alpha1NodeSLOSpecResourceQOSStrategyBeClassBlkioQOSBlocks name(String name) {
    
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


  public V1alpha1NodeSLOSpecResourceQOSStrategyBeClassBlkioQOSBlocks type(String type) {
    
    this.type = type;
    return this;
  }

   /**
   * Get type
   * @return type
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

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
    V1alpha1NodeSLOSpecResourceQOSStrategyBeClassBlkioQOSBlocks v1alpha1NodeSLOSpecResourceQOSStrategyBeClassBlkioQOSBlocks = (V1alpha1NodeSLOSpecResourceQOSStrategyBeClassBlkioQOSBlocks) o;
    return Objects.equals(this.ioCfg, v1alpha1NodeSLOSpecResourceQOSStrategyBeClassBlkioQOSBlocks.ioCfg) &&
        Objects.equals(this.name, v1alpha1NodeSLOSpecResourceQOSStrategyBeClassBlkioQOSBlocks.name) &&
        Objects.equals(this.type, v1alpha1NodeSLOSpecResourceQOSStrategyBeClassBlkioQOSBlocks.type);
  }

  @Override
  public int hashCode() {
    return Objects.hash(ioCfg, name, type);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class V1alpha1NodeSLOSpecResourceQOSStrategyBeClassBlkioQOSBlocks {\n");
    sb.append("    ioCfg: ").append(toIndentedString(ioCfg)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
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

