// Automatically generated by xdrgen
// DO NOT EDIT or your changes may be overwritten

package org.kuknos.sdk.xdr;


import java.io.IOException;

import com.google.common.base.Objects;

// === xdr source ============================================================

//  struct SignedSurveyResponseMessage
//  {
//      Signature responseSignature;
//      SurveyResponseMessage response;
//  };

//  ===========================================================================
public class SignedSurveyResponseMessage implements XdrElement {
  public SignedSurveyResponseMessage () {}
  private Signature responseSignature;
  public Signature getResponseSignature() {
    return this.responseSignature;
  }
  public void setResponseSignature(Signature value) {
    this.responseSignature = value;
  }
  private SurveyResponseMessage response;
  public SurveyResponseMessage getResponse() {
    return this.response;
  }
  public void setResponse(SurveyResponseMessage value) {
    this.response = value;
  }
  public static void encode(XdrDataOutputStream stream, SignedSurveyResponseMessage encodedSignedSurveyResponseMessage) throws IOException{
    Signature.encode(stream, encodedSignedSurveyResponseMessage.responseSignature);
    SurveyResponseMessage.encode(stream, encodedSignedSurveyResponseMessage.response);
  }
  public void encode(XdrDataOutputStream stream) throws IOException {
    encode(stream, this);
  }
  public static SignedSurveyResponseMessage decode(XdrDataInputStream stream) throws IOException {
    SignedSurveyResponseMessage decodedSignedSurveyResponseMessage = new SignedSurveyResponseMessage();
    decodedSignedSurveyResponseMessage.responseSignature = Signature.decode(stream);
    decodedSignedSurveyResponseMessage.response = SurveyResponseMessage.decode(stream);
    return decodedSignedSurveyResponseMessage;
  }
  @Override
  public int hashCode() {
    return Objects.hashCode(this.responseSignature, this.response);
  }
  @Override
  public boolean equals(Object object) {
    if (object == null || !(object instanceof SignedSurveyResponseMessage)) {
      return false;
    }

    SignedSurveyResponseMessage other = (SignedSurveyResponseMessage) object;
    return Objects.equal(this.responseSignature, other.responseSignature) && Objects.equal(this.response, other.response);
  }
}
