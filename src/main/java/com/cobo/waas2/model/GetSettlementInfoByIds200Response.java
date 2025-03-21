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
import com.cobo.waas2.model.SettlementInfo;
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
 * GetSettlementInfoByIds200Response
 */
@javax.annotation.Generated(
    value = "org.openapitools.codegen.languages.JavaClientCodegen", 
    comments = "Generator version: 7.6.0"
)
public class GetSettlementInfoByIds200Response {
  public static final String SERIALIZED_NAME_PSP_TOKEN_BALANCES = "psp_token_balances";
  @SerializedName(SERIALIZED_NAME_PSP_TOKEN_BALANCES)
  private List<SettlementInfo> pspTokenBalances = new ArrayList<>();

  public static final String SERIALIZED_NAME_TOKEN_BALANCES = "token_balances";
  @SerializedName(SERIALIZED_NAME_TOKEN_BALANCES)
  private List<SettlementInfo> tokenBalances = new ArrayList<>();

  public GetSettlementInfoByIds200Response() {
  }

  public GetSettlementInfoByIds200Response pspTokenBalances(List<SettlementInfo> pspTokenBalances) {
    this.pspTokenBalances = pspTokenBalances;
    return this;
  }

  public GetSettlementInfoByIds200Response addPspTokenBalancesItem(SettlementInfo pspTokenBalancesItem) {
    if (this.pspTokenBalances == null) {
      this.pspTokenBalances = new ArrayList<>();
    }
    this.pspTokenBalances.add(pspTokenBalancesItem);
    return this;
  }

   /**
   * Get pspTokenBalances
   * @return pspTokenBalances
  **/
  @javax.annotation.Nullable
  public List<SettlementInfo> getPspTokenBalances() {
    return pspTokenBalances;
  }

  public void setPspTokenBalances(List<SettlementInfo> pspTokenBalances) {
    this.pspTokenBalances = pspTokenBalances;
  }


  public GetSettlementInfoByIds200Response tokenBalances(List<SettlementInfo> tokenBalances) {
    this.tokenBalances = tokenBalances;
    return this;
  }

  public GetSettlementInfoByIds200Response addTokenBalancesItem(SettlementInfo tokenBalancesItem) {
    if (this.tokenBalances == null) {
      this.tokenBalances = new ArrayList<>();
    }
    this.tokenBalances.add(tokenBalancesItem);
    return this;
  }

   /**
   * Get tokenBalances
   * @return tokenBalances
  **/
  @javax.annotation.Nullable
  public List<SettlementInfo> getTokenBalances() {
    return tokenBalances;
  }

  public void setTokenBalances(List<SettlementInfo> tokenBalances) {
    this.tokenBalances = tokenBalances;
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
   * @return the GetSettlementInfoByIds200Response instance itself
   */
  public GetSettlementInfoByIds200Response putAdditionalProperty(String key, Object value) {
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
    GetSettlementInfoByIds200Response getSettlementInfoByIds200Response = (GetSettlementInfoByIds200Response) o;
    return Objects.equals(this.pspTokenBalances, getSettlementInfoByIds200Response.pspTokenBalances) &&
        Objects.equals(this.tokenBalances, getSettlementInfoByIds200Response.tokenBalances)&&
        Objects.equals(this.additionalProperties, getSettlementInfoByIds200Response.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(pspTokenBalances, tokenBalances, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class GetSettlementInfoByIds200Response {\n");
    sb.append("    pspTokenBalances: ").append(toIndentedString(pspTokenBalances)).append("\n");
    sb.append("    tokenBalances: ").append(toIndentedString(tokenBalances)).append("\n");
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
    openapiFields.add("psp_token_balances");
    openapiFields.add("token_balances");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Element and throws an exception if issues found
  *
  * @param jsonElement JSON Element
  * @throws IOException if the JSON Element is invalid with respect to GetSettlementInfoByIds200Response
  */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!GetSettlementInfoByIds200Response.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in GetSettlementInfoByIds200Response is not found in the empty JSON string", GetSettlementInfoByIds200Response.openapiRequiredFields.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if (jsonObj.get("psp_token_balances") != null && !jsonObj.get("psp_token_balances").isJsonNull()) {
        JsonArray jsonArraypspTokenBalances = jsonObj.getAsJsonArray("psp_token_balances");
        if (jsonArraypspTokenBalances != null) {
          // ensure the json data is an array
          if (!jsonObj.get("psp_token_balances").isJsonArray()) {
            throw new IllegalArgumentException(String.format("Expected the field `psp_token_balances` to be an array in the JSON string but got `%s`", jsonObj.get("psp_token_balances").toString()));
          }

          // validate the optional field `psp_token_balances` (array)
          for (int i = 0; i < jsonArraypspTokenBalances.size(); i++) {
            SettlementInfo.validateJsonElement(jsonArraypspTokenBalances.get(i));
          };
        }
      }
      if (jsonObj.get("token_balances") != null && !jsonObj.get("token_balances").isJsonNull()) {
        JsonArray jsonArraytokenBalances = jsonObj.getAsJsonArray("token_balances");
        if (jsonArraytokenBalances != null) {
          // ensure the json data is an array
          if (!jsonObj.get("token_balances").isJsonArray()) {
            throw new IllegalArgumentException(String.format("Expected the field `token_balances` to be an array in the JSON string but got `%s`", jsonObj.get("token_balances").toString()));
          }

          // validate the optional field `token_balances` (array)
          for (int i = 0; i < jsonArraytokenBalances.size(); i++) {
            SettlementInfo.validateJsonElement(jsonArraytokenBalances.get(i));
          };
        }
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!GetSettlementInfoByIds200Response.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'GetSettlementInfoByIds200Response' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<GetSettlementInfoByIds200Response> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(GetSettlementInfoByIds200Response.class));

       return (TypeAdapter<T>) new TypeAdapter<GetSettlementInfoByIds200Response>() {
           @Override
           public void write(JsonWriter out, GetSettlementInfoByIds200Response value) throws IOException {
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
           public GetSettlementInfoByIds200Response read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             JsonObject jsonObj = jsonElement.getAsJsonObject();
             // store additional fields in the deserialized instance
             GetSettlementInfoByIds200Response instance = thisAdapter.fromJsonTree(jsonObj);
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
  * Create an instance of GetSettlementInfoByIds200Response given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of GetSettlementInfoByIds200Response
  * @throws IOException if the JSON string is invalid with respect to GetSettlementInfoByIds200Response
  */
  public static GetSettlementInfoByIds200Response fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, GetSettlementInfoByIds200Response.class);
  }

 /**
  * Convert an instance of GetSettlementInfoByIds200Response to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

