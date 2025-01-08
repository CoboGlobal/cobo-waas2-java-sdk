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
import com.cobo.waas2.model.TransactionRoleApprovalDetail;
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
 * The approval detail data for transaction.
 */
@javax.annotation.Generated(
    value = "org.openapitools.codegen.languages.JavaClientCodegen", 
    comments = "Generator version: 7.6.0"
)
public class TransactionApprovalDetail {
  public static final String SERIALIZED_NAME_SPENDER = "spender";
  @SerializedName(SERIALIZED_NAME_SPENDER)
  private TransactionRoleApprovalDetail spender;

  public static final String SERIALIZED_NAME_APPROVER = "approver";
  @SerializedName(SERIALIZED_NAME_APPROVER)
  private TransactionRoleApprovalDetail approver;

  public static final String SERIALIZED_NAME_ADDRESS_OWNER = "address_owner";
  @SerializedName(SERIALIZED_NAME_ADDRESS_OWNER)
  private TransactionRoleApprovalDetail addressOwner;

  public TransactionApprovalDetail() {
  }

  public TransactionApprovalDetail spender(TransactionRoleApprovalDetail spender) {
    this.spender = spender;
    return this;
  }

   /**
   * Get spender
   * @return spender
  **/
  @javax.annotation.Nullable
  public TransactionRoleApprovalDetail getSpender() {
    return spender;
  }

  public void setSpender(TransactionRoleApprovalDetail spender) {
    this.spender = spender;
  }


  public TransactionApprovalDetail approver(TransactionRoleApprovalDetail approver) {
    this.approver = approver;
    return this;
  }

   /**
   * Get approver
   * @return approver
  **/
  @javax.annotation.Nullable
  public TransactionRoleApprovalDetail getApprover() {
    return approver;
  }

  public void setApprover(TransactionRoleApprovalDetail approver) {
    this.approver = approver;
  }


  public TransactionApprovalDetail addressOwner(TransactionRoleApprovalDetail addressOwner) {
    this.addressOwner = addressOwner;
    return this;
  }

   /**
   * Get addressOwner
   * @return addressOwner
  **/
  @javax.annotation.Nullable
  public TransactionRoleApprovalDetail getAddressOwner() {
    return addressOwner;
  }

  public void setAddressOwner(TransactionRoleApprovalDetail addressOwner) {
    this.addressOwner = addressOwner;
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
   * @return the TransactionApprovalDetail instance itself
   */
  public TransactionApprovalDetail putAdditionalProperty(String key, Object value) {
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
    TransactionApprovalDetail transactionApprovalDetail = (TransactionApprovalDetail) o;
    return Objects.equals(this.spender, transactionApprovalDetail.spender) &&
        Objects.equals(this.approver, transactionApprovalDetail.approver) &&
        Objects.equals(this.addressOwner, transactionApprovalDetail.addressOwner)&&
        Objects.equals(this.additionalProperties, transactionApprovalDetail.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(spender, approver, addressOwner, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TransactionApprovalDetail {\n");
    sb.append("    spender: ").append(toIndentedString(spender)).append("\n");
    sb.append("    approver: ").append(toIndentedString(approver)).append("\n");
    sb.append("    addressOwner: ").append(toIndentedString(addressOwner)).append("\n");
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
    openapiFields.add("spender");
    openapiFields.add("approver");
    openapiFields.add("address_owner");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Element and throws an exception if issues found
  *
  * @param jsonElement JSON Element
  * @throws IOException if the JSON Element is invalid with respect to TransactionApprovalDetail
  */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!TransactionApprovalDetail.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in TransactionApprovalDetail is not found in the empty JSON string", TransactionApprovalDetail.openapiRequiredFields.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      // validate the optional field `spender`
      if (jsonObj.get("spender") != null && !jsonObj.get("spender").isJsonNull()) {
        TransactionRoleApprovalDetail.validateJsonElement(jsonObj.get("spender"));
      }
      // validate the optional field `approver`
      if (jsonObj.get("approver") != null && !jsonObj.get("approver").isJsonNull()) {
        TransactionRoleApprovalDetail.validateJsonElement(jsonObj.get("approver"));
      }
      // validate the optional field `address_owner`
      if (jsonObj.get("address_owner") != null && !jsonObj.get("address_owner").isJsonNull()) {
        TransactionRoleApprovalDetail.validateJsonElement(jsonObj.get("address_owner"));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!TransactionApprovalDetail.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'TransactionApprovalDetail' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<TransactionApprovalDetail> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(TransactionApprovalDetail.class));

       return (TypeAdapter<T>) new TypeAdapter<TransactionApprovalDetail>() {
           @Override
           public void write(JsonWriter out, TransactionApprovalDetail value) throws IOException {
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
           public TransactionApprovalDetail read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             JsonObject jsonObj = jsonElement.getAsJsonObject();
             // store additional fields in the deserialized instance
             TransactionApprovalDetail instance = thisAdapter.fromJsonTree(jsonObj);
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
  * Create an instance of TransactionApprovalDetail given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of TransactionApprovalDetail
  * @throws IOException if the JSON string is invalid with respect to TransactionApprovalDetail
  */
  public static TransactionApprovalDetail fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, TransactionApprovalDetail.class);
  }

 /**
  * Convert an instance of TransactionApprovalDetail to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}
