/*
 * Cobo Wallet as a Service 2.0
 *
 * Contact: support@cobo.com
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.cobo.waas2.model;

import java.util.Objects;
import com.cobo.waas2.model.AmountDetailsInner;
import com.cobo.waas2.model.StakingsValidatorInfo;
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
 * The staking info.
 */
@javax.annotation.Generated(
    value = "org.openapitools.codegen.languages.JavaClientCodegen", 
    comments = "Generator version: 7.6.0"
)
public class Stakings {
  public static final String SERIALIZED_NAME_ID = "id";
  @SerializedName(SERIALIZED_NAME_ID)
  private String id;

  public static final String SERIALIZED_NAME_WALLET_ID = "wallet_id";
  @SerializedName(SERIALIZED_NAME_WALLET_ID)
  private String walletId;

  public static final String SERIALIZED_NAME_ADDRESS = "address";
  @SerializedName(SERIALIZED_NAME_ADDRESS)
  private String address;

  public static final String SERIALIZED_NAME_AMOUNTS = "amounts";
  @SerializedName(SERIALIZED_NAME_AMOUNTS)
  private List<AmountDetailsInner> amounts = new ArrayList<>();

  public static final String SERIALIZED_NAME_INITIATOR = "initiator";
  @SerializedName(SERIALIZED_NAME_INITIATOR)
  private String initiator;

  public static final String SERIALIZED_NAME_UNLOCK_TIMESTAMP = "unlock_timestamp";
  @SerializedName(SERIALIZED_NAME_UNLOCK_TIMESTAMP)
  private Long unlockTimestamp;

  public static final String SERIALIZED_NAME_UNLOCK_BLOCK_HEIGHT = "unlock_block_height";
  @SerializedName(SERIALIZED_NAME_UNLOCK_BLOCK_HEIGHT)
  private Long unlockBlockHeight;

  public static final String SERIALIZED_NAME_POOL_ID = "pool_id";
  @SerializedName(SERIALIZED_NAME_POOL_ID)
  private String poolId;

  public static final String SERIALIZED_NAME_TOKEN_ID = "token_id";
  @SerializedName(SERIALIZED_NAME_TOKEN_ID)
  private String tokenId;

  public static final String SERIALIZED_NAME_POS_CHAIN = "pos_chain";
  @SerializedName(SERIALIZED_NAME_POS_CHAIN)
  private String posChain;

  public static final String SERIALIZED_NAME_REWARDS_INFO = "rewards_info";
  @SerializedName(SERIALIZED_NAME_REWARDS_INFO)
  private Object rewardsInfo;

  public static final String SERIALIZED_NAME_CREATED_TIMESTAMP = "created_timestamp";
  @SerializedName(SERIALIZED_NAME_CREATED_TIMESTAMP)
  private Long createdTimestamp;

  public static final String SERIALIZED_NAME_UPDATED_TIMESTAMP = "updated_timestamp";
  @SerializedName(SERIALIZED_NAME_UPDATED_TIMESTAMP)
  private Long updatedTimestamp;

  public static final String SERIALIZED_NAME_VALIDATOR_INFO = "validator_info";
  @SerializedName(SERIALIZED_NAME_VALIDATOR_INFO)
  private StakingsValidatorInfo validatorInfo;

  public Stakings() {
  }

  public Stakings id(String id) {
    this.id = id;
    return this;
  }

   /**
   * The unique id of the stake.
   * @return id
  **/
  @javax.annotation.Nonnull
  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }


  public Stakings walletId(String walletId) {
    this.walletId = walletId;
    return this;
  }

   /**
   * The unique wallet id.
   * @return walletId
  **/
  @javax.annotation.Nonnull
  public String getWalletId() {
    return walletId;
  }

  public void setWalletId(String walletId) {
    this.walletId = walletId;
  }


  public Stakings address(String address) {
    this.address = address;
    return this;
  }

   /**
   * The staker wallet address.
   * @return address
  **/
  @javax.annotation.Nonnull
  public String getAddress() {
    return address;
  }

  public void setAddress(String address) {
    this.address = address;
  }


  public Stakings amounts(List<AmountDetailsInner> amounts) {
    this.amounts = amounts;
    return this;
  }

  public Stakings addAmountsItem(AmountDetailsInner amountsItem) {
    if (this.amounts == null) {
      this.amounts = new ArrayList<>();
    }
    this.amounts.add(amountsItem);
    return this;
  }

   /**
   * The staking amount details.
   * @return amounts
  **/
  @javax.annotation.Nonnull
  public List<AmountDetailsInner> getAmounts() {
    return amounts;
  }

  public void setAmounts(List<AmountDetailsInner> amounts) {
    this.amounts = amounts;
  }


  public Stakings initiator(String initiator) {
    this.initiator = initiator;
    return this;
  }

   /**
   * The initiator of the stake.
   * @return initiator
  **/
  @javax.annotation.Nullable
  public String getInitiator() {
    return initiator;
  }

  public void setInitiator(String initiator) {
    this.initiator = initiator;
  }


  public Stakings unlockTimestamp(Long unlockTimestamp) {
    this.unlockTimestamp = unlockTimestamp;
    return this;
  }

   /**
   * The unlock time.
   * @return unlockTimestamp
  **/
  @javax.annotation.Nullable
  public Long getUnlockTimestamp() {
    return unlockTimestamp;
  }

  public void setUnlockTimestamp(Long unlockTimestamp) {
    this.unlockTimestamp = unlockTimestamp;
  }


  public Stakings unlockBlockHeight(Long unlockBlockHeight) {
    this.unlockBlockHeight = unlockBlockHeight;
    return this;
  }

   /**
   * The unlock block height.
   * @return unlockBlockHeight
  **/
  @javax.annotation.Nullable
  public Long getUnlockBlockHeight() {
    return unlockBlockHeight;
  }

  public void setUnlockBlockHeight(Long unlockBlockHeight) {
    this.unlockBlockHeight = unlockBlockHeight;
  }


  public Stakings poolId(String poolId) {
    this.poolId = poolId;
    return this;
  }

   /**
   * The unique pool id.
   * @return poolId
  **/
  @javax.annotation.Nonnull
  public String getPoolId() {
    return poolId;
  }

  public void setPoolId(String poolId) {
    this.poolId = poolId;
  }


  public Stakings tokenId(String tokenId) {
    this.tokenId = tokenId;
    return this;
  }

   /**
   * The token id.
   * @return tokenId
  **/
  @javax.annotation.Nonnull
  public String getTokenId() {
    return tokenId;
  }

  public void setTokenId(String tokenId) {
    this.tokenId = tokenId;
  }


  public Stakings posChain(String posChain) {
    this.posChain = posChain;
    return this;
  }

   /**
   * The pos chain of the stake.
   * @return posChain
  **/
  @javax.annotation.Nullable
  public String getPosChain() {
    return posChain;
  }

  public void setPosChain(String posChain) {
    this.posChain = posChain;
  }


  public Stakings rewardsInfo(Object rewardsInfo) {
    this.rewardsInfo = rewardsInfo;
    return this;
  }

   /**
   * The rewards info of the stake.
   * @return rewardsInfo
  **/
  @javax.annotation.Nullable
  public Object getRewardsInfo() {
    return rewardsInfo;
  }

  public void setRewardsInfo(Object rewardsInfo) {
    this.rewardsInfo = rewardsInfo;
  }


  public Stakings createdTimestamp(Long createdTimestamp) {
    this.createdTimestamp = createdTimestamp;
    return this;
  }

   /**
   * The time when the stake was created.
   * @return createdTimestamp
  **/
  @javax.annotation.Nonnull
  public Long getCreatedTimestamp() {
    return createdTimestamp;
  }

  public void setCreatedTimestamp(Long createdTimestamp) {
    this.createdTimestamp = createdTimestamp;
  }


  public Stakings updatedTimestamp(Long updatedTimestamp) {
    this.updatedTimestamp = updatedTimestamp;
    return this;
  }

   /**
   * The time when the stake was last updated.
   * @return updatedTimestamp
  **/
  @javax.annotation.Nonnull
  public Long getUpdatedTimestamp() {
    return updatedTimestamp;
  }

  public void setUpdatedTimestamp(Long updatedTimestamp) {
    this.updatedTimestamp = updatedTimestamp;
  }


  public Stakings validatorInfo(StakingsValidatorInfo validatorInfo) {
    this.validatorInfo = validatorInfo;
    return this;
  }

   /**
   * Get validatorInfo
   * @return validatorInfo
  **/
  @javax.annotation.Nonnull
  public StakingsValidatorInfo getValidatorInfo() {
    return validatorInfo;
  }

  public void setValidatorInfo(StakingsValidatorInfo validatorInfo) {
    this.validatorInfo = validatorInfo;
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
   * @return the Stakings instance itself
   */
  public Stakings putAdditionalProperty(String key, Object value) {
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
    Stakings stakings = (Stakings) o;
    return Objects.equals(this.id, stakings.id) &&
        Objects.equals(this.walletId, stakings.walletId) &&
        Objects.equals(this.address, stakings.address) &&
        Objects.equals(this.amounts, stakings.amounts) &&
        Objects.equals(this.initiator, stakings.initiator) &&
        Objects.equals(this.unlockTimestamp, stakings.unlockTimestamp) &&
        Objects.equals(this.unlockBlockHeight, stakings.unlockBlockHeight) &&
        Objects.equals(this.poolId, stakings.poolId) &&
        Objects.equals(this.tokenId, stakings.tokenId) &&
        Objects.equals(this.posChain, stakings.posChain) &&
        Objects.equals(this.rewardsInfo, stakings.rewardsInfo) &&
        Objects.equals(this.createdTimestamp, stakings.createdTimestamp) &&
        Objects.equals(this.updatedTimestamp, stakings.updatedTimestamp) &&
        Objects.equals(this.validatorInfo, stakings.validatorInfo)&&
        Objects.equals(this.additionalProperties, stakings.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, walletId, address, amounts, initiator, unlockTimestamp, unlockBlockHeight, poolId, tokenId, posChain, rewardsInfo, createdTimestamp, updatedTimestamp, validatorInfo, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Stakings {\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    walletId: ").append(toIndentedString(walletId)).append("\n");
    sb.append("    address: ").append(toIndentedString(address)).append("\n");
    sb.append("    amounts: ").append(toIndentedString(amounts)).append("\n");
    sb.append("    initiator: ").append(toIndentedString(initiator)).append("\n");
    sb.append("    unlockTimestamp: ").append(toIndentedString(unlockTimestamp)).append("\n");
    sb.append("    unlockBlockHeight: ").append(toIndentedString(unlockBlockHeight)).append("\n");
    sb.append("    poolId: ").append(toIndentedString(poolId)).append("\n");
    sb.append("    tokenId: ").append(toIndentedString(tokenId)).append("\n");
    sb.append("    posChain: ").append(toIndentedString(posChain)).append("\n");
    sb.append("    rewardsInfo: ").append(toIndentedString(rewardsInfo)).append("\n");
    sb.append("    createdTimestamp: ").append(toIndentedString(createdTimestamp)).append("\n");
    sb.append("    updatedTimestamp: ").append(toIndentedString(updatedTimestamp)).append("\n");
    sb.append("    validatorInfo: ").append(toIndentedString(validatorInfo)).append("\n");
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
    openapiFields.add("wallet_id");
    openapiFields.add("address");
    openapiFields.add("amounts");
    openapiFields.add("initiator");
    openapiFields.add("unlock_timestamp");
    openapiFields.add("unlock_block_height");
    openapiFields.add("pool_id");
    openapiFields.add("token_id");
    openapiFields.add("pos_chain");
    openapiFields.add("rewards_info");
    openapiFields.add("created_timestamp");
    openapiFields.add("updated_timestamp");
    openapiFields.add("validator_info");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("id");
    openapiRequiredFields.add("wallet_id");
    openapiRequiredFields.add("address");
    openapiRequiredFields.add("amounts");
    openapiRequiredFields.add("pool_id");
    openapiRequiredFields.add("token_id");
    openapiRequiredFields.add("created_timestamp");
    openapiRequiredFields.add("updated_timestamp");
    openapiRequiredFields.add("validator_info");
  }

 /**
  * Validates the JSON Element and throws an exception if issues found
  *
  * @param jsonElement JSON Element
  * @throws IOException if the JSON Element is invalid with respect to Stakings
  */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!Stakings.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in Stakings is not found in the empty JSON string", Stakings.openapiRequiredFields.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : Stakings.openapiRequiredFields) {
        if (jsonElement.getAsJsonObject().get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if (!jsonObj.get("id").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `id` to be a primitive type in the JSON string but got `%s`", jsonObj.get("id").toString()));
      }
      if (!jsonObj.get("wallet_id").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `wallet_id` to be a primitive type in the JSON string but got `%s`", jsonObj.get("wallet_id").toString()));
      }
      if (!jsonObj.get("address").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `address` to be a primitive type in the JSON string but got `%s`", jsonObj.get("address").toString()));
      }
      // ensure the json data is an array
      if (!jsonObj.get("amounts").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `amounts` to be an array in the JSON string but got `%s`", jsonObj.get("amounts").toString()));
      }

      JsonArray jsonArrayamounts = jsonObj.getAsJsonArray("amounts");
      // validate the required field `amounts` (array)
      for (int i = 0; i < jsonArrayamounts.size(); i++) {
        AmountDetailsInner.validateJsonElement(jsonArrayamounts.get(i));
      };
      if ((jsonObj.get("initiator") != null && !jsonObj.get("initiator").isJsonNull()) && !jsonObj.get("initiator").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `initiator` to be a primitive type in the JSON string but got `%s`", jsonObj.get("initiator").toString()));
      }
      if (!jsonObj.get("pool_id").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `pool_id` to be a primitive type in the JSON string but got `%s`", jsonObj.get("pool_id").toString()));
      }
      if (!jsonObj.get("token_id").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `token_id` to be a primitive type in the JSON string but got `%s`", jsonObj.get("token_id").toString()));
      }
      if ((jsonObj.get("pos_chain") != null && !jsonObj.get("pos_chain").isJsonNull()) && !jsonObj.get("pos_chain").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `pos_chain` to be a primitive type in the JSON string but got `%s`", jsonObj.get("pos_chain").toString()));
      }
      // validate the required field `validator_info`
      StakingsValidatorInfo.validateJsonElement(jsonObj.get("validator_info"));
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!Stakings.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'Stakings' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<Stakings> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(Stakings.class));

       return (TypeAdapter<T>) new TypeAdapter<Stakings>() {
           @Override
           public void write(JsonWriter out, Stakings value) throws IOException {
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
           public Stakings read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             JsonObject jsonObj = jsonElement.getAsJsonObject();
             // store additional fields in the deserialized instance
             Stakings instance = thisAdapter.fromJsonTree(jsonObj);
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
  * Create an instance of Stakings given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of Stakings
  * @throws IOException if the JSON string is invalid with respect to Stakings
  */
  public static Stakings fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, Stakings.class);
  }

 /**
  * Convert an instance of Stakings to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

