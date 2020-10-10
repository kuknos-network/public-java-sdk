// Automatically generated by xdrgen
// DO NOT EDIT or your changes may be overwritten

package org.kuknos.sdk.xdr;


import java.io.IOException;

import com.google.common.base.Objects;
import java.util.Arrays;

// === xdr source ============================================================

//  struct LedgerCloseMetaV0
//  {
//      LedgerHeaderHistoryEntry ledgerHeader;
//      // NB: txSet is sorted in "Hash order"
//      TransactionSet txSet;
//  
//      // NB: transactions are sorted in apply order here
//      // fees for all transactions are processed first
//      // followed by applying transactions
//      TransactionResultMeta txProcessing<>;
//  
//      // upgrades are applied last
//      UpgradeEntryMeta upgradesProcessing<>;
//  
//      // other misc information attached to the ledger close
//      SCPHistoryEntry scpInfo<>;
//  };

//  ===========================================================================
public class LedgerCloseMetaV0 implements XdrElement {
  public LedgerCloseMetaV0 () {}
  private LedgerHeaderHistoryEntry ledgerHeader;
  public LedgerHeaderHistoryEntry getLedgerHeader() {
    return this.ledgerHeader;
  }
  public void setLedgerHeader(LedgerHeaderHistoryEntry value) {
    this.ledgerHeader = value;
  }
  private TransactionSet txSet;
  public TransactionSet getTxSet() {
    return this.txSet;
  }
  public void setTxSet(TransactionSet value) {
    this.txSet = value;
  }
  private TransactionResultMeta[] txProcessing;
  public TransactionResultMeta[] getTxProcessing() {
    return this.txProcessing;
  }
  public void setTxProcessing(TransactionResultMeta[] value) {
    this.txProcessing = value;
  }
  private UpgradeEntryMeta[] upgradesProcessing;
  public UpgradeEntryMeta[] getUpgradesProcessing() {
    return this.upgradesProcessing;
  }
  public void setUpgradesProcessing(UpgradeEntryMeta[] value) {
    this.upgradesProcessing = value;
  }
  private SCPHistoryEntry[] scpInfo;
  public SCPHistoryEntry[] getScpInfo() {
    return this.scpInfo;
  }
  public void setScpInfo(SCPHistoryEntry[] value) {
    this.scpInfo = value;
  }
  public static void encode(XdrDataOutputStream stream, LedgerCloseMetaV0 encodedLedgerCloseMetaV0) throws IOException{
    LedgerHeaderHistoryEntry.encode(stream, encodedLedgerCloseMetaV0.ledgerHeader);
    TransactionSet.encode(stream, encodedLedgerCloseMetaV0.txSet);
    int txProcessingsize = encodedLedgerCloseMetaV0.getTxProcessing().length;
    stream.writeInt(txProcessingsize);
    for (int i = 0; i < txProcessingsize; i++) {
      TransactionResultMeta.encode(stream, encodedLedgerCloseMetaV0.txProcessing[i]);
    }
    int upgradesProcessingsize = encodedLedgerCloseMetaV0.getUpgradesProcessing().length;
    stream.writeInt(upgradesProcessingsize);
    for (int i = 0; i < upgradesProcessingsize; i++) {
      UpgradeEntryMeta.encode(stream, encodedLedgerCloseMetaV0.upgradesProcessing[i]);
    }
    int scpInfosize = encodedLedgerCloseMetaV0.getScpInfo().length;
    stream.writeInt(scpInfosize);
    for (int i = 0; i < scpInfosize; i++) {
      SCPHistoryEntry.encode(stream, encodedLedgerCloseMetaV0.scpInfo[i]);
    }
  }
  public void encode(XdrDataOutputStream stream) throws IOException {
    encode(stream, this);
  }
  public static LedgerCloseMetaV0 decode(XdrDataInputStream stream) throws IOException {
    LedgerCloseMetaV0 decodedLedgerCloseMetaV0 = new LedgerCloseMetaV0();
    decodedLedgerCloseMetaV0.ledgerHeader = LedgerHeaderHistoryEntry.decode(stream);
    decodedLedgerCloseMetaV0.txSet = TransactionSet.decode(stream);
    int txProcessingsize = stream.readInt();
    decodedLedgerCloseMetaV0.txProcessing = new TransactionResultMeta[txProcessingsize];
    for (int i = 0; i < txProcessingsize; i++) {
      decodedLedgerCloseMetaV0.txProcessing[i] = TransactionResultMeta.decode(stream);
    }
    int upgradesProcessingsize = stream.readInt();
    decodedLedgerCloseMetaV0.upgradesProcessing = new UpgradeEntryMeta[upgradesProcessingsize];
    for (int i = 0; i < upgradesProcessingsize; i++) {
      decodedLedgerCloseMetaV0.upgradesProcessing[i] = UpgradeEntryMeta.decode(stream);
    }
    int scpInfosize = stream.readInt();
    decodedLedgerCloseMetaV0.scpInfo = new SCPHistoryEntry[scpInfosize];
    for (int i = 0; i < scpInfosize; i++) {
      decodedLedgerCloseMetaV0.scpInfo[i] = SCPHistoryEntry.decode(stream);
    }
    return decodedLedgerCloseMetaV0;
  }
  @Override
  public int hashCode() {
    return Objects.hashCode(this.ledgerHeader, this.txSet, Arrays.hashCode(this.txProcessing), Arrays.hashCode(this.upgradesProcessing), Arrays.hashCode(this.scpInfo));
  }
  @Override
  public boolean equals(Object object) {
    if (object == null || !(object instanceof LedgerCloseMetaV0)) {
      return false;
    }

    LedgerCloseMetaV0 other = (LedgerCloseMetaV0) object;
    return Objects.equal(this.ledgerHeader, other.ledgerHeader) && Objects.equal(this.txSet, other.txSet) && Arrays.equals(this.txProcessing, other.txProcessing) && Arrays.equals(this.upgradesProcessing, other.upgradesProcessing) && Arrays.equals(this.scpInfo, other.scpInfo);
  }
}
