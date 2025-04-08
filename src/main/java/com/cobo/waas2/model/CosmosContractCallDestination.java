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
import com.cobo.waas2.model.ContractCallDestinationType;
import com.cobo.waas2.model.CosmosContractCallMessage;
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
 * The information about the transaction destination. Refer to [Transaction sources and destinations](https://www.cobo.com/developers/v2/guides/transactions/sources-and-destinations) for a detailed introduction about the supported sources and destinations for each transaction type.
 */
@javax.annotation.Generated(
    value = "org.openapitools.codegen.languages.JavaClientCodegen", 
    comments = "Generator version: 7.6.0"
)
public class CosmosContractCallDestination {
  public static final String SERIALIZED_NAME_DESTINATION_TYPE = "destination_type";
  @SerializedName(SERIALIZED_NAME_DESTINATION_TYPE)
  private ContractCallDestinationType destinationType;

  public static final String SERIALIZED_NAME_COSMOS_MESSAGES = "cosmos_messages";
  @SerializedName(SERIALIZED_NAME_COSMOS_MESSAGES)
  private List<CosmosContractCallMessage> cosmosMessages = new ArrayList<>();

  public static final String SERIALIZED_NAME_VALUE = "value";
  @SerializedName(SERIALIZED_NAME_VALUE)
  private String value;

  public CosmosContractCallDestination() {
  }

  public CosmosContractCallDestination destinationType(ContractCallDestinationType destinationType) {
    this.destinationType = destinationType;
    return this;
  }

   /**
   * Get destinationType
   * @return destinationType
  **/
  @javax.annotation.Nonnull
  public ContractCallDestinationType getDestinationType() {
    return destinationType;
  }

  public void setDestinationType(ContractCallDestinationType destinationType) {
    this.destinationType = destinationType;
  }


  public CosmosContractCallDestination cosmosMessages(List<CosmosContractCallMessage> cosmosMessages) {
    this.cosmosMessages = cosmosMessages;
    return this;
  }

  public CosmosContractCallDestination addCosmosMessagesItem(CosmosContractCallMessage cosmosMessagesItem) {
    if (this.cosmosMessages == null) {
      this.cosmosMessages = new ArrayList<>();
    }
    this.cosmosMessages.add(cosmosMessagesItem);
    return this;
  }

   /**
   * Get cosmosMessages
   * @return cosmosMessages
  **/
  @javax.annotation.Nonnull
  public List<CosmosContractCallMessage> getCosmosMessages() {
    return cosmosMessages;
  }

  public void setCosmosMessages(List<CosmosContractCallMessage> cosmosMessages) {
    this.cosmosMessages = cosmosMessages;
  }


  public CosmosContractCallDestination value(String value) {
    this.value = value;
    return this;
  }

   /**
   * The transfer amount. For example, if you trade 1.5 ETH, then the value is &#x60;1.5&#x60;. 
   * @return value
  **/
  @javax.annotation.Nullable
  public String getValue() {
    return value;
  }

  public void setValue(String value) {
    this.value = value;
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
   * @return the CosmosContractCallDestination instance itself
   */
  public CosmosContractCallDestination putAdditionalProperty(String key, Object value) {
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
    CosmosContractCallDestination cosmosContractCallDestination = (CosmosContractCallDestination) o;
    return Objects.equals(this.destinationType, cosmosContractCallDestination.destinationType) &&
        Objects.equals(this.cosmosMessages, cosmosContractCallDestination.cosmosMessages) &&
        Objects.equals(this.value, cosmosContractCallDestination.value)&&
        Objects.equals(this.additionalProperties, cosmosContractCallDestination.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(destinationType, cosmosMessages, value, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CosmosContractCallDestination {\n");
    sb.append("    destinationType: ").append(toIndentedString(destinationType)).append("\n");
    sb.append("    cosmosMessages: ").append(toIndentedString(cosmosMessages)).append("\n");
    sb.append("    value: ").append(toIndentedString(value)).append("\n");
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
    openapiFields.add("destination_type");
    openapiFields.add("cosmos_messages");
    openapiFields.add("value");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("destination_type");
    openapiRequiredFields.add("cosmos_messages");
  }

 /**
  * Validates the JSON Element and throws an exception if issues found
  *
  * @param jsonElement JSON Element
  * @throws IOException if the JSON Element is invalid with respect to CosmosContractCallDestination
  */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!CosmosContractCallDestination.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in CosmosContractCallDestination is not found in the empty JSON string", CosmosContractCallDestination.openapiRequiredFields.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : CosmosContractCallDestination.openapiRequiredFields) {
        if (jsonElement.getAsJsonObject().get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      // validate the required field `destination_type`
      ContractCallDestinationType.validateJsonElement(jsonObj.get("destination_type"));
      // ensure the json data is an array
      if (!jsonObj.get("cosmos_messages").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `cosmos_messages` to be an array in the JSON string but got `%s`", jsonObj.get("cosmos_messages").toString()));
      }

      JsonArray jsonArraycosmosMessages = jsonObj.getAsJsonArray("cosmos_messages");
      // validate the required field `cosmos_messages` (array)
      for (int i = 0; i < jsonArraycosmosMessages.size(); i++) {
        CosmosContractCallMessage.validateJsonElement(jsonArraycosmosMessages.get(i));
      };
      if ((jsonObj.get("value") != null && !jsonObj.get("value").isJsonNull()) && !jsonObj.get("value").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `value` to be a primitive type in the JSON string but got `%s`", jsonObj.get("value").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!CosmosContractCallDestination.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'CosmosContractCallDestination' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<CosmosContractCallDestination> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(CosmosContractCallDestination.class));

       return (TypeAdapter<T>) new TypeAdapter<CosmosContractCallDestination>() {
           @Override
           public void write(JsonWriter out, CosmosContractCallDestination value) throws IOException {
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
           public CosmosContractCallDestination read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             JsonObject jsonObj = jsonElement.getAsJsonObject();
             // store additional fields in the deserialized instance
             CosmosContractCallDestination instance = thisAdapter.fromJsonTree(jsonObj);
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
  * Create an instance of CosmosContractCallDestination given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of CosmosContractCallDestination
  * @throws IOException if the JSON string is invalid with respect to CosmosContractCallDestination
  */
  public static CosmosContractCallDestination fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, CosmosContractCallDestination.class);
  }

 /**
  * Convert an instance of CosmosContractCallDestination to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

