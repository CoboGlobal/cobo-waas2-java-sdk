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

import com.cobo.waas2.model.AcquiringType;
import com.cobo.waas2.model.AddressesEventData;
import com.cobo.waas2.model.AddressesEventDataAllOfAddresses;
import com.cobo.waas2.model.Balance;
import com.cobo.waas2.model.BalanceUpdateInfoEventData;
import com.cobo.waas2.model.ChainInfo;
import com.cobo.waas2.model.ChainsEventData;
import com.cobo.waas2.model.MPCVaultEventData;
import com.cobo.waas2.model.PaymentAddressUpdateEventData;
import com.cobo.waas2.model.PaymentOrderEventData;
import com.cobo.waas2.model.PaymentRefundEventData;
import com.cobo.waas2.model.PaymentSettlementEvent;
import com.cobo.waas2.model.PaymentTransaction;
import com.cobo.waas2.model.PaymentTransactionEventData;
import com.cobo.waas2.model.RefundType;
import com.cobo.waas2.model.RootPubkey;
import com.cobo.waas2.model.SettleStatus;
import com.cobo.waas2.model.SettlementDetail;
import com.cobo.waas2.model.SourceGroup;
import com.cobo.waas2.model.SuspendedTokenEventData;
import com.cobo.waas2.model.SuspendedTokenOperationType;
import com.cobo.waas2.model.TSSRequestWebhookEventData;
import com.cobo.waas2.model.TokenInfo;
import com.cobo.waas2.model.TokenListingEventData;
import com.cobo.waas2.model.TokensEventData;
import com.cobo.waas2.model.TransactionBlockInfo;
import com.cobo.waas2.model.TransactionDestination;
import com.cobo.waas2.model.TransactionFee;
import com.cobo.waas2.model.TransactionFuelingInfo;
import com.cobo.waas2.model.TransactionInitiatorType;
import com.cobo.waas2.model.TransactionRawTxInfo;
import com.cobo.waas2.model.TransactionReplacement;
import com.cobo.waas2.model.TransactionResult;
import com.cobo.waas2.model.TransactionSource;
import com.cobo.waas2.model.TransactionStatus;
import com.cobo.waas2.model.TransactionSubStatus;
import com.cobo.waas2.model.TransactionType;
import com.cobo.waas2.model.TransactionWebhookEventData;
import com.cobo.waas2.model.WalletInfo;
import com.cobo.waas2.model.WalletInfoEventData;
import com.cobo.waas2.model.WalletSubtype;
import com.cobo.waas2.model.WalletType;
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
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

/**
 * Model tests for WebhookEventData
 */
public class WebhookEventDataTest {
    private final WebhookEventData model = new WebhookEventData();

    /**
     * Model tests for WebhookEventData
     */
    @Test
    public void testWebhookEventData() {
        // TODO: test WebhookEventData
    }

    /**
     * Test the property 'dataType'
     */
    @Test
    public void dataTypeTest() {
        // TODO: test dataType
    }

    /**
     * Test the property 'transactionId'
     */
    @Test
    public void transactionIdTest() {
        // TODO: test transactionId
    }

    /**
     * Test the property 'coboId'
     */
    @Test
    public void coboIdTest() {
        // TODO: test coboId
    }

    /**
     * Test the property 'requestId'
     */
    @Test
    public void requestIdTest() {
        // TODO: test requestId
    }

    /**
     * Test the property 'walletId'
     */
    @Test
    public void walletIdTest() {
        // TODO: test walletId
    }

    /**
     * Test the property 'type'
     */
    @Test
    public void typeTest() {
        // TODO: test type
    }

    /**
     * Test the property 'status'
     */
    @Test
    public void statusTest() {
        // TODO: test status
    }

    /**
     * Test the property 'subStatus'
     */
    @Test
    public void subStatusTest() {
        // TODO: test subStatus
    }

    /**
     * Test the property 'failedReason'
     */
    @Test
    public void failedReasonTest() {
        // TODO: test failedReason
    }

    /**
     * Test the property 'chainId'
     */
    @Test
    public void chainIdTest() {
        // TODO: test chainId
    }

    /**
     * Test the property 'tokenId'
     */
    @Test
    public void tokenIdTest() {
        // TODO: test tokenId
    }

    /**
     * Test the property 'assetId'
     */
    @Test
    public void assetIdTest() {
        // TODO: test assetId
    }

    /**
     * Test the property 'source'
     */
    @Test
    public void sourceTest() {
        // TODO: test source
    }

    /**
     * Test the property 'destination'
     */
    @Test
    public void destinationTest() {
        // TODO: test destination
    }

    /**
     * Test the property 'result'
     */
    @Test
    public void resultTest() {
        // TODO: test result
    }

    /**
     * Test the property 'fee'
     */
    @Test
    public void feeTest() {
        // TODO: test fee
    }

    /**
     * Test the property 'initiator'
     */
    @Test
    public void initiatorTest() {
        // TODO: test initiator
    }

    /**
     * Test the property 'initiatorType'
     */
    @Test
    public void initiatorTypeTest() {
        // TODO: test initiatorType
    }

    /**
     * Test the property 'confirmedNum'
     */
    @Test
    public void confirmedNumTest() {
        // TODO: test confirmedNum
    }

    /**
     * Test the property 'confirmingThreshold'
     */
    @Test
    public void confirmingThresholdTest() {
        // TODO: test confirmingThreshold
    }

    /**
     * Test the property 'transactionHash'
     */
    @Test
    public void transactionHashTest() {
        // TODO: test transactionHash
    }

    /**
     * Test the property 'blockInfo'
     */
    @Test
    public void blockInfoTest() {
        // TODO: test blockInfo
    }

    /**
     * Test the property 'rawTxInfo'
     */
    @Test
    public void rawTxInfoTest() {
        // TODO: test rawTxInfo
    }

    /**
     * Test the property 'replacement'
     */
    @Test
    public void replacementTest() {
        // TODO: test replacement
    }

    /**
     * Test the property 'category'
     */
    @Test
    public void categoryTest() {
        // TODO: test category
    }

    /**
     * Test the property 'description'
     */
    @Test
    public void descriptionTest() {
        // TODO: test description
    }

    /**
     * Test the property 'isLoop'
     */
    @Test
    public void isLoopTest() {
        // TODO: test isLoop
    }

    /**
     * Test the property 'coboCategory'
     */
    @Test
    public void coboCategoryTest() {
        // TODO: test coboCategory
    }

    /**
     * Test the property 'extra'
     */
    @Test
    public void extraTest() {
        // TODO: test extra
    }

    /**
     * Test the property 'fuelingInfo'
     */
    @Test
    public void fuelingInfoTest() {
        // TODO: test fuelingInfo
    }

    /**
     * Test the property 'createdTimestamp'
     */
    @Test
    public void createdTimestampTest() {
        // TODO: test createdTimestamp
    }

    /**
     * Test the property 'updatedTimestamp'
     */
    @Test
    public void updatedTimestampTest() {
        // TODO: test updatedTimestamp
    }

    /**
     * Test the property 'tssRequestId'
     */
    @Test
    public void tssRequestIdTest() {
        // TODO: test tssRequestId
    }

    /**
     * Test the property 'sourceKeyShareHolderGroup'
     */
    @Test
    public void sourceKeyShareHolderGroupTest() {
        // TODO: test sourceKeyShareHolderGroup
    }

    /**
     * Test the property 'targetKeyShareHolderGroupId'
     */
    @Test
    public void targetKeyShareHolderGroupIdTest() {
        // TODO: test targetKeyShareHolderGroupId
    }

    /**
     * Test the property 'addresses'
     */
    @Test
    public void addressesTest() {
        // TODO: test addresses
    }

    /**
     * Test the property 'wallet'
     */
    @Test
    public void walletTest() {
        // TODO: test wallet
    }

    /**
     * Test the property 'vaultId'
     */
    @Test
    public void vaultIdTest() {
        // TODO: test vaultId
    }

    /**
     * Test the property 'projectId'
     */
    @Test
    public void projectIdTest() {
        // TODO: test projectId
    }

    /**
     * Test the property 'name'
     */
    @Test
    public void nameTest() {
        // TODO: test name
    }

    /**
     * Test the property 'rootPubkeys'
     */
    @Test
    public void rootPubkeysTest() {
        // TODO: test rootPubkeys
    }

    /**
     * Test the property 'chains'
     */
    @Test
    public void chainsTest() {
        // TODO: test chains
    }

    /**
     * Test the property 'walletType'
     */
    @Test
    public void walletTypeTest() {
        // TODO: test walletType
    }

    /**
     * Test the property 'walletSubtypes'
     */
    @Test
    public void walletSubtypesTest() {
        // TODO: test walletSubtypes
    }

    /**
     * Test the property 'tokens'
     */
    @Test
    public void tokensTest() {
        // TODO: test tokens
    }

    /**
     * Test the property 'contractAddress'
     */
    @Test
    public void contractAddressTest() {
        // TODO: test contractAddress
    }

    /**
     * Test the property 'walletSubtype'
     */
    @Test
    public void walletSubtypeTest() {
        // TODO: test walletSubtype
    }

    /**
     * Test the property 'token'
     */
    @Test
    public void tokenTest() {
        // TODO: test token
    }

    /**
     * Test the property 'feedback'
     */
    @Test
    public void feedbackTest() {
        // TODO: test feedback
    }

    /**
     * Test the property 'address'
     */
    @Test
    public void addressTest() {
        // TODO: test address
    }

    /**
     * Test the property 'walletUuid'
     */
    @Test
    public void walletUuidTest() {
        // TODO: test walletUuid
    }

    /**
     * Test the property 'balance'
     */
    @Test
    public void balanceTest() {
        // TODO: test balance
    }

    /**
     * Test the property 'tokenIds'
     */
    @Test
    public void tokenIdsTest() {
        // TODO: test tokenIds
    }

    /**
     * Test the property 'operationType'
     */
    @Test
    public void operationTypeTest() {
        // TODO: test operationType
    }

    /**
     * Test the property 'orderId'
     */
    @Test
    public void orderIdTest() {
        // TODO: test orderId
    }

    /**
     * Test the property 'merchantId'
     */
    @Test
    public void merchantIdTest() {
        // TODO: test merchantId
    }

    /**
     * Test the property 'payableAmount'
     */
    @Test
    public void payableAmountTest() {
        // TODO: test payableAmount
    }

    /**
     * Test the property 'receiveAddress'
     */
    @Test
    public void receiveAddressTest() {
        // TODO: test receiveAddress
    }

    /**
     * Test the property 'currency'
     */
    @Test
    public void currencyTest() {
        // TODO: test currency
    }

    /**
     * Test the property 'orderAmount'
     */
    @Test
    public void orderAmountTest() {
        // TODO: test orderAmount
    }

    /**
     * Test the property 'feeAmount'
     */
    @Test
    public void feeAmountTest() {
        // TODO: test feeAmount
    }

    /**
     * Test the property 'exchangeRate'
     */
    @Test
    public void exchangeRateTest() {
        // TODO: test exchangeRate
    }

    /**
     * Test the property 'expiredAt'
     */
    @Test
    public void expiredAtTest() {
        // TODO: test expiredAt
    }

    /**
     * Test the property 'merchantOrderCode'
     */
    @Test
    public void merchantOrderCodeTest() {
        // TODO: test merchantOrderCode
    }

    /**
     * Test the property 'pspOrderCode'
     */
    @Test
    public void pspOrderCodeTest() {
        // TODO: test pspOrderCode
    }

    /**
     * Test the property 'receivedTokenAmount'
     */
    @Test
    public void receivedTokenAmountTest() {
        // TODO: test receivedTokenAmount
    }

    /**
     * Test the property 'transactions'
     */
    @Test
    public void transactionsTest() {
        // TODO: test transactions
    }

    /**
     * Test the property 'settlementStatus'
     */
    @Test
    public void settlementStatusTest() {
        // TODO: test settlementStatus
    }

    /**
     * Test the property 'refundId'
     */
    @Test
    public void refundIdTest() {
        // TODO: test refundId
    }

    /**
     * Test the property 'amount'
     */
    @Test
    public void amountTest() {
        // TODO: test amount
    }

    /**
     * Test the property 'toAddress'
     */
    @Test
    public void toAddressTest() {
        // TODO: test toAddress
    }

    /**
     * Test the property 'refundType'
     */
    @Test
    public void refundTypeTest() {
        // TODO: test refundType
    }

    /**
     * Test the property 'chargeMerchantFee'
     */
    @Test
    public void chargeMerchantFeeTest() {
        // TODO: test chargeMerchantFee
    }

    /**
     * Test the property 'merchantFeeAmount'
     */
    @Test
    public void merchantFeeAmountTest() {
        // TODO: test merchantFeeAmount
    }

    /**
     * Test the property 'merchantFeeTokenId'
     */
    @Test
    public void merchantFeeTokenIdTest() {
        // TODO: test merchantFeeTokenId
    }

    /**
     * Test the property 'settlementRequestId'
     */
    @Test
    public void settlementRequestIdTest() {
        // TODO: test settlementRequestId
    }

    /**
     * Test the property 'settlements'
     */
    @Test
    public void settlementsTest() {
        // TODO: test settlements
    }

    /**
     * Test the property 'acquiringType'
     */
    @Test
    public void acquiringTypeTest() {
        // TODO: test acquiringType
    }

    /**
     * Test the property 'payerId'
     */
    @Test
    public void payerIdTest() {
        // TODO: test payerId
    }

    /**
     * Test the property 'customPayerId'
     */
    @Test
    public void customPayerIdTest() {
        // TODO: test customPayerId
    }

    /**
     * Test the property 'chain'
     */
    @Test
    public void chainTest() {
        // TODO: test chain
    }

    /**
     * Test the property 'previousAddress'
     */
    @Test
    public void previousAddressTest() {
        // TODO: test previousAddress
    }

    /**
     * Test the property 'updatedAddress'
     */
    @Test
    public void updatedAddressTest() {
        // TODO: test updatedAddress
    }

}
