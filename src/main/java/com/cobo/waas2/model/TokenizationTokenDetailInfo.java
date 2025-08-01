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
import com.cobo.waas2.model.TokenizationAddressPermission;
import com.cobo.waas2.model.TokenizationStatus;
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
 * TokenizationTokenDetailInfo
 */
@javax.annotation.Generated(
    value = "org.openapitools.codegen.languages.JavaClientCodegen", 
    comments = "Generator version: 7.6.0"
)
public class TokenizationTokenDetailInfo {
  public static final String SERIALIZED_NAME_TOKEN_ID = "token_id";
  @SerializedName(SERIALIZED_NAME_TOKEN_ID)
  private String tokenId;

  public static final String SERIALIZED_NAME_CHAIN_ID = "chain_id";
  @SerializedName(SERIALIZED_NAME_CHAIN_ID)
  private String chainId;

  public static final String SERIALIZED_NAME_TOKEN_ADDRESS = "token_address";
  @SerializedName(SERIALIZED_NAME_TOKEN_ADDRESS)
  private String tokenAddress;

  public static final String SERIALIZED_NAME_TOKEN_NAME = "token_name";
  @SerializedName(SERIALIZED_NAME_TOKEN_NAME)
  private String tokenName;

  public static final String SERIALIZED_NAME_TOKEN_SYMBOL = "token_symbol";
  @SerializedName(SERIALIZED_NAME_TOKEN_SYMBOL)
  private String tokenSymbol;

  public static final String SERIALIZED_NAME_DECIMALS = "decimals";
  @SerializedName(SERIALIZED_NAME_DECIMALS)
  private Integer decimals;

  public static final String SERIALIZED_NAME_ALLOWLIST_ACTIVATED = "allowlist_activated";
  @SerializedName(SERIALIZED_NAME_ALLOWLIST_ACTIVATED)
  private Boolean allowlistActivated;

  public static final String SERIALIZED_NAME_STATUS = "status";
  @SerializedName(SERIALIZED_NAME_STATUS)
  private TokenizationStatus status;

  public static final String SERIALIZED_NAME_TOTAL_SUPPLY = "total_supply";
  @SerializedName(SERIALIZED_NAME_TOTAL_SUPPLY)
  private String totalSupply;

  public static final String SERIALIZED_NAME_HOLDINGS = "holdings";
  @SerializedName(SERIALIZED_NAME_HOLDINGS)
  private String holdings;

  public static final String SERIALIZED_NAME_PERMISSIONS = "permissions";
  @SerializedName(SERIALIZED_NAME_PERMISSIONS)
  private List<TokenizationAddressPermission> permissions = new ArrayList<>();

  public TokenizationTokenDetailInfo() {
  }

  public TokenizationTokenDetailInfo tokenId(String tokenId) {
    this.tokenId = tokenId;
    return this;
  }

   /**
   * The unique token identifier.
   * @return tokenId
  **/
  @javax.annotation.Nonnull
  public String getTokenId() {
    return tokenId;
  }

  public void setTokenId(String tokenId) {
    this.tokenId = tokenId;
  }


  public TokenizationTokenDetailInfo chainId(String chainId) {
    this.chainId = chainId;
    return this;
  }

   /**
   * The chain ID of the tokenization contract.
   * @return chainId
  **/
  @javax.annotation.Nonnull
  public String getChainId() {
    return chainId;
  }

  public void setChainId(String chainId) {
    this.chainId = chainId;
  }


  public TokenizationTokenDetailInfo tokenAddress(String tokenAddress) {
    this.tokenAddress = tokenAddress;
    return this;
  }

   /**
   * The address of the token contract.
   * @return tokenAddress
  **/
  @javax.annotation.Nullable
  public String getTokenAddress() {
    return tokenAddress;
  }

  public void setTokenAddress(String tokenAddress) {
    this.tokenAddress = tokenAddress;
  }


  public TokenizationTokenDetailInfo tokenName(String tokenName) {
    this.tokenName = tokenName;
    return this;
  }

   /**
   * The name of the token.
   * @return tokenName
  **/
  @javax.annotation.Nullable
  public String getTokenName() {
    return tokenName;
  }

  public void setTokenName(String tokenName) {
    this.tokenName = tokenName;
  }


  public TokenizationTokenDetailInfo tokenSymbol(String tokenSymbol) {
    this.tokenSymbol = tokenSymbol;
    return this;
  }

   /**
   * The unique token symbol.
   * @return tokenSymbol
  **/
  @javax.annotation.Nonnull
  public String getTokenSymbol() {
    return tokenSymbol;
  }

  public void setTokenSymbol(String tokenSymbol) {
    this.tokenSymbol = tokenSymbol;
  }


  public TokenizationTokenDetailInfo decimals(Integer decimals) {
    this.decimals = decimals;
    return this;
  }

   /**
   * The number of decimals of the token.
   * @return decimals
  **/
  @javax.annotation.Nonnull
  public Integer getDecimals() {
    return decimals;
  }

  public void setDecimals(Integer decimals) {
    this.decimals = decimals;
  }


  public TokenizationTokenDetailInfo allowlistActivated(Boolean allowlistActivated) {
    this.allowlistActivated = allowlistActivated;
    return this;
  }

   /**
   * Whether the allowlist feature is activated for the token.
   * @return allowlistActivated
  **/
  @javax.annotation.Nullable
  public Boolean getAllowlistActivated() {
    return allowlistActivated;
  }

  public void setAllowlistActivated(Boolean allowlistActivated) {
    this.allowlistActivated = allowlistActivated;
  }


  public TokenizationTokenDetailInfo status(TokenizationStatus status) {
    this.status = status;
    return this;
  }

   /**
   * Get status
   * @return status
  **/
  @javax.annotation.Nonnull
  public TokenizationStatus getStatus() {
    return status;
  }

  public void setStatus(TokenizationStatus status) {
    this.status = status;
  }


  public TokenizationTokenDetailInfo totalSupply(String totalSupply) {
    this.totalSupply = totalSupply;
    return this;
  }

   /**
   * The total supply of the token.
   * @return totalSupply
  **/
  @javax.annotation.Nullable
  public String getTotalSupply() {
    return totalSupply;
  }

  public void setTotalSupply(String totalSupply) {
    this.totalSupply = totalSupply;
  }


  public TokenizationTokenDetailInfo holdings(String holdings) {
    this.holdings = holdings;
    return this;
  }

   /**
   * The amount of tokens held by the organization.
   * @return holdings
  **/
  @javax.annotation.Nullable
  public String getHoldings() {
    return holdings;
  }

  public void setHoldings(String holdings) {
    this.holdings = holdings;
  }


  public TokenizationTokenDetailInfo permissions(List<TokenizationAddressPermission> permissions) {
    this.permissions = permissions;
    return this;
  }

  public TokenizationTokenDetailInfo addPermissionsItem(TokenizationAddressPermission permissionsItem) {
    if (this.permissions == null) {
      this.permissions = new ArrayList<>();
    }
    this.permissions.add(permissionsItem);
    return this;
  }

   /**
   * List of execution addresses and their permissions.
   * @return permissions
  **/
  @javax.annotation.Nullable
  public List<TokenizationAddressPermission> getPermissions() {
    return permissions;
  }

  public void setPermissions(List<TokenizationAddressPermission> permissions) {
    this.permissions = permissions;
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
   * @return the TokenizationTokenDetailInfo instance itself
   */
  public TokenizationTokenDetailInfo putAdditionalProperty(String key, Object value) {
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
    TokenizationTokenDetailInfo tokenizationTokenDetailInfo = (TokenizationTokenDetailInfo) o;
    return Objects.equals(this.tokenId, tokenizationTokenDetailInfo.tokenId) &&
        Objects.equals(this.chainId, tokenizationTokenDetailInfo.chainId) &&
        Objects.equals(this.tokenAddress, tokenizationTokenDetailInfo.tokenAddress) &&
        Objects.equals(this.tokenName, tokenizationTokenDetailInfo.tokenName) &&
        Objects.equals(this.tokenSymbol, tokenizationTokenDetailInfo.tokenSymbol) &&
        Objects.equals(this.decimals, tokenizationTokenDetailInfo.decimals) &&
        Objects.equals(this.allowlistActivated, tokenizationTokenDetailInfo.allowlistActivated) &&
        Objects.equals(this.status, tokenizationTokenDetailInfo.status) &&
        Objects.equals(this.totalSupply, tokenizationTokenDetailInfo.totalSupply) &&
        Objects.equals(this.holdings, tokenizationTokenDetailInfo.holdings) &&
        Objects.equals(this.permissions, tokenizationTokenDetailInfo.permissions)&&
        Objects.equals(this.additionalProperties, tokenizationTokenDetailInfo.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(tokenId, chainId, tokenAddress, tokenName, tokenSymbol, decimals, allowlistActivated, status, totalSupply, holdings, permissions, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TokenizationTokenDetailInfo {\n");
    sb.append("    tokenId: ").append(toIndentedString(tokenId)).append("\n");
    sb.append("    chainId: ").append(toIndentedString(chainId)).append("\n");
    sb.append("    tokenAddress: ").append(toIndentedString(tokenAddress)).append("\n");
    sb.append("    tokenName: ").append(toIndentedString(tokenName)).append("\n");
    sb.append("    tokenSymbol: ").append(toIndentedString(tokenSymbol)).append("\n");
    sb.append("    decimals: ").append(toIndentedString(decimals)).append("\n");
    sb.append("    allowlistActivated: ").append(toIndentedString(allowlistActivated)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("    totalSupply: ").append(toIndentedString(totalSupply)).append("\n");
    sb.append("    holdings: ").append(toIndentedString(holdings)).append("\n");
    sb.append("    permissions: ").append(toIndentedString(permissions)).append("\n");
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
    openapiFields.add("token_id");
    openapiFields.add("chain_id");
    openapiFields.add("token_address");
    openapiFields.add("token_name");
    openapiFields.add("token_symbol");
    openapiFields.add("decimals");
    openapiFields.add("allowlist_activated");
    openapiFields.add("status");
    openapiFields.add("total_supply");
    openapiFields.add("holdings");
    openapiFields.add("permissions");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("token_id");
    openapiRequiredFields.add("chain_id");
    openapiRequiredFields.add("token_symbol");
    openapiRequiredFields.add("decimals");
    openapiRequiredFields.add("status");
  }

 /**
  * Validates the JSON Element and throws an exception if issues found
  *
  * @param jsonElement JSON Element
  * @throws IOException if the JSON Element is invalid with respect to TokenizationTokenDetailInfo
  */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!TokenizationTokenDetailInfo.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in TokenizationTokenDetailInfo is not found in the empty JSON string", TokenizationTokenDetailInfo.openapiRequiredFields.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : TokenizationTokenDetailInfo.openapiRequiredFields) {
        if (jsonElement.getAsJsonObject().get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if (!jsonObj.get("token_id").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `token_id` to be a primitive type in the JSON string but got `%s`", jsonObj.get("token_id").toString()));
      }
      if (!jsonObj.get("chain_id").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `chain_id` to be a primitive type in the JSON string but got `%s`", jsonObj.get("chain_id").toString()));
      }
      if ((jsonObj.get("token_address") != null && !jsonObj.get("token_address").isJsonNull()) && !jsonObj.get("token_address").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `token_address` to be a primitive type in the JSON string but got `%s`", jsonObj.get("token_address").toString()));
      }
      if ((jsonObj.get("token_name") != null && !jsonObj.get("token_name").isJsonNull()) && !jsonObj.get("token_name").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `token_name` to be a primitive type in the JSON string but got `%s`", jsonObj.get("token_name").toString()));
      }
      if (!jsonObj.get("token_symbol").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `token_symbol` to be a primitive type in the JSON string but got `%s`", jsonObj.get("token_symbol").toString()));
      }
      // validate the required field `status`
      TokenizationStatus.validateJsonElement(jsonObj.get("status"));
      if ((jsonObj.get("total_supply") != null && !jsonObj.get("total_supply").isJsonNull()) && !jsonObj.get("total_supply").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `total_supply` to be a primitive type in the JSON string but got `%s`", jsonObj.get("total_supply").toString()));
      }
      if ((jsonObj.get("holdings") != null && !jsonObj.get("holdings").isJsonNull()) && !jsonObj.get("holdings").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `holdings` to be a primitive type in the JSON string but got `%s`", jsonObj.get("holdings").toString()));
      }
      if (jsonObj.get("permissions") != null && !jsonObj.get("permissions").isJsonNull()) {
        JsonArray jsonArraypermissions = jsonObj.getAsJsonArray("permissions");
        if (jsonArraypermissions != null) {
          // ensure the json data is an array
          if (!jsonObj.get("permissions").isJsonArray()) {
            throw new IllegalArgumentException(String.format("Expected the field `permissions` to be an array in the JSON string but got `%s`", jsonObj.get("permissions").toString()));
          }

          // validate the optional field `permissions` (array)
          for (int i = 0; i < jsonArraypermissions.size(); i++) {
            TokenizationAddressPermission.validateJsonElement(jsonArraypermissions.get(i));
          };
        }
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!TokenizationTokenDetailInfo.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'TokenizationTokenDetailInfo' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<TokenizationTokenDetailInfo> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(TokenizationTokenDetailInfo.class));

       return (TypeAdapter<T>) new TypeAdapter<TokenizationTokenDetailInfo>() {
           @Override
           public void write(JsonWriter out, TokenizationTokenDetailInfo value) throws IOException {
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
           public TokenizationTokenDetailInfo read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             JsonObject jsonObj = jsonElement.getAsJsonObject();
             // store additional fields in the deserialized instance
             TokenizationTokenDetailInfo instance = thisAdapter.fromJsonTree(jsonObj);
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
  * Create an instance of TokenizationTokenDetailInfo given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of TokenizationTokenDetailInfo
  * @throws IOException if the JSON string is invalid with respect to TokenizationTokenDetailInfo
  */
  public static TokenizationTokenDetailInfo fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, TokenizationTokenDetailInfo.class);
  }

 /**
  * Convert an instance of TokenizationTokenDetailInfo to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

