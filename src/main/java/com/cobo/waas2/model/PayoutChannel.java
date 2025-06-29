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
import com.google.gson.annotations.SerializedName;

import java.io.IOException;
import com.google.gson.TypeAdapter;
import com.google.gson.JsonElement;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;

/**
 * PayoutChannel defines the method by which settlement funds are paid out: - &#x60;Crypto&#x60;: Funds will be settled to a pre-approved blockchain crypto address. (Requires crypto_address_id to be specified.) - &#x60;OffRamp&#x60;: Funds will be settled through an off-ramp to a fiat bank account. (Requires bank_account_id to be specified.) 
 */
@JsonAdapter(PayoutChannel.Adapter.class)
public enum PayoutChannel {
  UNKNOWN(null),
  
  CRYPTO("Crypto"),
  
  OFFRAMP("OffRamp");

  private String value;

  PayoutChannel(String value) {
    this.value = value;
  }

  public String getValue() {
    return value;
  }

  @Override
  public String toString() {
    return String.valueOf(value);
  }

  public static PayoutChannel fromValue(String value) {
    for (PayoutChannel b : PayoutChannel.values()) {
      if (b == UNKNOWN) continue;
      if (b.value.equals(value)) {
        return b;
      }
    }
    return UNKNOWN;
    // throw new IllegalArgumentException("Unexpected value '" + value + "'");
  }

  public static class Adapter extends TypeAdapter<PayoutChannel> {
    @Override
    public void write(final JsonWriter jsonWriter, final PayoutChannel enumeration) throws IOException {
      jsonWriter.value(enumeration.getValue());
    }

    @Override
    public PayoutChannel read(final JsonReader jsonReader) throws IOException {
      String value = jsonReader.nextString();
      return PayoutChannel.fromValue(value);
    }
  }

  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
    String value = jsonElement.getAsString();
    PayoutChannel.fromValue(value);
  }
}

