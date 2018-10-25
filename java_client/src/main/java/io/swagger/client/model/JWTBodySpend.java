/*
 * Kin Ecosystem
 * Apis for client to server interaction
 *
 * OpenAPI spec version: 1.0.0
 * 
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */


package io.swagger.client.model;

import java.util.Objects;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import io.swagger.client.model.JWTBodyPartOffer;
import io.swagger.client.model.JWTBodyPartSender;
import java.io.IOException;
import java.math.BigDecimal;

/**
 * JWTBodySpend
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.java.JavaClientCodegen", date = "2018-10-25T17:08:07.569+03:00")
public class JWTBodySpend {
@SerializedName("iat")
  private BigDecimal iat = null;
  @SerializedName("iss")
  private String iss = null;
  @SerializedName("exp")
  private BigDecimal exp = null;
  
    /**
   * subject
   */
  @JsonAdapter(SubEnum.Adapter.class)
  public enum SubEnum {
    
    REGISTER("register"),
    SPEND("spend"),
    EARN("earn"),
    PAY_TO_USER("pay_to_user"),
    PAYMENT_CONFIRMATION("payment_confirmation");

    private String value;

    SubEnum(String value) {
      this.value = value;
    }
    
    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }
    
    public static SubEnum fromValue(String text) {
      for (SubEnum b : SubEnum.values()) {
        if (String.valueOf(b.value).equals(text)) {
          return b;
        }
      }
      return null;
    }
    
    public static class Adapter extends TypeAdapter<SubEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final SubEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public SubEnum read(final JsonReader jsonReader) throws IOException {
        String value = jsonReader.nextString();
        return SubEnum.fromValue(String.valueOf(value));
      }
    }
  }
  
  @SerializedName("sub")
  private SubEnum sub = null;
  @SerializedName("offer")
  private JWTBodyPartOffer offer = null;
  @SerializedName("sender")
  private JWTBodyPartSender sender = null;
  
  public JWTBodySpend iat(BigDecimal iat) {
    this.iat = iat;
    return this;
  }

  
  /**
  * issued at - seconds from epoc
  * @return iat
  **/
  @ApiModelProperty(required = true, value = "issued at - seconds from epoc")
  public BigDecimal getIat() {
    return iat;
  }
  public void setIat(BigDecimal iat) {
    this.iat = iat;
  }
  
  public JWTBodySpend iss(String iss) {
    this.iss = iss;
    return this;
  }

  
  /**
  * issuer name, the same as app_id (kik)
  * @return iss
  **/
  @ApiModelProperty(required = true, value = "issuer name, the same as app_id (kik)")
  public String getIss() {
    return iss;
  }
  public void setIss(String iss) {
    this.iss = iss;
  }
  
  public JWTBodySpend exp(BigDecimal exp) {
    this.exp = exp;
    return this;
  }

  
  /**
  * expiration - seconds from epoc
  * @return exp
  **/
  @ApiModelProperty(required = true, value = "expiration - seconds from epoc")
  public BigDecimal getExp() {
    return exp;
  }
  public void setExp(BigDecimal exp) {
    this.exp = exp;
  }
  
  public JWTBodySpend sub(SubEnum sub) {
    this.sub = sub;
    return this;
  }

  
  /**
  * subject
  * @return sub
  **/
  @ApiModelProperty(required = true, value = "subject")
  public SubEnum getSub() {
    return sub;
  }
  public void setSub(SubEnum sub) {
    this.sub = sub;
  }
  
  public JWTBodySpend offer(JWTBodyPartOffer offer) {
    this.offer = offer;
    return this;
  }

  
  /**
  * Get offer
  * @return offer
  **/
  @ApiModelProperty(required = true, value = "")
  public JWTBodyPartOffer getOffer() {
    return offer;
  }
  public void setOffer(JWTBodyPartOffer offer) {
    this.offer = offer;
  }
  
  public JWTBodySpend sender(JWTBodyPartSender sender) {
    this.sender = sender;
    return this;
  }

  
  /**
  * Get sender
  * @return sender
  **/
  @ApiModelProperty(required = true, value = "")
  public JWTBodyPartSender getSender() {
    return sender;
  }
  public void setSender(JWTBodyPartSender sender) {
    this.sender = sender;
  }
  
  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    JWTBodySpend jwTBodySpend = (JWTBodySpend) o;
    return Objects.equals(this.iat, jwTBodySpend.iat) &&
        Objects.equals(this.iss, jwTBodySpend.iss) &&
        Objects.equals(this.exp, jwTBodySpend.exp) &&
        Objects.equals(this.sub, jwTBodySpend.sub) &&
        Objects.equals(this.offer, jwTBodySpend.offer) &&
        Objects.equals(this.sender, jwTBodySpend.sender);
  }

  @Override
  public int hashCode() {
    return Objects.hash(iat, iss, exp, sub, offer, sender);
  }
  
  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class JWTBodySpend {\n");
    
    sb.append("    iat: ").append(toIndentedString(iat)).append("\n");
    sb.append("    iss: ").append(toIndentedString(iss)).append("\n");
    sb.append("    exp: ").append(toIndentedString(exp)).append("\n");
    sb.append("    sub: ").append(toIndentedString(sub)).append("\n");
    sb.append("    offer: ").append(toIndentedString(offer)).append("\n");
    sb.append("    sender: ").append(toIndentedString(sender)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }

  
}



