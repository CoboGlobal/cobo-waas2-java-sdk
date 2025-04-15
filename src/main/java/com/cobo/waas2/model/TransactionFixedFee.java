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
import com.cobo.waas2.model.FeeType;
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
 * The transaction fee actually charged by the chain that uses the fixed fee model.   Switch between the tabs to display the properties for different transaction fee models. 
 */
@javax.annotation.Generated(
    value = "org.openapitools.codegen.languages.JavaClientCodegen", 
    comments = "Generator version: 7.6.0"
)
public class TransactionFixedFee {
  public static final String SERIALIZED_NAME_MAX_FEE_AMOUNT = "max_fee_amount";
  @SerializedName(SERIALIZED_NAME_MAX_FEE_AMOUNT)
  private String maxFeeAmount;

  public static final String SERIALIZED_NAME_FEE_TYPE = "fee_type";
  @SerializedName(SERIALIZED_NAME_FEE_TYPE)
  private FeeType feeType = FeeType.EVM_EIP_1559;

  public static final String SERIALIZED_NAME_TOKEN_ID = "token_id";
  @SerializedName(SERIALIZED_NAME_TOKEN_ID)
  private String tokenId;

  public static final String SERIALIZED_NAME_FEE_USED = "fee_used";
  @SerializedName(SERIALIZED_NAME_FEE_USED)
  private String feeUsed;

  public static final String SERIALIZED_NAME_ESTIMATED_FEE_USED = "estimated_fee_used";
  @SerializedName(SERIALIZED_NAME_ESTIMATED_FEE_USED)
  private String estimatedFeeUsed;

  public TransactionFixedFee() {
  }

  public TransactionFixedFee maxFeeAmount(String maxFeeAmount) {
    this.maxFeeAmount = maxFeeAmount;
    return this;
  }

   /**
   * The maximum fee that you are willing to pay for the transaction. Provide the value without applying precision. The transaction will fail if the transaction fee exceeds the maximum fee.
   * @return maxFeeAmount
  **/
  @javax.annotation.Nullable
  public String getMaxFeeAmount() {
    return maxFeeAmount;
  }

  public void setMaxFeeAmount(String maxFeeAmount) {
    this.maxFeeAmount = maxFeeAmount;
  }


  public TransactionFixedFee feeType(FeeType feeType) {
    this.feeType = feeType;
    return this;
  }

   /**
   * Get feeType
   * @return feeType
  **/
  @javax.annotation.Nonnull
  public FeeType getFeeType() {
    return feeType;
  }

  public void setFeeType(FeeType feeType) {
    this.feeType = feeType;
  }


  public TransactionFixedFee tokenId(String tokenId) {
    this.tokenId = tokenId;
    return this;
  }

   /**
   * The token ID of the transaction fee.
   * @return tokenId
  **/
  @javax.annotation.Nullable
  public String getTokenId() {
    return tokenId;
  }

  public void setTokenId(String tokenId) {
    this.tokenId = tokenId;
  }


  public TransactionFixedFee feeUsed(String feeUsed) {
    this.feeUsed = feeUsed;
    return this;
  }

   /**
   * The transaction fee.
   * @return feeUsed
  **/
  @javax.annotation.Nullable
  public String getFeeUsed() {
    return feeUsed;
  }

  public void setFeeUsed(String feeUsed) {
    this.feeUsed = feeUsed;
  }


  public TransactionFixedFee estimatedFeeUsed(String estimatedFeeUsed) {
    this.estimatedFeeUsed = estimatedFeeUsed;
    return this;
  }

   /**
   * The estimated transaction fee.
   * @return estimatedFeeUsed
  **/
  @javax.annotation.Nullable
  public String getEstimatedFeeUsed() {
    return estimatedFeeUsed;
  }

  public void setEstimatedFeeUsed(String estimatedFeeUsed) {
    this.estimatedFeeUsed = estimatedFeeUsed;
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
   * @return the TransactionFixedFee instance itself
   */
  public TransactionFixedFee putAdditionalProperty(String key, Object value) {
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
    TransactionFixedFee transactionFixedFee = (TransactionFixedFee) o;
    return Objects.equals(this.maxFeeAmount, transactionFixedFee.maxFeeAmount) &&
        Objects.equals(this.feeType, transactionFixedFee.feeType) &&
        Objects.equals(this.tokenId, transactionFixedFee.tokenId) &&
        Objects.equals(this.feeUsed, transactionFixedFee.feeUsed) &&
        Objects.equals(this.estimatedFeeUsed, transactionFixedFee.estimatedFeeUsed)&&
        Objects.equals(this.additionalProperties, transactionFixedFee.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(maxFeeAmount, feeType, tokenId, feeUsed, estimatedFeeUsed, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TransactionFixedFee {\n");
    sb.append("    maxFeeAmount: ").append(toIndentedString(maxFeeAmount)).append("\n");
    sb.append("    feeType: ").append(toIndentedString(feeType)).append("\n");
    sb.append("    tokenId: ").append(toIndentedString(tokenId)).append("\n");
    sb.append("    feeUsed: ").append(toIndentedString(feeUsed)).append("\n");
    sb.append("    estimatedFeeUsed: ").append(toIndentedString(estimatedFeeUsed)).append("\n");
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
    openapiFields.add("max_fee_amount");
    openapiFields.add("fee_type");
    openapiFields.add("token_id");
    openapiFields.add("fee_used");
    openapiFields.add("estimated_fee_used");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("fee_type");
  }

 /**
  * Validates the JSON Element and throws an exception if issues found
  *
  * @param jsonElement JSON Element
  * @throws IOException if the JSON Element is invalid with respect to TransactionFixedFee
  */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!TransactionFixedFee.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in TransactionFixedFee is not found in the empty JSON string", TransactionFixedFee.openapiRequiredFields.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : TransactionFixedFee.openapiRequiredFields) {
        if (jsonElement.getAsJsonObject().get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if ((jsonObj.get("max_fee_amount") != null && !jsonObj.get("max_fee_amount").isJsonNull()) && !jsonObj.get("max_fee_amount").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `max_fee_amount` to be a primitive type in the JSON string but got `%s`", jsonObj.get("max_fee_amount").toString()));
      }
      // validate the required field `fee_type`
      FeeType.validateJsonElement(jsonObj.get("fee_type"));
      if ((jsonObj.get("token_id") != null && !jsonObj.get("token_id").isJsonNull()) && !jsonObj.get("token_id").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `token_id` to be a primitive type in the JSON string but got `%s`", jsonObj.get("token_id").toString()));
      }
      if ((jsonObj.get("fee_used") != null && !jsonObj.get("fee_used").isJsonNull()) && !jsonObj.get("fee_used").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `fee_used` to be a primitive type in the JSON string but got `%s`", jsonObj.get("fee_used").toString()));
      }
      if ((jsonObj.get("estimated_fee_used") != null && !jsonObj.get("estimated_fee_used").isJsonNull()) && !jsonObj.get("estimated_fee_used").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `estimated_fee_used` to be a primitive type in the JSON string but got `%s`", jsonObj.get("estimated_fee_used").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!TransactionFixedFee.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'TransactionFixedFee' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<TransactionFixedFee> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(TransactionFixedFee.class));

       return (TypeAdapter<T>) new TypeAdapter<TransactionFixedFee>() {
           @Override
           public void write(JsonWriter out, TransactionFixedFee value) throws IOException {
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
           public TransactionFixedFee read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             JsonObject jsonObj = jsonElement.getAsJsonObject();
             // store additional fields in the deserialized instance
             TransactionFixedFee instance = thisAdapter.fromJsonTree(jsonObj);
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
  * Create an instance of TransactionFixedFee given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of TransactionFixedFee
  * @throws IOException if the JSON string is invalid with respect to TransactionFixedFee
  */
  public static TransactionFixedFee fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, TransactionFixedFee.class);
  }

 /**
  * Convert an instance of TransactionFixedFee to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

