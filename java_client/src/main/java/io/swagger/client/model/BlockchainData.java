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
 * details taken from a blockchain transaction - all fields optional
 */@ApiModel(description = "details taken from a blockchain transaction - all fields optional")
@javax.annotation.Generated(value = "io.swagger.codegen.languages.java.JavaClientCodegen", date = "2018-05-15T10:52:55.639+03:00")
public class BlockchainData {
@SerializedName("transaction_id")
  private String transactionId = null;
  @SerializedName("sender_address")
  private String senderAddress = null;
  @SerializedName("recipient_address")
  private String recipientAddress = null;
  
  public BlockchainData transactionId(String transactionId) {
    this.transactionId = transactionId;
    return this;
  }

  
  /**
  * Get transactionId
  * @return transactionId
  **/
  @ApiModelProperty(value = "")
  public String getTransactionId() {
    return transactionId;
  }
  public void setTransactionId(String transactionId) {
    this.transactionId = transactionId;
  }
  
  public BlockchainData senderAddress(String senderAddress) {
    this.senderAddress = senderAddress;
    return this;
  }

  
  /**
  * Get senderAddress
  * @return senderAddress
  **/
  @ApiModelProperty(value = "")
  public String getSenderAddress() {
    return senderAddress;
  }
  public void setSenderAddress(String senderAddress) {
    this.senderAddress = senderAddress;
  }
  
  public BlockchainData recipientAddress(String recipientAddress) {
    this.recipientAddress = recipientAddress;
    return this;
  }

  
  /**
  * Get recipientAddress
  * @return recipientAddress
  **/
  @ApiModelProperty(value = "")
  public String getRecipientAddress() {
    return recipientAddress;
  }
  public void setRecipientAddress(String recipientAddress) {
    this.recipientAddress = recipientAddress;
  }
  
  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    BlockchainData blockchainData = (BlockchainData) o;
    return Objects.equals(this.transactionId, blockchainData.transactionId) &&
        Objects.equals(this.senderAddress, blockchainData.senderAddress) &&
        Objects.equals(this.recipientAddress, blockchainData.recipientAddress);
  }

  @Override
  public int hashCode() {
    return Objects.hash(transactionId, senderAddress, recipientAddress);
  }
  
  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class BlockchainData {\n");
    
    sb.append("    transactionId: ").append(toIndentedString(transactionId)).append("\n");
    sb.append("    senderAddress: ").append(toIndentedString(senderAddress)).append("\n");
    sb.append("    recipientAddress: ").append(toIndentedString(recipientAddress)).append("\n");
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



