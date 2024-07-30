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
import com.cobo.waas2.model.EstimateFeeRequestType;
import com.cobo.waas2.model.FeeType;
import com.cobo.waas2.model.TransferDestination;
import com.cobo.waas2.model.TransferSource;
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
 * The information about a token transfer.
 */
@javax.annotation.Generated(
    value = "org.openapitools.codegen.languages.JavaClientCodegen", 
    comments = "Generator version: 7.6.0"
)
public class EstimateTransferFeeParams {
  public static final String SERIALIZED_NAME_REQUEST_ID = "request_id";
  @SerializedName(SERIALIZED_NAME_REQUEST_ID)
  private String requestId;

  public static final String SERIALIZED_NAME_REQUEST_TYPE = "request_type";
  @SerializedName(SERIALIZED_NAME_REQUEST_TYPE)
  private EstimateFeeRequestType requestType;

  public static final String SERIALIZED_NAME_SOURCE = "source";
  @SerializedName(SERIALIZED_NAME_SOURCE)
  private TransferSource source;

  public static final String SERIALIZED_NAME_TOKEN_ID = "token_id";
  @SerializedName(SERIALIZED_NAME_TOKEN_ID)
  private String tokenId;

  public static final String SERIALIZED_NAME_DESTINATION = "destination";
  @SerializedName(SERIALIZED_NAME_DESTINATION)
  private TransferDestination destination;

  public static final String SERIALIZED_NAME_FEE_TYPE = "fee_type";
  @SerializedName(SERIALIZED_NAME_FEE_TYPE)
  private FeeType feeType = FeeType.EVM_EIP_1559;

  public EstimateTransferFeeParams() {
  }

  public EstimateTransferFeeParams requestId(String requestId) {
    this.requestId = requestId;
    return this;
  }

   /**
   * The request ID that is used to track a transaction request. The request ID is provided by you and must be unique within your organization.
   * @return requestId
  **/
  @javax.annotation.Nonnull
  public String getRequestId() {
    return requestId;
  }

  public void setRequestId(String requestId) {
    this.requestId = requestId;
  }


  public EstimateTransferFeeParams requestType(EstimateFeeRequestType requestType) {
    this.requestType = requestType;
    return this;
  }

   /**
   * Get requestType
   * @return requestType
  **/
  @javax.annotation.Nonnull
  public EstimateFeeRequestType getRequestType() {
    return requestType;
  }

  public void setRequestType(EstimateFeeRequestType requestType) {
    this.requestType = requestType;
  }


  public EstimateTransferFeeParams source(TransferSource source) {
    this.source = source;
    return this;
  }

   /**
   * Get source
   * @return source
  **/
  @javax.annotation.Nonnull
  public TransferSource getSource() {
    return source;
  }

  public void setSource(TransferSource source) {
    this.source = source;
  }


  public EstimateTransferFeeParams tokenId(String tokenId) {
    this.tokenId = tokenId;
    return this;
  }

   /**
   * The token ID of the transferred token. You can retrieve the IDs of all the tokens you can use by calling [List enabled tokens](/v2/api-references/wallets/list-enabled-tokens).
   * @return tokenId
  **/
  @javax.annotation.Nonnull
  public String getTokenId() {
    return tokenId;
  }

  public void setTokenId(String tokenId) {
    this.tokenId = tokenId;
  }


  public EstimateTransferFeeParams destination(TransferDestination destination) {
    this.destination = destination;
    return this;
  }

   /**
   * Get destination
   * @return destination
  **/
  @javax.annotation.Nonnull
  public TransferDestination getDestination() {
    return destination;
  }

  public void setDestination(TransferDestination destination) {
    this.destination = destination;
  }


  public EstimateTransferFeeParams feeType(FeeType feeType) {
    this.feeType = feeType;
    return this;
  }

   /**
   * Get feeType
   * @return feeType
  **/
  @javax.annotation.Nullable
  public FeeType getFeeType() {
    return feeType;
  }

  public void setFeeType(FeeType feeType) {
    this.feeType = feeType;
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
   * @return the EstimateTransferFeeParams instance itself
   */
  public EstimateTransferFeeParams putAdditionalProperty(String key, Object value) {
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
    EstimateTransferFeeParams estimateTransferFeeParams = (EstimateTransferFeeParams) o;
    return Objects.equals(this.requestId, estimateTransferFeeParams.requestId) &&
        Objects.equals(this.requestType, estimateTransferFeeParams.requestType) &&
        Objects.equals(this.source, estimateTransferFeeParams.source) &&
        Objects.equals(this.tokenId, estimateTransferFeeParams.tokenId) &&
        Objects.equals(this.destination, estimateTransferFeeParams.destination) &&
        Objects.equals(this.feeType, estimateTransferFeeParams.feeType)&&
        Objects.equals(this.additionalProperties, estimateTransferFeeParams.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(requestId, requestType, source, tokenId, destination, feeType, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class EstimateTransferFeeParams {\n");
    sb.append("    requestId: ").append(toIndentedString(requestId)).append("\n");
    sb.append("    requestType: ").append(toIndentedString(requestType)).append("\n");
    sb.append("    source: ").append(toIndentedString(source)).append("\n");
    sb.append("    tokenId: ").append(toIndentedString(tokenId)).append("\n");
    sb.append("    destination: ").append(toIndentedString(destination)).append("\n");
    sb.append("    feeType: ").append(toIndentedString(feeType)).append("\n");
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
    openapiFields.add("request_type");
    openapiFields.add("source");
    openapiFields.add("token_id");
    openapiFields.add("destination");
    openapiFields.add("fee_type");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("request_id");
    openapiRequiredFields.add("request_type");
    openapiRequiredFields.add("source");
    openapiRequiredFields.add("token_id");
    openapiRequiredFields.add("destination");
  }

 /**
  * Validates the JSON Element and throws an exception if issues found
  *
  * @param jsonElement JSON Element
  * @throws IOException if the JSON Element is invalid with respect to EstimateTransferFeeParams
  */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!EstimateTransferFeeParams.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in EstimateTransferFeeParams is not found in the empty JSON string", EstimateTransferFeeParams.openapiRequiredFields.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : EstimateTransferFeeParams.openapiRequiredFields) {
        if (jsonElement.getAsJsonObject().get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if (!jsonObj.get("request_id").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `request_id` to be a primitive type in the JSON string but got `%s`", jsonObj.get("request_id").toString()));
      }
      // validate the required field `request_type`
      EstimateFeeRequestType.validateJsonElement(jsonObj.get("request_type"));
      // validate the required field `source`
      TransferSource.validateJsonElement(jsonObj.get("source"));
      if (!jsonObj.get("token_id").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `token_id` to be a primitive type in the JSON string but got `%s`", jsonObj.get("token_id").toString()));
      }
      // validate the required field `destination`
      TransferDestination.validateJsonElement(jsonObj.get("destination"));
      // validate the optional field `fee_type`
      if (jsonObj.get("fee_type") != null && !jsonObj.get("fee_type").isJsonNull()) {
        FeeType.validateJsonElement(jsonObj.get("fee_type"));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!EstimateTransferFeeParams.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'EstimateTransferFeeParams' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<EstimateTransferFeeParams> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(EstimateTransferFeeParams.class));

       return (TypeAdapter<T>) new TypeAdapter<EstimateTransferFeeParams>() {
           @Override
           public void write(JsonWriter out, EstimateTransferFeeParams value) throws IOException {
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
           public EstimateTransferFeeParams read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             JsonObject jsonObj = jsonElement.getAsJsonObject();
             // store additional fields in the deserialized instance
             EstimateTransferFeeParams instance = thisAdapter.fromJsonTree(jsonObj);
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
  * Create an instance of EstimateTransferFeeParams given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of EstimateTransferFeeParams
  * @throws IOException if the JSON string is invalid with respect to EstimateTransferFeeParams
  */
  public static EstimateTransferFeeParams fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, EstimateTransferFeeParams.class);
  }

 /**
  * Convert an instance of EstimateTransferFeeParams to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

