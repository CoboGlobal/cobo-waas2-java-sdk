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
import com.cobo.waas2.model.TransactionDestinationType;
import com.cobo.waas2.model.WalletSubtype;
import com.cobo.waas2.model.WalletType;
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
 * Information about the transaction destination type &#x60;DepositToAddress&#x60;. 
 */
@javax.annotation.Generated(
    value = "org.openapitools.codegen.languages.JavaClientCodegen", 
    comments = "Generator version: 7.6.0"
)
public class TransactionDepositToAddressDestination {
  public static final String SERIALIZED_NAME_DESTINATION_TYPE = "destination_type";
  @SerializedName(SERIALIZED_NAME_DESTINATION_TYPE)
  private TransactionDestinationType destinationType;

  public static final String SERIALIZED_NAME_WALLET_ID = "wallet_id";
  @SerializedName(SERIALIZED_NAME_WALLET_ID)
  private UUID walletId;

  public static final String SERIALIZED_NAME_WALLET_TYPE = "wallet_type";
  @SerializedName(SERIALIZED_NAME_WALLET_TYPE)
  private WalletType walletType;

  public static final String SERIALIZED_NAME_WALLET_SUBTYPE = "wallet_subtype";
  @SerializedName(SERIALIZED_NAME_WALLET_SUBTYPE)
  private WalletSubtype walletSubtype;

  public static final String SERIALIZED_NAME_ADDRESS = "address";
  @SerializedName(SERIALIZED_NAME_ADDRESS)
  private String address;

  public static final String SERIALIZED_NAME_MEMO = "memo";
  @SerializedName(SERIALIZED_NAME_MEMO)
  private String memo;

  public static final String SERIALIZED_NAME_AMOUNT = "amount";
  @SerializedName(SERIALIZED_NAME_AMOUNT)
  private String amount;

  public TransactionDepositToAddressDestination() {
  }

  public TransactionDepositToAddressDestination destinationType(TransactionDestinationType destinationType) {
    this.destinationType = destinationType;
    return this;
  }

   /**
   * Get destinationType
   * @return destinationType
  **/
  @javax.annotation.Nonnull
  public TransactionDestinationType getDestinationType() {
    return destinationType;
  }

  public void setDestinationType(TransactionDestinationType destinationType) {
    this.destinationType = destinationType;
  }


  public TransactionDepositToAddressDestination walletId(UUID walletId) {
    this.walletId = walletId;
    return this;
  }

   /**
   * The wallet ID.
   * @return walletId
  **/
  @javax.annotation.Nonnull
  public UUID getWalletId() {
    return walletId;
  }

  public void setWalletId(UUID walletId) {
    this.walletId = walletId;
  }


  public TransactionDepositToAddressDestination walletType(WalletType walletType) {
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


  public TransactionDepositToAddressDestination walletSubtype(WalletSubtype walletSubtype) {
    this.walletSubtype = walletSubtype;
    return this;
  }

   /**
   * Get walletSubtype
   * @return walletSubtype
  **/
  @javax.annotation.Nullable
  public WalletSubtype getWalletSubtype() {
    return walletSubtype;
  }

  public void setWalletSubtype(WalletSubtype walletSubtype) {
    this.walletSubtype = walletSubtype;
  }


  public TransactionDepositToAddressDestination address(String address) {
    this.address = address;
    return this;
  }

   /**
   * The destination address.
   * @return address
  **/
  @javax.annotation.Nonnull
  public String getAddress() {
    return address;
  }

  public void setAddress(String address) {
    this.address = address;
  }


  public TransactionDepositToAddressDestination memo(String memo) {
    this.memo = memo;
    return this;
  }

   /**
   * The memo that identifies a transaction in order to credit the correct account. For transfers out of Cobo Portal, it is highly recommended to include a memo for the chains such as XRP, EOS, XLM, IOST, BNB_BNB, ATOM, LUNA, and TON.
   * @return memo
  **/
  @javax.annotation.Nullable
  public String getMemo() {
    return memo;
  }

  public void setMemo(String memo) {
    this.memo = memo;
  }


  public TransactionDepositToAddressDestination amount(String amount) {
    this.amount = amount;
    return this;
  }

   /**
   * The transfer amount. For example, if you trade 1.5 ETH, then the value is &#x60;1.5&#x60;. 
   * @return amount
  **/
  @javax.annotation.Nonnull
  public String getAmount() {
    return amount;
  }

  public void setAmount(String amount) {
    this.amount = amount;
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
   * @return the TransactionDepositToAddressDestination instance itself
   */
  public TransactionDepositToAddressDestination putAdditionalProperty(String key, Object value) {
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
    TransactionDepositToAddressDestination transactionDepositToAddressDestination = (TransactionDepositToAddressDestination) o;
    return Objects.equals(this.destinationType, transactionDepositToAddressDestination.destinationType) &&
        Objects.equals(this.walletId, transactionDepositToAddressDestination.walletId) &&
        Objects.equals(this.walletType, transactionDepositToAddressDestination.walletType) &&
        Objects.equals(this.walletSubtype, transactionDepositToAddressDestination.walletSubtype) &&
        Objects.equals(this.address, transactionDepositToAddressDestination.address) &&
        Objects.equals(this.memo, transactionDepositToAddressDestination.memo) &&
        Objects.equals(this.amount, transactionDepositToAddressDestination.amount)&&
        Objects.equals(this.additionalProperties, transactionDepositToAddressDestination.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(destinationType, walletId, walletType, walletSubtype, address, memo, amount, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TransactionDepositToAddressDestination {\n");
    sb.append("    destinationType: ").append(toIndentedString(destinationType)).append("\n");
    sb.append("    walletId: ").append(toIndentedString(walletId)).append("\n");
    sb.append("    walletType: ").append(toIndentedString(walletType)).append("\n");
    sb.append("    walletSubtype: ").append(toIndentedString(walletSubtype)).append("\n");
    sb.append("    address: ").append(toIndentedString(address)).append("\n");
    sb.append("    memo: ").append(toIndentedString(memo)).append("\n");
    sb.append("    amount: ").append(toIndentedString(amount)).append("\n");
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
    openapiFields.add("wallet_id");
    openapiFields.add("wallet_type");
    openapiFields.add("wallet_subtype");
    openapiFields.add("address");
    openapiFields.add("memo");
    openapiFields.add("amount");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("destination_type");
    openapiRequiredFields.add("wallet_id");
    openapiRequiredFields.add("wallet_type");
    openapiRequiredFields.add("address");
    openapiRequiredFields.add("amount");
  }

 /**
  * Validates the JSON Element and throws an exception if issues found
  *
  * @param jsonElement JSON Element
  * @throws IOException if the JSON Element is invalid with respect to TransactionDepositToAddressDestination
  */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!TransactionDepositToAddressDestination.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in TransactionDepositToAddressDestination is not found in the empty JSON string", TransactionDepositToAddressDestination.openapiRequiredFields.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : TransactionDepositToAddressDestination.openapiRequiredFields) {
        if (jsonElement.getAsJsonObject().get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      // validate the required field `destination_type`
      TransactionDestinationType.validateJsonElement(jsonObj.get("destination_type"));
      if (!jsonObj.get("wallet_id").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `wallet_id` to be a primitive type in the JSON string but got `%s`", jsonObj.get("wallet_id").toString()));
      }
      // validate the required field `wallet_type`
      WalletType.validateJsonElement(jsonObj.get("wallet_type"));
      // validate the optional field `wallet_subtype`
      if (jsonObj.get("wallet_subtype") != null && !jsonObj.get("wallet_subtype").isJsonNull()) {
        WalletSubtype.validateJsonElement(jsonObj.get("wallet_subtype"));
      }
      if (!jsonObj.get("address").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `address` to be a primitive type in the JSON string but got `%s`", jsonObj.get("address").toString()));
      }
      if ((jsonObj.get("memo") != null && !jsonObj.get("memo").isJsonNull()) && !jsonObj.get("memo").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `memo` to be a primitive type in the JSON string but got `%s`", jsonObj.get("memo").toString()));
      }
      if (!jsonObj.get("amount").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `amount` to be a primitive type in the JSON string but got `%s`", jsonObj.get("amount").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!TransactionDepositToAddressDestination.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'TransactionDepositToAddressDestination' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<TransactionDepositToAddressDestination> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(TransactionDepositToAddressDestination.class));

       return (TypeAdapter<T>) new TypeAdapter<TransactionDepositToAddressDestination>() {
           @Override
           public void write(JsonWriter out, TransactionDepositToAddressDestination value) throws IOException {
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
           public TransactionDepositToAddressDestination read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             JsonObject jsonObj = jsonElement.getAsJsonObject();
             // store additional fields in the deserialized instance
             TransactionDepositToAddressDestination instance = thisAdapter.fromJsonTree(jsonObj);
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
  * Create an instance of TransactionDepositToAddressDestination given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of TransactionDepositToAddressDestination
  * @throws IOException if the JSON string is invalid with respect to TransactionDepositToAddressDestination
  */
  public static TransactionDepositToAddressDestination fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, TransactionDepositToAddressDestination.class);
  }

 /**
  * Convert an instance of TransactionDepositToAddressDestination to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

