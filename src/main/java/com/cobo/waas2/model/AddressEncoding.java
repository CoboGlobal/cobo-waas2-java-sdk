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
import com.google.gson.annotations.SerializedName;

import java.io.IOException;
import com.google.gson.TypeAdapter;
import com.google.gson.JsonElement;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;

/**
 * The address encoding formats. This property only applies to blockchains that have a similar architecture to Bitcoin.
 */
@JsonAdapter(AddressEncoding.Adapter.class)
public enum AddressEncoding {
  UNKNOWN(null),
  
  P2PKH("ENCODING_P2PKH"),
  
  P2SH_P2WPKH("ENCODING_P2SH_P2WPKH"),
  
  BECH32("ENCODING_BECH32"),
  
  P2PKH_UNCOMPRESSED("ENCODING_P2PKH_UNCOMPRESSED"),
  
  P2SH_P2MS("ENCODING_P2SH_P2MS"),
  
  P2SH_P2WSH_P2MS("ENCODING_P2SH_P2WSH_P2MS"),
  
  P2TR("ENCODING_P2TR");

  private String value;

  AddressEncoding(String value) {
    this.value = value;
  }

  public String getValue() {
    return value;
  }

  @Override
  public String toString() {
    return String.valueOf(value);
  }

  public static AddressEncoding fromValue(String value) {
    for (AddressEncoding b : AddressEncoding.values()) {
      if (b == UNKNOWN) continue;
      if (b.value.equals(value)) {
        return b;
      }
    }
    return UNKNOWN;
    // throw new IllegalArgumentException("Unexpected value '" + value + "'");
  }

  public static class Adapter extends TypeAdapter<AddressEncoding> {
    @Override
    public void write(final JsonWriter jsonWriter, final AddressEncoding enumeration) throws IOException {
      jsonWriter.value(enumeration.getValue());
    }

    @Override
    public AddressEncoding read(final JsonReader jsonReader) throws IOException {
      String value = jsonReader.nextString();
      return AddressEncoding.fromValue(value);
    }
  }

  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
    String value = jsonElement.getAsString();
    AddressEncoding.fromValue(value);
  }
}

