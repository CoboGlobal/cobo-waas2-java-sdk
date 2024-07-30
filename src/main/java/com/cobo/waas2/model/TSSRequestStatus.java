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
 * The TSS request status. Possible values include: - &#x60;PendingKeyHolderConfirmation&#x60;: The action done to the TSS request is currently pending enough key share holders to approve.  - &#x60;KeyHolderConfirmationFailed&#x60;: Key share holders failed to approve the the action to be done to the TSS request.  - &#x60;KeyGenerating&#x60;: The key share is currently being generated for the action to be done to the TSS request.  - &#x60;KeyGeneratingFailed&#x60;: The key share generation process has failed for the action to be done to the TSS request.  - &#x60;Success&#x60;: The action done to the TSS request has been completed successfully. If you see this status while running [Cancel TSS request](http://localhost:3000/v2/api-references/wallets--mpc-wallets/cancel-tss-request), this mean the specified TSS request has been successfully canceled. 
 */
@JsonAdapter(TSSRequestStatus.Adapter.class)
public enum TSSRequestStatus {
  UNKNOWN(null),
  
  PENDINGKEYHOLDERCONFIRMATION("PendingKeyHolderConfirmation"),
  
  KEYHOLDERCONFIRMATIONFAILED("KeyHolderConfirmationFailed"),
  
  KEYGENERATING("KeyGenerating"),
  
  KEYGENERATINGFAILED("KeyGeneratingFailed"),
  
  SUCCESS("Success");

  private String value;

  TSSRequestStatus(String value) {
    this.value = value;
  }

  public String getValue() {
    return value;
  }

  @Override
  public String toString() {
    return String.valueOf(value);
  }

  public static TSSRequestStatus fromValue(String value) {
    for (TSSRequestStatus b : TSSRequestStatus.values()) {
      if (b == UNKNOWN) continue;
      if (b.value.equals(value)) {
        return b;
      }
    }
    return UNKNOWN;
    // throw new IllegalArgumentException("Unexpected value '" + value + "'");
  }

  public static class Adapter extends TypeAdapter<TSSRequestStatus> {
    @Override
    public void write(final JsonWriter jsonWriter, final TSSRequestStatus enumeration) throws IOException {
      jsonWriter.value(enumeration.getValue());
    }

    @Override
    public TSSRequestStatus read(final JsonReader jsonReader) throws IOException {
      String value = jsonReader.nextString();
      return TSSRequestStatus.fromValue(value);
    }
  }

  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
    String value = jsonElement.getAsString();
    TSSRequestStatus.fromValue(value);
  }
}

