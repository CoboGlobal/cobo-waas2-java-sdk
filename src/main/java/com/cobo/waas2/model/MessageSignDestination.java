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
import com.cobo.waas2.model.EvmEIP191MessageSignDestination;
import com.cobo.waas2.model.EvmEIP712MessageSignDestination;
import com.cobo.waas2.model.MessageSignDestinationType;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import java.io.IOException;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;



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
public class MessageSignDestination extends AbstractOpenApiSchema {
    private static final Logger log = Logger.getLogger(MessageSignDestination.class.getName());

    public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
        @SuppressWarnings("unchecked")
        @Override
        public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
            if (!MessageSignDestination.class.isAssignableFrom(type.getRawType())) {
                return null; // this class only serializes 'MessageSignDestination' and its subtypes
            }
            final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
            final TypeAdapter<EvmEIP191MessageSignDestination> adapterEvmEIP191MessageSignDestination = gson.getDelegateAdapter(this, TypeToken.get(EvmEIP191MessageSignDestination.class));
            final TypeAdapter<EvmEIP712MessageSignDestination> adapterEvmEIP712MessageSignDestination = gson.getDelegateAdapter(this, TypeToken.get(EvmEIP712MessageSignDestination.class));

            return (TypeAdapter<T>) new TypeAdapter<MessageSignDestination>() {
                @Override
                public void write(JsonWriter out, MessageSignDestination value) throws IOException {
                    if (value == null || value.getActualInstance() == null) {
                        elementAdapter.write(out, null);
                        return;
                    }

                    // check if the actual instance is of the type `EvmEIP191MessageSignDestination`
                    if (value.getActualInstance() instanceof EvmEIP191MessageSignDestination) {
                        JsonElement element = adapterEvmEIP191MessageSignDestination.toJsonTree((EvmEIP191MessageSignDestination)value.getActualInstance());
                        elementAdapter.write(out, element);
                        return;
                    }
                    // check if the actual instance is of the type `EvmEIP712MessageSignDestination`
                    if (value.getActualInstance() instanceof EvmEIP712MessageSignDestination) {
                        JsonElement element = adapterEvmEIP712MessageSignDestination.toJsonTree((EvmEIP712MessageSignDestination)value.getActualInstance());
                        elementAdapter.write(out, element);
                        return;
                    }
                    throw new IOException("Failed to serialize as the type doesn't match oneOf schemas: EvmEIP191MessageSignDestination, EvmEIP712MessageSignDestination");
                }

                @Override
                public MessageSignDestination read(JsonReader in) throws IOException {
                    Object deserialized = null;
                    JsonElement jsonElement = elementAdapter.read(in);

                    JsonObject jsonObject = jsonElement.getAsJsonObject();

                    // use discriminator value for faster oneOf lookup
                    MessageSignDestination newMessageSignDestination = new MessageSignDestination();
                    if (jsonObject.get("destination_type") == null) {
                        log.log(Level.WARNING, "Failed to lookup discriminator value for MessageSignDestination as `destination_type` was not found in the payload or the payload is empty.");
                    } else  {
                        // look up the discriminator value in the field `destination_type`
                        switch (jsonObject.get("destination_type").getAsString()) {
                            case "EVM_EIP_191":
                                deserialized = adapterEvmEIP191MessageSignDestination.fromJsonTree(jsonObject);
                                newMessageSignDestination.setActualInstance(deserialized);
                                return newMessageSignDestination;
                            case "EVM_EIP_712":
                                deserialized = adapterEvmEIP712MessageSignDestination.fromJsonTree(jsonObject);
                                newMessageSignDestination.setActualInstance(deserialized);
                                return newMessageSignDestination;
                            case "EvmEIP191MessageSignDestination":
                                deserialized = adapterEvmEIP191MessageSignDestination.fromJsonTree(jsonObject);
                                newMessageSignDestination.setActualInstance(deserialized);
                                return newMessageSignDestination;
                            case "EvmEIP712MessageSignDestination":
                                deserialized = adapterEvmEIP712MessageSignDestination.fromJsonTree(jsonObject);
                                newMessageSignDestination.setActualInstance(deserialized);
                                return newMessageSignDestination;
                            default:
                                log.log(Level.WARNING, String.format("Failed to lookup discriminator value `%s` for MessageSignDestination. Possible values: EVM_EIP_191 EVM_EIP_712 EvmEIP191MessageSignDestination EvmEIP712MessageSignDestination", jsonObject.get("destination_type").getAsString()));
                        }
                    }

                    int match = 0;
                    ArrayList<String> errorMessages = new ArrayList<>();
                    TypeAdapter actualAdapter = elementAdapter;

                    // deserialize EvmEIP191MessageSignDestination
                    try {
                        // validate the JSON object to see if any exception is thrown
                        EvmEIP191MessageSignDestination.validateJsonElement(jsonElement);
                        actualAdapter = adapterEvmEIP191MessageSignDestination;
                        match++;
                        log.log(Level.FINER, "Input data matches schema 'EvmEIP191MessageSignDestination'");
                    } catch (Exception e) {
                        // deserialization failed, continue
                        errorMessages.add(String.format("Deserialization for EvmEIP191MessageSignDestination failed with `%s`.", e.getMessage()));
                        log.log(Level.FINER, "Input data does not match schema 'EvmEIP191MessageSignDestination'", e);
                    }
                    // deserialize EvmEIP712MessageSignDestination
                    try {
                        // validate the JSON object to see if any exception is thrown
                        EvmEIP712MessageSignDestination.validateJsonElement(jsonElement);
                        actualAdapter = adapterEvmEIP712MessageSignDestination;
                        match++;
                        log.log(Level.FINER, "Input data matches schema 'EvmEIP712MessageSignDestination'");
                    } catch (Exception e) {
                        // deserialization failed, continue
                        errorMessages.add(String.format("Deserialization for EvmEIP712MessageSignDestination failed with `%s`.", e.getMessage()));
                        log.log(Level.FINER, "Input data does not match schema 'EvmEIP712MessageSignDestination'", e);
                    }

                    if (match == 1) {
                        MessageSignDestination ret = new MessageSignDestination();
                        ret.setActualInstance(actualAdapter.fromJsonTree(jsonElement));
                        return ret;
                    }

                    throw new IOException(String.format("Failed deserialization for MessageSignDestination: %d classes match result, expected 1. Detailed failure message for oneOf schemas: %s. JSON: %s", match, errorMessages, jsonElement.toString()));
                }
            }.nullSafe();
        }
    }

    // store a list of schema names defined in oneOf
    public static final Map<String, Class<?>> schemas = new HashMap<String, Class<?>>();

    public MessageSignDestination() {
        super("oneOf", Boolean.FALSE);
    }

    public MessageSignDestination(EvmEIP191MessageSignDestination o) {
        super("oneOf", Boolean.FALSE);
        setActualInstance(o);
    }

    public MessageSignDestination(EvmEIP712MessageSignDestination o) {
        super("oneOf", Boolean.FALSE);
        setActualInstance(o);
    }

    static {
        schemas.put("EvmEIP191MessageSignDestination", EvmEIP191MessageSignDestination.class);
        schemas.put("EvmEIP712MessageSignDestination", EvmEIP712MessageSignDestination.class);
    }

    @Override
    public Map<String, Class<?>> getSchemas() {
        return MessageSignDestination.schemas;
    }

    /**
     * Set the instance that matches the oneOf child schema, check
     * the instance parameter is valid against the oneOf child schemas:
     * EvmEIP191MessageSignDestination, EvmEIP712MessageSignDestination
     *
     * It could be an instance of the 'oneOf' schemas.
     */
    @Override
    public void setActualInstance(Object instance) {
        if (instance instanceof EvmEIP191MessageSignDestination) {
            super.setActualInstance(instance);
            return;
        }

        if (instance instanceof EvmEIP712MessageSignDestination) {
            super.setActualInstance(instance);
            return;
        }

        throw new RuntimeException("Invalid instance type. Must be EvmEIP191MessageSignDestination, EvmEIP712MessageSignDestination");
    }

    /**
     * Get the actual instance, which can be the following:
     * EvmEIP191MessageSignDestination, EvmEIP712MessageSignDestination
     *
     * @return The actual instance (EvmEIP191MessageSignDestination, EvmEIP712MessageSignDestination)
     */
    @SuppressWarnings("unchecked")
    @Override
    public Object getActualInstance() {
        return super.getActualInstance();
    }

    /**
     * Get the actual instance of `EvmEIP191MessageSignDestination`. If the actual instance is not `EvmEIP191MessageSignDestination`,
     * the ClassCastException will be thrown.
     *
     * @return The actual instance of `EvmEIP191MessageSignDestination`
     * @throws ClassCastException if the instance is not `EvmEIP191MessageSignDestination`
     */
    public EvmEIP191MessageSignDestination getEvmEIP191MessageSignDestination() throws ClassCastException {
        return (EvmEIP191MessageSignDestination)super.getActualInstance();
    }
    /**
     * Get the actual instance of `EvmEIP712MessageSignDestination`. If the actual instance is not `EvmEIP712MessageSignDestination`,
     * the ClassCastException will be thrown.
     *
     * @return The actual instance of `EvmEIP712MessageSignDestination`
     * @throws ClassCastException if the instance is not `EvmEIP712MessageSignDestination`
     */
    public EvmEIP712MessageSignDestination getEvmEIP712MessageSignDestination() throws ClassCastException {
        return (EvmEIP712MessageSignDestination)super.getActualInstance();
    }

    /**
     * Validates the JSON Element and throws an exception if issues found
     *
     * @param jsonElement JSON Element
     * @throws IOException if the JSON Element is invalid with respect to MessageSignDestination
     */
    public static void validateJsonElement(JsonElement jsonElement) throws IOException {
        // validate oneOf schemas one by one
        int validCount = 0;
        ArrayList<String> errorMessages = new ArrayList<>();
        // validate the json string with EvmEIP191MessageSignDestination
        try {
            EvmEIP191MessageSignDestination.validateJsonElement(jsonElement);
            validCount++;
        } catch (Exception e) {
            errorMessages.add(String.format("Deserialization for EvmEIP191MessageSignDestination failed with `%s`.", e.getMessage()));
            // continue to the next one
        }
        // validate the json string with EvmEIP712MessageSignDestination
        try {
            EvmEIP712MessageSignDestination.validateJsonElement(jsonElement);
            validCount++;
        } catch (Exception e) {
            errorMessages.add(String.format("Deserialization for EvmEIP712MessageSignDestination failed with `%s`.", e.getMessage()));
            // continue to the next one
        }
        if (validCount != 1) {
            // throw new IOException(String.format("The JSON string is invalid for MessageSignDestination with oneOf schemas: EvmEIP191MessageSignDestination, EvmEIP712MessageSignDestination. %d class(es) match the result, expected 1. Detailed failure message for oneOf schemas: %s. JSON: %s", validCount, errorMessages, jsonElement.toString()));
        }
    }

    /**
     * Create an instance of MessageSignDestination given an JSON string
     *
     * @param jsonString JSON string
     * @return An instance of MessageSignDestination
     * @throws IOException if the JSON string is invalid with respect to MessageSignDestination
     */
    public static MessageSignDestination fromJson(String jsonString) throws IOException {
        return JSON.getGson().fromJson(jsonString, MessageSignDestination.class);
    }

    /**
     * Convert an instance of MessageSignDestination to an JSON string
     *
     * @return JSON string
     */
    public String toJson() {
        return JSON.getGson().toJson(this);
    }
}

