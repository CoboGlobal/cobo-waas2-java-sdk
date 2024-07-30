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
import com.cobo.waas2.model.AddressTransferDestination;
import com.cobo.waas2.model.AddressTransferDestinationAccountOutput;
import com.cobo.waas2.model.AddressTransferDestinationUtxoOutputsInner;
import com.cobo.waas2.model.ExchangeTransferDestination;
import com.cobo.waas2.model.TransferDestinationType;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.UUID;



import java.io.IOException;
import java.lang.reflect.Type;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.JsonParseException;
import com.google.gson.TypeAdapter;
import com.google.gson.TypeAdapterFactory;
import com.google.gson.reflect.TypeToken;
import com.google.gson.JsonPrimitive;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import com.google.gson.JsonDeserializationContext;
import com.google.gson.JsonDeserializer;
import com.google.gson.JsonSerializationContext;
import com.google.gson.JsonSerializer;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonArray;
import com.google.gson.JsonParseException;

import com.cobo.waas2.JSON;

@javax.annotation.Generated(
    value = "org.openapitools.codegen.languages.JavaClientCodegen", 
    comments = "Generator version: 7.6.0"
)
public class TransferDestination extends AbstractOpenApiSchema {
    private static final Logger log = Logger.getLogger(TransferDestination.class.getName());

    public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
        @SuppressWarnings("unchecked")
        @Override
        public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
            if (!TransferDestination.class.isAssignableFrom(type.getRawType())) {
                return null; // this class only serializes 'TransferDestination' and its subtypes
            }
            final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
            final TypeAdapter<AddressTransferDestination> adapterAddressTransferDestination = gson.getDelegateAdapter(this, TypeToken.get(AddressTransferDestination.class));
            final TypeAdapter<ExchangeTransferDestination> adapterExchangeTransferDestination = gson.getDelegateAdapter(this, TypeToken.get(ExchangeTransferDestination.class));

            return (TypeAdapter<T>) new TypeAdapter<TransferDestination>() {
                @Override
                public void write(JsonWriter out, TransferDestination value) throws IOException {
                    if (value == null || value.getActualInstance() == null) {
                        elementAdapter.write(out, null);
                        return;
                    }

                    // check if the actual instance is of the type `AddressTransferDestination`
                    if (value.getActualInstance() instanceof AddressTransferDestination) {
                        JsonElement element = adapterAddressTransferDestination.toJsonTree((AddressTransferDestination)value.getActualInstance());
                        elementAdapter.write(out, element);
                        return;
                    }
                    // check if the actual instance is of the type `ExchangeTransferDestination`
                    if (value.getActualInstance() instanceof ExchangeTransferDestination) {
                        JsonElement element = adapterExchangeTransferDestination.toJsonTree((ExchangeTransferDestination)value.getActualInstance());
                        elementAdapter.write(out, element);
                        return;
                    }
                    throw new IOException("Failed to serialize as the type doesn't match oneOf schemas: AddressTransferDestination, ExchangeTransferDestination");
                }

                @Override
                public TransferDestination read(JsonReader in) throws IOException {
                    Object deserialized = null;
                    JsonElement jsonElement = elementAdapter.read(in);

                    JsonObject jsonObject = jsonElement.getAsJsonObject();

                    // use discriminator value for faster oneOf lookup
                    TransferDestination newTransferDestination = new TransferDestination();
                    if (jsonObject.get("destination_type") == null) {
                        log.log(Level.WARNING, "Failed to lookup discriminator value for TransferDestination as `destination_type` was not found in the payload or the payload is empty.");
                    } else  {
                        // look up the discriminator value in the field `destination_type`
                        switch (jsonObject.get("destination_type").getAsString()) {
                            case "Address":
                                deserialized = adapterAddressTransferDestination.fromJsonTree(jsonObject);
                                newTransferDestination.setActualInstance(deserialized);
                                return newTransferDestination;
                            case "ExchangeWallet":
                                deserialized = adapterExchangeTransferDestination.fromJsonTree(jsonObject);
                                newTransferDestination.setActualInstance(deserialized);
                                return newTransferDestination;
                            case "AddressTransferDestination":
                                deserialized = adapterAddressTransferDestination.fromJsonTree(jsonObject);
                                newTransferDestination.setActualInstance(deserialized);
                                return newTransferDestination;
                            case "ExchangeTransferDestination":
                                deserialized = adapterExchangeTransferDestination.fromJsonTree(jsonObject);
                                newTransferDestination.setActualInstance(deserialized);
                                return newTransferDestination;
                            default:
                                log.log(Level.WARNING, String.format("Failed to lookup discriminator value `%s` for TransferDestination. Possible values: Address ExchangeWallet AddressTransferDestination ExchangeTransferDestination", jsonObject.get("destination_type").getAsString()));
                        }
                    }

                    int match = 0;
                    ArrayList<String> errorMessages = new ArrayList<>();
                    TypeAdapter actualAdapter = elementAdapter;

                    // deserialize AddressTransferDestination
                    try {
                        // validate the JSON object to see if any exception is thrown
                        AddressTransferDestination.validateJsonElement(jsonElement);
                        actualAdapter = adapterAddressTransferDestination;
                        match++;
                        log.log(Level.FINER, "Input data matches schema 'AddressTransferDestination'");
                    } catch (Exception e) {
                        // deserialization failed, continue
                        errorMessages.add(String.format("Deserialization for AddressTransferDestination failed with `%s`.", e.getMessage()));
                        log.log(Level.FINER, "Input data does not match schema 'AddressTransferDestination'", e);
                    }
                    // deserialize ExchangeTransferDestination
                    try {
                        // validate the JSON object to see if any exception is thrown
                        ExchangeTransferDestination.validateJsonElement(jsonElement);
                        actualAdapter = adapterExchangeTransferDestination;
                        match++;
                        log.log(Level.FINER, "Input data matches schema 'ExchangeTransferDestination'");
                    } catch (Exception e) {
                        // deserialization failed, continue
                        errorMessages.add(String.format("Deserialization for ExchangeTransferDestination failed with `%s`.", e.getMessage()));
                        log.log(Level.FINER, "Input data does not match schema 'ExchangeTransferDestination'", e);
                    }

                    if (match == 1) {
                        TransferDestination ret = new TransferDestination();
                        ret.setActualInstance(actualAdapter.fromJsonTree(jsonElement));
                        return ret;
                    }

                    throw new IOException(String.format("Failed deserialization for TransferDestination: %d classes match result, expected 1. Detailed failure message for oneOf schemas: %s. JSON: %s", match, errorMessages, jsonElement.toString()));
                }
            }.nullSafe();
        }
    }

    // store a list of schema names defined in oneOf
    public static final Map<String, Class<?>> schemas = new HashMap<String, Class<?>>();

    public TransferDestination() {
        super("oneOf", Boolean.FALSE);
    }

    public TransferDestination(AddressTransferDestination o) {
        super("oneOf", Boolean.FALSE);
        setActualInstance(o);
    }

    public TransferDestination(ExchangeTransferDestination o) {
        super("oneOf", Boolean.FALSE);
        setActualInstance(o);
    }

    static {
        schemas.put("AddressTransferDestination", AddressTransferDestination.class);
        schemas.put("ExchangeTransferDestination", ExchangeTransferDestination.class);
    }

    @Override
    public Map<String, Class<?>> getSchemas() {
        return TransferDestination.schemas;
    }

    /**
     * Set the instance that matches the oneOf child schema, check
     * the instance parameter is valid against the oneOf child schemas:
     * AddressTransferDestination, ExchangeTransferDestination
     *
     * It could be an instance of the 'oneOf' schemas.
     */
    @Override
    public void setActualInstance(Object instance) {
        if (instance instanceof AddressTransferDestination) {
            super.setActualInstance(instance);
            return;
        }

        if (instance instanceof ExchangeTransferDestination) {
            super.setActualInstance(instance);
            return;
        }

        throw new RuntimeException("Invalid instance type. Must be AddressTransferDestination, ExchangeTransferDestination");
    }

    /**
     * Get the actual instance, which can be the following:
     * AddressTransferDestination, ExchangeTransferDestination
     *
     * @return The actual instance (AddressTransferDestination, ExchangeTransferDestination)
     */
    @SuppressWarnings("unchecked")
    @Override
    public Object getActualInstance() {
        return super.getActualInstance();
    }

    /**
     * Get the actual instance of `AddressTransferDestination`. If the actual instance is not `AddressTransferDestination`,
     * the ClassCastException will be thrown.
     *
     * @return The actual instance of `AddressTransferDestination`
     * @throws ClassCastException if the instance is not `AddressTransferDestination`
     */
    public AddressTransferDestination getAddressTransferDestination() throws ClassCastException {
        return (AddressTransferDestination)super.getActualInstance();
    }
    /**
     * Get the actual instance of `ExchangeTransferDestination`. If the actual instance is not `ExchangeTransferDestination`,
     * the ClassCastException will be thrown.
     *
     * @return The actual instance of `ExchangeTransferDestination`
     * @throws ClassCastException if the instance is not `ExchangeTransferDestination`
     */
    public ExchangeTransferDestination getExchangeTransferDestination() throws ClassCastException {
        return (ExchangeTransferDestination)super.getActualInstance();
    }

    /**
     * Validates the JSON Element and throws an exception if issues found
     *
     * @param jsonElement JSON Element
     * @throws IOException if the JSON Element is invalid with respect to TransferDestination
     */
    public static void validateJsonElement(JsonElement jsonElement) throws IOException {
        // validate oneOf schemas one by one
        int validCount = 0;
        ArrayList<String> errorMessages = new ArrayList<>();
        // validate the json string with AddressTransferDestination
        try {
            AddressTransferDestination.validateJsonElement(jsonElement);
            validCount++;
        } catch (Exception e) {
            errorMessages.add(String.format("Deserialization for AddressTransferDestination failed with `%s`.", e.getMessage()));
            // continue to the next one
        }
        // validate the json string with ExchangeTransferDestination
        try {
            ExchangeTransferDestination.validateJsonElement(jsonElement);
            validCount++;
        } catch (Exception e) {
            errorMessages.add(String.format("Deserialization for ExchangeTransferDestination failed with `%s`.", e.getMessage()));
            // continue to the next one
        }
        if (validCount != 1) {
            throw new IOException(String.format("The JSON string is invalid for TransferDestination with oneOf schemas: AddressTransferDestination, ExchangeTransferDestination. %d class(es) match the result, expected 1. Detailed failure message for oneOf schemas: %s. JSON: %s", validCount, errorMessages, jsonElement.toString()));
        }
    }

    /**
     * Create an instance of TransferDestination given an JSON string
     *
     * @param jsonString JSON string
     * @return An instance of TransferDestination
     * @throws IOException if the JSON string is invalid with respect to TransferDestination
     */
    public static TransferDestination fromJson(String jsonString) throws IOException {
        return JSON.getGson().fromJson(jsonString, TransferDestination.class);
    }

    /**
     * Convert an instance of TransferDestination to an JSON string
     *
     * @return JSON string
     */
    public String toJson() {
        return JSON.getGson().toJson(this);
    }
}

