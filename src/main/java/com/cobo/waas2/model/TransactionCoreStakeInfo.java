/*
 * Cobo Wallet as a Service 2.0
 *
 * Contact: help@cobo.com
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.cobo.waas2.model;

import java.util.Objects;
import com.cobo.waas2.model.TransactionExtraType;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import java.io.IOException;
import java.util.Arrays;

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
 * The core stake information.
 */
@javax.annotation.Generated(
    value = "org.openapitools.codegen.languages.JavaClientCodegen", 
    comments = "Generator version: 7.6.0"
)
public class TransactionCoreStakeInfo {
  public static final String SERIALIZED_NAME_EXTRA_TYPE = "extra_type";
  @SerializedName(SERIALIZED_NAME_EXTRA_TYPE)
  private TransactionExtraType extraType;

  public static final String SERIALIZED_NAME_STAKE_AMOUNT = "stake_amount";
  @SerializedName(SERIALIZED_NAME_STAKE_AMOUNT)
  private String stakeAmount;

  public static final String SERIALIZED_NAME_TIMELOCK = "timelock";
  @SerializedName(SERIALIZED_NAME_TIMELOCK)
  private Integer timelock;

  public static final String SERIALIZED_NAME_CHANGE_ADDRESS = "change_address";
  @SerializedName(SERIALIZED_NAME_CHANGE_ADDRESS)
  private String changeAddress;

  public static final String SERIALIZED_NAME_VALIDATOR_ADDRESS = "validator_address";
  @SerializedName(SERIALIZED_NAME_VALIDATOR_ADDRESS)
  private String validatorAddress;

  public static final String SERIALIZED_NAME_REWARD_ADDRESS = "reward_address";
  @SerializedName(SERIALIZED_NAME_REWARD_ADDRESS)
  private String rewardAddress;

  public TransactionCoreStakeInfo() {
  }

  public TransactionCoreStakeInfo extraType(TransactionExtraType extraType) {
    this.extraType = extraType;
    return this;
  }

   /**
   * Get extraType
   * @return extraType
  **/
  @javax.annotation.Nonnull
  public TransactionExtraType getExtraType() {
    return extraType;
  }

  public void setExtraType(TransactionExtraType extraType) {
    this.extraType = extraType;
  }


  public TransactionCoreStakeInfo stakeAmount(String stakeAmount) {
    this.stakeAmount = stakeAmount;
    return this;
  }

   /**
   * The origin staking amount.
   * @return stakeAmount
  **/
  @javax.annotation.Nullable
  public String getStakeAmount() {
    return stakeAmount;
  }

  public void setStakeAmount(String stakeAmount) {
    this.stakeAmount = stakeAmount;
  }


  public TransactionCoreStakeInfo timelock(Integer timelock) {
    this.timelock = timelock;
    return this;
  }

   /**
   * The Unix timestamp (in seconds) when the staking position will be unlocked and available for withdrawal.
   * @return timelock
  **/
  @javax.annotation.Nullable
  public Integer getTimelock() {
    return timelock;
  }

  public void setTimelock(Integer timelock) {
    this.timelock = timelock;
  }


  public TransactionCoreStakeInfo changeAddress(String changeAddress) {
    this.changeAddress = changeAddress;
    return this;
  }

   /**
   * The change address on the Bitcoin chain. If not provided, the source wallet&#39;s address will be used as the change address.
   * @return changeAddress
  **/
  @javax.annotation.Nullable
  public String getChangeAddress() {
    return changeAddress;
  }

  public void setChangeAddress(String changeAddress) {
    this.changeAddress = changeAddress;
  }


  public TransactionCoreStakeInfo validatorAddress(String validatorAddress) {
    this.validatorAddress = validatorAddress;
    return this;
  }

   /**
   * The validator&#39;s EVM address.
   * @return validatorAddress
  **/
  @javax.annotation.Nullable
  public String getValidatorAddress() {
    return validatorAddress;
  }

  public void setValidatorAddress(String validatorAddress) {
    this.validatorAddress = validatorAddress;
  }


  public TransactionCoreStakeInfo rewardAddress(String rewardAddress) {
    this.rewardAddress = rewardAddress;
    return this;
  }

   /**
   * The EVM address to receive staking rewards.
   * @return rewardAddress
  **/
  @javax.annotation.Nullable
  public String getRewardAddress() {
    return rewardAddress;
  }

  public void setRewardAddress(String rewardAddress) {
    this.rewardAddress = rewardAddress;
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
   * @return the TransactionCoreStakeInfo instance itself
   */
  public TransactionCoreStakeInfo putAdditionalProperty(String key, Object value) {
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
    TransactionCoreStakeInfo transactionCoreStakeInfo = (TransactionCoreStakeInfo) o;
    return Objects.equals(this.extraType, transactionCoreStakeInfo.extraType) &&
        Objects.equals(this.stakeAmount, transactionCoreStakeInfo.stakeAmount) &&
        Objects.equals(this.timelock, transactionCoreStakeInfo.timelock) &&
        Objects.equals(this.changeAddress, transactionCoreStakeInfo.changeAddress) &&
        Objects.equals(this.validatorAddress, transactionCoreStakeInfo.validatorAddress) &&
        Objects.equals(this.rewardAddress, transactionCoreStakeInfo.rewardAddress)&&
        Objects.equals(this.additionalProperties, transactionCoreStakeInfo.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(extraType, stakeAmount, timelock, changeAddress, validatorAddress, rewardAddress, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TransactionCoreStakeInfo {\n");
    sb.append("    extraType: ").append(toIndentedString(extraType)).append("\n");
    sb.append("    stakeAmount: ").append(toIndentedString(stakeAmount)).append("\n");
    sb.append("    timelock: ").append(toIndentedString(timelock)).append("\n");
    sb.append("    changeAddress: ").append(toIndentedString(changeAddress)).append("\n");
    sb.append("    validatorAddress: ").append(toIndentedString(validatorAddress)).append("\n");
    sb.append("    rewardAddress: ").append(toIndentedString(rewardAddress)).append("\n");
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
    openapiFields.add("extra_type");
    openapiFields.add("stake_amount");
    openapiFields.add("timelock");
    openapiFields.add("change_address");
    openapiFields.add("validator_address");
    openapiFields.add("reward_address");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("extra_type");
  }

 /**
  * Validates the JSON Element and throws an exception if issues found
  *
  * @param jsonElement JSON Element
  * @throws IOException if the JSON Element is invalid with respect to TransactionCoreStakeInfo
  */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!TransactionCoreStakeInfo.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in TransactionCoreStakeInfo is not found in the empty JSON string", TransactionCoreStakeInfo.openapiRequiredFields.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : TransactionCoreStakeInfo.openapiRequiredFields) {
        if (jsonElement.getAsJsonObject().get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      // validate the required field `extra_type`
      TransactionExtraType.validateJsonElement(jsonObj.get("extra_type"));
      if ((jsonObj.get("stake_amount") != null && !jsonObj.get("stake_amount").isJsonNull()) && !jsonObj.get("stake_amount").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `stake_amount` to be a primitive type in the JSON string but got `%s`", jsonObj.get("stake_amount").toString()));
      }
      if ((jsonObj.get("change_address") != null && !jsonObj.get("change_address").isJsonNull()) && !jsonObj.get("change_address").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `change_address` to be a primitive type in the JSON string but got `%s`", jsonObj.get("change_address").toString()));
      }
      if ((jsonObj.get("validator_address") != null && !jsonObj.get("validator_address").isJsonNull()) && !jsonObj.get("validator_address").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `validator_address` to be a primitive type in the JSON string but got `%s`", jsonObj.get("validator_address").toString()));
      }
      if ((jsonObj.get("reward_address") != null && !jsonObj.get("reward_address").isJsonNull()) && !jsonObj.get("reward_address").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `reward_address` to be a primitive type in the JSON string but got `%s`", jsonObj.get("reward_address").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!TransactionCoreStakeInfo.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'TransactionCoreStakeInfo' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<TransactionCoreStakeInfo> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(TransactionCoreStakeInfo.class));

       return (TypeAdapter<T>) new TypeAdapter<TransactionCoreStakeInfo>() {
           @Override
           public void write(JsonWriter out, TransactionCoreStakeInfo value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             obj.remove("additionalProperties");
             // serialize additional properties
             if (value.getAdditionalProperties() != null) {
               for (Map.Entry<String, Object> entry : value.getAdditionalProperties().entrySet()) {
                 if (entry.getValue() == null)
                   obj.addProperty(entry.getKey(), (String) null);
                 else if (entry.getValue() instanceof String)
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
           public TransactionCoreStakeInfo read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             JsonObject jsonObj = jsonElement.getAsJsonObject();
             // store additional fields in the deserialized instance
             TransactionCoreStakeInfo instance = thisAdapter.fromJsonTree(jsonObj);
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
  * Create an instance of TransactionCoreStakeInfo given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of TransactionCoreStakeInfo
  * @throws IOException if the JSON string is invalid with respect to TransactionCoreStakeInfo
  */
  public static TransactionCoreStakeInfo fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, TransactionCoreStakeInfo.class);
  }

 /**
  * Convert an instance of TransactionCoreStakeInfo to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

