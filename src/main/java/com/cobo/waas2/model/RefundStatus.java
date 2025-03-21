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
 * Gets or Sets RefundStatus
 */
@JsonAdapter(RefundStatus.Adapter.class)
public enum RefundStatus {
  UNKNOWN(null),
  
  PENDING("Pending"),
  
  PROCESSING("Processing"),
  
  COMPLETED("Completed"),
  
  FAILED("Failed");

  private String value;

  RefundStatus(String value) {
    this.value = value;
  }

  public String getValue() {
    return value;
  }

  @Override
  public String toString() {
    return String.valueOf(value);
  }

  public static RefundStatus fromValue(String value) {
    for (RefundStatus b : RefundStatus.values()) {
      if (b == UNKNOWN) continue;
      if (b.value.equals(value)) {
        return b;
      }
    }
    return UNKNOWN;
    // throw new IllegalArgumentException("Unexpected value '" + value + "'");
  }

  public static class Adapter extends TypeAdapter<RefundStatus> {
    @Override
    public void write(final JsonWriter jsonWriter, final RefundStatus enumeration) throws IOException {
      jsonWriter.value(enumeration.getValue());
    }

    @Override
    public RefundStatus read(final JsonReader jsonReader) throws IOException {
      String value = jsonReader.nextString();
      return RefundStatus.fromValue(value);
    }
  }

  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
    String value = jsonElement.getAsString();
    RefundStatus.fromValue(value);
  }
}

