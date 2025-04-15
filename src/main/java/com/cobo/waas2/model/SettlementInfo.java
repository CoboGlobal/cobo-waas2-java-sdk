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
 * SettlementInfo
 */
@javax.annotation.Generated(
    value = "org.openapitools.codegen.languages.JavaClientCodegen", 
    comments = "Generator version: 7.6.0"
)
public class SettlementInfo {
  public static final String SERIALIZED_NAME_MERCHANT_ID = "merchant_id";
  @SerializedName(SERIALIZED_NAME_MERCHANT_ID)
  private String merchantId;

  public static final String SERIALIZED_NAME_TOKEN_ID = "token_id";
  @SerializedName(SERIALIZED_NAME_TOKEN_ID)
  private String tokenId;

  public static final String SERIALIZED_NAME_AVAILABLE_AMOUNT = "available_amount";
  @SerializedName(SERIALIZED_NAME_AVAILABLE_AMOUNT)
  private String availableAmount;

  public static final String SERIALIZED_NAME_AVAILABLE_CURRENCY_BALANCE = "available_currency_balance";
  @SerializedName(SERIALIZED_NAME_AVAILABLE_CURRENCY_BALANCE)
  private String availableCurrencyBalance;

  public static final String SERIALIZED_NAME_PENDING_AMOUNT = "pending_amount";
  @SerializedName(SERIALIZED_NAME_PENDING_AMOUNT)
  private String pendingAmount;

  public static final String SERIALIZED_NAME_PENDING_CURRENCY_BALANCE = "pending_currency_balance";
  @SerializedName(SERIALIZED_NAME_PENDING_CURRENCY_BALANCE)
  private String pendingCurrencyBalance;

  public SettlementInfo() {
  }

  public SettlementInfo merchantId(String merchantId) {
    this.merchantId = merchantId;
    return this;
  }

   /**
   * The merchant ID. For developer balance, this field will be empty.
   * @return merchantId
  **/
  @javax.annotation.Nullable
  public String getMerchantId() {
    return merchantId;
  }

  public void setMerchantId(String merchantId) {
    this.merchantId = merchantId;
  }


  public SettlementInfo tokenId(String tokenId) {
    this.tokenId = tokenId;
    return this;
  }

   /**
   * The ID of the cryptocurrency.
   * @return tokenId
  **/
  @javax.annotation.Nullable
  public String getTokenId() {
    return tokenId;
  }

  public void setTokenId(String tokenId) {
    this.tokenId = tokenId;
  }


  public SettlementInfo availableAmount(String availableAmount) {
    this.availableAmount = availableAmount;
    return this;
  }

   /**
   * The amount available for settlement or refund, in the specified cryptocurrency.
   * @return availableAmount
  **/
  @javax.annotation.Nonnull
  public String getAvailableAmount() {
    return availableAmount;
  }

  public void setAvailableAmount(String availableAmount) {
    this.availableAmount = availableAmount;
  }


  public SettlementInfo availableCurrencyBalance(String availableCurrencyBalance) {
    this.availableCurrencyBalance = availableCurrencyBalance;
    return this;
  }

   /**
   * The amount available for settlement or refund, in the specified fiat currency.
   * @return availableCurrencyBalance
  **/
  @javax.annotation.Nullable
  public String getAvailableCurrencyBalance() {
    return availableCurrencyBalance;
  }

  public void setAvailableCurrencyBalance(String availableCurrencyBalance) {
    this.availableCurrencyBalance = availableCurrencyBalance;
  }


  public SettlementInfo pendingAmount(String pendingAmount) {
    this.pendingAmount = pendingAmount;
    return this;
  }

   /**
   * The amount unavailable for settlement or refund, in the specified cryptocurrency.
   * @return pendingAmount
  **/
  @javax.annotation.Nullable
  public String getPendingAmount() {
    return pendingAmount;
  }

  public void setPendingAmount(String pendingAmount) {
    this.pendingAmount = pendingAmount;
  }


  public SettlementInfo pendingCurrencyBalance(String pendingCurrencyBalance) {
    this.pendingCurrencyBalance = pendingCurrencyBalance;
    return this;
  }

   /**
   * The amount unavailable for settlement or refund, in the specified fiat currency.
   * @return pendingCurrencyBalance
  **/
  @javax.annotation.Nullable
  public String getPendingCurrencyBalance() {
    return pendingCurrencyBalance;
  }

  public void setPendingCurrencyBalance(String pendingCurrencyBalance) {
    this.pendingCurrencyBalance = pendingCurrencyBalance;
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
   * @return the SettlementInfo instance itself
   */
  public SettlementInfo putAdditionalProperty(String key, Object value) {
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
    SettlementInfo settlementInfo = (SettlementInfo) o;
    return Objects.equals(this.merchantId, settlementInfo.merchantId) &&
        Objects.equals(this.tokenId, settlementInfo.tokenId) &&
        Objects.equals(this.availableAmount, settlementInfo.availableAmount) &&
        Objects.equals(this.availableCurrencyBalance, settlementInfo.availableCurrencyBalance) &&
        Objects.equals(this.pendingAmount, settlementInfo.pendingAmount) &&
        Objects.equals(this.pendingCurrencyBalance, settlementInfo.pendingCurrencyBalance)&&
        Objects.equals(this.additionalProperties, settlementInfo.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(merchantId, tokenId, availableAmount, availableCurrencyBalance, pendingAmount, pendingCurrencyBalance, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SettlementInfo {\n");
    sb.append("    merchantId: ").append(toIndentedString(merchantId)).append("\n");
    sb.append("    tokenId: ").append(toIndentedString(tokenId)).append("\n");
    sb.append("    availableAmount: ").append(toIndentedString(availableAmount)).append("\n");
    sb.append("    availableCurrencyBalance: ").append(toIndentedString(availableCurrencyBalance)).append("\n");
    sb.append("    pendingAmount: ").append(toIndentedString(pendingAmount)).append("\n");
    sb.append("    pendingCurrencyBalance: ").append(toIndentedString(pendingCurrencyBalance)).append("\n");
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
    openapiFields.add("merchant_id");
    openapiFields.add("token_id");
    openapiFields.add("available_amount");
    openapiFields.add("available_currency_balance");
    openapiFields.add("pending_amount");
    openapiFields.add("pending_currency_balance");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("available_amount");
  }

 /**
  * Validates the JSON Element and throws an exception if issues found
  *
  * @param jsonElement JSON Element
  * @throws IOException if the JSON Element is invalid with respect to SettlementInfo
  */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!SettlementInfo.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in SettlementInfo is not found in the empty JSON string", SettlementInfo.openapiRequiredFields.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : SettlementInfo.openapiRequiredFields) {
        if (jsonElement.getAsJsonObject().get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if ((jsonObj.get("merchant_id") != null && !jsonObj.get("merchant_id").isJsonNull()) && !jsonObj.get("merchant_id").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `merchant_id` to be a primitive type in the JSON string but got `%s`", jsonObj.get("merchant_id").toString()));
      }
      if ((jsonObj.get("token_id") != null && !jsonObj.get("token_id").isJsonNull()) && !jsonObj.get("token_id").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `token_id` to be a primitive type in the JSON string but got `%s`", jsonObj.get("token_id").toString()));
      }
      if (!jsonObj.get("available_amount").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `available_amount` to be a primitive type in the JSON string but got `%s`", jsonObj.get("available_amount").toString()));
      }
      if ((jsonObj.get("available_currency_balance") != null && !jsonObj.get("available_currency_balance").isJsonNull()) && !jsonObj.get("available_currency_balance").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `available_currency_balance` to be a primitive type in the JSON string but got `%s`", jsonObj.get("available_currency_balance").toString()));
      }
      if ((jsonObj.get("pending_amount") != null && !jsonObj.get("pending_amount").isJsonNull()) && !jsonObj.get("pending_amount").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `pending_amount` to be a primitive type in the JSON string but got `%s`", jsonObj.get("pending_amount").toString()));
      }
      if ((jsonObj.get("pending_currency_balance") != null && !jsonObj.get("pending_currency_balance").isJsonNull()) && !jsonObj.get("pending_currency_balance").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `pending_currency_balance` to be a primitive type in the JSON string but got `%s`", jsonObj.get("pending_currency_balance").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!SettlementInfo.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'SettlementInfo' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<SettlementInfo> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(SettlementInfo.class));

       return (TypeAdapter<T>) new TypeAdapter<SettlementInfo>() {
           @Override
           public void write(JsonWriter out, SettlementInfo value) throws IOException {
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
           public SettlementInfo read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             JsonObject jsonObj = jsonElement.getAsJsonObject();
             // store additional fields in the deserialized instance
             SettlementInfo instance = thisAdapter.fromJsonTree(jsonObj);
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
  * Create an instance of SettlementInfo given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of SettlementInfo
  * @throws IOException if the JSON string is invalid with respect to SettlementInfo
  */
  public static SettlementInfo fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, SettlementInfo.class);
  }

 /**
  * Convert an instance of SettlementInfo to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

