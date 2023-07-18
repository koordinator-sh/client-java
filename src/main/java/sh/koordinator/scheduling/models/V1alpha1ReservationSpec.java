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
import io.kubernetes.client.openapi.models.V1PodTemplateSpec;
import io.kubernetes.client.proto.V1.PodTemplateSpec;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import java.time.OffsetDateTime;
import java.util.ArrayList;
import java.util.List;
import sh.koordinator.scheduling.models.V1alpha1ReservationSpecOwners;

/**
 * V1alpha1ReservationSpec
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2023-07-17T16:42:15.030Z[Etc/UTC]")
public class V1alpha1ReservationSpec {
  public static final String SERIALIZED_NAME_ALLOCATE_ONCE = "allocateOnce";
  @SerializedName(SERIALIZED_NAME_ALLOCATE_ONCE)
  private Boolean allocateOnce;

  /**
   * AllocatePolicy represents the allocation policy of reserved resources that Reservation expects.
   */
  @JsonAdapter(AllocatePolicyEnum.Adapter.class)
  public enum AllocatePolicyEnum {
    ALIGNED("Aligned"),
    
    RESTRICTED("Restricted");

    private String value;

    AllocatePolicyEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static AllocatePolicyEnum fromValue(String value) {
      for (AllocatePolicyEnum b : AllocatePolicyEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }

    public static class Adapter extends TypeAdapter<AllocatePolicyEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final AllocatePolicyEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public AllocatePolicyEnum read(final JsonReader jsonReader) throws IOException {
        String value =  jsonReader.nextString();
        return AllocatePolicyEnum.fromValue(value);
      }
    }
  }

  public static final String SERIALIZED_NAME_ALLOCATE_POLICY = "allocatePolicy";
  @SerializedName(SERIALIZED_NAME_ALLOCATE_POLICY)
  private AllocatePolicyEnum allocatePolicy;

  public static final String SERIALIZED_NAME_EXPIRES = "expires";
  @SerializedName(SERIALIZED_NAME_EXPIRES)
  private OffsetDateTime expires;

  public static final String SERIALIZED_NAME_OWNERS = "owners";
  @SerializedName(SERIALIZED_NAME_OWNERS)
  private List<V1alpha1ReservationSpecOwners> owners = new ArrayList<>();

  public static final String SERIALIZED_NAME_PRE_ALLOCATION = "preAllocation";
  @SerializedName(SERIALIZED_NAME_PRE_ALLOCATION)
  private Boolean preAllocation;

  public static final String SERIALIZED_NAME_TEMPLATE = "template";
  @SerializedName(SERIALIZED_NAME_TEMPLATE)
  private V1PodTemplateSpec template;

  public static final String SERIALIZED_NAME_TTL = "ttl";
  @SerializedName(SERIALIZED_NAME_TTL)
  private String ttl;


  public V1alpha1ReservationSpec allocateOnce(Boolean allocateOnce) {
    
    this.allocateOnce = allocateOnce;
    return this;
  }

   /**
   * When &#x60;AllocateOnce&#x60; is set, the reserved resources are only available for the first owner who allocates successfully and are not allocatable to other owners anymore. Defaults to true.
   * @return allocateOnce
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "When `AllocateOnce` is set, the reserved resources are only available for the first owner who allocates successfully and are not allocatable to other owners anymore. Defaults to true.")

  public Boolean getAllocateOnce() {
    return allocateOnce;
  }


  public void setAllocateOnce(Boolean allocateOnce) {
    this.allocateOnce = allocateOnce;
  }


  public V1alpha1ReservationSpec allocatePolicy(AllocatePolicyEnum allocatePolicy) {
    
    this.allocatePolicy = allocatePolicy;
    return this;
  }

   /**
   * AllocatePolicy represents the allocation policy of reserved resources that Reservation expects.
   * @return allocatePolicy
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "AllocatePolicy represents the allocation policy of reserved resources that Reservation expects.")

  public AllocatePolicyEnum getAllocatePolicy() {
    return allocatePolicy;
  }


  public void setAllocatePolicy(AllocatePolicyEnum allocatePolicy) {
    this.allocatePolicy = allocatePolicy;
  }


  public V1alpha1ReservationSpec expires(OffsetDateTime expires) {
    
    this.expires = expires;
    return this;
  }

   /**
   * Expired timestamp when the reservation is expected to expire. If both &#x60;expires&#x60; and &#x60;ttl&#x60; are set, &#x60;expires&#x60; is checked first. &#x60;expires&#x60; and &#x60;ttl&#x60; are mutually exclusive. Defaults to being set dynamically at runtime based on the &#x60;ttl&#x60;.
   * @return expires
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Expired timestamp when the reservation is expected to expire. If both `expires` and `ttl` are set, `expires` is checked first. `expires` and `ttl` are mutually exclusive. Defaults to being set dynamically at runtime based on the `ttl`.")

  public OffsetDateTime getExpires() {
    return expires;
  }


  public void setExpires(OffsetDateTime expires) {
    this.expires = expires;
  }


  public V1alpha1ReservationSpec owners(List<V1alpha1ReservationSpecOwners> owners) {
    
    this.owners = owners;
    return this;
  }

  public V1alpha1ReservationSpec addOwnersItem(V1alpha1ReservationSpecOwners ownersItem) {
    this.owners.add(ownersItem);
    return this;
  }

   /**
   * Specify the owners who can allocate the reserved resources. Multiple owner selectors and ORed.
   * @return owners
  **/
  @ApiModelProperty(required = true, value = "Specify the owners who can allocate the reserved resources. Multiple owner selectors and ORed.")

  public List<V1alpha1ReservationSpecOwners> getOwners() {
    return owners;
  }


  public void setOwners(List<V1alpha1ReservationSpecOwners> owners) {
    this.owners = owners;
  }


  public V1alpha1ReservationSpec preAllocation(Boolean preAllocation) {
    
    this.preAllocation = preAllocation;
    return this;
  }

   /**
   * By default, the resources requirements of reservation (specified in &#x60;template.spec&#x60;) is filtered by whether the node has sufficient free resources (i.e. Reservation Request &lt;  Node Free). When &#x60;preAllocation&#x60; is set, the scheduler will skip this validation and allow overcommitment. The scheduled reservation would be waiting to be available until free resources are sufficient.
   * @return preAllocation
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "By default, the resources requirements of reservation (specified in `template.spec`) is filtered by whether the node has sufficient free resources (i.e. Reservation Request <  Node Free). When `preAllocation` is set, the scheduler will skip this validation and allow overcommitment. The scheduled reservation would be waiting to be available until free resources are sufficient.")

  public Boolean getPreAllocation() {
    return preAllocation;
  }


  public void setPreAllocation(Boolean preAllocation) {
    this.preAllocation = preAllocation;
  }


  public V1alpha1ReservationSpec template(V1PodTemplateSpec template) {
    
    this.template = template;
    return this;
  }

   /**
   * Template defines the scheduling requirements (resources, affinities, images, ...) processed by the scheduler just like a normal pod. If the &#x60;template.spec.nodeName&#x60; is specified, the scheduler will not choose another node but reserve resources on the specified node.
   * @return template
  **/
  @ApiModelProperty(required = true, value = "Template defines the scheduling requirements (resources, affinities, images, ...) processed by the scheduler just like a normal pod. If the `template.spec.nodeName` is specified, the scheduler will not choose another node but reserve resources on the specified node.")

  public V1PodTemplateSpec getTemplate() {
    return template;
  }


  public void setTemplate(V1PodTemplateSpec template) {
    this.template = template;
  }


  public V1alpha1ReservationSpec ttl(String ttl) {
    
    this.ttl = ttl;
    return this;
  }

   /**
   * Time-to-Live period for the reservation. &#x60;expires&#x60; and &#x60;ttl&#x60; are mutually exclusive. Defaults to 24h. Set 0 to disable expiration.
   * @return ttl
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Time-to-Live period for the reservation. `expires` and `ttl` are mutually exclusive. Defaults to 24h. Set 0 to disable expiration.")

  public String getTtl() {
    return ttl;
  }


  public void setTtl(String ttl) {
    this.ttl = ttl;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    V1alpha1ReservationSpec v1alpha1ReservationSpec = (V1alpha1ReservationSpec) o;
    return Objects.equals(this.allocateOnce, v1alpha1ReservationSpec.allocateOnce) &&
        Objects.equals(this.allocatePolicy, v1alpha1ReservationSpec.allocatePolicy) &&
        Objects.equals(this.expires, v1alpha1ReservationSpec.expires) &&
        Objects.equals(this.owners, v1alpha1ReservationSpec.owners) &&
        Objects.equals(this.preAllocation, v1alpha1ReservationSpec.preAllocation) &&
        Objects.equals(this.template, v1alpha1ReservationSpec.template) &&
        Objects.equals(this.ttl, v1alpha1ReservationSpec.ttl);
  }

  @Override
  public int hashCode() {
    return Objects.hash(allocateOnce, allocatePolicy, expires, owners, preAllocation, template, ttl);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class V1alpha1ReservationSpec {\n");
    sb.append("    allocateOnce: ").append(toIndentedString(allocateOnce)).append("\n");
    sb.append("    allocatePolicy: ").append(toIndentedString(allocatePolicy)).append("\n");
    sb.append("    expires: ").append(toIndentedString(expires)).append("\n");
    sb.append("    owners: ").append(toIndentedString(owners)).append("\n");
    sb.append("    preAllocation: ").append(toIndentedString(preAllocation)).append("\n");
    sb.append("    template: ").append(toIndentedString(template)).append("\n");
    sb.append("    ttl: ").append(toIndentedString(ttl)).append("\n");
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

