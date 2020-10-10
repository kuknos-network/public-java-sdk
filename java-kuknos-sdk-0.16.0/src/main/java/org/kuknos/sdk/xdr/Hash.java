// Automatically generated by xdrgen
// DO NOT EDIT or your changes may be overwritten

package org.kuknos.sdk.xdr;


import java.io.IOException;

import java.util.Arrays;

// === xdr source ============================================================

//  typedef opaque Hash[32];

//  ===========================================================================
public class Hash implements XdrElement {
  private byte[] Hash;
  public byte[] getHash() {
    return this.Hash;
  }
  public void setHash(byte[] value) {
    this.Hash = value;
  }
  public static void encode(XdrDataOutputStream stream, Hash  encodedHash) throws IOException {
  int Hashsize = encodedHash.Hash.length;
  stream.write(encodedHash.getHash(), 0, Hashsize);
  }
  public void encode(XdrDataOutputStream stream) throws IOException {
    encode(stream, this);
  }
  public static Hash decode(XdrDataInputStream stream) throws IOException {
    Hash decodedHash = new Hash();
  int Hashsize = 32;
  decodedHash.Hash = new byte[Hashsize];
  stream.read(decodedHash.Hash, 0, Hashsize);
    return decodedHash;
  }
  @Override
  public int hashCode() {
    return Arrays.hashCode(this.Hash);
  }
  @Override
  public boolean equals(Object object) {
    if (object == null || !(object instanceof Hash)) {
      return false;
    }

    Hash other = (Hash) object;
    return Arrays.equals(this.Hash, other.Hash);
  }
}