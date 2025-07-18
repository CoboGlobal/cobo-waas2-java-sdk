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
import com.cobo.waas2.model.TokenizationOperationType;
import com.cobo.waas2.model.TokenizationTokenOperationSource;
import com.cobo.waas2.model.TokenizationUpdateAddressAction;
import com.cobo.waas2.model.TokenizationUpdateAllowlistAddressesParamsAddressesInner;
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
 * TokenizationUpdateAllowlistAddressesEstimateFeeParams
 */
@javax.annotation.Generated(
    value = "org.openapitools.codegen.languages.JavaClientCodegen", 
    comments = "Generator version: 7.6.0"
)
public class TokenizationUpdateAllowlistAddressesEstimateFeeParams {
  public static final String SERIALIZED_NAME_ACTION = "action";
  @SerializedName(SERIALIZED_NAME_ACTION)
  private TokenizationUpdateAddressAction action;

  public static final String SERIALIZED_NAME_SOURCE = "source";
  @SerializedName(SERIALIZED_NAME_SOURCE)
  private TokenizationTokenOperationSource source;

  public static final String SERIALIZED_NAME_ADDRESSES = "addresses";
  @SerializedName(SERIALIZED_NAME_ADDRESSES)
  private List<TokenizationUpdateAllowlistAddressesParamsAddressesInner> addresses = new ArrayList<>();

  public static final String SERIALIZED_NAME_OPERATION_TYPE = "operation_type";
  @SerializedName(SERIALIZED_NAME_OPERATION_TYPE)
  private TokenizationOperationType operationType;

  public static final String SERIALIZED_NAME_TOKEN_ID = "token_id";
  @SerializedName(SERIALIZED_NAME_TOKEN_ID)
  private String tokenId;

  public TokenizationUpdateAllowlistAddressesEstimateFeeParams() {
  }

  public TokenizationUpdateAllowlistAddressesEstimateFeeParams action(TokenizationUpdateAddressAction action) {
    this.action = action;
    return this;
  }

   /**
   * Get action
   * @return action
  **/
  @javax.annotation.Nonnull
  public TokenizationUpdateAddressAction getAction() {
    return action;
  }

  public void setAction(TokenizationUpdateAddressAction action) {
    this.action = action;
  }


  public TokenizationUpdateAllowlistAddressesEstimateFeeParams source(TokenizationTokenOperationSource source) {
    this.source = source;
    return this;
  }

   /**
   * Get source
   * @return source
  **/
  @javax.annotation.Nonnull
  public TokenizationTokenOperationSource getSource() {
    return source;
  }

  public void setSource(TokenizationTokenOperationSource source) {
    this.source = source;
  }


  public TokenizationUpdateAllowlistAddressesEstimateFeeParams addresses(List<TokenizationUpdateAllowlistAddressesParamsAddressesInner> addresses) {
    this.addresses = addresses;
    return this;
  }

  public TokenizationUpdateAllowlistAddressesEstimateFeeParams addAddressesItem(TokenizationUpdateAllowlistAddressesParamsAddressesInner addressesItem) {
    if (this.addresses == null) {
      this.addresses = new ArrayList<>();
    }
    this.addresses.add(addressesItem);
    return this;
  }

   /**
   * A list of addresses to manage. For &#39;add&#39; operations, notes can be provided. For &#39;remove&#39; operations, notes are ignored.
   * @return addresses
  **/
  @javax.annotation.Nonnull
  public List<TokenizationUpdateAllowlistAddressesParamsAddressesInner> getAddresses() {
    return addresses;
  }

  public void setAddresses(List<TokenizationUpdateAllowlistAddressesParamsAddressesInner> addresses) {
    this.addresses = addresses;
  }


  public TokenizationUpdateAllowlistAddressesEstimateFeeParams operationType(TokenizationOperationType operationType) {
    this.operationType = operationType;
    return this;
  }

   /**
   * Get operationType
   * @return operationType
  **/
  @javax.annotation.Nonnull
  public TokenizationOperationType getOperationType() {
    return operationType;
  }

  public void setOperationType(TokenizationOperationType operationType) {
    this.operationType = operationType;
  }


  public TokenizationUpdateAllowlistAddressesEstimateFeeParams tokenId(String tokenId) {
    this.tokenId = tokenId;
    return this;
  }

   /**
   * The ID of the token.
   * @return tokenId
  **/
  @javax.annotation.Nonnull
  public String getTokenId() {
    return tokenId;
  }

  public void setTokenId(String tokenId) {
    this.tokenId = tokenId;
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
   * @return the TokenizationUpdateAllowlistAddressesEstimateFeeParams instance itself
   */
  public TokenizationUpdateAllowlistAddressesEstimateFeeParams putAdditionalProperty(String key, Object value) {
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
    TokenizationUpdateAllowlistAddressesEstimateFeeParams tokenizationUpdateAllowlistAddressesEstimateFeeParams = (TokenizationUpdateAllowlistAddressesEstimateFeeParams) o;
    return Objects.equals(this.action, tokenizationUpdateAllowlistAddressesEstimateFeeParams.action) &&
        Objects.equals(this.source, tokenizationUpdateAllowlistAddressesEstimateFeeParams.source) &&
        Objects.equals(this.addresses, tokenizationUpdateAllowlistAddressesEstimateFeeParams.addresses) &&
        Objects.equals(this.operationType, tokenizationUpdateAllowlistAddressesEstimateFeeParams.operationType) &&
        Objects.equals(this.tokenId, tokenizationUpdateAllowlistAddressesEstimateFeeParams.tokenId)&&
        Objects.equals(this.additionalProperties, tokenizationUpdateAllowlistAddressesEstimateFeeParams.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(action, source, addresses, operationType, tokenId, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TokenizationUpdateAllowlistAddressesEstimateFeeParams {\n");
    sb.append("    action: ").append(toIndentedString(action)).append("\n");
    sb.append("    source: ").append(toIndentedString(source)).append("\n");
    sb.append("    addresses: ").append(toIndentedString(addresses)).append("\n");
    sb.append("    operationType: ").append(toIndentedString(operationType)).append("\n");
    sb.append("    tokenId: ").append(toIndentedString(tokenId)).append("\n");
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
    openapiFields.add("action");
    openapiFields.add("source");
    openapiFields.add("addresses");
    openapiFields.add("operation_type");
    openapiFields.add("token_id");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("action");
    openapiRequiredFields.add("source");
    openapiRequiredFields.add("addresses");
    openapiRequiredFields.add("operation_type");
    openapiRequiredFields.add("token_id");
  }

 /**
  * Validates the JSON Element and throws an exception if issues found
  *
  * @param jsonElement JSON Element
  * @throws IOException if the JSON Element is invalid with respect to TokenizationUpdateAllowlistAddressesEstimateFeeParams
  */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!TokenizationUpdateAllowlistAddressesEstimateFeeParams.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in TokenizationUpdateAllowlistAddressesEstimateFeeParams is not found in the empty JSON string", TokenizationUpdateAllowlistAddressesEstimateFeeParams.openapiRequiredFields.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : TokenizationUpdateAllowlistAddressesEstimateFeeParams.openapiRequiredFields) {
        if (jsonElement.getAsJsonObject().get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      // validate the required field `action`
      TokenizationUpdateAddressAction.validateJsonElement(jsonObj.get("action"));
      // validate the required field `source`
      TokenizationTokenOperationSource.validateJsonElement(jsonObj.get("source"));
      // ensure the json data is an array
      if (!jsonObj.get("addresses").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `addresses` to be an array in the JSON string but got `%s`", jsonObj.get("addresses").toString()));
      }

      JsonArray jsonArrayaddresses = jsonObj.getAsJsonArray("addresses");
      // validate the required field `addresses` (array)
      for (int i = 0; i < jsonArrayaddresses.size(); i++) {
        TokenizationUpdateAllowlistAddressesParamsAddressesInner.validateJsonElement(jsonArrayaddresses.get(i));
      };
      // validate the required field `operation_type`
      TokenizationOperationType.validateJsonElement(jsonObj.get("operation_type"));
      if (!jsonObj.get("token_id").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `token_id` to be a primitive type in the JSON string but got `%s`", jsonObj.get("token_id").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!TokenizationUpdateAllowlistAddressesEstimateFeeParams.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'TokenizationUpdateAllowlistAddressesEstimateFeeParams' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<TokenizationUpdateAllowlistAddressesEstimateFeeParams> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(TokenizationUpdateAllowlistAddressesEstimateFeeParams.class));

       return (TypeAdapter<T>) new TypeAdapter<TokenizationUpdateAllowlistAddressesEstimateFeeParams>() {
           @Override
           public void write(JsonWriter out, TokenizationUpdateAllowlistAddressesEstimateFeeParams value) throws IOException {
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
           public TokenizationUpdateAllowlistAddressesEstimateFeeParams read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             JsonObject jsonObj = jsonElement.getAsJsonObject();
             // store additional fields in the deserialized instance
             TokenizationUpdateAllowlistAddressesEstimateFeeParams instance = thisAdapter.fromJsonTree(jsonObj);
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
  * Create an instance of TokenizationUpdateAllowlistAddressesEstimateFeeParams given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of TokenizationUpdateAllowlistAddressesEstimateFeeParams
  * @throws IOException if the JSON string is invalid with respect to TokenizationUpdateAllowlistAddressesEstimateFeeParams
  */
  public static TokenizationUpdateAllowlistAddressesEstimateFeeParams fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, TokenizationUpdateAllowlistAddressesEstimateFeeParams.class);
  }

 /**
  * Convert an instance of TokenizationUpdateAllowlistAddressesEstimateFeeParams to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

