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
import com.cobo.waas2.model.SmartContractInitiator;
import com.cobo.waas2.model.SmartContractWalletType;
import com.cobo.waas2.model.WalletSubtype;
import com.cobo.waas2.model.WalletType;
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
 * CreateSafeWalletParams
 */
@javax.annotation.Generated(
    value = "org.openapitools.codegen.languages.JavaClientCodegen", 
    comments = "Generator version: 7.6.0"
)
public class CreateSafeWalletParams {
  public static final String SERIALIZED_NAME_NAME = "name";
  @SerializedName(SERIALIZED_NAME_NAME)
  private String name;

  public static final String SERIALIZED_NAME_WALLET_TYPE = "wallet_type";
  @SerializedName(SERIALIZED_NAME_WALLET_TYPE)
  private WalletType walletType;

  public static final String SERIALIZED_NAME_WALLET_SUBTYPE = "wallet_subtype";
  @SerializedName(SERIALIZED_NAME_WALLET_SUBTYPE)
  private WalletSubtype walletSubtype;

  public static final String SERIALIZED_NAME_CHAIN_ID = "chain_id";
  @SerializedName(SERIALIZED_NAME_CHAIN_ID)
  private String chainId;

  public static final String SERIALIZED_NAME_SMART_CONTRACT_WALLET_TYPE = "smart_contract_wallet_type";
  @SerializedName(SERIALIZED_NAME_SMART_CONTRACT_WALLET_TYPE)
  private SmartContractWalletType smartContractWalletType = SmartContractWalletType.SAFE_WALLET_;

  public static final String SERIALIZED_NAME_SAFE_ADDRESS = "safe_address";
  @SerializedName(SERIALIZED_NAME_SAFE_ADDRESS)
  private String safeAddress;

  public static final String SERIALIZED_NAME_SIGNERS = "signers";
  @SerializedName(SERIALIZED_NAME_SIGNERS)
  private List<String> signers = new ArrayList<>();

  public static final String SERIALIZED_NAME_THRESHOLD = "threshold";
  @SerializedName(SERIALIZED_NAME_THRESHOLD)
  private Integer threshold;

  public static final String SERIALIZED_NAME_COBO_SAFE_ADDRESS = "cobo_safe_address";
  @SerializedName(SERIALIZED_NAME_COBO_SAFE_ADDRESS)
  private String coboSafeAddress;

  public static final String SERIALIZED_NAME_INITIATOR = "initiator";
  @SerializedName(SERIALIZED_NAME_INITIATOR)
  private SmartContractInitiator initiator;

  public CreateSafeWalletParams() {
  }

  public CreateSafeWalletParams name(String name) {
    this.name = name;
    return this;
  }

   /**
   * The wallet name.
   * @return name
  **/
  @javax.annotation.Nonnull
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }


  public CreateSafeWalletParams walletType(WalletType walletType) {
    this.walletType = walletType;
    return this;
  }

   /**
   * Get walletType
   * @return walletType
  **/
  @javax.annotation.Nonnull
  public WalletType getWalletType() {
    return walletType;
  }

  public void setWalletType(WalletType walletType) {
    this.walletType = walletType;
  }


  public CreateSafeWalletParams walletSubtype(WalletSubtype walletSubtype) {
    this.walletSubtype = walletSubtype;
    return this;
  }

   /**
   * Get walletSubtype
   * @return walletSubtype
  **/
  @javax.annotation.Nonnull
  public WalletSubtype getWalletSubtype() {
    return walletSubtype;
  }

  public void setWalletSubtype(WalletSubtype walletSubtype) {
    this.walletSubtype = walletSubtype;
  }


  public CreateSafeWalletParams chainId(String chainId) {
    this.chainId = chainId;
    return this;
  }

   /**
   * The ID of the chain that the wallet operates on.
   * @return chainId
  **/
  @javax.annotation.Nonnull
  public String getChainId() {
    return chainId;
  }

  public void setChainId(String chainId) {
    this.chainId = chainId;
  }


  public CreateSafeWalletParams smartContractWalletType(SmartContractWalletType smartContractWalletType) {
    this.smartContractWalletType = smartContractWalletType;
    return this;
  }

   /**
   * Get smartContractWalletType
   * @return smartContractWalletType
  **/
  @javax.annotation.Nonnull
  public SmartContractWalletType getSmartContractWalletType() {
    return smartContractWalletType;
  }

  public void setSmartContractWalletType(SmartContractWalletType smartContractWalletType) {
    this.smartContractWalletType = smartContractWalletType;
  }


  public CreateSafeWalletParams safeAddress(String safeAddress) {
    this.safeAddress = safeAddress;
    return this;
  }

   /**
   * The address of the Smart Contract Wallet. If this is not provided, Cobo will create a new Safe{Wallet} and set up Cobo Safe for you. In that case, the &#x60;threshold&#x60; and &#x60;signers&#x60; properties are required.
   * @return safeAddress
  **/
  @javax.annotation.Nullable
  public String getSafeAddress() {
    return safeAddress;
  }

  public void setSafeAddress(String safeAddress) {
    this.safeAddress = safeAddress;
  }


  public CreateSafeWalletParams signers(List<String> signers) {
    this.signers = signers;
    return this;
  }

  public CreateSafeWalletParams addSignersItem(String signersItem) {
    if (this.signers == null) {
      this.signers = new ArrayList<>();
    }
    this.signers.add(signersItem);
    return this;
  }

   /**
   * The signers of the Smart Contract Wallet. This property is required when creating a new Safe{Wallet}.
   * @return signers
  **/
  @javax.annotation.Nullable
  public List<String> getSigners() {
    return signers;
  }

  public void setSigners(List<String> signers) {
    this.signers = signers;
  }


  public CreateSafeWalletParams threshold(Integer threshold) {
    this.threshold = threshold;
    return this;
  }

   /**
   * The minimum number of confirmations required for the Smart Contract Wallet. This property is required when creating a new Safe{Wallet}.
   * minimum: 1
   * @return threshold
  **/
  @javax.annotation.Nullable
  public Integer getThreshold() {
    return threshold;
  }

  public void setThreshold(Integer threshold) {
    this.threshold = threshold;
  }


  public CreateSafeWalletParams coboSafeAddress(String coboSafeAddress) {
    this.coboSafeAddress = coboSafeAddress;
    return this;
  }

   /**
   * The address of Cobo Safe. If you are importing an existing Safe{Wallet}, Cobo Safe must have been created and enabled.
   * @return coboSafeAddress
  **/
  @javax.annotation.Nullable
  public String getCoboSafeAddress() {
    return coboSafeAddress;
  }

  public void setCoboSafeAddress(String coboSafeAddress) {
    this.coboSafeAddress = coboSafeAddress;
  }


  public CreateSafeWalletParams initiator(SmartContractInitiator initiator) {
    this.initiator = initiator;
    return this;
  }

   /**
   * Get initiator
   * @return initiator
  **/
  @javax.annotation.Nullable
  public SmartContractInitiator getInitiator() {
    return initiator;
  }

  public void setInitiator(SmartContractInitiator initiator) {
    this.initiator = initiator;
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
   * @return the CreateSafeWalletParams instance itself
   */
  public CreateSafeWalletParams putAdditionalProperty(String key, Object value) {
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
    CreateSafeWalletParams createSafeWalletParams = (CreateSafeWalletParams) o;
    return Objects.equals(this.name, createSafeWalletParams.name) &&
        Objects.equals(this.walletType, createSafeWalletParams.walletType) &&
        Objects.equals(this.walletSubtype, createSafeWalletParams.walletSubtype) &&
        Objects.equals(this.chainId, createSafeWalletParams.chainId) &&
        Objects.equals(this.smartContractWalletType, createSafeWalletParams.smartContractWalletType) &&
        Objects.equals(this.safeAddress, createSafeWalletParams.safeAddress) &&
        Objects.equals(this.signers, createSafeWalletParams.signers) &&
        Objects.equals(this.threshold, createSafeWalletParams.threshold) &&
        Objects.equals(this.coboSafeAddress, createSafeWalletParams.coboSafeAddress) &&
        Objects.equals(this.initiator, createSafeWalletParams.initiator)&&
        Objects.equals(this.additionalProperties, createSafeWalletParams.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(name, walletType, walletSubtype, chainId, smartContractWalletType, safeAddress, signers, threshold, coboSafeAddress, initiator, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CreateSafeWalletParams {\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    walletType: ").append(toIndentedString(walletType)).append("\n");
    sb.append("    walletSubtype: ").append(toIndentedString(walletSubtype)).append("\n");
    sb.append("    chainId: ").append(toIndentedString(chainId)).append("\n");
    sb.append("    smartContractWalletType: ").append(toIndentedString(smartContractWalletType)).append("\n");
    sb.append("    safeAddress: ").append(toIndentedString(safeAddress)).append("\n");
    sb.append("    signers: ").append(toIndentedString(signers)).append("\n");
    sb.append("    threshold: ").append(toIndentedString(threshold)).append("\n");
    sb.append("    coboSafeAddress: ").append(toIndentedString(coboSafeAddress)).append("\n");
    sb.append("    initiator: ").append(toIndentedString(initiator)).append("\n");
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
    openapiFields.add("name");
    openapiFields.add("wallet_type");
    openapiFields.add("wallet_subtype");
    openapiFields.add("chain_id");
    openapiFields.add("smart_contract_wallet_type");
    openapiFields.add("safe_address");
    openapiFields.add("signers");
    openapiFields.add("threshold");
    openapiFields.add("cobo_safe_address");
    openapiFields.add("initiator");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("name");
    openapiRequiredFields.add("wallet_type");
    openapiRequiredFields.add("wallet_subtype");
    openapiRequiredFields.add("chain_id");
    openapiRequiredFields.add("smart_contract_wallet_type");
  }

 /**
  * Validates the JSON Element and throws an exception if issues found
  *
  * @param jsonElement JSON Element
  * @throws IOException if the JSON Element is invalid with respect to CreateSafeWalletParams
  */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!CreateSafeWalletParams.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in CreateSafeWalletParams is not found in the empty JSON string", CreateSafeWalletParams.openapiRequiredFields.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : CreateSafeWalletParams.openapiRequiredFields) {
        if (jsonElement.getAsJsonObject().get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if (!jsonObj.get("name").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `name` to be a primitive type in the JSON string but got `%s`", jsonObj.get("name").toString()));
      }
      // validate the required field `wallet_type`
      WalletType.validateJsonElement(jsonObj.get("wallet_type"));
      // validate the required field `wallet_subtype`
      WalletSubtype.validateJsonElement(jsonObj.get("wallet_subtype"));
      if (!jsonObj.get("chain_id").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `chain_id` to be a primitive type in the JSON string but got `%s`", jsonObj.get("chain_id").toString()));
      }
      // validate the required field `smart_contract_wallet_type`
      SmartContractWalletType.validateJsonElement(jsonObj.get("smart_contract_wallet_type"));
      if ((jsonObj.get("safe_address") != null && !jsonObj.get("safe_address").isJsonNull()) && !jsonObj.get("safe_address").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `safe_address` to be a primitive type in the JSON string but got `%s`", jsonObj.get("safe_address").toString()));
      }
      // ensure the optional json data is an array if present
      if (jsonObj.get("signers") != null && !jsonObj.get("signers").isJsonNull() && !jsonObj.get("signers").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `signers` to be an array in the JSON string but got `%s`", jsonObj.get("signers").toString()));
      }
      if ((jsonObj.get("cobo_safe_address") != null && !jsonObj.get("cobo_safe_address").isJsonNull()) && !jsonObj.get("cobo_safe_address").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `cobo_safe_address` to be a primitive type in the JSON string but got `%s`", jsonObj.get("cobo_safe_address").toString()));
      }
      // validate the optional field `initiator`
      if (jsonObj.get("initiator") != null && !jsonObj.get("initiator").isJsonNull()) {
        SmartContractInitiator.validateJsonElement(jsonObj.get("initiator"));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!CreateSafeWalletParams.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'CreateSafeWalletParams' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<CreateSafeWalletParams> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(CreateSafeWalletParams.class));

       return (TypeAdapter<T>) new TypeAdapter<CreateSafeWalletParams>() {
           @Override
           public void write(JsonWriter out, CreateSafeWalletParams value) throws IOException {
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
           public CreateSafeWalletParams read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             JsonObject jsonObj = jsonElement.getAsJsonObject();
             // store additional fields in the deserialized instance
             CreateSafeWalletParams instance = thisAdapter.fromJsonTree(jsonObj);
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
  * Create an instance of CreateSafeWalletParams given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of CreateSafeWalletParams
  * @throws IOException if the JSON string is invalid with respect to CreateSafeWalletParams
  */
  public static CreateSafeWalletParams fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, CreateSafeWalletParams.class);
  }

 /**
  * Convert an instance of CreateSafeWalletParams to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

