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
import com.cobo.waas2.model.KeyShareHolderGroup;
import com.cobo.waas2.model.MPCProject;
import com.cobo.waas2.model.MPCVault;
import com.cobo.waas2.model.OrgInfo;
import com.cobo.waas2.model.TSSRequest;
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
 * TSSKeyGenExtra
 */
@javax.annotation.Generated(
    value = "org.openapitools.codegen.languages.JavaClientCodegen", 
    comments = "Generator version: 7.6.0"
)
public class TSSKeyGenExtra {
  public static final String SERIALIZED_NAME_ORG = "org";
  @SerializedName(SERIALIZED_NAME_ORG)
  private OrgInfo org;

  public static final String SERIALIZED_NAME_PROJECT = "project";
  @SerializedName(SERIALIZED_NAME_PROJECT)
  private MPCProject project;

  public static final String SERIALIZED_NAME_VAULT = "vault";
  @SerializedName(SERIALIZED_NAME_VAULT)
  private MPCVault vault;

  public static final String SERIALIZED_NAME_TARGET_KEY_SHARE_HOLDER_GROUP = "target_key_share_holder_group";
  @SerializedName(SERIALIZED_NAME_TARGET_KEY_SHARE_HOLDER_GROUP)
  private KeyShareHolderGroup targetKeyShareHolderGroup;

  public static final String SERIALIZED_NAME_TSS_REQUEST = "tss_request";
  @SerializedName(SERIALIZED_NAME_TSS_REQUEST)
  private TSSRequest tssRequest;

  public TSSKeyGenExtra() {
  }

  public TSSKeyGenExtra org(OrgInfo org) {
    this.org = org;
    return this;
  }

   /**
   * Get org
   * @return org
  **/
  @javax.annotation.Nullable
  public OrgInfo getOrg() {
    return org;
  }

  public void setOrg(OrgInfo org) {
    this.org = org;
  }


  public TSSKeyGenExtra project(MPCProject project) {
    this.project = project;
    return this;
  }

   /**
   * Get project
   * @return project
  **/
  @javax.annotation.Nullable
  public MPCProject getProject() {
    return project;
  }

  public void setProject(MPCProject project) {
    this.project = project;
  }


  public TSSKeyGenExtra vault(MPCVault vault) {
    this.vault = vault;
    return this;
  }

   /**
   * Get vault
   * @return vault
  **/
  @javax.annotation.Nullable
  public MPCVault getVault() {
    return vault;
  }

  public void setVault(MPCVault vault) {
    this.vault = vault;
  }


  public TSSKeyGenExtra targetKeyShareHolderGroup(KeyShareHolderGroup targetKeyShareHolderGroup) {
    this.targetKeyShareHolderGroup = targetKeyShareHolderGroup;
    return this;
  }

   /**
   * Get targetKeyShareHolderGroup
   * @return targetKeyShareHolderGroup
  **/
  @javax.annotation.Nullable
  public KeyShareHolderGroup getTargetKeyShareHolderGroup() {
    return targetKeyShareHolderGroup;
  }

  public void setTargetKeyShareHolderGroup(KeyShareHolderGroup targetKeyShareHolderGroup) {
    this.targetKeyShareHolderGroup = targetKeyShareHolderGroup;
  }


  public TSSKeyGenExtra tssRequest(TSSRequest tssRequest) {
    this.tssRequest = tssRequest;
    return this;
  }

   /**
   * Get tssRequest
   * @return tssRequest
  **/
  @javax.annotation.Nullable
  public TSSRequest getTssRequest() {
    return tssRequest;
  }

  public void setTssRequest(TSSRequest tssRequest) {
    this.tssRequest = tssRequest;
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
   * @return the TSSKeyGenExtra instance itself
   */
  public TSSKeyGenExtra putAdditionalProperty(String key, Object value) {
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
    TSSKeyGenExtra tsSKeyGenExtra = (TSSKeyGenExtra) o;
    return Objects.equals(this.org, tsSKeyGenExtra.org) &&
        Objects.equals(this.project, tsSKeyGenExtra.project) &&
        Objects.equals(this.vault, tsSKeyGenExtra.vault) &&
        Objects.equals(this.targetKeyShareHolderGroup, tsSKeyGenExtra.targetKeyShareHolderGroup) &&
        Objects.equals(this.tssRequest, tsSKeyGenExtra.tssRequest)&&
        Objects.equals(this.additionalProperties, tsSKeyGenExtra.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(org, project, vault, targetKeyShareHolderGroup, tssRequest, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TSSKeyGenExtra {\n");
    sb.append("    org: ").append(toIndentedString(org)).append("\n");
    sb.append("    project: ").append(toIndentedString(project)).append("\n");
    sb.append("    vault: ").append(toIndentedString(vault)).append("\n");
    sb.append("    targetKeyShareHolderGroup: ").append(toIndentedString(targetKeyShareHolderGroup)).append("\n");
    sb.append("    tssRequest: ").append(toIndentedString(tssRequest)).append("\n");
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
    openapiFields.add("org");
    openapiFields.add("project");
    openapiFields.add("vault");
    openapiFields.add("target_key_share_holder_group");
    openapiFields.add("tss_request");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Element and throws an exception if issues found
  *
  * @param jsonElement JSON Element
  * @throws IOException if the JSON Element is invalid with respect to TSSKeyGenExtra
  */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!TSSKeyGenExtra.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in TSSKeyGenExtra is not found in the empty JSON string", TSSKeyGenExtra.openapiRequiredFields.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      // validate the optional field `org`
      if (jsonObj.get("org") != null && !jsonObj.get("org").isJsonNull()) {
        OrgInfo.validateJsonElement(jsonObj.get("org"));
      }
      // validate the optional field `project`
      if (jsonObj.get("project") != null && !jsonObj.get("project").isJsonNull()) {
        MPCProject.validateJsonElement(jsonObj.get("project"));
      }
      // validate the optional field `vault`
      if (jsonObj.get("vault") != null && !jsonObj.get("vault").isJsonNull()) {
        MPCVault.validateJsonElement(jsonObj.get("vault"));
      }
      // validate the optional field `target_key_share_holder_group`
      if (jsonObj.get("target_key_share_holder_group") != null && !jsonObj.get("target_key_share_holder_group").isJsonNull()) {
        KeyShareHolderGroup.validateJsonElement(jsonObj.get("target_key_share_holder_group"));
      }
      // validate the optional field `tss_request`
      if (jsonObj.get("tss_request") != null && !jsonObj.get("tss_request").isJsonNull()) {
        TSSRequest.validateJsonElement(jsonObj.get("tss_request"));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!TSSKeyGenExtra.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'TSSKeyGenExtra' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<TSSKeyGenExtra> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(TSSKeyGenExtra.class));

       return (TypeAdapter<T>) new TypeAdapter<TSSKeyGenExtra>() {
           @Override
           public void write(JsonWriter out, TSSKeyGenExtra value) throws IOException {
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
           public TSSKeyGenExtra read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             JsonObject jsonObj = jsonElement.getAsJsonObject();
             // store additional fields in the deserialized instance
             TSSKeyGenExtra instance = thisAdapter.fromJsonTree(jsonObj);
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
  * Create an instance of TSSKeyGenExtra given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of TSSKeyGenExtra
  * @throws IOException if the JSON string is invalid with respect to TSSKeyGenExtra
  */
  public static TSSKeyGenExtra fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, TSSKeyGenExtra.class);
  }

 /**
  * Convert an instance of TSSKeyGenExtra to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

