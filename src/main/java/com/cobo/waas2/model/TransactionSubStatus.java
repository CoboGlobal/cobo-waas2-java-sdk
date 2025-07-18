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
 * The transaction sub-status. For more details, please refer to [Transaction statuses and sub-statuses](https://www.cobo.com/developers/v2/guides/transactions/status). 
 */
@JsonAdapter(TransactionSubStatus.Adapter.class)
public enum TransactionSubStatus {
  UNKNOWN(null),
  
  REJECTEDKYT("RejectedKYT"),
  
  PENDINGDOUBLECHECK("PendingDoubleCheck"),
  
  PENDINGSPENDERCHECK("PendingSpenderCheck"),
  
  PENDINGRISKCONTROLCHECK("PendingRiskControlCheck"),
  
  PENDINGAPPROVERCHECK("PendingApproverCheck"),
  
  REJECTEDCOBOCHECK("RejectedCoboCheck"),
  
  REJECTEDBYCOBO("RejectedByCobo"),
  
  REJECTEDWHITELIST("RejectedWhiteList"),
  
  REJECTEDDOUBLECHECK("RejectedDoubleCheck"),
  
  REJECTEDSPENDERAUTH("RejectedSpenderAuth"),
  
  REJECTEDRISKCONTROLCHECK("RejectedRiskControlCheck"),
  
  REJECTEDAPPROVERAUTH("RejectedApproverAuth"),
  
  REJECTEDBYMOBILECOSIGNER("RejectedbyMobileCosigner"),
  
  BUILT("Built"),
  
  PENDINGWAITSIGNER("PendingWaitSigner"),
  
  PENDINGAPPROVALSTART("PendingApprovalStart"),
  
  PENDINGSIGNERAPPROVAL("PendingSignerApproval"),
  
  PENDINGSIGNERPROCESSING("PendingSignerProcessing"),
  
  REJECTEDBYSIGNER("RejectedBySigner"),
  
  FAILEDBYSIGNER("FailedBySigner"),
  
  FAILEDSIGNERTIMEOUT("FailedSignerTimeout"),
  
  FAILEDBROADCASTING("FailedBroadcasting"),
  
  FAILEDONCHAIN("FailedOnChain"),
  
  REVERTING("Reverting"),
  
  QUEUE("Queue"),
  
  INSUFFICIENTBALANCE("InsufficientBalance"),
  
  INSUFFICIENTBALANCEFUNDLOCKED("InsufficientBalanceFundLocked"),
  
  PENDINGSYSTEMPROCESSING("PendingSystemProcessing"),
  
  SYSTEMPROCESSINGONGOING("SystemProcessingOngoing"),
  
  PENDINGBLOCKCONFIRMATIONS("PendingBlockConfirmations"),
  
  REORGED("ReOrged"),
  
  REPLACEDBYNEWTRANSACTION("ReplacedByNewTransaction"),
  
  CANCELEDBYSPENDER("CanceledBySpender"),
  
  CANCELEDBYAPI("CanceledByAPI"),
  
  ONCHAINREJECTION("OnchainRejection"),
  
  REJECTEDTRAVELRULE("RejectedTravelRule"),
  
  REJECTEDTRAVELRULEDUETOCOMPLIANCE("RejectedTravelRuleDueToCompliance"),
  
  PENDINGTRAVELRULEINFO("PendingTravelRuleInfo"),
  
  PENDINGTRAVELRULECHECK("PendingTravelRuleCheck"),
  
  REJECTEDTRAVELRULEDUETOUNSUPPORTEDTOKEN("RejectedTravelRuleDueToUnsupportedToken"),
  
  SIGNATUREVERIFICATIONSUCCESS("SignatureVerificationSuccess"),
  
  SIGNATUREVERIFICATIONFAILED("SignatureVerificationFailed"),
  
  PENDINGCOBOCHECK("PendingCoboCheck"),
  
  REJECTEDTRANSACTIONPOLICY("RejectedTransactionPolicy"),
  
  REJECTEDBYSCREENINGAPP("RejectedByScreeningApp"),
  
  PENDINGSCREENINGAPPCHECK("PendingScreeningAppCheck"),
  
  PENDINGCOBOKYTCHECK("PendingCoboKYTCheck"),
  
  REJECTEDBYCOBOKYT("RejectedByCoboKYT"),
  
  PENDINGCOBOTRAVELRULECHECK("PendingCoboTravelRuleCheck");

  private String value;

  TransactionSubStatus(String value) {
    this.value = value;
  }

  public String getValue() {
    return value;
  }

  @Override
  public String toString() {
    return String.valueOf(value);
  }

  public static TransactionSubStatus fromValue(String value) {
    for (TransactionSubStatus b : TransactionSubStatus.values()) {
      if (b == UNKNOWN) continue;
      if (b.value.equals(value)) {
        return b;
      }
    }
    return UNKNOWN;
    // throw new IllegalArgumentException("Unexpected value '" + value + "'");
  }

  public static class Adapter extends TypeAdapter<TransactionSubStatus> {
    @Override
    public void write(final JsonWriter jsonWriter, final TransactionSubStatus enumeration) throws IOException {
      jsonWriter.value(enumeration.getValue());
    }

    @Override
    public TransactionSubStatus read(final JsonReader jsonReader) throws IOException {
      String value = jsonReader.nextString();
      return TransactionSubStatus.fromValue(value);
    }
  }

  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
    String value = jsonElement.getAsString();
    TransactionSubStatus.fromValue(value);
  }
}

