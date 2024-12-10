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
import com.cobo.waas2.model.ExchangeId;
import com.cobo.waas2.model.WalletSubtype;
import com.cobo.waas2.model.WalletType;
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
 * CreateExchangeWalletParams
 */
@javax.annotation.Generated(
    value = "org.openapitools.codegen.languages.JavaClientCodegen", 
    comments = "Generator version: 7.6.0"
)
public class CreateExchangeWalletParams {
  public static final String SERIALIZED_NAME_NAME = "name";
  @SerializedName(SERIALIZED_NAME_NAME)
  private String name;

  public static final String SERIALIZED_NAME_WALLET_TYPE = "wallet_type";
  @SerializedName(SERIALIZED_NAME_WALLET_TYPE)
  private WalletType walletType;

  public static final String SERIALIZED_NAME_WALLET_SUBTYPE = "wallet_subtype";
  @SerializedName(SERIALIZED_NAME_WALLET_SUBTYPE)
  private WalletSubtype walletSubtype;

  public static final String SERIALIZED_NAME_EXCHANGE_ID = "exchange_id";
  @SerializedName(SERIALIZED_NAME_EXCHANGE_ID)
  private ExchangeId exchangeId;

  public static final String SERIALIZED_NAME_APIKEY = "apikey";
  @SerializedName(SERIALIZED_NAME_APIKEY)
  private String apikey;

  public static final String SERIALIZED_NAME_SECRET = "secret";
  @SerializedName(SERIALIZED_NAME_SECRET)
  private String secret;

  public static final String SERIALIZED_NAME_PASSPHRASE = "passphrase";
  @SerializedName(SERIALIZED_NAME_PASSPHRASE)
  private String passphrase;

  public static final String SERIALIZED_NAME_MEMO = "memo";
  @SerializedName(SERIALIZED_NAME_MEMO)
  private String memo;

  public static final String SERIALIZED_NAME_ACCOUNT_IDENTIFY = "account_identify";
  @SerializedName(SERIALIZED_NAME_ACCOUNT_IDENTIFY)
  private String accountIdentify;

  public static final String SERIALIZED_NAME_GA_CODE = "ga_code";
  @SerializedName(SERIALIZED_NAME_GA_CODE)
  private String gaCode;

  public static final String SERIALIZED_NAME_MAIN_WALLET_ID = "main_wallet_id";
  @SerializedName(SERIALIZED_NAME_MAIN_WALLET_ID)
  private String mainWalletId;

  public CreateExchangeWalletParams() {
  }

  public CreateExchangeWalletParams name(String name) {
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


  public CreateExchangeWalletParams walletType(WalletType walletType) {
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


  public CreateExchangeWalletParams walletSubtype(WalletSubtype walletSubtype) {
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


  public CreateExchangeWalletParams exchangeId(ExchangeId exchangeId) {
    this.exchangeId = exchangeId;
    return this;
  }

   /**
   * Get exchangeId
   * @return exchangeId
  **/
  @javax.annotation.Nonnull
  public ExchangeId getExchangeId() {
    return exchangeId;
  }

  public void setExchangeId(ExchangeId exchangeId) {
    this.exchangeId = exchangeId;
  }


  public CreateExchangeWalletParams apikey(String apikey) {
    this.apikey = apikey;
    return this;
  }

   /**
   * The API key of your exchange account.
   * @return apikey
  **/
  @javax.annotation.Nonnull
  public String getApikey() {
    return apikey;
  }

  public void setApikey(String apikey) {
    this.apikey = apikey;
  }


  public CreateExchangeWalletParams secret(String secret) {
    this.secret = secret;
    return this;
  }

   /**
   * The API secret of your exchange account.
   * @return secret
  **/
  @javax.annotation.Nonnull
  public String getSecret() {
    return secret;
  }

  public void setSecret(String secret) {
    this.secret = secret;
  }


  public CreateExchangeWalletParams passphrase(String passphrase) {
    this.passphrase = passphrase;
    return this;
  }

   /**
   * The passphrase of your exchange account.
   * @return passphrase
  **/
  @javax.annotation.Nullable
  public String getPassphrase() {
    return passphrase;
  }

  public void setPassphrase(String passphrase) {
    this.passphrase = passphrase;
  }


  public CreateExchangeWalletParams memo(String memo) {
    this.memo = memo;
    return this;
  }

   /**
   * The memo you use when applying for the API key of your exchange account.
   * @return memo
  **/
  @javax.annotation.Nullable
  public String getMemo() {
    return memo;
  }

  public void setMemo(String memo) {
    this.memo = memo;
  }


  public CreateExchangeWalletParams accountIdentify(String accountIdentify) {
    this.accountIdentify = accountIdentify;
    return this;
  }

   /**
   * The identifier of your exchange account. - For Binance, this is email address of your exchange account. - For OKX, this is the user name of your exchange account. 
   * @return accountIdentify
  **/
  @javax.annotation.Nullable
  public String getAccountIdentify() {
    return accountIdentify;
  }

  public void setAccountIdentify(String accountIdentify) {
    this.accountIdentify = accountIdentify;
  }


  public CreateExchangeWalletParams gaCode(String gaCode) {
    this.gaCode = gaCode;
    return this;
  }

   /**
   * The GA code for the exchange.
   * @return gaCode
  **/
  @javax.annotation.Nullable
  public String getGaCode() {
    return gaCode;
  }

  public void setGaCode(String gaCode) {
    this.gaCode = gaCode;
  }


  public CreateExchangeWalletParams mainWalletId(String mainWalletId) {
    this.mainWalletId = mainWalletId;
    return this;
  }

   /**
   * The ID of the Exchange Wallet (Main Account).
   * @return mainWalletId
  **/
  @javax.annotation.Nullable
  public String getMainWalletId() {
    return mainWalletId;
  }

  public void setMainWalletId(String mainWalletId) {
    this.mainWalletId = mainWalletId;
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
   * @return the CreateExchangeWalletParams instance itself
   */
  public CreateExchangeWalletParams putAdditionalProperty(String key, Object value) {
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
    CreateExchangeWalletParams createExchangeWalletParams = (CreateExchangeWalletParams) o;
    return Objects.equals(this.name, createExchangeWalletParams.name) &&
        Objects.equals(this.walletType, createExchangeWalletParams.walletType) &&
        Objects.equals(this.walletSubtype, createExchangeWalletParams.walletSubtype) &&
        Objects.equals(this.exchangeId, createExchangeWalletParams.exchangeId) &&
        Objects.equals(this.apikey, createExchangeWalletParams.apikey) &&
        Objects.equals(this.secret, createExchangeWalletParams.secret) &&
        Objects.equals(this.passphrase, createExchangeWalletParams.passphrase) &&
        Objects.equals(this.memo, createExchangeWalletParams.memo) &&
        Objects.equals(this.accountIdentify, createExchangeWalletParams.accountIdentify) &&
        Objects.equals(this.gaCode, createExchangeWalletParams.gaCode) &&
        Objects.equals(this.mainWalletId, createExchangeWalletParams.mainWalletId)&&
        Objects.equals(this.additionalProperties, createExchangeWalletParams.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(name, walletType, walletSubtype, exchangeId, apikey, secret, passphrase, memo, accountIdentify, gaCode, mainWalletId, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CreateExchangeWalletParams {\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    walletType: ").append(toIndentedString(walletType)).append("\n");
    sb.append("    walletSubtype: ").append(toIndentedString(walletSubtype)).append("\n");
    sb.append("    exchangeId: ").append(toIndentedString(exchangeId)).append("\n");
    sb.append("    apikey: ").append(toIndentedString(apikey)).append("\n");
    sb.append("    secret: ").append(toIndentedString(secret)).append("\n");
    sb.append("    passphrase: ").append(toIndentedString(passphrase)).append("\n");
    sb.append("    memo: ").append(toIndentedString(memo)).append("\n");
    sb.append("    accountIdentify: ").append(toIndentedString(accountIdentify)).append("\n");
    sb.append("    gaCode: ").append(toIndentedString(gaCode)).append("\n");
    sb.append("    mainWalletId: ").append(toIndentedString(mainWalletId)).append("\n");
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
    openapiFields.add("exchange_id");
    openapiFields.add("apikey");
    openapiFields.add("secret");
    openapiFields.add("passphrase");
    openapiFields.add("memo");
    openapiFields.add("account_identify");
    openapiFields.add("ga_code");
    openapiFields.add("main_wallet_id");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("name");
    openapiRequiredFields.add("wallet_type");
    openapiRequiredFields.add("wallet_subtype");
    openapiRequiredFields.add("exchange_id");
    openapiRequiredFields.add("apikey");
    openapiRequiredFields.add("secret");
  }

 /**
  * Validates the JSON Element and throws an exception if issues found
  *
  * @param jsonElement JSON Element
  * @throws IOException if the JSON Element is invalid with respect to CreateExchangeWalletParams
  */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!CreateExchangeWalletParams.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in CreateExchangeWalletParams is not found in the empty JSON string", CreateExchangeWalletParams.openapiRequiredFields.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : CreateExchangeWalletParams.openapiRequiredFields) {
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
      // validate the required field `exchange_id`
      ExchangeId.validateJsonElement(jsonObj.get("exchange_id"));
      if (!jsonObj.get("apikey").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `apikey` to be a primitive type in the JSON string but got `%s`", jsonObj.get("apikey").toString()));
      }
      if (!jsonObj.get("secret").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `secret` to be a primitive type in the JSON string but got `%s`", jsonObj.get("secret").toString()));
      }
      if ((jsonObj.get("passphrase") != null && !jsonObj.get("passphrase").isJsonNull()) && !jsonObj.get("passphrase").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `passphrase` to be a primitive type in the JSON string but got `%s`", jsonObj.get("passphrase").toString()));
      }
      if ((jsonObj.get("memo") != null && !jsonObj.get("memo").isJsonNull()) && !jsonObj.get("memo").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `memo` to be a primitive type in the JSON string but got `%s`", jsonObj.get("memo").toString()));
      }
      if ((jsonObj.get("account_identify") != null && !jsonObj.get("account_identify").isJsonNull()) && !jsonObj.get("account_identify").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `account_identify` to be a primitive type in the JSON string but got `%s`", jsonObj.get("account_identify").toString()));
      }
      if ((jsonObj.get("ga_code") != null && !jsonObj.get("ga_code").isJsonNull()) && !jsonObj.get("ga_code").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `ga_code` to be a primitive type in the JSON string but got `%s`", jsonObj.get("ga_code").toString()));
      }
      if ((jsonObj.get("main_wallet_id") != null && !jsonObj.get("main_wallet_id").isJsonNull()) && !jsonObj.get("main_wallet_id").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `main_wallet_id` to be a primitive type in the JSON string but got `%s`", jsonObj.get("main_wallet_id").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!CreateExchangeWalletParams.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'CreateExchangeWalletParams' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<CreateExchangeWalletParams> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(CreateExchangeWalletParams.class));

       return (TypeAdapter<T>) new TypeAdapter<CreateExchangeWalletParams>() {
           @Override
           public void write(JsonWriter out, CreateExchangeWalletParams value) throws IOException {
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
           public CreateExchangeWalletParams read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             JsonObject jsonObj = jsonElement.getAsJsonObject();
             // store additional fields in the deserialized instance
             CreateExchangeWalletParams instance = thisAdapter.fromJsonTree(jsonObj);
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
  * Create an instance of CreateExchangeWalletParams given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of CreateExchangeWalletParams
  * @throws IOException if the JSON string is invalid with respect to CreateExchangeWalletParams
  */
  public static CreateExchangeWalletParams fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, CreateExchangeWalletParams.class);
  }

 /**
  * Convert an instance of CreateExchangeWalletParams to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

