/*
 * Cobo Wallet as a Service 2.0
 *
 * The version of the OpenAPI document: 1.0.0
 * Contact: support@cobo.com
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.cobo.waas2.model;

import java.util.Objects;
import com.cobo.waas2.model.MPCVaultType;
import com.cobo.waas2.model.RootPubkey;
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
 * The data for vault information.
 */
@javax.annotation.Generated(
    value = "org.openapitools.codegen.languages.JavaClientCodegen", 
    comments = "Generator version: 7.6.0"
)
public class MPCVault {
  public static final String SERIALIZED_NAME_VAULT_ID = "vault_id";
  @SerializedName(SERIALIZED_NAME_VAULT_ID)
  private String vaultId;

  public static final String SERIALIZED_NAME_PROJECT_ID = "project_id";
  @SerializedName(SERIALIZED_NAME_PROJECT_ID)
  private String projectId;

  public static final String SERIALIZED_NAME_NAME = "name";
  @SerializedName(SERIALIZED_NAME_NAME)
  private String name;

  public static final String SERIALIZED_NAME_TYPE = "type";
  @SerializedName(SERIALIZED_NAME_TYPE)
  private MPCVaultType type;

  public static final String SERIALIZED_NAME_ROOT_PUBKEYS = "root_pubkeys";
  @SerializedName(SERIALIZED_NAME_ROOT_PUBKEYS)
  private List<RootPubkey> rootPubkeys = new ArrayList<>();

  public static final String SERIALIZED_NAME_CREATE_TIMESTAMP = "create_timestamp";
  @SerializedName(SERIALIZED_NAME_CREATE_TIMESTAMP)
  private Long createTimestamp;

  public MPCVault() {
  }

  public MPCVault vaultId(String vaultId) {
    this.vaultId = vaultId;
    return this;
  }

   /**
   * The vault ID.
   * @return vaultId
  **/
  @javax.annotation.Nullable
  public String getVaultId() {
    return vaultId;
  }

  public void setVaultId(String vaultId) {
    this.vaultId = vaultId;
  }


  public MPCVault projectId(String projectId) {
    this.projectId = projectId;
    return this;
  }

   /**
   * The project ID.
   * @return projectId
  **/
  @javax.annotation.Nullable
  public String getProjectId() {
    return projectId;
  }

  public void setProjectId(String projectId) {
    this.projectId = projectId;
  }


  public MPCVault name(String name) {
    this.name = name;
    return this;
  }

   /**
   * The vault name.
   * @return name
  **/
  @javax.annotation.Nullable
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }


  public MPCVault type(MPCVaultType type) {
    this.type = type;
    return this;
  }

   /**
   * Get type
   * @return type
  **/
  @javax.annotation.Nullable
  public MPCVaultType getType() {
    return type;
  }

  public void setType(MPCVaultType type) {
    this.type = type;
  }


  public MPCVault rootPubkeys(List<RootPubkey> rootPubkeys) {
    this.rootPubkeys = rootPubkeys;
    return this;
  }

  public MPCVault addRootPubkeysItem(RootPubkey rootPubkeysItem) {
    if (this.rootPubkeys == null) {
      this.rootPubkeys = new ArrayList<>();
    }
    this.rootPubkeys.add(rootPubkeysItem);
    return this;
  }

   /**
   * Get rootPubkeys
   * @return rootPubkeys
  **/
  @javax.annotation.Nullable
  public List<RootPubkey> getRootPubkeys() {
    return rootPubkeys;
  }

  public void setRootPubkeys(List<RootPubkey> rootPubkeys) {
    this.rootPubkeys = rootPubkeys;
  }


  public MPCVault createTimestamp(Long createTimestamp) {
    this.createTimestamp = createTimestamp;
    return this;
  }

   /**
   * The vault&#39;s creation time in Unix timestamp format, measured in milliseconds.
   * @return createTimestamp
  **/
  @javax.annotation.Nullable
  public Long getCreateTimestamp() {
    return createTimestamp;
  }

  public void setCreateTimestamp(Long createTimestamp) {
    this.createTimestamp = createTimestamp;
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
   * @return the MPCVault instance itself
   */
  public MPCVault putAdditionalProperty(String key, Object value) {
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
    MPCVault mpCVault = (MPCVault) o;
    return Objects.equals(this.vaultId, mpCVault.vaultId) &&
        Objects.equals(this.projectId, mpCVault.projectId) &&
        Objects.equals(this.name, mpCVault.name) &&
        Objects.equals(this.type, mpCVault.type) &&
        Objects.equals(this.rootPubkeys, mpCVault.rootPubkeys) &&
        Objects.equals(this.createTimestamp, mpCVault.createTimestamp)&&
        Objects.equals(this.additionalProperties, mpCVault.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(vaultId, projectId, name, type, rootPubkeys, createTimestamp, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class MPCVault {\n");
    sb.append("    vaultId: ").append(toIndentedString(vaultId)).append("\n");
    sb.append("    projectId: ").append(toIndentedString(projectId)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    rootPubkeys: ").append(toIndentedString(rootPubkeys)).append("\n");
    sb.append("    createTimestamp: ").append(toIndentedString(createTimestamp)).append("\n");
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
    openapiFields.add("vault_id");
    openapiFields.add("project_id");
    openapiFields.add("name");
    openapiFields.add("type");
    openapiFields.add("root_pubkeys");
    openapiFields.add("create_timestamp");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Element and throws an exception if issues found
  *
  * @param jsonElement JSON Element
  * @throws IOException if the JSON Element is invalid with respect to MPCVault
  */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!MPCVault.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in MPCVault is not found in the empty JSON string", MPCVault.openapiRequiredFields.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if ((jsonObj.get("vault_id") != null && !jsonObj.get("vault_id").isJsonNull()) && !jsonObj.get("vault_id").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `vault_id` to be a primitive type in the JSON string but got `%s`", jsonObj.get("vault_id").toString()));
      }
      if ((jsonObj.get("project_id") != null && !jsonObj.get("project_id").isJsonNull()) && !jsonObj.get("project_id").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `project_id` to be a primitive type in the JSON string but got `%s`", jsonObj.get("project_id").toString()));
      }
      if ((jsonObj.get("name") != null && !jsonObj.get("name").isJsonNull()) && !jsonObj.get("name").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `name` to be a primitive type in the JSON string but got `%s`", jsonObj.get("name").toString()));
      }
      // validate the optional field `type`
      if (jsonObj.get("type") != null && !jsonObj.get("type").isJsonNull()) {
        MPCVaultType.validateJsonElement(jsonObj.get("type"));
      }
      if (jsonObj.get("root_pubkeys") != null && !jsonObj.get("root_pubkeys").isJsonNull()) {
        JsonArray jsonArrayrootPubkeys = jsonObj.getAsJsonArray("root_pubkeys");
        if (jsonArrayrootPubkeys != null) {
          // ensure the json data is an array
          if (!jsonObj.get("root_pubkeys").isJsonArray()) {
            throw new IllegalArgumentException(String.format("Expected the field `root_pubkeys` to be an array in the JSON string but got `%s`", jsonObj.get("root_pubkeys").toString()));
          }

          // validate the optional field `root_pubkeys` (array)
          for (int i = 0; i < jsonArrayrootPubkeys.size(); i++) {
            RootPubkey.validateJsonElement(jsonArrayrootPubkeys.get(i));
          };
        }
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!MPCVault.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'MPCVault' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<MPCVault> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(MPCVault.class));

       return (TypeAdapter<T>) new TypeAdapter<MPCVault>() {
           @Override
           public void write(JsonWriter out, MPCVault value) throws IOException {
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
           public MPCVault read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             JsonObject jsonObj = jsonElement.getAsJsonObject();
             // store additional fields in the deserialized instance
             MPCVault instance = thisAdapter.fromJsonTree(jsonObj);
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
  * Create an instance of MPCVault given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of MPCVault
  * @throws IOException if the JSON string is invalid with respect to MPCVault
  */
  public static MPCVault fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, MPCVault.class);
  }

 /**
  * Convert an instance of MPCVault to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

