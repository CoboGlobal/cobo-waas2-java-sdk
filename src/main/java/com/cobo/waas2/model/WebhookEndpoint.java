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
import com.cobo.waas2.model.WebhookEndpointStatus;
import com.cobo.waas2.model.WebhookEventType;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
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
 * The information about a webhook endpoint.
 */
@javax.annotation.Generated(
    value = "org.openapitools.codegen.languages.JavaClientCodegen", 
    comments = "Generator version: 7.6.0"
)
public class WebhookEndpoint {
  public static final String SERIALIZED_NAME_URL = "url";
  @SerializedName(SERIALIZED_NAME_URL)
  private String url;

  public static final String SERIALIZED_NAME_SUBSCRIBED_EVENTS = "subscribed_events";
  @SerializedName(SERIALIZED_NAME_SUBSCRIBED_EVENTS)
  private List<WebhookEventType> subscribedEvents = new ArrayList<>();

  public static final String SERIALIZED_NAME_CREATED_TIMESTAMP = "created_timestamp";
  @SerializedName(SERIALIZED_NAME_CREATED_TIMESTAMP)
  private Long createdTimestamp;

  public static final String SERIALIZED_NAME_ENDPOINT_ID = "endpoint_id";
  @SerializedName(SERIALIZED_NAME_ENDPOINT_ID)
  private UUID endpointId;

  public static final String SERIALIZED_NAME_STATUS = "status";
  @SerializedName(SERIALIZED_NAME_STATUS)
  private WebhookEndpointStatus status;

  public static final String SERIALIZED_NAME_DESCRIPTION = "description";
  @SerializedName(SERIALIZED_NAME_DESCRIPTION)
  private String description;

  public WebhookEndpoint() {
  }

  public WebhookEndpoint url(String url) {
    this.url = url;
    return this;
  }

   /**
   * The webhook endpoint URL.
   * @return url
  **/
  @javax.annotation.Nonnull
  public String getUrl() {
    return url;
  }

  public void setUrl(String url) {
    this.url = url;
  }


  public WebhookEndpoint subscribedEvents(List<WebhookEventType> subscribedEvents) {
    this.subscribedEvents = subscribedEvents;
    return this;
  }

  public WebhookEndpoint addSubscribedEventsItem(WebhookEventType subscribedEventsItem) {
    if (this.subscribedEvents == null) {
      this.subscribedEvents = new ArrayList<>();
    }
    this.subscribedEvents.add(subscribedEventsItem);
    return this;
  }

   /**
   * The event types subscribed by a webhook endpoint.
   * @return subscribedEvents
  **/
  @javax.annotation.Nonnull
  public List<WebhookEventType> getSubscribedEvents() {
    return subscribedEvents;
  }

  public void setSubscribedEvents(List<WebhookEventType> subscribedEvents) {
    this.subscribedEvents = subscribedEvents;
  }


  public WebhookEndpoint createdTimestamp(Long createdTimestamp) {
    this.createdTimestamp = createdTimestamp;
    return this;
  }

   /**
   * The time when the endpoint was registered, in Unix timestamp format, measured in seconds.
   * @return createdTimestamp
  **/
  @javax.annotation.Nonnull
  public Long getCreatedTimestamp() {
    return createdTimestamp;
  }

  public void setCreatedTimestamp(Long createdTimestamp) {
    this.createdTimestamp = createdTimestamp;
  }


  public WebhookEndpoint endpointId(UUID endpointId) {
    this.endpointId = endpointId;
    return this;
  }

   /**
   * The webhook endpoint ID.
   * @return endpointId
  **/
  @javax.annotation.Nullable
  public UUID getEndpointId() {
    return endpointId;
  }

  public void setEndpointId(UUID endpointId) {
    this.endpointId = endpointId;
  }


  public WebhookEndpoint status(WebhookEndpointStatus status) {
    this.status = status;
    return this;
  }

   /**
   * Get status
   * @return status
  **/
  @javax.annotation.Nonnull
  public WebhookEndpointStatus getStatus() {
    return status;
  }

  public void setStatus(WebhookEndpointStatus status) {
    this.status = status;
  }


  public WebhookEndpoint description(String description) {
    this.description = description;
    return this;
  }

   /**
   * The description of the webhook endpoint.
   * @return description
  **/
  @javax.annotation.Nullable
  public String getDescription() {
    return description;
  }

  public void setDescription(String description) {
    this.description = description;
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
   * @return the WebhookEndpoint instance itself
   */
  public WebhookEndpoint putAdditionalProperty(String key, Object value) {
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
    WebhookEndpoint webhookEndpoint = (WebhookEndpoint) o;
    return Objects.equals(this.url, webhookEndpoint.url) &&
        Objects.equals(this.subscribedEvents, webhookEndpoint.subscribedEvents) &&
        Objects.equals(this.createdTimestamp, webhookEndpoint.createdTimestamp) &&
        Objects.equals(this.endpointId, webhookEndpoint.endpointId) &&
        Objects.equals(this.status, webhookEndpoint.status) &&
        Objects.equals(this.description, webhookEndpoint.description)&&
        Objects.equals(this.additionalProperties, webhookEndpoint.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(url, subscribedEvents, createdTimestamp, endpointId, status, description, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class WebhookEndpoint {\n");
    sb.append("    url: ").append(toIndentedString(url)).append("\n");
    sb.append("    subscribedEvents: ").append(toIndentedString(subscribedEvents)).append("\n");
    sb.append("    createdTimestamp: ").append(toIndentedString(createdTimestamp)).append("\n");
    sb.append("    endpointId: ").append(toIndentedString(endpointId)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
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
    openapiFields.add("url");
    openapiFields.add("subscribed_events");
    openapiFields.add("created_timestamp");
    openapiFields.add("endpoint_id");
    openapiFields.add("status");
    openapiFields.add("description");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("url");
    openapiRequiredFields.add("subscribed_events");
    openapiRequiredFields.add("created_timestamp");
    openapiRequiredFields.add("status");
  }

 /**
  * Validates the JSON Element and throws an exception if issues found
  *
  * @param jsonElement JSON Element
  * @throws IOException if the JSON Element is invalid with respect to WebhookEndpoint
  */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!WebhookEndpoint.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in WebhookEndpoint is not found in the empty JSON string", WebhookEndpoint.openapiRequiredFields.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : WebhookEndpoint.openapiRequiredFields) {
        if (jsonElement.getAsJsonObject().get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if (!jsonObj.get("url").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `url` to be a primitive type in the JSON string but got `%s`", jsonObj.get("url").toString()));
      }
      // ensure the required json array is present
      if (jsonObj.get("subscribed_events") == null) {
        throw new IllegalArgumentException("Expected the field `linkedContent` to be an array in the JSON string but got `null`");
      } else if (!jsonObj.get("subscribed_events").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `subscribed_events` to be an array in the JSON string but got `%s`", jsonObj.get("subscribed_events").toString()));
      }
      if ((jsonObj.get("endpoint_id") != null && !jsonObj.get("endpoint_id").isJsonNull()) && !jsonObj.get("endpoint_id").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `endpoint_id` to be a primitive type in the JSON string but got `%s`", jsonObj.get("endpoint_id").toString()));
      }
      // validate the required field `status`
      WebhookEndpointStatus.validateJsonElement(jsonObj.get("status"));
      if ((jsonObj.get("description") != null && !jsonObj.get("description").isJsonNull()) && !jsonObj.get("description").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `description` to be a primitive type in the JSON string but got `%s`", jsonObj.get("description").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!WebhookEndpoint.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'WebhookEndpoint' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<WebhookEndpoint> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(WebhookEndpoint.class));

       return (TypeAdapter<T>) new TypeAdapter<WebhookEndpoint>() {
           @Override
           public void write(JsonWriter out, WebhookEndpoint value) throws IOException {
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
           public WebhookEndpoint read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             JsonObject jsonObj = jsonElement.getAsJsonObject();
             // store additional fields in the deserialized instance
             WebhookEndpoint instance = thisAdapter.fromJsonTree(jsonObj);
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
  * Create an instance of WebhookEndpoint given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of WebhookEndpoint
  * @throws IOException if the JSON string is invalid with respect to WebhookEndpoint
  */
  public static WebhookEndpoint fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, WebhookEndpoint.class);
  }

 /**
  * Convert an instance of WebhookEndpoint to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

