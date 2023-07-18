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

/**
 * ResctrlQOSCfg stores node-level config of resctrl qos
 */
@ApiModel(description = "ResctrlQOSCfg stores node-level config of resctrl qos")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2023-07-17T16:57:54.694Z[Etc/UTC]")
public class V1alpha1NodeSLOSpecResourceQOSStrategyBeClassResctrlQOS {
  public static final String SERIALIZED_NAME_CAT_RANGE_END_PERCENT = "catRangeEndPercent";
  @SerializedName(SERIALIZED_NAME_CAT_RANGE_END_PERCENT)
  private Long catRangeEndPercent;

  public static final String SERIALIZED_NAME_CAT_RANGE_START_PERCENT = "catRangeStartPercent";
  @SerializedName(SERIALIZED_NAME_CAT_RANGE_START_PERCENT)
  private Long catRangeStartPercent;

  public static final String SERIALIZED_NAME_ENABLE = "enable";
  @SerializedName(SERIALIZED_NAME_ENABLE)
  private Boolean enable;

  public static final String SERIALIZED_NAME_MBA_PERCENT = "mbaPercent";
  @SerializedName(SERIALIZED_NAME_MBA_PERCENT)
  private Long mbaPercent;


  public V1alpha1NodeSLOSpecResourceQOSStrategyBeClassResctrlQOS catRangeEndPercent(Long catRangeEndPercent) {
    
    this.catRangeEndPercent = catRangeEndPercent;
    return this;
  }

   /**
   * LLC available range end for pods by percentage
   * minimum: 0
   * maximum: 100
   * @return catRangeEndPercent
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "LLC available range end for pods by percentage")

  public Long getCatRangeEndPercent() {
    return catRangeEndPercent;
  }


  public void setCatRangeEndPercent(Long catRangeEndPercent) {
    this.catRangeEndPercent = catRangeEndPercent;
  }


  public V1alpha1NodeSLOSpecResourceQOSStrategyBeClassResctrlQOS catRangeStartPercent(Long catRangeStartPercent) {
    
    this.catRangeStartPercent = catRangeStartPercent;
    return this;
  }

   /**
   * LLC available range start for pods by percentage
   * minimum: 0
   * maximum: 100
   * @return catRangeStartPercent
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "LLC available range start for pods by percentage")

  public Long getCatRangeStartPercent() {
    return catRangeStartPercent;
  }


  public void setCatRangeStartPercent(Long catRangeStartPercent) {
    this.catRangeStartPercent = catRangeStartPercent;
  }


  public V1alpha1NodeSLOSpecResourceQOSStrategyBeClassResctrlQOS enable(Boolean enable) {
    
    this.enable = enable;
    return this;
  }

   /**
   * Enable indicates whether the resctrl qos is enabled.
   * @return enable
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Enable indicates whether the resctrl qos is enabled.")

  public Boolean getEnable() {
    return enable;
  }


  public void setEnable(Boolean enable) {
    this.enable = enable;
  }


  public V1alpha1NodeSLOSpecResourceQOSStrategyBeClassResctrlQOS mbaPercent(Long mbaPercent) {
    
    this.mbaPercent = mbaPercent;
    return this;
  }

   /**
   * MBA percent
   * minimum: 0
   * maximum: 100
   * @return mbaPercent
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "MBA percent")

  public Long getMbaPercent() {
    return mbaPercent;
  }


  public void setMbaPercent(Long mbaPercent) {
    this.mbaPercent = mbaPercent;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    V1alpha1NodeSLOSpecResourceQOSStrategyBeClassResctrlQOS v1alpha1NodeSLOSpecResourceQOSStrategyBeClassResctrlQOS = (V1alpha1NodeSLOSpecResourceQOSStrategyBeClassResctrlQOS) o;
    return Objects.equals(this.catRangeEndPercent, v1alpha1NodeSLOSpecResourceQOSStrategyBeClassResctrlQOS.catRangeEndPercent) &&
        Objects.equals(this.catRangeStartPercent, v1alpha1NodeSLOSpecResourceQOSStrategyBeClassResctrlQOS.catRangeStartPercent) &&
        Objects.equals(this.enable, v1alpha1NodeSLOSpecResourceQOSStrategyBeClassResctrlQOS.enable) &&
        Objects.equals(this.mbaPercent, v1alpha1NodeSLOSpecResourceQOSStrategyBeClassResctrlQOS.mbaPercent);
  }

  @Override
  public int hashCode() {
    return Objects.hash(catRangeEndPercent, catRangeStartPercent, enable, mbaPercent);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class V1alpha1NodeSLOSpecResourceQOSStrategyBeClassResctrlQOS {\n");
    sb.append("    catRangeEndPercent: ").append(toIndentedString(catRangeEndPercent)).append("\n");
    sb.append("    catRangeStartPercent: ").append(toIndentedString(catRangeStartPercent)).append("\n");
    sb.append("    enable: ").append(toIndentedString(enable)).append("\n");
    sb.append("    mbaPercent: ").append(toIndentedString(mbaPercent)).append("\n");
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

