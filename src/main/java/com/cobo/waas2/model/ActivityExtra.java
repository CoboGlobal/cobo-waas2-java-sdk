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
import com.cobo.waas2.model.BabylonStakingActivityDetailExtra;
import com.cobo.waas2.model.CoreStakingActivityDetailExtra;
import com.cobo.waas2.model.EthStakingActivityDetailExtra;
import com.cobo.waas2.model.StakingPoolType;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;



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
public class ActivityExtra extends AbstractOpenApiSchema {
    private static final Logger log = Logger.getLogger(ActivityExtra.class.getName());

    public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
        @SuppressWarnings("unchecked")
        @Override
        public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
            if (!ActivityExtra.class.isAssignableFrom(type.getRawType())) {
                return null; // this class only serializes 'ActivityExtra' and its subtypes
            }
            final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
            final TypeAdapter<BabylonStakingActivityDetailExtra> adapterBabylonStakingActivityDetailExtra = gson.getDelegateAdapter(this, TypeToken.get(BabylonStakingActivityDetailExtra.class));
            final TypeAdapter<EthStakingActivityDetailExtra> adapterEthStakingActivityDetailExtra = gson.getDelegateAdapter(this, TypeToken.get(EthStakingActivityDetailExtra.class));
            final TypeAdapter<CoreStakingActivityDetailExtra> adapterCoreStakingActivityDetailExtra = gson.getDelegateAdapter(this, TypeToken.get(CoreStakingActivityDetailExtra.class));

            return (TypeAdapter<T>) new TypeAdapter<ActivityExtra>() {
                @Override
                public void write(JsonWriter out, ActivityExtra value) throws IOException {
                    if (value == null || value.getActualInstance() == null) {
                        elementAdapter.write(out, null);
                        return;
                    }

                    // check if the actual instance is of the type `BabylonStakingActivityDetailExtra`
                    if (value.getActualInstance() instanceof BabylonStakingActivityDetailExtra) {
                        JsonElement element = adapterBabylonStakingActivityDetailExtra.toJsonTree((BabylonStakingActivityDetailExtra)value.getActualInstance());
                        elementAdapter.write(out, element);
                        return;
                    }
                    // check if the actual instance is of the type `EthStakingActivityDetailExtra`
                    if (value.getActualInstance() instanceof EthStakingActivityDetailExtra) {
                        JsonElement element = adapterEthStakingActivityDetailExtra.toJsonTree((EthStakingActivityDetailExtra)value.getActualInstance());
                        elementAdapter.write(out, element);
                        return;
                    }
                    // check if the actual instance is of the type `CoreStakingActivityDetailExtra`
                    if (value.getActualInstance() instanceof CoreStakingActivityDetailExtra) {
                        JsonElement element = adapterCoreStakingActivityDetailExtra.toJsonTree((CoreStakingActivityDetailExtra)value.getActualInstance());
                        elementAdapter.write(out, element);
                        return;
                    }
                    throw new IOException("Failed to serialize as the type doesn't match oneOf schemas: BabylonStakingActivityDetailExtra, CoreStakingActivityDetailExtra, EthStakingActivityDetailExtra");
                }

                @Override
                public ActivityExtra read(JsonReader in) throws IOException {
                    Object deserialized = null;
                    JsonElement jsonElement = elementAdapter.read(in);

                    JsonObject jsonObject = jsonElement.getAsJsonObject();

                    // use discriminator value for faster oneOf lookup
                    ActivityExtra newActivityExtra = new ActivityExtra();
                    if (jsonObject.get("pool_type") == null) {
                        log.log(Level.WARNING, "Failed to lookup discriminator value for ActivityExtra as `pool_type` was not found in the payload or the payload is empty.");
                    } else  {
                        // look up the discriminator value in the field `pool_type`
                        switch (jsonObject.get("pool_type").getAsString()) {
                            case "Babylon":
                                deserialized = adapterBabylonStakingActivityDetailExtra.fromJsonTree(jsonObject);
                                newActivityExtra.setActualInstance(deserialized);
                                return newActivityExtra;
                            case "CoreBTC":
                                deserialized = adapterCoreStakingActivityDetailExtra.fromJsonTree(jsonObject);
                                newActivityExtra.setActualInstance(deserialized);
                                return newActivityExtra;
                            case "ETHBeacon":
                                deserialized = adapterEthStakingActivityDetailExtra.fromJsonTree(jsonObject);
                                newActivityExtra.setActualInstance(deserialized);
                                return newActivityExtra;
                            case "BabylonStakingActivityDetailExtra":
                                deserialized = adapterBabylonStakingActivityDetailExtra.fromJsonTree(jsonObject);
                                newActivityExtra.setActualInstance(deserialized);
                                return newActivityExtra;
                            case "CoreStakingActivityDetailExtra":
                                deserialized = adapterCoreStakingActivityDetailExtra.fromJsonTree(jsonObject);
                                newActivityExtra.setActualInstance(deserialized);
                                return newActivityExtra;
                            case "EthStakingActivityDetailExtra":
                                deserialized = adapterEthStakingActivityDetailExtra.fromJsonTree(jsonObject);
                                newActivityExtra.setActualInstance(deserialized);
                                return newActivityExtra;
                            default:
                                log.log(Level.WARNING, String.format("Failed to lookup discriminator value `%s` for ActivityExtra. Possible values: Babylon CoreBTC ETHBeacon BabylonStakingActivityDetailExtra CoreStakingActivityDetailExtra EthStakingActivityDetailExtra", jsonObject.get("pool_type").getAsString()));
                        }
                    }

                    int match = 0;
                    ArrayList<String> errorMessages = new ArrayList<>();
                    TypeAdapter actualAdapter = elementAdapter;

                    // deserialize BabylonStakingActivityDetailExtra
                    try {
                        // validate the JSON object to see if any exception is thrown
                        BabylonStakingActivityDetailExtra.validateJsonElement(jsonElement);
                        actualAdapter = adapterBabylonStakingActivityDetailExtra;
                        match++;
                        log.log(Level.FINER, "Input data matches schema 'BabylonStakingActivityDetailExtra'");
                    } catch (Exception e) {
                        // deserialization failed, continue
                        errorMessages.add(String.format("Deserialization for BabylonStakingActivityDetailExtra failed with `%s`.", e.getMessage()));
                        log.log(Level.FINER, "Input data does not match schema 'BabylonStakingActivityDetailExtra'", e);
                    }
                    // deserialize EthStakingActivityDetailExtra
                    try {
                        // validate the JSON object to see if any exception is thrown
                        EthStakingActivityDetailExtra.validateJsonElement(jsonElement);
                        actualAdapter = adapterEthStakingActivityDetailExtra;
                        match++;
                        log.log(Level.FINER, "Input data matches schema 'EthStakingActivityDetailExtra'");
                    } catch (Exception e) {
                        // deserialization failed, continue
                        errorMessages.add(String.format("Deserialization for EthStakingActivityDetailExtra failed with `%s`.", e.getMessage()));
                        log.log(Level.FINER, "Input data does not match schema 'EthStakingActivityDetailExtra'", e);
                    }
                    // deserialize CoreStakingActivityDetailExtra
                    try {
                        // validate the JSON object to see if any exception is thrown
                        CoreStakingActivityDetailExtra.validateJsonElement(jsonElement);
                        actualAdapter = adapterCoreStakingActivityDetailExtra;
                        match++;
                        log.log(Level.FINER, "Input data matches schema 'CoreStakingActivityDetailExtra'");
                    } catch (Exception e) {
                        // deserialization failed, continue
                        errorMessages.add(String.format("Deserialization for CoreStakingActivityDetailExtra failed with `%s`.", e.getMessage()));
                        log.log(Level.FINER, "Input data does not match schema 'CoreStakingActivityDetailExtra'", e);
                    }

                    if (match == 1) {
                        ActivityExtra ret = new ActivityExtra();
                        ret.setActualInstance(actualAdapter.fromJsonTree(jsonElement));
                        return ret;
                    }

                    throw new IOException(String.format("Failed deserialization for ActivityExtra: %d classes match result, expected 1. Detailed failure message for oneOf schemas: %s. JSON: %s", match, errorMessages, jsonElement.toString()));
                }
            }.nullSafe();
        }
    }

    // store a list of schema names defined in oneOf
    public static final Map<String, Class<?>> schemas = new HashMap<String, Class<?>>();

    public ActivityExtra() {
        super("oneOf", Boolean.FALSE);
    }

    public ActivityExtra(BabylonStakingActivityDetailExtra o) {
        super("oneOf", Boolean.FALSE);
        setActualInstance(o);
    }

    public ActivityExtra(CoreStakingActivityDetailExtra o) {
        super("oneOf", Boolean.FALSE);
        setActualInstance(o);
    }

    public ActivityExtra(EthStakingActivityDetailExtra o) {
        super("oneOf", Boolean.FALSE);
        setActualInstance(o);
    }

    static {
        schemas.put("BabylonStakingActivityDetailExtra", BabylonStakingActivityDetailExtra.class);
        schemas.put("EthStakingActivityDetailExtra", EthStakingActivityDetailExtra.class);
        schemas.put("CoreStakingActivityDetailExtra", CoreStakingActivityDetailExtra.class);
    }

    @Override
    public Map<String, Class<?>> getSchemas() {
        return ActivityExtra.schemas;
    }

    /**
     * Set the instance that matches the oneOf child schema, check
     * the instance parameter is valid against the oneOf child schemas:
     * BabylonStakingActivityDetailExtra, CoreStakingActivityDetailExtra, EthStakingActivityDetailExtra
     *
     * It could be an instance of the 'oneOf' schemas.
     */
    @Override
    public void setActualInstance(Object instance) {
        if (instance instanceof BabylonStakingActivityDetailExtra) {
            super.setActualInstance(instance);
            return;
        }

        if (instance instanceof EthStakingActivityDetailExtra) {
            super.setActualInstance(instance);
            return;
        }

        if (instance instanceof CoreStakingActivityDetailExtra) {
            super.setActualInstance(instance);
            return;
        }

        throw new RuntimeException("Invalid instance type. Must be BabylonStakingActivityDetailExtra, CoreStakingActivityDetailExtra, EthStakingActivityDetailExtra");
    }

    /**
     * Get the actual instance, which can be the following:
     * BabylonStakingActivityDetailExtra, CoreStakingActivityDetailExtra, EthStakingActivityDetailExtra
     *
     * @return The actual instance (BabylonStakingActivityDetailExtra, CoreStakingActivityDetailExtra, EthStakingActivityDetailExtra)
     */
    @SuppressWarnings("unchecked")
    @Override
    public Object getActualInstance() {
        return super.getActualInstance();
    }

    /**
     * Get the actual instance of `BabylonStakingActivityDetailExtra`. If the actual instance is not `BabylonStakingActivityDetailExtra`,
     * the ClassCastException will be thrown.
     *
     * @return The actual instance of `BabylonStakingActivityDetailExtra`
     * @throws ClassCastException if the instance is not `BabylonStakingActivityDetailExtra`
     */
    public BabylonStakingActivityDetailExtra getBabylonStakingActivityDetailExtra() throws ClassCastException {
        return (BabylonStakingActivityDetailExtra)super.getActualInstance();
    }
    /**
     * Get the actual instance of `EthStakingActivityDetailExtra`. If the actual instance is not `EthStakingActivityDetailExtra`,
     * the ClassCastException will be thrown.
     *
     * @return The actual instance of `EthStakingActivityDetailExtra`
     * @throws ClassCastException if the instance is not `EthStakingActivityDetailExtra`
     */
    public EthStakingActivityDetailExtra getEthStakingActivityDetailExtra() throws ClassCastException {
        return (EthStakingActivityDetailExtra)super.getActualInstance();
    }
    /**
     * Get the actual instance of `CoreStakingActivityDetailExtra`. If the actual instance is not `CoreStakingActivityDetailExtra`,
     * the ClassCastException will be thrown.
     *
     * @return The actual instance of `CoreStakingActivityDetailExtra`
     * @throws ClassCastException if the instance is not `CoreStakingActivityDetailExtra`
     */
    public CoreStakingActivityDetailExtra getCoreStakingActivityDetailExtra() throws ClassCastException {
        return (CoreStakingActivityDetailExtra)super.getActualInstance();
    }

    /**
     * Validates the JSON Element and throws an exception if issues found
     *
     * @param jsonElement JSON Element
     * @throws IOException if the JSON Element is invalid with respect to ActivityExtra
     */
    public static void validateJsonElement(JsonElement jsonElement) throws IOException {
        // validate oneOf schemas one by one
        int validCount = 0;
        ArrayList<String> errorMessages = new ArrayList<>();
        // validate the json string with BabylonStakingActivityDetailExtra
        try {
            BabylonStakingActivityDetailExtra.validateJsonElement(jsonElement);
            validCount++;
        } catch (Exception e) {
            errorMessages.add(String.format("Deserialization for BabylonStakingActivityDetailExtra failed with `%s`.", e.getMessage()));
            // continue to the next one
        }
        // validate the json string with EthStakingActivityDetailExtra
        try {
            EthStakingActivityDetailExtra.validateJsonElement(jsonElement);
            validCount++;
        } catch (Exception e) {
            errorMessages.add(String.format("Deserialization for EthStakingActivityDetailExtra failed with `%s`.", e.getMessage()));
            // continue to the next one
        }
        // validate the json string with CoreStakingActivityDetailExtra
        try {
            CoreStakingActivityDetailExtra.validateJsonElement(jsonElement);
            validCount++;
        } catch (Exception e) {
            errorMessages.add(String.format("Deserialization for CoreStakingActivityDetailExtra failed with `%s`.", e.getMessage()));
            // continue to the next one
        }
        if (validCount != 1) {
            // throw new IOException(String.format("The JSON string is invalid for ActivityExtra with oneOf schemas: BabylonStakingActivityDetailExtra, CoreStakingActivityDetailExtra, EthStakingActivityDetailExtra. %d class(es) match the result, expected 1. Detailed failure message for oneOf schemas: %s. JSON: %s", validCount, errorMessages, jsonElement.toString()));
        }
    }

    /**
     * Create an instance of ActivityExtra given an JSON string
     *
     * @param jsonString JSON string
     * @return An instance of ActivityExtra
     * @throws IOException if the JSON string is invalid with respect to ActivityExtra
     */
    public static ActivityExtra fromJson(String jsonString) throws IOException {
        return JSON.getGson().fromJson(jsonString, ActivityExtra.class);
    }

    /**
     * Convert an instance of ActivityExtra to an JSON string
     *
     * @return JSON string
     */
    public String toJson() {
        return JSON.getGson().toJson(this);
    }
}

