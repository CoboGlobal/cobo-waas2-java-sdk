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
import com.cobo.waas2.model.ExchangeId;
import com.cobo.waas2.model.TransactionSourceType;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import java.io.IOException;
import java.util.Arrays;
import java.util.UUID;

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
 * Information about the transaction source types &#x60;Main&#x60; and &#x60;Sub&#x60;. 
 */
@javax.annotation.Generated(
    value = "org.openapitools.codegen.languages.JavaClientCodegen", 
    comments = "Generator version: 7.6.0"
)
public class TransactionExchangeWalletSource {
  public static final String SERIALIZED_NAME_SOURCE_TYPE = "source_type";
  @SerializedName(SERIALIZED_NAME_SOURCE_TYPE)
  private TransactionSourceType sourceType;

  public static final String SERIALIZED_NAME_EXCHANGE_ID = "exchange_id";
  @SerializedName(SERIALIZED_NAME_EXCHANGE_ID)
  private ExchangeId exchangeId;

  public static final String SERIALIZED_NAME_WALLET_ID = "wallet_id";
  @SerializedName(SERIALIZED_NAME_WALLET_ID)
  private UUID walletId;

  public static final String SERIALIZED_NAME_SUB_WALLET_ID = "sub_wallet_id";
  @SerializedName(SERIALIZED_NAME_SUB_WALLET_ID)
  private String subWalletId;

  public TransactionExchangeWalletSource() {
  }

  public TransactionExchangeWalletSource sourceType(TransactionSourceType sourceType) {
    this.sourceType = sourceType;
    return this;
  }

   /**
   * Get sourceType
   * @return sourceType
  **/
  @javax.annotation.Nonnull
  public TransactionSourceType getSourceType() {
    return sourceType;
  }

  public void setSourceType(TransactionSourceType sourceType) {
    this.sourceType = sourceType;
  }


  public TransactionExchangeWalletSource exchangeId(ExchangeId exchangeId) {
    this.exchangeId = exchangeId;
    return this;
  }

   /**
   * Get exchangeId
   * @return exchangeId
  **/
  @javax.annotation.Nonnull
  public ExchangeId getExchangeId() {
    return exchangeId;
  }

  public void setExchangeId(ExchangeId exchangeId) {
    this.exchangeId = exchangeId;
  }


  public TransactionExchangeWalletSource walletId(UUID walletId) {
    this.walletId = walletId;
    return this;
  }

   /**
   * The wallet ID.
   * @return walletId
  **/
  @javax.annotation.Nonnull
  public UUID getWalletId() {
    return walletId;
  }

  public void setWalletId(UUID walletId) {
    this.walletId = walletId;
  }


  public TransactionExchangeWalletSource subWalletId(String subWalletId) {
    this.subWalletId = subWalletId;
    return this;
  }

   /**
   * The exchange trading account or a sub-wallet ID.
   * @return subWalletId
  **/
  @javax.annotation.Nullable
  public String getSubWalletId() {
    return subWalletId;
  }

  public void setSubWalletId(String subWalletId) {
    this.subWalletId = subWalletId;
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
   * @return the TransactionExchangeWalletSource instance itself
   */
  public TransactionExchangeWalletSource putAdditionalProperty(String key, Object value) {
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
    TransactionExchangeWalletSource transactionExchangeWalletSource = (TransactionExchangeWalletSource) o;
    return Objects.equals(this.sourceType, transactionExchangeWalletSource.sourceType) &&
        Objects.equals(this.exchangeId, transactionExchangeWalletSource.exchangeId) &&
        Objects.equals(this.walletId, transactionExchangeWalletSource.walletId) &&
        Objects.equals(this.subWalletId, transactionExchangeWalletSource.subWalletId)&&
        Objects.equals(this.additionalProperties, transactionExchangeWalletSource.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(sourceType, exchangeId, walletId, subWalletId, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TransactionExchangeWalletSource {\n");
    sb.append("    sourceType: ").append(toIndentedString(sourceType)).append("\n");
    sb.append("    exchangeId: ").append(toIndentedString(exchangeId)).append("\n");
    sb.append("    walletId: ").append(toIndentedString(walletId)).append("\n");
    sb.append("    subWalletId: ").append(toIndentedString(subWalletId)).append("\n");
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
    openapiFields.add("source_type");
    openapiFields.add("exchange_id");
    openapiFields.add("wallet_id");
    openapiFields.add("sub_wallet_id");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("source_type");
    openapiRequiredFields.add("exchange_id");
    openapiRequiredFields.add("wallet_id");
  }

 /**
  * Validates the JSON Element and throws an exception if issues found
  *
  * @param jsonElement JSON Element
  * @throws IOException if the JSON Element is invalid with respect to TransactionExchangeWalletSource
  */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!TransactionExchangeWalletSource.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in TransactionExchangeWalletSource is not found in the empty JSON string", TransactionExchangeWalletSource.openapiRequiredFields.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : TransactionExchangeWalletSource.openapiRequiredFields) {
        if (jsonElement.getAsJsonObject().get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      // validate the required field `source_type`
      TransactionSourceType.validateJsonElement(jsonObj.get("source_type"));
      // validate the required field `exchange_id`
      ExchangeId.validateJsonElement(jsonObj.get("exchange_id"));
      if (!jsonObj.get("wallet_id").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `wallet_id` to be a primitive type in the JSON string but got `%s`", jsonObj.get("wallet_id").toString()));
      }
      if ((jsonObj.get("sub_wallet_id") != null && !jsonObj.get("sub_wallet_id").isJsonNull()) && !jsonObj.get("sub_wallet_id").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `sub_wallet_id` to be a primitive type in the JSON string but got `%s`", jsonObj.get("sub_wallet_id").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!TransactionExchangeWalletSource.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'TransactionExchangeWalletSource' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<TransactionExchangeWalletSource> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(TransactionExchangeWalletSource.class));

       return (TypeAdapter<T>) new TypeAdapter<TransactionExchangeWalletSource>() {
           @Override
           public void write(JsonWriter out, TransactionExchangeWalletSource value) throws IOException {
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
           public TransactionExchangeWalletSource read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             JsonObject jsonObj = jsonElement.getAsJsonObject();
             // store additional fields in the deserialized instance
             TransactionExchangeWalletSource instance = thisAdapter.fromJsonTree(jsonObj);
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
  * Create an instance of TransactionExchangeWalletSource given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of TransactionExchangeWalletSource
  * @throws IOException if the JSON string is invalid with respect to TransactionExchangeWalletSource
  */
  public static TransactionExchangeWalletSource fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, TransactionExchangeWalletSource.class);
  }

 /**
  * Convert an instance of TransactionExchangeWalletSource to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

