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
import com.cobo.waas2.model.FeeType;
import com.cobo.waas2.model.TransactionEvmEip1559Fee;
import com.cobo.waas2.model.TransactionEvmLegacyFee;
import com.cobo.waas2.model.TransactionFixedFee;
import com.cobo.waas2.model.TransactionUtxoFee;
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
public class TransactionFee extends AbstractOpenApiSchema {
    private static final Logger log = Logger.getLogger(TransactionFee.class.getName());

    public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
        @SuppressWarnings("unchecked")
        @Override
        public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
            if (!TransactionFee.class.isAssignableFrom(type.getRawType())) {
                return null; // this class only serializes 'TransactionFee' and its subtypes
            }
            final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
            final TypeAdapter<TransactionEvmEip1559Fee> adapterTransactionEvmEip1559Fee = gson.getDelegateAdapter(this, TypeToken.get(TransactionEvmEip1559Fee.class));
            final TypeAdapter<TransactionEvmLegacyFee> adapterTransactionEvmLegacyFee = gson.getDelegateAdapter(this, TypeToken.get(TransactionEvmLegacyFee.class));
            final TypeAdapter<TransactionUtxoFee> adapterTransactionUtxoFee = gson.getDelegateAdapter(this, TypeToken.get(TransactionUtxoFee.class));
            final TypeAdapter<TransactionFixedFee> adapterTransactionFixedFee = gson.getDelegateAdapter(this, TypeToken.get(TransactionFixedFee.class));

            return (TypeAdapter<T>) new TypeAdapter<TransactionFee>() {
                @Override
                public void write(JsonWriter out, TransactionFee value) throws IOException {
                    if (value == null || value.getActualInstance() == null) {
                        elementAdapter.write(out, null);
                        return;
                    }

                    // check if the actual instance is of the type `TransactionEvmEip1559Fee`
                    if (value.getActualInstance() instanceof TransactionEvmEip1559Fee) {
                        JsonElement element = adapterTransactionEvmEip1559Fee.toJsonTree((TransactionEvmEip1559Fee)value.getActualInstance());
                        elementAdapter.write(out, element);
                        return;
                    }
                    // check if the actual instance is of the type `TransactionEvmLegacyFee`
                    if (value.getActualInstance() instanceof TransactionEvmLegacyFee) {
                        JsonElement element = adapterTransactionEvmLegacyFee.toJsonTree((TransactionEvmLegacyFee)value.getActualInstance());
                        elementAdapter.write(out, element);
                        return;
                    }
                    // check if the actual instance is of the type `TransactionUtxoFee`
                    if (value.getActualInstance() instanceof TransactionUtxoFee) {
                        JsonElement element = adapterTransactionUtxoFee.toJsonTree((TransactionUtxoFee)value.getActualInstance());
                        elementAdapter.write(out, element);
                        return;
                    }
                    // check if the actual instance is of the type `TransactionFixedFee`
                    if (value.getActualInstance() instanceof TransactionFixedFee) {
                        JsonElement element = adapterTransactionFixedFee.toJsonTree((TransactionFixedFee)value.getActualInstance());
                        elementAdapter.write(out, element);
                        return;
                    }
                    throw new IOException("Failed to serialize as the type doesn't match oneOf schemas: TransactionEvmEip1559Fee, TransactionEvmLegacyFee, TransactionFixedFee, TransactionUtxoFee");
                }

                @Override
                public TransactionFee read(JsonReader in) throws IOException {
                    Object deserialized = null;
                    JsonElement jsonElement = elementAdapter.read(in);

                    JsonObject jsonObject = jsonElement.getAsJsonObject();

                    // use discriminator value for faster oneOf lookup
                    TransactionFee newTransactionFee = new TransactionFee();
                    if (jsonObject.get("fee_type") == null) {
                        log.log(Level.WARNING, "Failed to lookup discriminator value for TransactionFee as `fee_type` was not found in the payload or the payload is empty.");
                    } else  {
                        // look up the discriminator value in the field `fee_type`
                        switch (jsonObject.get("fee_type").getAsString()) {
                            case "EVM_EIP_1559":
                                deserialized = adapterTransactionEvmEip1559Fee.fromJsonTree(jsonObject);
                                newTransactionFee.setActualInstance(deserialized);
                                return newTransactionFee;
                            case "EVM_Legacy":
                                deserialized = adapterTransactionEvmLegacyFee.fromJsonTree(jsonObject);
                                newTransactionFee.setActualInstance(deserialized);
                                return newTransactionFee;
                            case "Fixed":
                                deserialized = adapterTransactionFixedFee.fromJsonTree(jsonObject);
                                newTransactionFee.setActualInstance(deserialized);
                                return newTransactionFee;
                            case "UTXO":
                                deserialized = adapterTransactionUtxoFee.fromJsonTree(jsonObject);
                                newTransactionFee.setActualInstance(deserialized);
                                return newTransactionFee;
                            case "TransactionEvmEip1559Fee":
                                deserialized = adapterTransactionEvmEip1559Fee.fromJsonTree(jsonObject);
                                newTransactionFee.setActualInstance(deserialized);
                                return newTransactionFee;
                            case "TransactionEvmLegacyFee":
                                deserialized = adapterTransactionEvmLegacyFee.fromJsonTree(jsonObject);
                                newTransactionFee.setActualInstance(deserialized);
                                return newTransactionFee;
                            case "TransactionFixedFee":
                                deserialized = adapterTransactionFixedFee.fromJsonTree(jsonObject);
                                newTransactionFee.setActualInstance(deserialized);
                                return newTransactionFee;
                            case "TransactionUtxoFee":
                                deserialized = adapterTransactionUtxoFee.fromJsonTree(jsonObject);
                                newTransactionFee.setActualInstance(deserialized);
                                return newTransactionFee;
                            default:
                                log.log(Level.WARNING, String.format("Failed to lookup discriminator value `%s` for TransactionFee. Possible values: EVM_EIP_1559 EVM_Legacy Fixed UTXO TransactionEvmEip1559Fee TransactionEvmLegacyFee TransactionFixedFee TransactionUtxoFee", jsonObject.get("fee_type").getAsString()));
                        }
                    }

                    int match = 0;
                    ArrayList<String> errorMessages = new ArrayList<>();
                    TypeAdapter actualAdapter = elementAdapter;

                    // deserialize TransactionEvmEip1559Fee
                    try {
                        // validate the JSON object to see if any exception is thrown
                        TransactionEvmEip1559Fee.validateJsonElement(jsonElement);
                        actualAdapter = adapterTransactionEvmEip1559Fee;
                        match++;
                        log.log(Level.FINER, "Input data matches schema 'TransactionEvmEip1559Fee'");
                    } catch (Exception e) {
                        // deserialization failed, continue
                        errorMessages.add(String.format("Deserialization for TransactionEvmEip1559Fee failed with `%s`.", e.getMessage()));
                        log.log(Level.FINER, "Input data does not match schema 'TransactionEvmEip1559Fee'", e);
                    }
                    // deserialize TransactionEvmLegacyFee
                    try {
                        // validate the JSON object to see if any exception is thrown
                        TransactionEvmLegacyFee.validateJsonElement(jsonElement);
                        actualAdapter = adapterTransactionEvmLegacyFee;
                        match++;
                        log.log(Level.FINER, "Input data matches schema 'TransactionEvmLegacyFee'");
                    } catch (Exception e) {
                        // deserialization failed, continue
                        errorMessages.add(String.format("Deserialization for TransactionEvmLegacyFee failed with `%s`.", e.getMessage()));
                        log.log(Level.FINER, "Input data does not match schema 'TransactionEvmLegacyFee'", e);
                    }
                    // deserialize TransactionUtxoFee
                    try {
                        // validate the JSON object to see if any exception is thrown
                        TransactionUtxoFee.validateJsonElement(jsonElement);
                        actualAdapter = adapterTransactionUtxoFee;
                        match++;
                        log.log(Level.FINER, "Input data matches schema 'TransactionUtxoFee'");
                    } catch (Exception e) {
                        // deserialization failed, continue
                        errorMessages.add(String.format("Deserialization for TransactionUtxoFee failed with `%s`.", e.getMessage()));
                        log.log(Level.FINER, "Input data does not match schema 'TransactionUtxoFee'", e);
                    }
                    // deserialize TransactionFixedFee
                    try {
                        // validate the JSON object to see if any exception is thrown
                        TransactionFixedFee.validateJsonElement(jsonElement);
                        actualAdapter = adapterTransactionFixedFee;
                        match++;
                        log.log(Level.FINER, "Input data matches schema 'TransactionFixedFee'");
                    } catch (Exception e) {
                        // deserialization failed, continue
                        errorMessages.add(String.format("Deserialization for TransactionFixedFee failed with `%s`.", e.getMessage()));
                        log.log(Level.FINER, "Input data does not match schema 'TransactionFixedFee'", e);
                    }

                    if (match == 1) {
                        TransactionFee ret = new TransactionFee();
                        ret.setActualInstance(actualAdapter.fromJsonTree(jsonElement));
                        return ret;
                    }

                    throw new IOException(String.format("Failed deserialization for TransactionFee: %d classes match result, expected 1. Detailed failure message for oneOf schemas: %s. JSON: %s", match, errorMessages, jsonElement.toString()));
                }
            }.nullSafe();
        }
    }

    // store a list of schema names defined in oneOf
    public static final Map<String, Class<?>> schemas = new HashMap<String, Class<?>>();

    public TransactionFee() {
        super("oneOf", Boolean.FALSE);
    }

    public TransactionFee(TransactionEvmEip1559Fee o) {
        super("oneOf", Boolean.FALSE);
        setActualInstance(o);
    }

    public TransactionFee(TransactionEvmLegacyFee o) {
        super("oneOf", Boolean.FALSE);
        setActualInstance(o);
    }

    public TransactionFee(TransactionFixedFee o) {
        super("oneOf", Boolean.FALSE);
        setActualInstance(o);
    }

    public TransactionFee(TransactionUtxoFee o) {
        super("oneOf", Boolean.FALSE);
        setActualInstance(o);
    }

    static {
        schemas.put("TransactionEvmEip1559Fee", TransactionEvmEip1559Fee.class);
        schemas.put("TransactionEvmLegacyFee", TransactionEvmLegacyFee.class);
        schemas.put("TransactionUtxoFee", TransactionUtxoFee.class);
        schemas.put("TransactionFixedFee", TransactionFixedFee.class);
    }

    @Override
    public Map<String, Class<?>> getSchemas() {
        return TransactionFee.schemas;
    }

    /**
     * Set the instance that matches the oneOf child schema, check
     * the instance parameter is valid against the oneOf child schemas:
     * TransactionEvmEip1559Fee, TransactionEvmLegacyFee, TransactionFixedFee, TransactionUtxoFee
     *
     * It could be an instance of the 'oneOf' schemas.
     */
    @Override
    public void setActualInstance(Object instance) {
        if (instance instanceof TransactionEvmEip1559Fee) {
            super.setActualInstance(instance);
            return;
        }

        if (instance instanceof TransactionEvmLegacyFee) {
            super.setActualInstance(instance);
            return;
        }

        if (instance instanceof TransactionUtxoFee) {
            super.setActualInstance(instance);
            return;
        }

        if (instance instanceof TransactionFixedFee) {
            super.setActualInstance(instance);
            return;
        }

        throw new RuntimeException("Invalid instance type. Must be TransactionEvmEip1559Fee, TransactionEvmLegacyFee, TransactionFixedFee, TransactionUtxoFee");
    }

    /**
     * Get the actual instance, which can be the following:
     * TransactionEvmEip1559Fee, TransactionEvmLegacyFee, TransactionFixedFee, TransactionUtxoFee
     *
     * @return The actual instance (TransactionEvmEip1559Fee, TransactionEvmLegacyFee, TransactionFixedFee, TransactionUtxoFee)
     */
    @SuppressWarnings("unchecked")
    @Override
    public Object getActualInstance() {
        return super.getActualInstance();
    }

    /**
     * Get the actual instance of `TransactionEvmEip1559Fee`. If the actual instance is not `TransactionEvmEip1559Fee`,
     * the ClassCastException will be thrown.
     *
     * @return The actual instance of `TransactionEvmEip1559Fee`
     * @throws ClassCastException if the instance is not `TransactionEvmEip1559Fee`
     */
    public TransactionEvmEip1559Fee getTransactionEvmEip1559Fee() throws ClassCastException {
        return (TransactionEvmEip1559Fee)super.getActualInstance();
    }
    /**
     * Get the actual instance of `TransactionEvmLegacyFee`. If the actual instance is not `TransactionEvmLegacyFee`,
     * the ClassCastException will be thrown.
     *
     * @return The actual instance of `TransactionEvmLegacyFee`
     * @throws ClassCastException if the instance is not `TransactionEvmLegacyFee`
     */
    public TransactionEvmLegacyFee getTransactionEvmLegacyFee() throws ClassCastException {
        return (TransactionEvmLegacyFee)super.getActualInstance();
    }
    /**
     * Get the actual instance of `TransactionUtxoFee`. If the actual instance is not `TransactionUtxoFee`,
     * the ClassCastException will be thrown.
     *
     * @return The actual instance of `TransactionUtxoFee`
     * @throws ClassCastException if the instance is not `TransactionUtxoFee`
     */
    public TransactionUtxoFee getTransactionUtxoFee() throws ClassCastException {
        return (TransactionUtxoFee)super.getActualInstance();
    }
    /**
     * Get the actual instance of `TransactionFixedFee`. If the actual instance is not `TransactionFixedFee`,
     * the ClassCastException will be thrown.
     *
     * @return The actual instance of `TransactionFixedFee`
     * @throws ClassCastException if the instance is not `TransactionFixedFee`
     */
    public TransactionFixedFee getTransactionFixedFee() throws ClassCastException {
        return (TransactionFixedFee)super.getActualInstance();
    }

    /**
     * Validates the JSON Element and throws an exception if issues found
     *
     * @param jsonElement JSON Element
     * @throws IOException if the JSON Element is invalid with respect to TransactionFee
     */
    public static void validateJsonElement(JsonElement jsonElement) throws IOException {
        // validate oneOf schemas one by one
        int validCount = 0;
        ArrayList<String> errorMessages = new ArrayList<>();
        // validate the json string with TransactionEvmEip1559Fee
        try {
            TransactionEvmEip1559Fee.validateJsonElement(jsonElement);
            validCount++;
        } catch (Exception e) {
            errorMessages.add(String.format("Deserialization for TransactionEvmEip1559Fee failed with `%s`.", e.getMessage()));
            // continue to the next one
        }
        // validate the json string with TransactionEvmLegacyFee
        try {
            TransactionEvmLegacyFee.validateJsonElement(jsonElement);
            validCount++;
        } catch (Exception e) {
            errorMessages.add(String.format("Deserialization for TransactionEvmLegacyFee failed with `%s`.", e.getMessage()));
            // continue to the next one
        }
        // validate the json string with TransactionUtxoFee
        try {
            TransactionUtxoFee.validateJsonElement(jsonElement);
            validCount++;
        } catch (Exception e) {
            errorMessages.add(String.format("Deserialization for TransactionUtxoFee failed with `%s`.", e.getMessage()));
            // continue to the next one
        }
        // validate the json string with TransactionFixedFee
        try {
            TransactionFixedFee.validateJsonElement(jsonElement);
            validCount++;
        } catch (Exception e) {
            errorMessages.add(String.format("Deserialization for TransactionFixedFee failed with `%s`.", e.getMessage()));
            // continue to the next one
        }
        if (validCount != 1) {
            // throw new IOException(String.format("The JSON string is invalid for TransactionFee with oneOf schemas: TransactionEvmEip1559Fee, TransactionEvmLegacyFee, TransactionFixedFee, TransactionUtxoFee. %d class(es) match the result, expected 1. Detailed failure message for oneOf schemas: %s. JSON: %s", validCount, errorMessages, jsonElement.toString()));
        }
    }

    /**
     * Create an instance of TransactionFee given an JSON string
     *
     * @param jsonString JSON string
     * @return An instance of TransactionFee
     * @throws IOException if the JSON string is invalid with respect to TransactionFee
     */
    public static TransactionFee fromJson(String jsonString) throws IOException {
        return JSON.getGson().fromJson(jsonString, TransactionFee.class);
    }

    /**
     * Convert an instance of TransactionFee to an JSON string
     *
     * @return JSON string
     */
    public String toJson() {
        return JSON.getGson().toJson(this);
    }
}

