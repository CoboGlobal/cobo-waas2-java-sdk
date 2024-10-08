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
import com.cobo.waas2.model.CreateCustodialWalletParams;
import com.cobo.waas2.model.CreateExchangeWalletParams;
import com.cobo.waas2.model.CreateMpcWalletParams;
import com.cobo.waas2.model.ExchangeId;
import com.cobo.waas2.model.WalletSubtype;
import com.cobo.waas2.model.WalletType;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import java.io.IOException;
import java.util.Arrays;



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
public class CreateWalletParams extends AbstractOpenApiSchema {
    private static final Logger log = Logger.getLogger(CreateWalletParams.class.getName());

    public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
        @SuppressWarnings("unchecked")
        @Override
        public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
            if (!CreateWalletParams.class.isAssignableFrom(type.getRawType())) {
                return null; // this class only serializes 'CreateWalletParams' and its subtypes
            }
            final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
            final TypeAdapter<CreateCustodialWalletParams> adapterCreateCustodialWalletParams = gson.getDelegateAdapter(this, TypeToken.get(CreateCustodialWalletParams.class));
            final TypeAdapter<CreateMpcWalletParams> adapterCreateMpcWalletParams = gson.getDelegateAdapter(this, TypeToken.get(CreateMpcWalletParams.class));
            final TypeAdapter<CreateExchangeWalletParams> adapterCreateExchangeWalletParams = gson.getDelegateAdapter(this, TypeToken.get(CreateExchangeWalletParams.class));

            return (TypeAdapter<T>) new TypeAdapter<CreateWalletParams>() {
                @Override
                public void write(JsonWriter out, CreateWalletParams value) throws IOException {
                    if (value == null || value.getActualInstance() == null) {
                        elementAdapter.write(out, null);
                        return;
                    }

                    // check if the actual instance is of the type `CreateCustodialWalletParams`
                    if (value.getActualInstance() instanceof CreateCustodialWalletParams) {
                        JsonElement element = adapterCreateCustodialWalletParams.toJsonTree((CreateCustodialWalletParams)value.getActualInstance());
                        elementAdapter.write(out, element);
                        return;
                    }
                    // check if the actual instance is of the type `CreateMpcWalletParams`
                    if (value.getActualInstance() instanceof CreateMpcWalletParams) {
                        JsonElement element = adapterCreateMpcWalletParams.toJsonTree((CreateMpcWalletParams)value.getActualInstance());
                        elementAdapter.write(out, element);
                        return;
                    }
                    // check if the actual instance is of the type `CreateExchangeWalletParams`
                    if (value.getActualInstance() instanceof CreateExchangeWalletParams) {
                        JsonElement element = adapterCreateExchangeWalletParams.toJsonTree((CreateExchangeWalletParams)value.getActualInstance());
                        elementAdapter.write(out, element);
                        return;
                    }
                    throw new IOException("Failed to serialize as the type doesn't match oneOf schemas: CreateCustodialWalletParams, CreateExchangeWalletParams, CreateMpcWalletParams");
                }

                @Override
                public CreateWalletParams read(JsonReader in) throws IOException {
                    Object deserialized = null;
                    JsonElement jsonElement = elementAdapter.read(in);

                    JsonObject jsonObject = jsonElement.getAsJsonObject();

                    // use discriminator value for faster oneOf lookup
                    CreateWalletParams newCreateWalletParams = new CreateWalletParams();
                    if (jsonObject.get("wallet_type") == null) {
                        log.log(Level.WARNING, "Failed to lookup discriminator value for CreateWalletParams as `wallet_type` was not found in the payload or the payload is empty.");
                    } else  {
                        // look up the discriminator value in the field `wallet_type`
                        switch (jsonObject.get("wallet_type").getAsString()) {
                            case "Custodial":
                                deserialized = adapterCreateCustodialWalletParams.fromJsonTree(jsonObject);
                                newCreateWalletParams.setActualInstance(deserialized);
                                return newCreateWalletParams;
                            case "Exchange":
                                deserialized = adapterCreateExchangeWalletParams.fromJsonTree(jsonObject);
                                newCreateWalletParams.setActualInstance(deserialized);
                                return newCreateWalletParams;
                            case "MPC":
                                deserialized = adapterCreateMpcWalletParams.fromJsonTree(jsonObject);
                                newCreateWalletParams.setActualInstance(deserialized);
                                return newCreateWalletParams;
                            case "CreateCustodialWalletParams":
                                deserialized = adapterCreateCustodialWalletParams.fromJsonTree(jsonObject);
                                newCreateWalletParams.setActualInstance(deserialized);
                                return newCreateWalletParams;
                            case "CreateExchangeWalletParams":
                                deserialized = adapterCreateExchangeWalletParams.fromJsonTree(jsonObject);
                                newCreateWalletParams.setActualInstance(deserialized);
                                return newCreateWalletParams;
                            case "CreateMpcWalletParams":
                                deserialized = adapterCreateMpcWalletParams.fromJsonTree(jsonObject);
                                newCreateWalletParams.setActualInstance(deserialized);
                                return newCreateWalletParams;
                            default:
                                log.log(Level.WARNING, String.format("Failed to lookup discriminator value `%s` for CreateWalletParams. Possible values: Custodial Exchange MPC CreateCustodialWalletParams CreateExchangeWalletParams CreateMpcWalletParams", jsonObject.get("wallet_type").getAsString()));
                        }
                    }

                    int match = 0;
                    ArrayList<String> errorMessages = new ArrayList<>();
                    TypeAdapter actualAdapter = elementAdapter;

                    // deserialize CreateCustodialWalletParams
                    try {
                        // validate the JSON object to see if any exception is thrown
                        CreateCustodialWalletParams.validateJsonElement(jsonElement);
                        actualAdapter = adapterCreateCustodialWalletParams;
                        match++;
                        log.log(Level.FINER, "Input data matches schema 'CreateCustodialWalletParams'");
                    } catch (Exception e) {
                        // deserialization failed, continue
                        errorMessages.add(String.format("Deserialization for CreateCustodialWalletParams failed with `%s`.", e.getMessage()));
                        log.log(Level.FINER, "Input data does not match schema 'CreateCustodialWalletParams'", e);
                    }
                    // deserialize CreateMpcWalletParams
                    try {
                        // validate the JSON object to see if any exception is thrown
                        CreateMpcWalletParams.validateJsonElement(jsonElement);
                        actualAdapter = adapterCreateMpcWalletParams;
                        match++;
                        log.log(Level.FINER, "Input data matches schema 'CreateMpcWalletParams'");
                    } catch (Exception e) {
                        // deserialization failed, continue
                        errorMessages.add(String.format("Deserialization for CreateMpcWalletParams failed with `%s`.", e.getMessage()));
                        log.log(Level.FINER, "Input data does not match schema 'CreateMpcWalletParams'", e);
                    }
                    // deserialize CreateExchangeWalletParams
                    try {
                        // validate the JSON object to see if any exception is thrown
                        CreateExchangeWalletParams.validateJsonElement(jsonElement);
                        actualAdapter = adapterCreateExchangeWalletParams;
                        match++;
                        log.log(Level.FINER, "Input data matches schema 'CreateExchangeWalletParams'");
                    } catch (Exception e) {
                        // deserialization failed, continue
                        errorMessages.add(String.format("Deserialization for CreateExchangeWalletParams failed with `%s`.", e.getMessage()));
                        log.log(Level.FINER, "Input data does not match schema 'CreateExchangeWalletParams'", e);
                    }

                    if (match == 1) {
                        CreateWalletParams ret = new CreateWalletParams();
                        ret.setActualInstance(actualAdapter.fromJsonTree(jsonElement));
                        return ret;
                    }

                    throw new IOException(String.format("Failed deserialization for CreateWalletParams: %d classes match result, expected 1. Detailed failure message for oneOf schemas: %s. JSON: %s", match, errorMessages, jsonElement.toString()));
                }
            }.nullSafe();
        }
    }

    // store a list of schema names defined in oneOf
    public static final Map<String, Class<?>> schemas = new HashMap<String, Class<?>>();

    public CreateWalletParams() {
        super("oneOf", Boolean.FALSE);
    }

    public CreateWalletParams(CreateCustodialWalletParams o) {
        super("oneOf", Boolean.FALSE);
        setActualInstance(o);
    }

    public CreateWalletParams(CreateExchangeWalletParams o) {
        super("oneOf", Boolean.FALSE);
        setActualInstance(o);
    }

    public CreateWalletParams(CreateMpcWalletParams o) {
        super("oneOf", Boolean.FALSE);
        setActualInstance(o);
    }

    static {
        schemas.put("CreateCustodialWalletParams", CreateCustodialWalletParams.class);
        schemas.put("CreateMpcWalletParams", CreateMpcWalletParams.class);
        schemas.put("CreateExchangeWalletParams", CreateExchangeWalletParams.class);
    }

    @Override
    public Map<String, Class<?>> getSchemas() {
        return CreateWalletParams.schemas;
    }

    /**
     * Set the instance that matches the oneOf child schema, check
     * the instance parameter is valid against the oneOf child schemas:
     * CreateCustodialWalletParams, CreateExchangeWalletParams, CreateMpcWalletParams
     *
     * It could be an instance of the 'oneOf' schemas.
     */
    @Override
    public void setActualInstance(Object instance) {
        if (instance instanceof CreateCustodialWalletParams) {
            super.setActualInstance(instance);
            return;
        }

        if (instance instanceof CreateMpcWalletParams) {
            super.setActualInstance(instance);
            return;
        }

        if (instance instanceof CreateExchangeWalletParams) {
            super.setActualInstance(instance);
            return;
        }

        throw new RuntimeException("Invalid instance type. Must be CreateCustodialWalletParams, CreateExchangeWalletParams, CreateMpcWalletParams");
    }

    /**
     * Get the actual instance, which can be the following:
     * CreateCustodialWalletParams, CreateExchangeWalletParams, CreateMpcWalletParams
     *
     * @return The actual instance (CreateCustodialWalletParams, CreateExchangeWalletParams, CreateMpcWalletParams)
     */
    @SuppressWarnings("unchecked")
    @Override
    public Object getActualInstance() {
        return super.getActualInstance();
    }

    /**
     * Get the actual instance of `CreateCustodialWalletParams`. If the actual instance is not `CreateCustodialWalletParams`,
     * the ClassCastException will be thrown.
     *
     * @return The actual instance of `CreateCustodialWalletParams`
     * @throws ClassCastException if the instance is not `CreateCustodialWalletParams`
     */
    public CreateCustodialWalletParams getCreateCustodialWalletParams() throws ClassCastException {
        return (CreateCustodialWalletParams)super.getActualInstance();
    }
    /**
     * Get the actual instance of `CreateMpcWalletParams`. If the actual instance is not `CreateMpcWalletParams`,
     * the ClassCastException will be thrown.
     *
     * @return The actual instance of `CreateMpcWalletParams`
     * @throws ClassCastException if the instance is not `CreateMpcWalletParams`
     */
    public CreateMpcWalletParams getCreateMpcWalletParams() throws ClassCastException {
        return (CreateMpcWalletParams)super.getActualInstance();
    }
    /**
     * Get the actual instance of `CreateExchangeWalletParams`. If the actual instance is not `CreateExchangeWalletParams`,
     * the ClassCastException will be thrown.
     *
     * @return The actual instance of `CreateExchangeWalletParams`
     * @throws ClassCastException if the instance is not `CreateExchangeWalletParams`
     */
    public CreateExchangeWalletParams getCreateExchangeWalletParams() throws ClassCastException {
        return (CreateExchangeWalletParams)super.getActualInstance();
    }

    /**
     * Validates the JSON Element and throws an exception if issues found
     *
     * @param jsonElement JSON Element
     * @throws IOException if the JSON Element is invalid with respect to CreateWalletParams
     */
    public static void validateJsonElement(JsonElement jsonElement) throws IOException {
        // validate oneOf schemas one by one
        int validCount = 0;
        ArrayList<String> errorMessages = new ArrayList<>();
        // validate the json string with CreateCustodialWalletParams
        try {
            CreateCustodialWalletParams.validateJsonElement(jsonElement);
            validCount++;
        } catch (Exception e) {
            errorMessages.add(String.format("Deserialization for CreateCustodialWalletParams failed with `%s`.", e.getMessage()));
            // continue to the next one
        }
        // validate the json string with CreateMpcWalletParams
        try {
            CreateMpcWalletParams.validateJsonElement(jsonElement);
            validCount++;
        } catch (Exception e) {
            errorMessages.add(String.format("Deserialization for CreateMpcWalletParams failed with `%s`.", e.getMessage()));
            // continue to the next one
        }
        // validate the json string with CreateExchangeWalletParams
        try {
            CreateExchangeWalletParams.validateJsonElement(jsonElement);
            validCount++;
        } catch (Exception e) {
            errorMessages.add(String.format("Deserialization for CreateExchangeWalletParams failed with `%s`.", e.getMessage()));
            // continue to the next one
        }
        if (validCount != 1) {
            // throw new IOException(String.format("The JSON string is invalid for CreateWalletParams with oneOf schemas: CreateCustodialWalletParams, CreateExchangeWalletParams, CreateMpcWalletParams. %d class(es) match the result, expected 1. Detailed failure message for oneOf schemas: %s. JSON: %s", validCount, errorMessages, jsonElement.toString()));
        }
    }

    /**
     * Create an instance of CreateWalletParams given an JSON string
     *
     * @param jsonString JSON string
     * @return An instance of CreateWalletParams
     * @throws IOException if the JSON string is invalid with respect to CreateWalletParams
     */
    public static CreateWalletParams fromJson(String jsonString) throws IOException {
        return JSON.getGson().fromJson(jsonString, CreateWalletParams.class);
    }

    /**
     * Convert an instance of CreateWalletParams to an JSON string
     *
     * @return JSON string
     */
    public String toJson() {
        return JSON.getGson().toJson(this);
    }
}

