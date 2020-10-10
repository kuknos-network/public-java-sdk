// Automatically generated by xdrgen
// DO NOT EDIT or your changes may be overwritten

package org.kuknos.sdk.xdr;


import java.io.IOException;

import com.google.common.base.Objects;
import java.util.Arrays;

// === xdr source ============================================================

//  struct TransactionMetaV2
//  {
//      LedgerEntryChanges txChangesBefore; // tx level changes before operations
//                                          // are applied if any
//      OperationMeta operations<>;         // meta for each operation
//      LedgerEntryChanges txChangesAfter;  // tx level changes after operations are
//                                          // applied if any
//  };

//  ===========================================================================
public class TransactionMetaV2 implements XdrElement {
  public TransactionMetaV2 () {}
  private LedgerEntryChanges txChangesBefore;
  public LedgerEntryChanges getTxChangesBefore() {
    return this.txChangesBefore;
  }
  public void setTxChangesBefore(LedgerEntryChanges value) {
    this.txChangesBefore = value;
  }
  private OperationMeta[] operations;
  public OperationMeta[] getOperations() {
    return this.operations;
  }
  public void setOperations(OperationMeta[] value) {
    this.operations = value;
  }
  private LedgerEntryChanges txChangesAfter;
  public LedgerEntryChanges getTxChangesAfter() {
    return this.txChangesAfter;
  }
  public void setTxChangesAfter(LedgerEntryChanges value) {
    this.txChangesAfter = value;
  }
  public static void encode(XdrDataOutputStream stream, TransactionMetaV2 encodedTransactionMetaV2) throws IOException{
    LedgerEntryChanges.encode(stream, encodedTransactionMetaV2.txChangesBefore);
    int operationssize = encodedTransactionMetaV2.getOperations().length;
    stream.writeInt(operationssize);
    for (int i = 0; i < operationssize; i++) {
      OperationMeta.encode(stream, encodedTransactionMetaV2.operations[i]);
    }
    LedgerEntryChanges.encode(stream, encodedTransactionMetaV2.txChangesAfter);
  }
  public void encode(XdrDataOutputStream stream) throws IOException {
    encode(stream, this);
  }
  public static TransactionMetaV2 decode(XdrDataInputStream stream) throws IOException {
    TransactionMetaV2 decodedTransactionMetaV2 = new TransactionMetaV2();
    decodedTransactionMetaV2.txChangesBefore = LedgerEntryChanges.decode(stream);
    int operationssize = stream.readInt();
    decodedTransactionMetaV2.operations = new OperationMeta[operationssize];
    for (int i = 0; i < operationssize; i++) {
      decodedTransactionMetaV2.operations[i] = OperationMeta.decode(stream);
    }
    decodedTransactionMetaV2.txChangesAfter = LedgerEntryChanges.decode(stream);
    return decodedTransactionMetaV2;
  }
  @Override
  public int hashCode() {
    return Objects.hashCode(this.txChangesBefore, Arrays.hashCode(this.operations), this.txChangesAfter);
  }
  @Override
  public boolean equals(Object object) {
    if (object == null || !(object instanceof TransactionMetaV2)) {
      return false;
    }

    TransactionMetaV2 other = (TransactionMetaV2) object;
    return Objects.equal(this.txChangesBefore, other.txChangesBefore) && Arrays.equals(this.operations, other.operations) && Objects.equal(this.txChangesAfter, other.txChangesAfter);
  }
}
