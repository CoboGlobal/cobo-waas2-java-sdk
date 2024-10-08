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
 * The staking source type. Possible values include:   - &#x60;Org-Controlled&#x60;: An MPC Wallet (Organization-Controlled Wallet). 
 */
@JsonAdapter(StakeSourceType.Adapter.class)
public enum StakeSourceType {
  UNKNOWN(null),
  
  ORG_CONTROLLED("Org-Controlled");

  private String value;

  StakeSourceType(String value) {
    this.value = value;
  }

  public String getValue() {
    return value;
  }

  @Override
  public String toString() {
    return String.valueOf(value);
  }

  public static StakeSourceType fromValue(String value) {
    for (StakeSourceType b : StakeSourceType.values()) {
      if (b == UNKNOWN) continue;
      if (b.value.equals(value)) {
        return b;
      }
    }
    return UNKNOWN;
    // throw new IllegalArgumentException("Unexpected value '" + value + "'");
  }

  public static class Adapter extends TypeAdapter<StakeSourceType> {
    @Override
    public void write(final JsonWriter jsonWriter, final StakeSourceType enumeration) throws IOException {
      jsonWriter.value(enumeration.getValue());
    }

    @Override
    public StakeSourceType read(final JsonReader jsonReader) throws IOException {
      String value = jsonReader.nextString();
      return StakeSourceType.fromValue(value);
    }
  }

  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
    String value = jsonElement.getAsString();
    StakeSourceType.fromValue(value);
  }
}

