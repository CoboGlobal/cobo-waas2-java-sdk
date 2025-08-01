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
import com.cobo.waas2.model.Balance;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import java.io.IOException;
import java.util.Arrays;
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
 * BalanceUpdateInfoEventData
 */
@javax.annotation.Generated(
    value = "org.openapitools.codegen.languages.JavaClientCodegen", 
    comments = "Generator version: 7.6.0"
)
public class BalanceUpdateInfoEventData {
  /**
   *  The data type of the event. - &#x60;Transaction&#x60;: The transaction event data. - &#x60;TSSRequest&#x60;: The TSS request event data. - &#x60;Addresses&#x60;: The addresses event data. - &#x60;WalletInfo&#x60;: The wallet information event data. - &#x60;MPCVault&#x60;: The MPC vault event data. - &#x60;Chains&#x60;: The enabled chain event data. - &#x60;Tokens&#x60;: The enabled token event data. - &#x60;TokenListing&#x60;: The token listing event data.        - &#x60;PaymentOrder&#x60;: The payment order event data. - &#x60;PaymentRefund&#x60;: The payment refund event data. - &#x60;PaymentSettlement&#x60;: The payment settlement event data. - &#x60;PaymentTransaction&#x60;: The payment transaction event data. - &#x60;PaymentAddressUpdate&#x60;: The payment address update event data. - &#x60;BalanceUpdateInfo&#x60;: The balance update event data. - &#x60;SuspendedToken&#x60;: The token suspension event data.
   */
  @JsonAdapter(DataTypeEnum.Adapter.class)
  public enum DataTypeEnum {
    TRANSACTION("Transaction"),
    
    TSSREQUEST("TSSRequest"),
    
    ADDRESSES("Addresses"),
    
    WALLETINFO("WalletInfo"),
    
    MPCVAULT("MPCVault"),
    
    CHAINS("Chains"),
    
    TOKENS("Tokens"),
    
    TOKENLISTING("TokenListing"),
    
    PAYMENTORDER("PaymentOrder"),
    
    PAYMENTREFUND("PaymentRefund"),
    
    PAYMENTSETTLEMENT("PaymentSettlement"),
    
    PAYMENTTRANSACTION("PaymentTransaction"),
    
    PAYMENTADDRESSUPDATE("PaymentAddressUpdate"),
    
    BALANCEUPDATEINFO("BalanceUpdateInfo"),
    
    SUSPENDEDTOKEN("SuspendedToken");

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

  public static final String SERIALIZED_NAME_TOKEN_ID = "token_id";
  @SerializedName(SERIALIZED_NAME_TOKEN_ID)
  private String tokenId;

  public static final String SERIALIZED_NAME_ADDRESS = "address";
  @SerializedName(SERIALIZED_NAME_ADDRESS)
  private String address;

  public static final String SERIALIZED_NAME_WALLET_UUID = "wallet_uuid";
  @SerializedName(SERIALIZED_NAME_WALLET_UUID)
  private UUID walletUuid;

  public static final String SERIALIZED_NAME_UPDATED_TIMESTAMP = "updated_timestamp";
  @SerializedName(SERIALIZED_NAME_UPDATED_TIMESTAMP)
  private Long updatedTimestamp;

  public static final String SERIALIZED_NAME_BALANCE = "balance";
  @SerializedName(SERIALIZED_NAME_BALANCE)
  private Balance balance;

  public BalanceUpdateInfoEventData() {
  }

  public BalanceUpdateInfoEventData dataType(DataTypeEnum dataType) {
    this.dataType = dataType;
    return this;
  }

   /**
   *  The data type of the event. - &#x60;Transaction&#x60;: The transaction event data. - &#x60;TSSRequest&#x60;: The TSS request event data. - &#x60;Addresses&#x60;: The addresses event data. - &#x60;WalletInfo&#x60;: The wallet information event data. - &#x60;MPCVault&#x60;: The MPC vault event data. - &#x60;Chains&#x60;: The enabled chain event data. - &#x60;Tokens&#x60;: The enabled token event data. - &#x60;TokenListing&#x60;: The token listing event data.        - &#x60;PaymentOrder&#x60;: The payment order event data. - &#x60;PaymentRefund&#x60;: The payment refund event data. - &#x60;PaymentSettlement&#x60;: The payment settlement event data. - &#x60;PaymentTransaction&#x60;: The payment transaction event data. - &#x60;PaymentAddressUpdate&#x60;: The payment address update event data. - &#x60;BalanceUpdateInfo&#x60;: The balance update event data. - &#x60;SuspendedToken&#x60;: The token suspension event data.
   * @return dataType
  **/
  @javax.annotation.Nonnull
  public DataTypeEnum getDataType() {
    return dataType;
  }

  public void setDataType(DataTypeEnum dataType) {
    this.dataType = dataType;
  }


  public BalanceUpdateInfoEventData tokenId(String tokenId) {
    this.tokenId = tokenId;
    return this;
  }

   /**
   * The token ID, which is the unique identifier of a token. You can retrieve the IDs of all the tokens you can use by calling [List enabled tokens](https://www.cobo.com/developers/v2/api-references/wallets/list-enabled-tokens).
   * @return tokenId
  **/
  @javax.annotation.Nonnull
  public String getTokenId() {
    return tokenId;
  }

  public void setTokenId(String tokenId) {
    this.tokenId = tokenId;
  }


  public BalanceUpdateInfoEventData address(String address) {
    this.address = address;
    return this;
  }

   /**
   * The wallet address.
   * @return address
  **/
  @javax.annotation.Nonnull
  public String getAddress() {
    return address;
  }

  public void setAddress(String address) {
    this.address = address;
  }


  public BalanceUpdateInfoEventData walletUuid(UUID walletUuid) {
    this.walletUuid = walletUuid;
    return this;
  }

   /**
   * The wallet ID.
   * @return walletUuid
  **/
  @javax.annotation.Nonnull
  public UUID getWalletUuid() {
    return walletUuid;
  }

  public void setWalletUuid(UUID walletUuid) {
    this.walletUuid = walletUuid;
  }


  public BalanceUpdateInfoEventData updatedTimestamp(Long updatedTimestamp) {
    this.updatedTimestamp = updatedTimestamp;
    return this;
  }

   /**
   * The time when the balance updated, in Unix timestamp format, measured in milliseconds. 
   * @return updatedTimestamp
  **/
  @javax.annotation.Nonnull
  public Long getUpdatedTimestamp() {
    return updatedTimestamp;
  }

  public void setUpdatedTimestamp(Long updatedTimestamp) {
    this.updatedTimestamp = updatedTimestamp;
  }


  public BalanceUpdateInfoEventData balance(Balance balance) {
    this.balance = balance;
    return this;
  }

   /**
   * Get balance
   * @return balance
  **/
  @javax.annotation.Nonnull
  public Balance getBalance() {
    return balance;
  }

  public void setBalance(Balance balance) {
    this.balance = balance;
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
   * @return the BalanceUpdateInfoEventData instance itself
   */
  public BalanceUpdateInfoEventData putAdditionalProperty(String key, Object value) {
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
    BalanceUpdateInfoEventData balanceUpdateInfoEventData = (BalanceUpdateInfoEventData) o;
    return Objects.equals(this.dataType, balanceUpdateInfoEventData.dataType) &&
        Objects.equals(this.tokenId, balanceUpdateInfoEventData.tokenId) &&
        Objects.equals(this.address, balanceUpdateInfoEventData.address) &&
        Objects.equals(this.walletUuid, balanceUpdateInfoEventData.walletUuid) &&
        Objects.equals(this.updatedTimestamp, balanceUpdateInfoEventData.updatedTimestamp) &&
        Objects.equals(this.balance, balanceUpdateInfoEventData.balance)&&
        Objects.equals(this.additionalProperties, balanceUpdateInfoEventData.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(dataType, tokenId, address, walletUuid, updatedTimestamp, balance, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class BalanceUpdateInfoEventData {\n");
    sb.append("    dataType: ").append(toIndentedString(dataType)).append("\n");
    sb.append("    tokenId: ").append(toIndentedString(tokenId)).append("\n");
    sb.append("    address: ").append(toIndentedString(address)).append("\n");
    sb.append("    walletUuid: ").append(toIndentedString(walletUuid)).append("\n");
    sb.append("    updatedTimestamp: ").append(toIndentedString(updatedTimestamp)).append("\n");
    sb.append("    balance: ").append(toIndentedString(balance)).append("\n");
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
    openapiFields.add("token_id");
    openapiFields.add("address");
    openapiFields.add("wallet_uuid");
    openapiFields.add("updated_timestamp");
    openapiFields.add("balance");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("data_type");
    openapiRequiredFields.add("token_id");
    openapiRequiredFields.add("address");
    openapiRequiredFields.add("wallet_uuid");
    openapiRequiredFields.add("updated_timestamp");
    openapiRequiredFields.add("balance");
  }

 /**
  * Validates the JSON Element and throws an exception if issues found
  *
  * @param jsonElement JSON Element
  * @throws IOException if the JSON Element is invalid with respect to BalanceUpdateInfoEventData
  */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!BalanceUpdateInfoEventData.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in BalanceUpdateInfoEventData is not found in the empty JSON string", BalanceUpdateInfoEventData.openapiRequiredFields.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : BalanceUpdateInfoEventData.openapiRequiredFields) {
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
      if (!jsonObj.get("token_id").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `token_id` to be a primitive type in the JSON string but got `%s`", jsonObj.get("token_id").toString()));
      }
      if (!jsonObj.get("address").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `address` to be a primitive type in the JSON string but got `%s`", jsonObj.get("address").toString()));
      }
      if (!jsonObj.get("wallet_uuid").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `wallet_uuid` to be a primitive type in the JSON string but got `%s`", jsonObj.get("wallet_uuid").toString()));
      }
      // validate the required field `balance`
      Balance.validateJsonElement(jsonObj.get("balance"));
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!BalanceUpdateInfoEventData.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'BalanceUpdateInfoEventData' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<BalanceUpdateInfoEventData> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(BalanceUpdateInfoEventData.class));

       return (TypeAdapter<T>) new TypeAdapter<BalanceUpdateInfoEventData>() {
           @Override
           public void write(JsonWriter out, BalanceUpdateInfoEventData value) throws IOException {
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
           public BalanceUpdateInfoEventData read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             JsonObject jsonObj = jsonElement.getAsJsonObject();
             // store additional fields in the deserialized instance
             BalanceUpdateInfoEventData instance = thisAdapter.fromJsonTree(jsonObj);
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
  * Create an instance of BalanceUpdateInfoEventData given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of BalanceUpdateInfoEventData
  * @throws IOException if the JSON string is invalid with respect to BalanceUpdateInfoEventData
  */
  public static BalanceUpdateInfoEventData fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, BalanceUpdateInfoEventData.class);
  }

 /**
  * Convert an instance of BalanceUpdateInfoEventData to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

