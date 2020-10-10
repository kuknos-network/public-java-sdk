// Automatically generated by xdrgen
// DO NOT EDIT or your changes may be overwritten

package org.kuknos.sdk.xdr;


import java.io.IOException;

import com.google.common.base.Objects;

// === xdr source ============================================================

//  struct BucketMetadata
//  {
//      // Indicates the protocol version used to create / merge this bucket.
//      uint32 ledgerVersion;
//  
//      // reserved for future use
//      union switch (int v)
//      {
//      case 0:
//          void;
//      }
//      ext;
//  };

//  ===========================================================================
public class BucketMetadata implements XdrElement {
  public BucketMetadata () {}
  private Uint32 ledgerVersion;
  public Uint32 getLedgerVersion() {
    return this.ledgerVersion;
  }
  public void setLedgerVersion(Uint32 value) {
    this.ledgerVersion = value;
  }
  private BucketMetadataExt ext;
  public BucketMetadataExt getExt() {
    return this.ext;
  }
  public void setExt(BucketMetadataExt value) {
    this.ext = value;
  }
  public static void encode(XdrDataOutputStream stream, BucketMetadata encodedBucketMetadata) throws IOException{
    Uint32.encode(stream, encodedBucketMetadata.ledgerVersion);
    BucketMetadataExt.encode(stream, encodedBucketMetadata.ext);
  }
  public void encode(XdrDataOutputStream stream) throws IOException {
    encode(stream, this);
  }
  public static BucketMetadata decode(XdrDataInputStream stream) throws IOException {
    BucketMetadata decodedBucketMetadata = new BucketMetadata();
    decodedBucketMetadata.ledgerVersion = Uint32.decode(stream);
    decodedBucketMetadata.ext = BucketMetadataExt.decode(stream);
    return decodedBucketMetadata;
  }
  @Override
  public int hashCode() {
    return Objects.hashCode(this.ledgerVersion, this.ext);
  }
  @Override
  public boolean equals(Object object) {
    if (object == null || !(object instanceof BucketMetadata)) {
      return false;
    }

    BucketMetadata other = (BucketMetadata) object;
    return Objects.equal(this.ledgerVersion, other.ledgerVersion) && Objects.equal(this.ext, other.ext);
  }

  public static class BucketMetadataExt {
    public BucketMetadataExt () {}
    Integer v;
    public Integer getDiscriminant() {
      return this.v;
    }
    public void setDiscriminant(Integer value) {
      this.v = value;
    }
    public static void encode(XdrDataOutputStream stream, BucketMetadataExt encodedBucketMetadataExt) throws IOException {
    //Xdrgen::AST::Typespecs::Int
    //Integer
    stream.writeInt(encodedBucketMetadataExt.getDiscriminant().intValue());
    switch (encodedBucketMetadataExt.getDiscriminant()) {
    case 0:
    break;
    }
    }
    public void encode(XdrDataOutputStream stream) throws IOException {
      encode(stream, this);
    }
    public static BucketMetadataExt decode(XdrDataInputStream stream) throws IOException {
    BucketMetadataExt decodedBucketMetadataExt = new BucketMetadataExt();
    Integer discriminant = stream.readInt();
    decodedBucketMetadataExt.setDiscriminant(discriminant);
    switch (decodedBucketMetadataExt.getDiscriminant()) {
    case 0:
    break;
    }
      return decodedBucketMetadataExt;
    }
    @Override
    public int hashCode() {
      return Objects.hashCode(this.v);
    }
    @Override
    public boolean equals(Object object) {
      if (object == null || !(object instanceof BucketMetadataExt)) {
        return false;
      }

      BucketMetadataExt other = (BucketMetadataExt) object;
      return Objects.equal(this.v, other.v);
    }

  }
}