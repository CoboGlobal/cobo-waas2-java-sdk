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
 * The selected UTXO information.
 */
@javax.annotation.Generated(
    value = "org.openapitools.codegen.languages.JavaClientCodegen", 
    comments = "Generator version: 7.6.0"
)
public class TransactionSelectedUtxo {
  public static final String SERIALIZED_NAME_TX_HASH = "tx_hash";
  @SerializedName(SERIALIZED_NAME_TX_HASH)
  private String txHash;

  public static final String SERIALIZED_NAME_VOUT_N = "vout_n";
  @SerializedName(SERIALIZED_NAME_VOUT_N)
  private Integer voutN;

  public static final String SERIALIZED_NAME_ADDRESS = "address";
  @SerializedName(SERIALIZED_NAME_ADDRESS)
  private String address;

  public static final String SERIALIZED_NAME_VALUE = "value";
  @SerializedName(SERIALIZED_NAME_VALUE)
  private String value;

  public static final String SERIALIZED_NAME_REDEEM_SCRIPT = "redeem_script";
  @SerializedName(SERIALIZED_NAME_REDEEM_SCRIPT)
  private String redeemScript;

  public static final String SERIALIZED_NAME_REVEALED_SCRIPT = "revealed_script";
  @SerializedName(SERIALIZED_NAME_REVEALED_SCRIPT)
  private String revealedScript;

  public TransactionSelectedUtxo() {
  }

  public TransactionSelectedUtxo txHash(String txHash) {
    this.txHash = txHash;
    return this;
  }

   /**
   * The transaction hash of the UTXO.
   * @return txHash
  **/
  @javax.annotation.Nullable
  public String getTxHash() {
    return txHash;
  }

  public void setTxHash(String txHash) {
    this.txHash = txHash;
  }


  public TransactionSelectedUtxo voutN(Integer voutN) {
    this.voutN = voutN;
    return this;
  }

   /**
   * The output index of the UTXO.
   * @return voutN
  **/
  @javax.annotation.Nullable
  public Integer getVoutN() {
    return voutN;
  }

  public void setVoutN(Integer voutN) {
    this.voutN = voutN;
  }


  public TransactionSelectedUtxo address(String address) {
    this.address = address;
    return this;
  }

   /**
   * The address of the UTXO.
   * @return address
  **/
  @javax.annotation.Nullable
  public String getAddress() {
    return address;
  }

  public void setAddress(String address) {
    this.address = address;
  }


  public TransactionSelectedUtxo value(String value) {
    this.value = value;
    return this;
  }

   /**
   * The value of the UTXO.
   * @return value
  **/
  @javax.annotation.Nullable
  public String getValue() {
    return value;
  }

  public void setValue(String value) {
    this.value = value;
  }


  public TransactionSelectedUtxo redeemScript(String redeemScript) {
    this.redeemScript = redeemScript;
    return this;
  }

   /**
   * The redeem script used in P2SH and P2WSH transactions.
   * @return redeemScript
  **/
  @javax.annotation.Nullable
  public String getRedeemScript() {
    return redeemScript;
  }

  public void setRedeemScript(String redeemScript) {
    this.redeemScript = redeemScript;
  }


  public TransactionSelectedUtxo revealedScript(String revealedScript) {
    this.revealedScript = revealedScript;
    return this;
  }

   /**
   * The revealed script used for Taproot script-path spend transaction.
   * @return revealedScript
  **/
  @javax.annotation.Nullable
  public String getRevealedScript() {
    return revealedScript;
  }

  public void setRevealedScript(String revealedScript) {
    this.revealedScript = revealedScript;
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
   * @return the TransactionSelectedUtxo instance itself
   */
  public TransactionSelectedUtxo putAdditionalProperty(String key, Object value) {
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
    TransactionSelectedUtxo transactionSelectedUtxo = (TransactionSelectedUtxo) o;
    return Objects.equals(this.txHash, transactionSelectedUtxo.txHash) &&
        Objects.equals(this.voutN, transactionSelectedUtxo.voutN) &&
        Objects.equals(this.address, transactionSelectedUtxo.address) &&
        Objects.equals(this.value, transactionSelectedUtxo.value) &&
        Objects.equals(this.redeemScript, transactionSelectedUtxo.redeemScript) &&
        Objects.equals(this.revealedScript, transactionSelectedUtxo.revealedScript)&&
        Objects.equals(this.additionalProperties, transactionSelectedUtxo.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(txHash, voutN, address, value, redeemScript, revealedScript, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TransactionSelectedUtxo {\n");
    sb.append("    txHash: ").append(toIndentedString(txHash)).append("\n");
    sb.append("    voutN: ").append(toIndentedString(voutN)).append("\n");
    sb.append("    address: ").append(toIndentedString(address)).append("\n");
    sb.append("    value: ").append(toIndentedString(value)).append("\n");
    sb.append("    redeemScript: ").append(toIndentedString(redeemScript)).append("\n");
    sb.append("    revealedScript: ").append(toIndentedString(revealedScript)).append("\n");
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
    openapiFields.add("tx_hash");
    openapiFields.add("vout_n");
    openapiFields.add("address");
    openapiFields.add("value");
    openapiFields.add("redeem_script");
    openapiFields.add("revealed_script");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Element and throws an exception if issues found
  *
  * @param jsonElement JSON Element
  * @throws IOException if the JSON Element is invalid with respect to TransactionSelectedUtxo
  */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!TransactionSelectedUtxo.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in TransactionSelectedUtxo is not found in the empty JSON string", TransactionSelectedUtxo.openapiRequiredFields.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if ((jsonObj.get("tx_hash") != null && !jsonObj.get("tx_hash").isJsonNull()) && !jsonObj.get("tx_hash").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `tx_hash` to be a primitive type in the JSON string but got `%s`", jsonObj.get("tx_hash").toString()));
      }
      if ((jsonObj.get("address") != null && !jsonObj.get("address").isJsonNull()) && !jsonObj.get("address").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `address` to be a primitive type in the JSON string but got `%s`", jsonObj.get("address").toString()));
      }
      if ((jsonObj.get("value") != null && !jsonObj.get("value").isJsonNull()) && !jsonObj.get("value").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `value` to be a primitive type in the JSON string but got `%s`", jsonObj.get("value").toString()));
      }
      if ((jsonObj.get("redeem_script") != null && !jsonObj.get("redeem_script").isJsonNull()) && !jsonObj.get("redeem_script").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `redeem_script` to be a primitive type in the JSON string but got `%s`", jsonObj.get("redeem_script").toString()));
      }
      if ((jsonObj.get("revealed_script") != null && !jsonObj.get("revealed_script").isJsonNull()) && !jsonObj.get("revealed_script").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `revealed_script` to be a primitive type in the JSON string but got `%s`", jsonObj.get("revealed_script").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!TransactionSelectedUtxo.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'TransactionSelectedUtxo' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<TransactionSelectedUtxo> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(TransactionSelectedUtxo.class));

       return (TypeAdapter<T>) new TypeAdapter<TransactionSelectedUtxo>() {
           @Override
           public void write(JsonWriter out, TransactionSelectedUtxo value) throws IOException {
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
           public TransactionSelectedUtxo read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             JsonObject jsonObj = jsonElement.getAsJsonObject();
             // store additional fields in the deserialized instance
             TransactionSelectedUtxo instance = thisAdapter.fromJsonTree(jsonObj);
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
  * Create an instance of TransactionSelectedUtxo given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of TransactionSelectedUtxo
  * @throws IOException if the JSON string is invalid with respect to TransactionSelectedUtxo
  */
  public static TransactionSelectedUtxo fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, TransactionSelectedUtxo.class);
  }

 /**
  * Convert an instance of TransactionSelectedUtxo to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

