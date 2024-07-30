/*
 * Cobo Wallet as a Service 2.0
 *
 * The version of the OpenAPI document: 1.0.0
 * Contact: support@cobo.com
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.cobo.waas2.model;

import java.util.Objects;
import com.cobo.waas2.model.PoolDetailsAllOfValidatorsInfo;
import com.cobo.waas2.model.StakingPoolType;
import com.cobo.waas2.model.WalletSubtype;
import com.cobo.waas2.model.WalletType;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.JsonArray;
import com.google.gson.JsonDeserializationContext;
import com.google.gson.JsonDeserializer;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonParseException;
import com.google.gson.TypeAdapterFactory;
import com.google.gson.reflect.TypeToken;
import com.google.gson.TypeAdapter;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import java.io.IOException;

import java.lang.reflect.Type;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

import com.cobo.waas2.JSON;

/**
 * PoolDetails
 */
@javax.annotation.Generated(
    value = "org.openapitools.codegen.languages.JavaClientCodegen", 
    comments = "Generator version: 7.6.0"
)
public class PoolDetails {
  public static final String SERIALIZED_NAME_ID = "id";
  @SerializedName(SERIALIZED_NAME_ID)
  private String id;

  public static final String SERIALIZED_NAME_CHAIN_ID = "chain_id";
  @SerializedName(SERIALIZED_NAME_CHAIN_ID)
  private String chainId;

  public static final String SERIALIZED_NAME_PROTOCOL = "protocol";
  @SerializedName(SERIALIZED_NAME_PROTOCOL)
  private String protocol;

  public static final String SERIALIZED_NAME_PROTOCOL_ICON_URL = "protocol_icon_url";
  @SerializedName(SERIALIZED_NAME_PROTOCOL_ICON_URL)
  private String protocolIconUrl;

  public static final String SERIALIZED_NAME_SUPPORTED_WALLET_TYPES = "supported_wallet_types";
  @SerializedName(SERIALIZED_NAME_SUPPORTED_WALLET_TYPES)
  private List<WalletType> supportedWalletTypes = new ArrayList<>();

  public static final String SERIALIZED_NAME_SUPPORTED_WALLET_SUBTYPES = "supported_wallet_subtypes";
  @SerializedName(SERIALIZED_NAME_SUPPORTED_WALLET_SUBTYPES)
  private List<WalletSubtype> supportedWalletSubtypes = new ArrayList<>();

  public static final String SERIALIZED_NAME_TOKEN_ID = "token_id";
  @SerializedName(SERIALIZED_NAME_TOKEN_ID)
  private String tokenId;

  public static final String SERIALIZED_NAME_EST_APR = "est_apr";
  @SerializedName(SERIALIZED_NAME_EST_APR)
  private Float estApr;

  public static final String SERIALIZED_NAME_POOL_TYPE = "pool_type";
  @SerializedName(SERIALIZED_NAME_POOL_TYPE)
  private StakingPoolType poolType;

  public static final String SERIALIZED_NAME_MIN_AMOUNT = "min_amount";
  @SerializedName(SERIALIZED_NAME_MIN_AMOUNT)
  private String minAmount;

  public static final String SERIALIZED_NAME_MAX_AMOUNT = "max_amount";
  @SerializedName(SERIALIZED_NAME_MAX_AMOUNT)
  private String maxAmount;

  public static final String SERIALIZED_NAME_MIN_STAKE_PERIOD = "min_stake_period";
  @SerializedName(SERIALIZED_NAME_MIN_STAKE_PERIOD)
  private Integer minStakePeriod;

  public static final String SERIALIZED_NAME_MAX_STAKE_PERIOD = "max_stake_period";
  @SerializedName(SERIALIZED_NAME_MAX_STAKE_PERIOD)
  private Integer maxStakePeriod;

  public static final String SERIALIZED_NAME_MIN_STAKE_BLOCKS = "min_stake_blocks";
  @SerializedName(SERIALIZED_NAME_MIN_STAKE_BLOCKS)
  private Long minStakeBlocks;

  public static final String SERIALIZED_NAME_MAX_STAKE_BLOCKS = "max_stake_blocks";
  @SerializedName(SERIALIZED_NAME_MAX_STAKE_BLOCKS)
  private Long maxStakeBlocks;

  public static final String SERIALIZED_NAME_VALIDATORS_INFO = "validators_info";
  @SerializedName(SERIALIZED_NAME_VALIDATORS_INFO)
  private List<PoolDetailsAllOfValidatorsInfo> validatorsInfo = new ArrayList<>();

  public PoolDetails() {
  }

  public PoolDetails id(String id) {
    this.id = id;
    return this;
  }

   /**
   * The unique protocol id.
   * @return id
  **/
  @javax.annotation.Nonnull
  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }


  public PoolDetails chainId(String chainId) {
    this.chainId = chainId;
    return this;
  }

   /**
   * The unique chain id.
   * @return chainId
  **/
  @javax.annotation.Nonnull
  public String getChainId() {
    return chainId;
  }

  public void setChainId(String chainId) {
    this.chainId = chainId;
  }


  public PoolDetails protocol(String protocol) {
    this.protocol = protocol;
    return this;
  }

   /**
   * The name of the protocol.
   * @return protocol
  **/
  @javax.annotation.Nonnull
  public String getProtocol() {
    return protocol;
  }

  public void setProtocol(String protocol) {
    this.protocol = protocol;
  }


  public PoolDetails protocolIconUrl(String protocolIconUrl) {
    this.protocolIconUrl = protocolIconUrl;
    return this;
  }

   /**
   * The URL of the protocol&#39;s icon.
   * @return protocolIconUrl
  **/
  @javax.annotation.Nonnull
  public String getProtocolIconUrl() {
    return protocolIconUrl;
  }

  public void setProtocolIconUrl(String protocolIconUrl) {
    this.protocolIconUrl = protocolIconUrl;
  }


  public PoolDetails supportedWalletTypes(List<WalletType> supportedWalletTypes) {
    this.supportedWalletTypes = supportedWalletTypes;
    return this;
  }

  public PoolDetails addSupportedWalletTypesItem(WalletType supportedWalletTypesItem) {
    if (this.supportedWalletTypes == null) {
      this.supportedWalletTypes = new ArrayList<>();
    }
    this.supportedWalletTypes.add(supportedWalletTypesItem);
    return this;
  }

   /**
   * The list of available wallet types.
   * @return supportedWalletTypes
  **/
  @javax.annotation.Nonnull
  public List<WalletType> getSupportedWalletTypes() {
    return supportedWalletTypes;
  }

  public void setSupportedWalletTypes(List<WalletType> supportedWalletTypes) {
    this.supportedWalletTypes = supportedWalletTypes;
  }


  public PoolDetails supportedWalletSubtypes(List<WalletSubtype> supportedWalletSubtypes) {
    this.supportedWalletSubtypes = supportedWalletSubtypes;
    return this;
  }

  public PoolDetails addSupportedWalletSubtypesItem(WalletSubtype supportedWalletSubtypesItem) {
    if (this.supportedWalletSubtypes == null) {
      this.supportedWalletSubtypes = new ArrayList<>();
    }
    this.supportedWalletSubtypes.add(supportedWalletSubtypesItem);
    return this;
  }

   /**
   * The list of available wallet types.
   * @return supportedWalletSubtypes
  **/
  @javax.annotation.Nonnull
  public List<WalletSubtype> getSupportedWalletSubtypes() {
    return supportedWalletSubtypes;
  }

  public void setSupportedWalletSubtypes(List<WalletSubtype> supportedWalletSubtypes) {
    this.supportedWalletSubtypes = supportedWalletSubtypes;
  }


  public PoolDetails tokenId(String tokenId) {
    this.tokenId = tokenId;
    return this;
  }

   /**
   * The unique token id.
   * @return tokenId
  **/
  @javax.annotation.Nonnull
  public String getTokenId() {
    return tokenId;
  }

  public void setTokenId(String tokenId) {
    this.tokenId = tokenId;
  }


  public PoolDetails estApr(Float estApr) {
    this.estApr = estApr;
    return this;
  }

   /**
   * The estimated APR.
   * @return estApr
  **/
  @javax.annotation.Nonnull
  public Float getEstApr() {
    return estApr;
  }

  public void setEstApr(Float estApr) {
    this.estApr = estApr;
  }


  public PoolDetails poolType(StakingPoolType poolType) {
    this.poolType = poolType;
    return this;
  }

   /**
   * Get poolType
   * @return poolType
  **/
  @javax.annotation.Nullable
  public StakingPoolType getPoolType() {
    return poolType;
  }

  public void setPoolType(StakingPoolType poolType) {
    this.poolType = poolType;
  }


  public PoolDetails minAmount(String minAmount) {
    this.minAmount = minAmount;
    return this;
  }

   /**
   * The minimum amount to stake.
   * @return minAmount
  **/
  @javax.annotation.Nullable
  public String getMinAmount() {
    return minAmount;
  }

  public void setMinAmount(String minAmount) {
    this.minAmount = minAmount;
  }


  public PoolDetails maxAmount(String maxAmount) {
    this.maxAmount = maxAmount;
    return this;
  }

   /**
   * The maximum amount to stake.
   * @return maxAmount
  **/
  @javax.annotation.Nullable
  public String getMaxAmount() {
    return maxAmount;
  }

  public void setMaxAmount(String maxAmount) {
    this.maxAmount = maxAmount;
  }


  public PoolDetails minStakePeriod(Integer minStakePeriod) {
    this.minStakePeriod = minStakePeriod;
    return this;
  }

   /**
   * The minimum staking period in days.
   * @return minStakePeriod
  **/
  @javax.annotation.Nullable
  public Integer getMinStakePeriod() {
    return minStakePeriod;
  }

  public void setMinStakePeriod(Integer minStakePeriod) {
    this.minStakePeriod = minStakePeriod;
  }


  public PoolDetails maxStakePeriod(Integer maxStakePeriod) {
    this.maxStakePeriod = maxStakePeriod;
    return this;
  }

   /**
   * The maximum staking period in days.
   * @return maxStakePeriod
  **/
  @javax.annotation.Nullable
  public Integer getMaxStakePeriod() {
    return maxStakePeriod;
  }

  public void setMaxStakePeriod(Integer maxStakePeriod) {
    this.maxStakePeriod = maxStakePeriod;
  }


  public PoolDetails minStakeBlocks(Long minStakeBlocks) {
    this.minStakeBlocks = minStakeBlocks;
    return this;
  }

   /**
   * The minimum staking blocks.
   * @return minStakeBlocks
  **/
  @javax.annotation.Nullable
  public Long getMinStakeBlocks() {
    return minStakeBlocks;
  }

  public void setMinStakeBlocks(Long minStakeBlocks) {
    this.minStakeBlocks = minStakeBlocks;
  }


  public PoolDetails maxStakeBlocks(Long maxStakeBlocks) {
    this.maxStakeBlocks = maxStakeBlocks;
    return this;
  }

   /**
   * The maximum staking blocks.
   * @return maxStakeBlocks
  **/
  @javax.annotation.Nullable
  public Long getMaxStakeBlocks() {
    return maxStakeBlocks;
  }

  public void setMaxStakeBlocks(Long maxStakeBlocks) {
    this.maxStakeBlocks = maxStakeBlocks;
  }


  public PoolDetails validatorsInfo(List<PoolDetailsAllOfValidatorsInfo> validatorsInfo) {
    this.validatorsInfo = validatorsInfo;
    return this;
  }

  public PoolDetails addValidatorsInfoItem(PoolDetailsAllOfValidatorsInfo validatorsInfoItem) {
    if (this.validatorsInfo == null) {
      this.validatorsInfo = new ArrayList<>();
    }
    this.validatorsInfo.add(validatorsInfoItem);
    return this;
  }

   /**
   * The list of validators.
   * @return validatorsInfo
  **/
  @javax.annotation.Nonnull
  public List<PoolDetailsAllOfValidatorsInfo> getValidatorsInfo() {
    return validatorsInfo;
  }

  public void setValidatorsInfo(List<PoolDetailsAllOfValidatorsInfo> validatorsInfo) {
    this.validatorsInfo = validatorsInfo;
  }

  /**
   * A container for additional, undeclared properties.
   * This is a holder for any undeclared properties as specified with
   * the 'additionalProperties' keyword in the OAS document.
   */
  private Map<String, Object> additionalProperties;

  /**
   * Set the additional (undeclared) property with the specified name and value.
   * If the property does not already exist, create it otherwise replace it.
   *
   * @param key name of the property
   * @param value value of the property
   * @return the PoolDetails instance itself
   */
  public PoolDetails putAdditionalProperty(String key, Object value) {
    if (this.additionalProperties == null) {
        this.additionalProperties = new HashMap<String, Object>();
    }
    this.additionalProperties.put(key, value);
    return this;
  }

  /**
   * Return the additional (undeclared) property.
   *
   * @return a map of objects
   */
  public Map<String, Object> getAdditionalProperties() {
    return additionalProperties;
  }

  /**
   * Return the additional (undeclared) property with the specified name.
   *
   * @param key name of the property
   * @return an object
   */
  public Object getAdditionalProperty(String key) {
    if (this.additionalProperties == null) {
        return null;
    }
    return this.additionalProperties.get(key);
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PoolDetails poolDetails = (PoolDetails) o;
    return Objects.equals(this.id, poolDetails.id) &&
        Objects.equals(this.chainId, poolDetails.chainId) &&
        Objects.equals(this.protocol, poolDetails.protocol) &&
        Objects.equals(this.protocolIconUrl, poolDetails.protocolIconUrl) &&
        Objects.equals(this.supportedWalletTypes, poolDetails.supportedWalletTypes) &&
        Objects.equals(this.supportedWalletSubtypes, poolDetails.supportedWalletSubtypes) &&
        Objects.equals(this.tokenId, poolDetails.tokenId) &&
        Objects.equals(this.estApr, poolDetails.estApr) &&
        Objects.equals(this.poolType, poolDetails.poolType) &&
        Objects.equals(this.minAmount, poolDetails.minAmount) &&
        Objects.equals(this.maxAmount, poolDetails.maxAmount) &&
        Objects.equals(this.minStakePeriod, poolDetails.minStakePeriod) &&
        Objects.equals(this.maxStakePeriod, poolDetails.maxStakePeriod) &&
        Objects.equals(this.minStakeBlocks, poolDetails.minStakeBlocks) &&
        Objects.equals(this.maxStakeBlocks, poolDetails.maxStakeBlocks) &&
        Objects.equals(this.validatorsInfo, poolDetails.validatorsInfo)&&
        Objects.equals(this.additionalProperties, poolDetails.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, chainId, protocol, protocolIconUrl, supportedWalletTypes, supportedWalletSubtypes, tokenId, estApr, poolType, minAmount, maxAmount, minStakePeriod, maxStakePeriod, minStakeBlocks, maxStakeBlocks, validatorsInfo, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PoolDetails {\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    chainId: ").append(toIndentedString(chainId)).append("\n");
    sb.append("    protocol: ").append(toIndentedString(protocol)).append("\n");
    sb.append("    protocolIconUrl: ").append(toIndentedString(protocolIconUrl)).append("\n");
    sb.append("    supportedWalletTypes: ").append(toIndentedString(supportedWalletTypes)).append("\n");
    sb.append("    supportedWalletSubtypes: ").append(toIndentedString(supportedWalletSubtypes)).append("\n");
    sb.append("    tokenId: ").append(toIndentedString(tokenId)).append("\n");
    sb.append("    estApr: ").append(toIndentedString(estApr)).append("\n");
    sb.append("    poolType: ").append(toIndentedString(poolType)).append("\n");
    sb.append("    minAmount: ").append(toIndentedString(minAmount)).append("\n");
    sb.append("    maxAmount: ").append(toIndentedString(maxAmount)).append("\n");
    sb.append("    minStakePeriod: ").append(toIndentedString(minStakePeriod)).append("\n");
    sb.append("    maxStakePeriod: ").append(toIndentedString(maxStakePeriod)).append("\n");
    sb.append("    minStakeBlocks: ").append(toIndentedString(minStakeBlocks)).append("\n");
    sb.append("    maxStakeBlocks: ").append(toIndentedString(maxStakeBlocks)).append("\n");
    sb.append("    validatorsInfo: ").append(toIndentedString(validatorsInfo)).append("\n");
    sb.append("    additionalProperties: ").append(toIndentedString(additionalProperties)).append("\n");
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


  public static HashSet<String> openapiFields;
  public static HashSet<String> openapiRequiredFields;

  static {
    // a set of all properties/fields (JSON key names)
    openapiFields = new HashSet<String>();
    openapiFields.add("id");
    openapiFields.add("chain_id");
    openapiFields.add("protocol");
    openapiFields.add("protocol_icon_url");
    openapiFields.add("supported_wallet_types");
    openapiFields.add("supported_wallet_subtypes");
    openapiFields.add("token_id");
    openapiFields.add("est_apr");
    openapiFields.add("pool_type");
    openapiFields.add("min_amount");
    openapiFields.add("max_amount");
    openapiFields.add("min_stake_period");
    openapiFields.add("max_stake_period");
    openapiFields.add("min_stake_blocks");
    openapiFields.add("max_stake_blocks");
    openapiFields.add("validators_info");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("id");
    openapiRequiredFields.add("chain_id");
    openapiRequiredFields.add("protocol");
    openapiRequiredFields.add("protocol_icon_url");
    openapiRequiredFields.add("supported_wallet_types");
    openapiRequiredFields.add("supported_wallet_subtypes");
    openapiRequiredFields.add("token_id");
    openapiRequiredFields.add("est_apr");
    openapiRequiredFields.add("validators_info");
  }

 /**
  * Validates the JSON Element and throws an exception if issues found
  *
  * @param jsonElement JSON Element
  * @throws IOException if the JSON Element is invalid with respect to PoolDetails
  */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!PoolDetails.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in PoolDetails is not found in the empty JSON string", PoolDetails.openapiRequiredFields.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : PoolDetails.openapiRequiredFields) {
        if (jsonElement.getAsJsonObject().get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if (!jsonObj.get("id").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `id` to be a primitive type in the JSON string but got `%s`", jsonObj.get("id").toString()));
      }
      if (!jsonObj.get("chain_id").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `chain_id` to be a primitive type in the JSON string but got `%s`", jsonObj.get("chain_id").toString()));
      }
      if (!jsonObj.get("protocol").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `protocol` to be a primitive type in the JSON string but got `%s`", jsonObj.get("protocol").toString()));
      }
      if (!jsonObj.get("protocol_icon_url").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `protocol_icon_url` to be a primitive type in the JSON string but got `%s`", jsonObj.get("protocol_icon_url").toString()));
      }
      // ensure the required json array is present
      if (jsonObj.get("supported_wallet_types") == null) {
        throw new IllegalArgumentException("Expected the field `linkedContent` to be an array in the JSON string but got `null`");
      } else if (!jsonObj.get("supported_wallet_types").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `supported_wallet_types` to be an array in the JSON string but got `%s`", jsonObj.get("supported_wallet_types").toString()));
      }
      // ensure the required json array is present
      if (jsonObj.get("supported_wallet_subtypes") == null) {
        throw new IllegalArgumentException("Expected the field `linkedContent` to be an array in the JSON string but got `null`");
      } else if (!jsonObj.get("supported_wallet_subtypes").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `supported_wallet_subtypes` to be an array in the JSON string but got `%s`", jsonObj.get("supported_wallet_subtypes").toString()));
      }
      if (!jsonObj.get("token_id").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `token_id` to be a primitive type in the JSON string but got `%s`", jsonObj.get("token_id").toString()));
      }
      // validate the optional field `pool_type`
      if (jsonObj.get("pool_type") != null && !jsonObj.get("pool_type").isJsonNull()) {
        StakingPoolType.validateJsonElement(jsonObj.get("pool_type"));
      }
      if ((jsonObj.get("min_amount") != null && !jsonObj.get("min_amount").isJsonNull()) && !jsonObj.get("min_amount").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `min_amount` to be a primitive type in the JSON string but got `%s`", jsonObj.get("min_amount").toString()));
      }
      if ((jsonObj.get("max_amount") != null && !jsonObj.get("max_amount").isJsonNull()) && !jsonObj.get("max_amount").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `max_amount` to be a primitive type in the JSON string but got `%s`", jsonObj.get("max_amount").toString()));
      }
      // ensure the json data is an array
      if (!jsonObj.get("validators_info").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `validators_info` to be an array in the JSON string but got `%s`", jsonObj.get("validators_info").toString()));
      }

      JsonArray jsonArrayvalidatorsInfo = jsonObj.getAsJsonArray("validators_info");
      // validate the required field `validators_info` (array)
      for (int i = 0; i < jsonArrayvalidatorsInfo.size(); i++) {
        PoolDetailsAllOfValidatorsInfo.validateJsonElement(jsonArrayvalidatorsInfo.get(i));
      };
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!PoolDetails.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'PoolDetails' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<PoolDetails> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(PoolDetails.class));

       return (TypeAdapter<T>) new TypeAdapter<PoolDetails>() {
           @Override
           public void write(JsonWriter out, PoolDetails value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             obj.remove("additionalProperties");
             // serialize additional properties
             if (value.getAdditionalProperties() != null) {
               for (Map.Entry<String, Object> entry : value.getAdditionalProperties().entrySet()) {
                 if (entry.getValue() instanceof String)
                   obj.addProperty(entry.getKey(), (String) entry.getValue());
                 else if (entry.getValue() instanceof Number)
                   obj.addProperty(entry.getKey(), (Number) entry.getValue());
                 else if (entry.getValue() instanceof Boolean)
                   obj.addProperty(entry.getKey(), (Boolean) entry.getValue());
                 else if (entry.getValue() instanceof Character)
                   obj.addProperty(entry.getKey(), (Character) entry.getValue());
                 else {
                   JsonElement jsonElement = gson.toJsonTree(entry.getValue());
                   if (jsonElement.isJsonArray()) {
                     obj.add(entry.getKey(), jsonElement.getAsJsonArray());
                   } else {
                     obj.add(entry.getKey(), jsonElement.getAsJsonObject());
                   }
                 }
               }
             }
             elementAdapter.write(out, obj);
           }

           @Override
           public PoolDetails read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             JsonObject jsonObj = jsonElement.getAsJsonObject();
             // store additional fields in the deserialized instance
             PoolDetails instance = thisAdapter.fromJsonTree(jsonObj);
             for (Map.Entry<String, JsonElement> entry : jsonObj.entrySet()) {
               if (!openapiFields.contains(entry.getKey())) {
                 if (entry.getValue().isJsonPrimitive()) { // primitive type
                   if (entry.getValue().getAsJsonPrimitive().isString())
                     instance.putAdditionalProperty(entry.getKey(), entry.getValue().getAsString());
                   else if (entry.getValue().getAsJsonPrimitive().isNumber())
                     instance.putAdditionalProperty(entry.getKey(), entry.getValue().getAsNumber());
                   else if (entry.getValue().getAsJsonPrimitive().isBoolean())
                     instance.putAdditionalProperty(entry.getKey(), entry.getValue().getAsBoolean());
                   else
                     throw new IllegalArgumentException(String.format("The field `%s` has unknown primitive type. Value: %s", entry.getKey(), entry.getValue().toString()));
                 } else if (entry.getValue().isJsonArray()) {
                     instance.putAdditionalProperty(entry.getKey(), gson.fromJson(entry.getValue(), List.class));
                 } else { // JSON object
                     instance.putAdditionalProperty(entry.getKey(), gson.fromJson(entry.getValue(), HashMap.class));
                 }
               }
             }
             return instance;
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of PoolDetails given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of PoolDetails
  * @throws IOException if the JSON string is invalid with respect to PoolDetails
  */
  public static PoolDetails fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, PoolDetails.class);
  }

 /**
  * Convert an instance of PoolDetails to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

