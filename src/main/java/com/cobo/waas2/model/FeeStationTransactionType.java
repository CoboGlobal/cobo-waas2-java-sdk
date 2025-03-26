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
 * The transaction type. Possible values include:    - &#x60;Deposit&#x60;: A deposit transaction.   - &#x60;Withdrawal&#x60;: A withdrawal transaction. 
 */
@JsonAdapter(FeeStationTransactionType.Adapter.class)
public enum FeeStationTransactionType {
  UNKNOWN(null),
  
  DEPOSIT("Deposit"),
  
  WITHDRAWAL("Withdrawal");

  private String value;

  FeeStationTransactionType(String value) {
    this.value = value;
  }

  public String getValue() {
    return value;
  }

  @Override
  public String toString() {
    return String.valueOf(value);
  }

  public static FeeStationTransactionType fromValue(String value) {
    for (FeeStationTransactionType b : FeeStationTransactionType.values()) {
      if (b == UNKNOWN) continue;
      if (b.value.equals(value)) {
        return b;
      }
    }
    return UNKNOWN;
    // throw new IllegalArgumentException("Unexpected value '" + value + "'");
  }

  public static class Adapter extends TypeAdapter<FeeStationTransactionType> {
    @Override
    public void write(final JsonWriter jsonWriter, final FeeStationTransactionType enumeration) throws IOException {
      jsonWriter.value(enumeration.getValue());
    }

    @Override
    public FeeStationTransactionType read(final JsonReader jsonReader) throws IOException {
      String value = jsonReader.nextString();
      return FeeStationTransactionType.fromValue(value);
    }
  }

  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
    String value = jsonElement.getAsString();
    FeeStationTransactionType.fromValue(value);
  }
}

