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
import com.cobo.waas2.model.WalletSubtype;
import com.cobo.waas2.model.WalletType;
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
 * CreateTokenListingRequestRequest
 */
@javax.annotation.Generated(
    value = "org.openapitools.codegen.languages.JavaClientCodegen", 
    comments = "Generator version: 7.6.0"
)
public class CreateTokenListingRequestRequest {
  public static final String SERIALIZED_NAME_WALLET_TYPE = "wallet_type";
  @SerializedName(SERIALIZED_NAME_WALLET_TYPE)
  private WalletType walletType;

  public static final String SERIALIZED_NAME_WALLET_SUBTYPE = "wallet_subtype";
  @SerializedName(SERIALIZED_NAME_WALLET_SUBTYPE)
  private WalletSubtype walletSubtype;

  public static final String SERIALIZED_NAME_CHAIN_ID = "chain_id";
  @SerializedName(SERIALIZED_NAME_CHAIN_ID)
  private String chainId;

  public static final String SERIALIZED_NAME_CONTRACT_ADDRESS = "contract_address";
  @SerializedName(SERIALIZED_NAME_CONTRACT_ADDRESS)
  private String contractAddress;

  public CreateTokenListingRequestRequest() {
  }

  public CreateTokenListingRequestRequest walletType(WalletType walletType) {
    this.walletType = walletType;
    return this;
  }

   /**
   * Get walletType
   * @return walletType
  **/
  @javax.annotation.Nonnull
  public WalletType getWalletType() {
    return walletType;
  }

  public void setWalletType(WalletType walletType) {
    this.walletType = walletType;
  }


  public CreateTokenListingRequestRequest walletSubtype(WalletSubtype walletSubtype) {
    this.walletSubtype = walletSubtype;
    return this;
  }

   /**
   * Get walletSubtype
   * @return walletSubtype
  **/
  @javax.annotation.Nonnull
  public WalletSubtype getWalletSubtype() {
    return walletSubtype;
  }

  public void setWalletSubtype(WalletSubtype walletSubtype) {
    this.walletSubtype = walletSubtype;
  }


  public CreateTokenListingRequestRequest chainId(String chainId) {
    this.chainId = chainId;
    return this;
  }

   /**
   * ID of the blockchain where the token exists
   * @return chainId
  **/
  @javax.annotation.Nonnull
  public String getChainId() {
    return chainId;
  }

  public void setChainId(String chainId) {
    this.chainId = chainId;
  }


  public CreateTokenListingRequestRequest contractAddress(String contractAddress) {
    this.contractAddress = contractAddress;
    return this;
  }

   /**
   * Contract address of the token
   * @return contractAddress
  **/
  @javax.annotation.Nonnull
  public String getContractAddress() {
    return contractAddress;
  }

  public void setContractAddress(String contractAddress) {
    this.contractAddress = contractAddress;
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
   * @return the CreateTokenListingRequestRequest instance itself
   */
  public CreateTokenListingRequestRequest putAdditionalProperty(String key, Object value) {
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
    CreateTokenListingRequestRequest createTokenListingRequestRequest = (CreateTokenListingRequestRequest) o;
    return Objects.equals(this.walletType, createTokenListingRequestRequest.walletType) &&
        Objects.equals(this.walletSubtype, createTokenListingRequestRequest.walletSubtype) &&
        Objects.equals(this.chainId, createTokenListingRequestRequest.chainId) &&
        Objects.equals(this.contractAddress, createTokenListingRequestRequest.contractAddress)&&
        Objects.equals(this.additionalProperties, createTokenListingRequestRequest.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(walletType, walletSubtype, chainId, contractAddress, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CreateTokenListingRequestRequest {\n");
    sb.append("    walletType: ").append(toIndentedString(walletType)).append("\n");
    sb.append("    walletSubtype: ").append(toIndentedString(walletSubtype)).append("\n");
    sb.append("    chainId: ").append(toIndentedString(chainId)).append("\n");
    sb.append("    contractAddress: ").append(toIndentedString(contractAddress)).append("\n");
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
    openapiFields.add("wallet_type");
    openapiFields.add("wallet_subtype");
    openapiFields.add("chain_id");
    openapiFields.add("contract_address");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("wallet_type");
    openapiRequiredFields.add("wallet_subtype");
    openapiRequiredFields.add("chain_id");
    openapiRequiredFields.add("contract_address");
  }

 /**
  * Validates the JSON Element and throws an exception if issues found
  *
  * @param jsonElement JSON Element
  * @throws IOException if the JSON Element is invalid with respect to CreateTokenListingRequestRequest
  */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!CreateTokenListingRequestRequest.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in CreateTokenListingRequestRequest is not found in the empty JSON string", CreateTokenListingRequestRequest.openapiRequiredFields.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : CreateTokenListingRequestRequest.openapiRequiredFields) {
        if (jsonElement.getAsJsonObject().get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      // validate the required field `wallet_type`
      WalletType.validateJsonElement(jsonObj.get("wallet_type"));
      // validate the required field `wallet_subtype`
      WalletSubtype.validateJsonElement(jsonObj.get("wallet_subtype"));
      if (!jsonObj.get("chain_id").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `chain_id` to be a primitive type in the JSON string but got `%s`", jsonObj.get("chain_id").toString()));
      }
      if (!jsonObj.get("contract_address").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `contract_address` to be a primitive type in the JSON string but got `%s`", jsonObj.get("contract_address").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!CreateTokenListingRequestRequest.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'CreateTokenListingRequestRequest' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<CreateTokenListingRequestRequest> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(CreateTokenListingRequestRequest.class));

       return (TypeAdapter<T>) new TypeAdapter<CreateTokenListingRequestRequest>() {
           @Override
           public void write(JsonWriter out, CreateTokenListingRequestRequest value) throws IOException {
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
           public CreateTokenListingRequestRequest read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             JsonObject jsonObj = jsonElement.getAsJsonObject();
             // store additional fields in the deserialized instance
             CreateTokenListingRequestRequest instance = thisAdapter.fromJsonTree(jsonObj);
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
  * Create an instance of CreateTokenListingRequestRequest given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of CreateTokenListingRequestRequest
  * @throws IOException if the JSON string is invalid with respect to CreateTokenListingRequestRequest
  */
  public static CreateTokenListingRequestRequest fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, CreateTokenListingRequestRequest.class);
  }

 /**
  * Convert an instance of CreateTokenListingRequestRequest to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

