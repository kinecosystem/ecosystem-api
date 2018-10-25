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
import java.io.IOException;

/**
 * JWTBodyPaymentConfirmationPayment
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.java.JavaClientCodegen", date = "2018-10-25T17:08:07.569+03:00")
public class JWTBodyPaymentConfirmationPayment {
@SerializedName("blockchain")
  private String blockchain = null;
  @SerializedName("transaction_id")
  private String transactionId = null;
  
  public JWTBodyPaymentConfirmationPayment blockchain(String blockchain) {
    this.blockchain = blockchain;
    return this;
  }

  
  /**
  * identifier of the blockchain network the transaction was made on
  * @return blockchain
  **/
  @ApiModelProperty(value = "identifier of the blockchain network the transaction was made on")
  public String getBlockchain() {
    return blockchain;
  }
  public void setBlockchain(String blockchain) {
    this.blockchain = blockchain;
  }
  
  public JWTBodyPaymentConfirmationPayment transactionId(String transactionId) {
    this.transactionId = transactionId;
    return this;
  }

  
  /**
  * stellar identifier of the blockchain transaction
  * @return transactionId
  **/
  @ApiModelProperty(value = "stellar identifier of the blockchain transaction")
  public String getTransactionId() {
    return transactionId;
  }
  public void setTransactionId(String transactionId) {
    this.transactionId = transactionId;
  }
  
  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    JWTBodyPaymentConfirmationPayment jwTBodyPaymentConfirmationPayment = (JWTBodyPaymentConfirmationPayment) o;
    return Objects.equals(this.blockchain, jwTBodyPaymentConfirmationPayment.blockchain) &&
        Objects.equals(this.transactionId, jwTBodyPaymentConfirmationPayment.transactionId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(blockchain, transactionId);
  }
  
  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class JWTBodyPaymentConfirmationPayment {\n");
    
    sb.append("    blockchain: ").append(toIndentedString(blockchain)).append("\n");
    sb.append("    transactionId: ").append(toIndentedString(transactionId)).append("\n");
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



