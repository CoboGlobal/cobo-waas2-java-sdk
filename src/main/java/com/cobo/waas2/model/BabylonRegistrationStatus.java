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
 * The status of Babylon airdrop or staking registration. Possible values are: - &#x60;Registered&#x60;: Registered for Babylon airdrop or staking. - &#x60;Unregistered&#x60;: Not registered for any Babylon airdrop or staking. - &#x60;Registering&#x60;: Requesting to register for Babylon airdrop or staking. 
 */
@JsonAdapter(BabylonRegistrationStatus.Adapter.class)
public enum BabylonRegistrationStatus {
  UNKNOWN(null),
  
  REGISTERED("Registered"),
  
  UNREGISTERED("Unregistered"),
  
  REGISTERING("Registering");

  private String value;

  BabylonRegistrationStatus(String value) {
    this.value = value;
  }

  public String getValue() {
    return value;
  }

  @Override
  public String toString() {
    return String.valueOf(value);
  }

  public static BabylonRegistrationStatus fromValue(String value) {
    for (BabylonRegistrationStatus b : BabylonRegistrationStatus.values()) {
      if (b == UNKNOWN) continue;
      if (b.value.equals(value)) {
        return b;
      }
    }
    return UNKNOWN;
    // throw new IllegalArgumentException("Unexpected value '" + value + "'");
  }

  public static class Adapter extends TypeAdapter<BabylonRegistrationStatus> {
    @Override
    public void write(final JsonWriter jsonWriter, final BabylonRegistrationStatus enumeration) throws IOException {
      jsonWriter.value(enumeration.getValue());
    }

    @Override
    public BabylonRegistrationStatus read(final JsonReader jsonReader) throws IOException {
      String value = jsonReader.nextString();
      return BabylonRegistrationStatus.fromValue(value);
    }
  }

  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
    String value = jsonElement.getAsString();
    BabylonRegistrationStatus.fromValue(value);
  }
}

