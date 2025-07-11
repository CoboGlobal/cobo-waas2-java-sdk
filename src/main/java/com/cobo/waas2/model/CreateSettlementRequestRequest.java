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
import com.cobo.waas2.model.AcquiringType;
import com.cobo.waas2.model.CreateSettlement;
import com.cobo.waas2.model.PayoutChannel;
import com.cobo.waas2.model.SettlementType;
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
 * CreateSettlementRequestRequest
 */
@javax.annotation.Generated(
    value = "org.openapitools.codegen.languages.JavaClientCodegen", 
    comments = "Generator version: 7.6.0"
)
public class CreateSettlementRequestRequest {
  public static final String SERIALIZED_NAME_REQUEST_ID = "request_id";
  @SerializedName(SERIALIZED_NAME_REQUEST_ID)
  private String requestId;

  public static final String SERIALIZED_NAME_ACQUIRING_TYPE = "acquiring_type";
  @SerializedName(SERIALIZED_NAME_ACQUIRING_TYPE)
  private AcquiringType acquiringType;

  public static final String SERIALIZED_NAME_PAYOUT_CHANNEL = "payout_channel";
  @SerializedName(SERIALIZED_NAME_PAYOUT_CHANNEL)
  private PayoutChannel payoutChannel;

  public static final String SERIALIZED_NAME_SETTLEMENT_TYPE = "settlement_type";
  @SerializedName(SERIALIZED_NAME_SETTLEMENT_TYPE)
  private SettlementType settlementType;

  public static final String SERIALIZED_NAME_SETTLEMENTS = "settlements";
  @SerializedName(SERIALIZED_NAME_SETTLEMENTS)
  private List<CreateSettlement> settlements = new ArrayList<>();

  public CreateSettlementRequestRequest() {
  }

  public CreateSettlementRequestRequest requestId(String requestId) {
    this.requestId = requestId;
    return this;
  }

   /**
   * The request ID that is used to track a settlement request. The request ID is provided by you and must be unique.
   * @return requestId
  **/
  @javax.annotation.Nonnull
  public String getRequestId() {
    return requestId;
  }

  public void setRequestId(String requestId) {
    this.requestId = requestId;
  }


  public CreateSettlementRequestRequest acquiringType(AcquiringType acquiringType) {
    this.acquiringType = acquiringType;
    return this;
  }

   /**
   * Get acquiringType
   * @return acquiringType
  **/
  @javax.annotation.Nullable
  public AcquiringType getAcquiringType() {
    return acquiringType;
  }

  public void setAcquiringType(AcquiringType acquiringType) {
    this.acquiringType = acquiringType;
  }


  public CreateSettlementRequestRequest payoutChannel(PayoutChannel payoutChannel) {
    this.payoutChannel = payoutChannel;
    return this;
  }

   /**
   * Get payoutChannel
   * @return payoutChannel
  **/
  @javax.annotation.Nullable
  public PayoutChannel getPayoutChannel() {
    return payoutChannel;
  }

  public void setPayoutChannel(PayoutChannel payoutChannel) {
    this.payoutChannel = payoutChannel;
  }


  public CreateSettlementRequestRequest settlementType(SettlementType settlementType) {
    this.settlementType = settlementType;
    return this;
  }

   /**
   * Get settlementType
   * @return settlementType
  **/
  @javax.annotation.Nullable
  public SettlementType getSettlementType() {
    return settlementType;
  }

  public void setSettlementType(SettlementType settlementType) {
    this.settlementType = settlementType;
  }


  public CreateSettlementRequestRequest settlements(List<CreateSettlement> settlements) {
    this.settlements = settlements;
    return this;
  }

  public CreateSettlementRequestRequest addSettlementsItem(CreateSettlement settlementsItem) {
    if (this.settlements == null) {
      this.settlements = new ArrayList<>();
    }
    this.settlements.add(settlementsItem);
    return this;
  }

   /**
   * Get settlements
   * @return settlements
  **/
  @javax.annotation.Nonnull
  public List<CreateSettlement> getSettlements() {
    return settlements;
  }

  public void setSettlements(List<CreateSettlement> settlements) {
    this.settlements = settlements;
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
   * @return the CreateSettlementRequestRequest instance itself
   */
  public CreateSettlementRequestRequest putAdditionalProperty(String key, Object value) {
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
    CreateSettlementRequestRequest createSettlementRequestRequest = (CreateSettlementRequestRequest) o;
    return Objects.equals(this.requestId, createSettlementRequestRequest.requestId) &&
        Objects.equals(this.acquiringType, createSettlementRequestRequest.acquiringType) &&
        Objects.equals(this.payoutChannel, createSettlementRequestRequest.payoutChannel) &&
        Objects.equals(this.settlementType, createSettlementRequestRequest.settlementType) &&
        Objects.equals(this.settlements, createSettlementRequestRequest.settlements)&&
        Objects.equals(this.additionalProperties, createSettlementRequestRequest.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(requestId, acquiringType, payoutChannel, settlementType, settlements, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CreateSettlementRequestRequest {\n");
    sb.append("    requestId: ").append(toIndentedString(requestId)).append("\n");
    sb.append("    acquiringType: ").append(toIndentedString(acquiringType)).append("\n");
    sb.append("    payoutChannel: ").append(toIndentedString(payoutChannel)).append("\n");
    sb.append("    settlementType: ").append(toIndentedString(settlementType)).append("\n");
    sb.append("    settlements: ").append(toIndentedString(settlements)).append("\n");
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
    openapiFields.add("request_id");
    openapiFields.add("acquiring_type");
    openapiFields.add("payout_channel");
    openapiFields.add("settlement_type");
    openapiFields.add("settlements");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("request_id");
    openapiRequiredFields.add("settlements");
  }

 /**
  * Validates the JSON Element and throws an exception if issues found
  *
  * @param jsonElement JSON Element
  * @throws IOException if the JSON Element is invalid with respect to CreateSettlementRequestRequest
  */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!CreateSettlementRequestRequest.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in CreateSettlementRequestRequest is not found in the empty JSON string", CreateSettlementRequestRequest.openapiRequiredFields.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : CreateSettlementRequestRequest.openapiRequiredFields) {
        if (jsonElement.getAsJsonObject().get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if (!jsonObj.get("request_id").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `request_id` to be a primitive type in the JSON string but got `%s`", jsonObj.get("request_id").toString()));
      }
      // validate the optional field `acquiring_type`
      if (jsonObj.get("acquiring_type") != null && !jsonObj.get("acquiring_type").isJsonNull()) {
        AcquiringType.validateJsonElement(jsonObj.get("acquiring_type"));
      }
      // validate the optional field `payout_channel`
      if (jsonObj.get("payout_channel") != null && !jsonObj.get("payout_channel").isJsonNull()) {
        PayoutChannel.validateJsonElement(jsonObj.get("payout_channel"));
      }
      // validate the optional field `settlement_type`
      if (jsonObj.get("settlement_type") != null && !jsonObj.get("settlement_type").isJsonNull()) {
        SettlementType.validateJsonElement(jsonObj.get("settlement_type"));
      }
      // ensure the json data is an array
      if (!jsonObj.get("settlements").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `settlements` to be an array in the JSON string but got `%s`", jsonObj.get("settlements").toString()));
      }

      JsonArray jsonArraysettlements = jsonObj.getAsJsonArray("settlements");
      // validate the required field `settlements` (array)
      for (int i = 0; i < jsonArraysettlements.size(); i++) {
        CreateSettlement.validateJsonElement(jsonArraysettlements.get(i));
      };
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!CreateSettlementRequestRequest.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'CreateSettlementRequestRequest' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<CreateSettlementRequestRequest> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(CreateSettlementRequestRequest.class));

       return (TypeAdapter<T>) new TypeAdapter<CreateSettlementRequestRequest>() {
           @Override
           public void write(JsonWriter out, CreateSettlementRequestRequest value) throws IOException {
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
           public CreateSettlementRequestRequest read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             JsonObject jsonObj = jsonElement.getAsJsonObject();
             // store additional fields in the deserialized instance
             CreateSettlementRequestRequest instance = thisAdapter.fromJsonTree(jsonObj);
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
  * Create an instance of CreateSettlementRequestRequest given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of CreateSettlementRequestRequest
  * @throws IOException if the JSON string is invalid with respect to CreateSettlementRequestRequest
  */
  public static CreateSettlementRequestRequest fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, CreateSettlementRequestRequest.class);
  }

 /**
  * Convert an instance of CreateSettlementRequestRequest to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

