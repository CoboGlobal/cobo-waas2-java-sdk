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
 * CheckAddressChainsValidity200ResponseInner
 */
@javax.annotation.Generated(
    value = "org.openapitools.codegen.languages.JavaClientCodegen", 
    comments = "Generator version: 7.6.0"
)
public class CheckAddressChainsValidity200ResponseInner {
  public static final String SERIALIZED_NAME_CHAIN_ID = "chain_id";
  @SerializedName(SERIALIZED_NAME_CHAIN_ID)
  private String chainId;

  public static final String SERIALIZED_NAME_VALIDITY = "validity";
  @SerializedName(SERIALIZED_NAME_VALIDITY)
  private Boolean validity;

  public CheckAddressChainsValidity200ResponseInner() {
  }

  public CheckAddressChainsValidity200ResponseInner chainId(String chainId) {
    this.chainId = chainId;
    return this;
  }

   /**
   * The chain ID, which is the unique identifier of a blockchain.
   * @return chainId
  **/
  @javax.annotation.Nonnull
  public String getChainId() {
    return chainId;
  }

  public void setChainId(String chainId) {
    this.chainId = chainId;
  }


  public CheckAddressChainsValidity200ResponseInner validity(Boolean validity) {
    this.validity = validity;
    return this;
  }

   /**
   * Whether the address is valid for the specified chain.  - &#x60;true&#x60;: The address is valid.  - &#x60;false&#x60;: The address is invalid. 
   * @return validity
  **/
  @javax.annotation.Nonnull
  public Boolean getValidity() {
    return validity;
  }

  public void setValidity(Boolean validity) {
    this.validity = validity;
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
   * @return the CheckAddressChainsValidity200ResponseInner instance itself
   */
  public CheckAddressChainsValidity200ResponseInner putAdditionalProperty(String key, Object value) {
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
    CheckAddressChainsValidity200ResponseInner checkAddressChainsValidity200ResponseInner = (CheckAddressChainsValidity200ResponseInner) o;
    return Objects.equals(this.chainId, checkAddressChainsValidity200ResponseInner.chainId) &&
        Objects.equals(this.validity, checkAddressChainsValidity200ResponseInner.validity)&&
        Objects.equals(this.additionalProperties, checkAddressChainsValidity200ResponseInner.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(chainId, validity, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CheckAddressChainsValidity200ResponseInner {\n");
    sb.append("    chainId: ").append(toIndentedString(chainId)).append("\n");
    sb.append("    validity: ").append(toIndentedString(validity)).append("\n");
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
    openapiFields.add("chain_id");
    openapiFields.add("validity");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("chain_id");
    openapiRequiredFields.add("validity");
  }

 /**
  * Validates the JSON Element and throws an exception if issues found
  *
  * @param jsonElement JSON Element
  * @throws IOException if the JSON Element is invalid with respect to CheckAddressChainsValidity200ResponseInner
  */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!CheckAddressChainsValidity200ResponseInner.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in CheckAddressChainsValidity200ResponseInner is not found in the empty JSON string", CheckAddressChainsValidity200ResponseInner.openapiRequiredFields.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : CheckAddressChainsValidity200ResponseInner.openapiRequiredFields) {
        if (jsonElement.getAsJsonObject().get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if (!jsonObj.get("chain_id").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `chain_id` to be a primitive type in the JSON string but got `%s`", jsonObj.get("chain_id").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!CheckAddressChainsValidity200ResponseInner.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'CheckAddressChainsValidity200ResponseInner' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<CheckAddressChainsValidity200ResponseInner> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(CheckAddressChainsValidity200ResponseInner.class));

       return (TypeAdapter<T>) new TypeAdapter<CheckAddressChainsValidity200ResponseInner>() {
           @Override
           public void write(JsonWriter out, CheckAddressChainsValidity200ResponseInner value) throws IOException {
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
           public CheckAddressChainsValidity200ResponseInner read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             JsonObject jsonObj = jsonElement.getAsJsonObject();
             // store additional fields in the deserialized instance
             CheckAddressChainsValidity200ResponseInner instance = thisAdapter.fromJsonTree(jsonObj);
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
  * Create an instance of CheckAddressChainsValidity200ResponseInner given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of CheckAddressChainsValidity200ResponseInner
  * @throws IOException if the JSON string is invalid with respect to CheckAddressChainsValidity200ResponseInner
  */
  public static CheckAddressChainsValidity200ResponseInner fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, CheckAddressChainsValidity200ResponseInner.class);
  }

 /**
  * Convert an instance of CheckAddressChainsValidity200ResponseInner to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

