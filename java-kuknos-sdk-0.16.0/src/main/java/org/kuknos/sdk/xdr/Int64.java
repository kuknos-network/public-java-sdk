// Automatically generated by xdrgen
// DO NOT EDIT or your changes may be overwritten

package org.kuknos.sdk.xdr;


import java.io.IOException;

import com.google.common.base.Objects;

// === xdr source ============================================================

//  typedef hyper int64;

//  ===========================================================================
public class Int64 implements XdrElement {
  private Long int64;
  public Long getInt64() {
    return this.int64;
  }
  public void setInt64(Long value) {
    this.int64 = value;
  }
  public static void encode(XdrDataOutputStream stream, Int64  encodedInt64) throws IOException {
  stream.writeLong(encodedInt64.int64);
  }
  public void encode(XdrDataOutputStream stream) throws IOException {
    encode(stream, this);
  }
  public static Int64 decode(XdrDataInputStream stream) throws IOException {
    Int64 decodedInt64 = new Int64();
  decodedInt64.int64 = stream.readLong();
    return decodedInt64;
  }
  @Override
  public int hashCode() {
    return Objects.hashCode(this.int64);
  }
  @Override
  public boolean equals(Object object) {
    if (object == null || !(object instanceof Int64)) {
      return false;
    }

    Int64 other = (Int64) object;
    return Objects.equal(this.int64, other.int64);
  }
}
