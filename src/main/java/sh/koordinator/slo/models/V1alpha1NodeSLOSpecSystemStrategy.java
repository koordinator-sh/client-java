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
 * node global system config
 */
@ApiModel(description = "node global system config")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2023-07-17T16:57:54.694Z[Etc/UTC]")
public class V1alpha1NodeSLOSpecSystemStrategy {
  public static final String SERIALIZED_NAME_MEMCG_REAP_BACK_GROUND = "memcgReapBackGround";
  @SerializedName(SERIALIZED_NAME_MEMCG_REAP_BACK_GROUND)
  private Long memcgReapBackGround;

  public static final String SERIALIZED_NAME_MIN_FREE_KBYTES_FACTOR = "minFreeKbytesFactor";
  @SerializedName(SERIALIZED_NAME_MIN_FREE_KBYTES_FACTOR)
  private Long minFreeKbytesFactor;

  public static final String SERIALIZED_NAME_WATERMARK_SCALE_FACTOR = "watermarkScaleFactor";
  @SerializedName(SERIALIZED_NAME_WATERMARK_SCALE_FACTOR)
  private Long watermarkScaleFactor;


  public V1alpha1NodeSLOSpecSystemStrategy memcgReapBackGround(Long memcgReapBackGround) {
    
    this.memcgReapBackGround = memcgReapBackGround;
    return this;
  }

   /**
   * /sys/kernel/mm/memcg_reaper/reap_background
   * @return memcgReapBackGround
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "/sys/kernel/mm/memcg_reaper/reap_background")

  public Long getMemcgReapBackGround() {
    return memcgReapBackGround;
  }


  public void setMemcgReapBackGround(Long memcgReapBackGround) {
    this.memcgReapBackGround = memcgReapBackGround;
  }


  public V1alpha1NodeSLOSpecSystemStrategy minFreeKbytesFactor(Long minFreeKbytesFactor) {
    
    this.minFreeKbytesFactor = minFreeKbytesFactor;
    return this;
  }

   /**
   * for /proc/sys/vm/min_free_kbytes, min_free_kbytes &#x3D; minFreeKbytesFactor * nodeTotalMemory /10000
   * @return minFreeKbytesFactor
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "for /proc/sys/vm/min_free_kbytes, min_free_kbytes = minFreeKbytesFactor * nodeTotalMemory /10000")

  public Long getMinFreeKbytesFactor() {
    return minFreeKbytesFactor;
  }


  public void setMinFreeKbytesFactor(Long minFreeKbytesFactor) {
    this.minFreeKbytesFactor = minFreeKbytesFactor;
  }


  public V1alpha1NodeSLOSpecSystemStrategy watermarkScaleFactor(Long watermarkScaleFactor) {
    
    this.watermarkScaleFactor = watermarkScaleFactor;
    return this;
  }

   /**
   * /proc/sys/vm/watermark_scale_factor
   * @return watermarkScaleFactor
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "/proc/sys/vm/watermark_scale_factor")

  public Long getWatermarkScaleFactor() {
    return watermarkScaleFactor;
  }


  public void setWatermarkScaleFactor(Long watermarkScaleFactor) {
    this.watermarkScaleFactor = watermarkScaleFactor;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    V1alpha1NodeSLOSpecSystemStrategy v1alpha1NodeSLOSpecSystemStrategy = (V1alpha1NodeSLOSpecSystemStrategy) o;
    return Objects.equals(this.memcgReapBackGround, v1alpha1NodeSLOSpecSystemStrategy.memcgReapBackGround) &&
        Objects.equals(this.minFreeKbytesFactor, v1alpha1NodeSLOSpecSystemStrategy.minFreeKbytesFactor) &&
        Objects.equals(this.watermarkScaleFactor, v1alpha1NodeSLOSpecSystemStrategy.watermarkScaleFactor);
  }

  @Override
  public int hashCode() {
    return Objects.hash(memcgReapBackGround, minFreeKbytesFactor, watermarkScaleFactor);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class V1alpha1NodeSLOSpecSystemStrategy {\n");
    sb.append("    memcgReapBackGround: ").append(toIndentedString(memcgReapBackGround)).append("\n");
    sb.append("    minFreeKbytesFactor: ").append(toIndentedString(minFreeKbytesFactor)).append("\n");
    sb.append("    watermarkScaleFactor: ").append(toIndentedString(watermarkScaleFactor)).append("\n");
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

