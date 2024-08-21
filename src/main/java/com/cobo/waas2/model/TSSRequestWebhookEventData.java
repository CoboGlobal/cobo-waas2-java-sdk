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
import com.cobo.waas2.model.SourceGroup;
import com.cobo.waas2.model.TSSRequestStatus;
import com.cobo.waas2.model.TSSRequestType;
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
 * TSSRequestWebhookEventData
 */
@javax.annotation.Generated(
    value = "org.openapitools.codegen.languages.JavaClientCodegen", 
    comments = "Generator version: 7.6.0"
)
public class TSSRequestWebhookEventData {
  /**
   *  The data type of the event. - &#x60;Transaction&#x60;: The transaction event data. - &#x60;TSSRequest&#x60;: The TSS request event data.
   */
  @JsonAdapter(DataTypeEnum.Adapter.class)
  public enum DataTypeEnum {
    TRANSACTION("Transaction"),
    
    TSSREQUEST("TSSRequest");

    private String value;

    DataTypeEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static DataTypeEnum fromValue(String value) {
      for (DataTypeEnum b : DataTypeEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }

    public static class Adapter extends TypeAdapter<DataTypeEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final DataTypeEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public DataTypeEnum read(final JsonReader jsonReader) throws IOException {
        String value =  jsonReader.nextString();
        return DataTypeEnum.fromValue(value);
      }
    }

    public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      String value = jsonElement.getAsString();
      DataTypeEnum.fromValue(value);
    }
  }

  public static final String SERIALIZED_NAME_DATA_TYPE = "data_type";
  @SerializedName(SERIALIZED_NAME_DATA_TYPE)
  private DataTypeEnum dataType;

  public static final String SERIALIZED_NAME_TSS_REQUEST_ID = "tss_request_id";
  @SerializedName(SERIALIZED_NAME_TSS_REQUEST_ID)
  private String tssRequestId;

  public static final String SERIALIZED_NAME_SOURCE_KEY_SHARE_HOLDER_GROUP = "source_key_share_holder_group";
  @SerializedName(SERIALIZED_NAME_SOURCE_KEY_SHARE_HOLDER_GROUP)
  private SourceGroup sourceKeyShareHolderGroup;

  public static final String SERIALIZED_NAME_TARGET_KEY_SHARE_HOLDER_GROUP_ID = "target_key_share_holder_group_id";
  @SerializedName(SERIALIZED_NAME_TARGET_KEY_SHARE_HOLDER_GROUP_ID)
  private String targetKeyShareHolderGroupId;

  public static final String SERIALIZED_NAME_TYPE = "type";
  @SerializedName(SERIALIZED_NAME_TYPE)
  private TSSRequestType type;

  public static final String SERIALIZED_NAME_STATUS = "status";
  @SerializedName(SERIALIZED_NAME_STATUS)
  private TSSRequestStatus status;

  public static final String SERIALIZED_NAME_DESCRIPTION = "description";
  @SerializedName(SERIALIZED_NAME_DESCRIPTION)
  private String description;

  public static final String SERIALIZED_NAME_CREATED_TIMESTAMP = "created_timestamp";
  @SerializedName(SERIALIZED_NAME_CREATED_TIMESTAMP)
  private Long createdTimestamp;

  public TSSRequestWebhookEventData() {
  }

  public TSSRequestWebhookEventData dataType(DataTypeEnum dataType) {
    this.dataType = dataType;
    return this;
  }

   /**
   *  The data type of the event. - &#x60;Transaction&#x60;: The transaction event data. - &#x60;TSSRequest&#x60;: The TSS request event data.
   * @return dataType
  **/
  @javax.annotation.Nonnull
  public DataTypeEnum getDataType() {
    return dataType;
  }

  public void setDataType(DataTypeEnum dataType) {
    this.dataType = dataType;
  }


  public TSSRequestWebhookEventData tssRequestId(String tssRequestId) {
    this.tssRequestId = tssRequestId;
    return this;
  }

   /**
   * The TSS request ID.
   * @return tssRequestId
  **/
  @javax.annotation.Nullable
  public String getTssRequestId() {
    return tssRequestId;
  }

  public void setTssRequestId(String tssRequestId) {
    this.tssRequestId = tssRequestId;
  }


  public TSSRequestWebhookEventData sourceKeyShareHolderGroup(SourceGroup sourceKeyShareHolderGroup) {
    this.sourceKeyShareHolderGroup = sourceKeyShareHolderGroup;
    return this;
  }

   /**
   * Get sourceKeyShareHolderGroup
   * @return sourceKeyShareHolderGroup
  **/
  @javax.annotation.Nullable
  public SourceGroup getSourceKeyShareHolderGroup() {
    return sourceKeyShareHolderGroup;
  }

  public void setSourceKeyShareHolderGroup(SourceGroup sourceKeyShareHolderGroup) {
    this.sourceKeyShareHolderGroup = sourceKeyShareHolderGroup;
  }


  public TSSRequestWebhookEventData targetKeyShareHolderGroupId(String targetKeyShareHolderGroupId) {
    this.targetKeyShareHolderGroupId = targetKeyShareHolderGroupId;
    return this;
  }

   /**
   * The target key share holder group ID.
   * @return targetKeyShareHolderGroupId
  **/
  @javax.annotation.Nullable
  public String getTargetKeyShareHolderGroupId() {
    return targetKeyShareHolderGroupId;
  }

  public void setTargetKeyShareHolderGroupId(String targetKeyShareHolderGroupId) {
    this.targetKeyShareHolderGroupId = targetKeyShareHolderGroupId;
  }


  public TSSRequestWebhookEventData type(TSSRequestType type) {
    this.type = type;
    return this;
  }

   /**
   * Get type
   * @return type
  **/
  @javax.annotation.Nullable
  public TSSRequestType getType() {
    return type;
  }

  public void setType(TSSRequestType type) {
    this.type = type;
  }


  public TSSRequestWebhookEventData status(TSSRequestStatus status) {
    this.status = status;
    return this;
  }

   /**
   * Get status
   * @return status
  **/
  @javax.annotation.Nullable
  public TSSRequestStatus getStatus() {
    return status;
  }

  public void setStatus(TSSRequestStatus status) {
    this.status = status;
  }


  public TSSRequestWebhookEventData description(String description) {
    this.description = description;
    return this;
  }

   /**
   * The description of the TSS request.
   * @return description
  **/
  @javax.annotation.Nullable
  public String getDescription() {
    return description;
  }

  public void setDescription(String description) {
    this.description = description;
  }


  public TSSRequestWebhookEventData createdTimestamp(Long createdTimestamp) {
    this.createdTimestamp = createdTimestamp;
    return this;
  }

   /**
   * The TSS request&#39;s creation time in Unix timestamp format, measured in milliseconds.
   * @return createdTimestamp
  **/
  @javax.annotation.Nullable
  public Long getCreatedTimestamp() {
    return createdTimestamp;
  }

  public void setCreatedTimestamp(Long createdTimestamp) {
    this.createdTimestamp = createdTimestamp;
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
   * @return the TSSRequestWebhookEventData instance itself
   */
  public TSSRequestWebhookEventData putAdditionalProperty(String key, Object value) {
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
    TSSRequestWebhookEventData tsSRequestWebhookEventData = (TSSRequestWebhookEventData) o;
    return Objects.equals(this.dataType, tsSRequestWebhookEventData.dataType) &&
        Objects.equals(this.tssRequestId, tsSRequestWebhookEventData.tssRequestId) &&
        Objects.equals(this.sourceKeyShareHolderGroup, tsSRequestWebhookEventData.sourceKeyShareHolderGroup) &&
        Objects.equals(this.targetKeyShareHolderGroupId, tsSRequestWebhookEventData.targetKeyShareHolderGroupId) &&
        Objects.equals(this.type, tsSRequestWebhookEventData.type) &&
        Objects.equals(this.status, tsSRequestWebhookEventData.status) &&
        Objects.equals(this.description, tsSRequestWebhookEventData.description) &&
        Objects.equals(this.createdTimestamp, tsSRequestWebhookEventData.createdTimestamp)&&
        Objects.equals(this.additionalProperties, tsSRequestWebhookEventData.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(dataType, tssRequestId, sourceKeyShareHolderGroup, targetKeyShareHolderGroupId, type, status, description, createdTimestamp, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TSSRequestWebhookEventData {\n");
    sb.append("    dataType: ").append(toIndentedString(dataType)).append("\n");
    sb.append("    tssRequestId: ").append(toIndentedString(tssRequestId)).append("\n");
    sb.append("    sourceKeyShareHolderGroup: ").append(toIndentedString(sourceKeyShareHolderGroup)).append("\n");
    sb.append("    targetKeyShareHolderGroupId: ").append(toIndentedString(targetKeyShareHolderGroupId)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    createdTimestamp: ").append(toIndentedString(createdTimestamp)).append("\n");
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
    openapiFields.add("data_type");
    openapiFields.add("tss_request_id");
    openapiFields.add("source_key_share_holder_group");
    openapiFields.add("target_key_share_holder_group_id");
    openapiFields.add("type");
    openapiFields.add("status");
    openapiFields.add("description");
    openapiFields.add("created_timestamp");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("data_type");
  }

 /**
  * Validates the JSON Element and throws an exception if issues found
  *
  * @param jsonElement JSON Element
  * @throws IOException if the JSON Element is invalid with respect to TSSRequestWebhookEventData
  */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!TSSRequestWebhookEventData.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in TSSRequestWebhookEventData is not found in the empty JSON string", TSSRequestWebhookEventData.openapiRequiredFields.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : TSSRequestWebhookEventData.openapiRequiredFields) {
        if (jsonElement.getAsJsonObject().get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if (!jsonObj.get("data_type").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `data_type` to be a primitive type in the JSON string but got `%s`", jsonObj.get("data_type").toString()));
      }
      // validate the required field `data_type`
      DataTypeEnum.validateJsonElement(jsonObj.get("data_type"));
      if ((jsonObj.get("tss_request_id") != null && !jsonObj.get("tss_request_id").isJsonNull()) && !jsonObj.get("tss_request_id").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `tss_request_id` to be a primitive type in the JSON string but got `%s`", jsonObj.get("tss_request_id").toString()));
      }
      // validate the optional field `source_key_share_holder_group`
      if (jsonObj.get("source_key_share_holder_group") != null && !jsonObj.get("source_key_share_holder_group").isJsonNull()) {
        SourceGroup.validateJsonElement(jsonObj.get("source_key_share_holder_group"));
      }
      if ((jsonObj.get("target_key_share_holder_group_id") != null && !jsonObj.get("target_key_share_holder_group_id").isJsonNull()) && !jsonObj.get("target_key_share_holder_group_id").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `target_key_share_holder_group_id` to be a primitive type in the JSON string but got `%s`", jsonObj.get("target_key_share_holder_group_id").toString()));
      }
      // validate the optional field `type`
      if (jsonObj.get("type") != null && !jsonObj.get("type").isJsonNull()) {
        TSSRequestType.validateJsonElement(jsonObj.get("type"));
      }
      // validate the optional field `status`
      if (jsonObj.get("status") != null && !jsonObj.get("status").isJsonNull()) {
        TSSRequestStatus.validateJsonElement(jsonObj.get("status"));
      }
      if ((jsonObj.get("description") != null && !jsonObj.get("description").isJsonNull()) && !jsonObj.get("description").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `description` to be a primitive type in the JSON string but got `%s`", jsonObj.get("description").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!TSSRequestWebhookEventData.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'TSSRequestWebhookEventData' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<TSSRequestWebhookEventData> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(TSSRequestWebhookEventData.class));

       return (TypeAdapter<T>) new TypeAdapter<TSSRequestWebhookEventData>() {
           @Override
           public void write(JsonWriter out, TSSRequestWebhookEventData value) throws IOException {
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
           public TSSRequestWebhookEventData read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             JsonObject jsonObj = jsonElement.getAsJsonObject();
             // store additional fields in the deserialized instance
             TSSRequestWebhookEventData instance = thisAdapter.fromJsonTree(jsonObj);
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
  * Create an instance of TSSRequestWebhookEventData given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of TSSRequestWebhookEventData
  * @throws IOException if the JSON string is invalid with respect to TSSRequestWebhookEventData
  */
  public static TSSRequestWebhookEventData fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, TSSRequestWebhookEventData.class);
  }

 /**
  * Convert an instance of TSSRequestWebhookEventData to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}
