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
 * The guard binding status. Possible values include:    - &#x60;New&#x60;: The guard binding created.   - &#x60;ChangeNew&#x60;: A new guard binding created    - &#x60;WaitSelfConfirm&#x60;: The guard binding waiting user confirm on old guard.   - &#x60;WaitConfirm&#x60;: The guard binding waiting admin confirm on guard.   - &#x60;WaitActive&#x60;: The guard binding waiting active   - &#x60;Active&#x60;: The guard binding active.   - &#x60;Freeze&#x60;: The guard binding was frozen.   - &#x60;Invalid&#x60;: The guard binding was invalid. 
 */
@JsonAdapter(GuardPubkeyStatus.Adapter.class)
public enum GuardPubkeyStatus {
  UNKNOWN(null),
  
  NEW("New"),
  
  CHANGENEW("ChangeNew"),
  
  WAITSELFCONFIRM("WaitSelfConfirm"),
  
  WAITCONFIRM("WaitConfirm"),
  
  WAITACTIVE("WaitActive"),
  
  ACTIVE("Active"),
  
  FREEZE("Freeze"),
  
  INVALID("Invalid");

  private String value;

  GuardPubkeyStatus(String value) {
    this.value = value;
  }

  public String getValue() {
    return value;
  }

  @Override
  public String toString() {
    return String.valueOf(value);
  }

  public static GuardPubkeyStatus fromValue(String value) {
    for (GuardPubkeyStatus b : GuardPubkeyStatus.values()) {
      if (b == UNKNOWN) continue;
      if (b.value.equals(value)) {
        return b;
      }
    }
    return UNKNOWN;
    // throw new IllegalArgumentException("Unexpected value '" + value + "'");
  }

  public static class Adapter extends TypeAdapter<GuardPubkeyStatus> {
    @Override
    public void write(final JsonWriter jsonWriter, final GuardPubkeyStatus enumeration) throws IOException {
      jsonWriter.value(enumeration.getValue());
    }

    @Override
    public GuardPubkeyStatus read(final JsonReader jsonReader) throws IOException {
      String value = jsonReader.nextString();
      return GuardPubkeyStatus.fromValue(value);
    }
  }

  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
    String value = jsonElement.getAsString();
    GuardPubkeyStatus.fromValue(value);
  }
}

