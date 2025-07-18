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
import com.cobo.waas2.model.GraphQLErrorLocationsInner;
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
 * Details of an error in the GraphQL operation.
 */
@javax.annotation.Generated(
    value = "org.openapitools.codegen.languages.JavaClientCodegen", 
    comments = "Generator version: 7.6.0"
)
public class GraphQLError {
  public static final String SERIALIZED_NAME_MESSAGE = "message";
  @SerializedName(SERIALIZED_NAME_MESSAGE)
  private String message;

  public static final String SERIALIZED_NAME_LOCATIONS = "locations";
  @SerializedName(SERIALIZED_NAME_LOCATIONS)
  private List<GraphQLErrorLocationsInner> locations = new ArrayList<>();

  public static final String SERIALIZED_NAME_PATH = "path";
  @SerializedName(SERIALIZED_NAME_PATH)
  private List<String> path = new ArrayList<>();

  public GraphQLError() {
  }

  public GraphQLError message(String message) {
    this.message = message;
    return this;
  }

   /**
   * The error message.
   * @return message
  **/
  @javax.annotation.Nullable
  public String getMessage() {
    return message;
  }

  public void setMessage(String message) {
    this.message = message;
  }


  public GraphQLError locations(List<GraphQLErrorLocationsInner> locations) {
    this.locations = locations;
    return this;
  }

  public GraphQLError addLocationsItem(GraphQLErrorLocationsInner locationsItem) {
    if (this.locations == null) {
      this.locations = new ArrayList<>();
    }
    this.locations.add(locationsItem);
    return this;
  }

   /**
   * The locations in the query where the error occurred.
   * @return locations
  **/
  @javax.annotation.Nullable
  public List<GraphQLErrorLocationsInner> getLocations() {
    return locations;
  }

  public void setLocations(List<GraphQLErrorLocationsInner> locations) {
    this.locations = locations;
  }


  public GraphQLError path(List<String> path) {
    this.path = path;
    return this;
  }

  public GraphQLError addPathItem(String pathItem) {
    if (this.path == null) {
      this.path = new ArrayList<>();
    }
    this.path.add(pathItem);
    return this;
  }

   /**
   * The path in the response where the error occurred.
   * @return path
  **/
  @javax.annotation.Nullable
  public List<String> getPath() {
    return path;
  }

  public void setPath(List<String> path) {
    this.path = path;
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
   * @return the GraphQLError instance itself
   */
  public GraphQLError putAdditionalProperty(String key, Object value) {
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
    GraphQLError graphQLError = (GraphQLError) o;
    return Objects.equals(this.message, graphQLError.message) &&
        Objects.equals(this.locations, graphQLError.locations) &&
        Objects.equals(this.path, graphQLError.path)&&
        Objects.equals(this.additionalProperties, graphQLError.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(message, locations, path, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class GraphQLError {\n");
    sb.append("    message: ").append(toIndentedString(message)).append("\n");
    sb.append("    locations: ").append(toIndentedString(locations)).append("\n");
    sb.append("    path: ").append(toIndentedString(path)).append("\n");
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
    openapiFields.add("message");
    openapiFields.add("locations");
    openapiFields.add("path");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Element and throws an exception if issues found
  *
  * @param jsonElement JSON Element
  * @throws IOException if the JSON Element is invalid with respect to GraphQLError
  */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!GraphQLError.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in GraphQLError is not found in the empty JSON string", GraphQLError.openapiRequiredFields.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if ((jsonObj.get("message") != null && !jsonObj.get("message").isJsonNull()) && !jsonObj.get("message").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `message` to be a primitive type in the JSON string but got `%s`", jsonObj.get("message").toString()));
      }
      if (jsonObj.get("locations") != null && !jsonObj.get("locations").isJsonNull()) {
        JsonArray jsonArraylocations = jsonObj.getAsJsonArray("locations");
        if (jsonArraylocations != null) {
          // ensure the json data is an array
          if (!jsonObj.get("locations").isJsonArray()) {
            throw new IllegalArgumentException(String.format("Expected the field `locations` to be an array in the JSON string but got `%s`", jsonObj.get("locations").toString()));
          }

          // validate the optional field `locations` (array)
          for (int i = 0; i < jsonArraylocations.size(); i++) {
            GraphQLErrorLocationsInner.validateJsonElement(jsonArraylocations.get(i));
          };
        }
      }
      // ensure the optional json data is an array if present
      if (jsonObj.get("path") != null && !jsonObj.get("path").isJsonNull() && !jsonObj.get("path").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `path` to be an array in the JSON string but got `%s`", jsonObj.get("path").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!GraphQLError.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'GraphQLError' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<GraphQLError> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(GraphQLError.class));

       return (TypeAdapter<T>) new TypeAdapter<GraphQLError>() {
           @Override
           public void write(JsonWriter out, GraphQLError value) throws IOException {
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
           public GraphQLError read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             JsonObject jsonObj = jsonElement.getAsJsonObject();
             // store additional fields in the deserialized instance
             GraphQLError instance = thisAdapter.fromJsonTree(jsonObj);
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
  * Create an instance of GraphQLError given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of GraphQLError
  * @throws IOException if the JSON string is invalid with respect to GraphQLError
  */
  public static GraphQLError fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, GraphQLError.class);
  }

 /**
  * Convert an instance of GraphQLError to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

