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
import com.google.gson.annotations.SerializedName;

import java.io.IOException;
import com.google.gson.TypeAdapter;
import com.google.gson.JsonElement;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;

/**
 * The type of key share holder group. Possible values include:  - &#x60;MainGroup&#x60;: A [Main Group](https://manuals.cobo.com/en/portal/mpc-wallets/ocw/create-key-share-groups).  - &#x60;SigningGroup&#x60;: A [Signing Group](https://manuals.cobo.com/en/portal/mpc-wallets/ocw/create-key-share-groups).  - &#x60;RecoveryGroup&#x60;: A [Recovery Group](https://manuals.cobo.com/en/portal/mpc-wallets/ocw/create-key-share-groups).  **Note:** For &#x60;MainGroup&#x60; and &#x60;SigningGroup&#x60;, a Cobo key share holder will be added automatically. 
 */
@JsonAdapter(KeyShareHolderGroupType.Adapter.class)
public enum KeyShareHolderGroupType {
  UNKNOWN(null),
  
  MAINGROUP("MainGroup"),
  
  SIGNINGGROUP("SigningGroup"),
  
  RECOVERYGROUP("RecoveryGroup");

  private String value;

  KeyShareHolderGroupType(String value) {
    this.value = value;
  }

  public String getValue() {
    return value;
  }

  @Override
  public String toString() {
    return String.valueOf(value);
  }

  public static KeyShareHolderGroupType fromValue(String value) {
    for (KeyShareHolderGroupType b : KeyShareHolderGroupType.values()) {
      if (b == UNKNOWN) continue;
      if (b.value.equals(value)) {
        return b;
      }
    }
    return UNKNOWN;
    // throw new IllegalArgumentException("Unexpected value '" + value + "'");
  }

  public static class Adapter extends TypeAdapter<KeyShareHolderGroupType> {
    @Override
    public void write(final JsonWriter jsonWriter, final KeyShareHolderGroupType enumeration) throws IOException {
      jsonWriter.value(enumeration.getValue());
    }

    @Override
    public KeyShareHolderGroupType read(final JsonReader jsonReader) throws IOException {
      String value = jsonReader.nextString();
      return KeyShareHolderGroupType.fromValue(value);
    }
  }

  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
    String value = jsonElement.getAsString();
    KeyShareHolderGroupType.fromValue(value);
  }
}

