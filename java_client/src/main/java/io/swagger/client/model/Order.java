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
import io.swagger.client.model.BlockchainData;
import io.swagger.client.model.Error;
import java.io.IOException;

/**
 * a submitted order. it can be pending/completed/failed
 */@ApiModel(description = "a submitted order. it can be pending/completed/failed")
@javax.annotation.Generated(value = "io.swagger.codegen.languages.java.JavaClientCodegen", date = "2018-10-25T17:08:07.569+03:00")
public class Order {
@SerializedName("id")
  private String id = null;
  @SerializedName("offer_id")
  private String offerId = null;
  
    /**
   * Gets or Sets offerType
   */
  @JsonAdapter(OfferTypeEnum.Adapter.class)
  public enum OfferTypeEnum {
    
    EARN("earn"),
    SPEND("spend");

    private String value;

    OfferTypeEnum(String value) {
      this.value = value;
    }
    
    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }
    
    public static OfferTypeEnum fromValue(String text) {
      for (OfferTypeEnum b : OfferTypeEnum.values()) {
        if (String.valueOf(b.value).equals(text)) {
          return b;
        }
      }
      return null;
    }
    
    public static class Adapter extends TypeAdapter<OfferTypeEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final OfferTypeEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public OfferTypeEnum read(final JsonReader jsonReader) throws IOException {
        String value = jsonReader.nextString();
        return OfferTypeEnum.fromValue(String.valueOf(value));
      }
    }
  }
  
  @SerializedName("offer_type")
  private OfferTypeEnum offerType = null;
  @SerializedName("title")
  private String title = null;
  @SerializedName("description")
  private String description = null;
  @SerializedName("amount")
  private Integer amount = null;
  @SerializedName("blockchain_data")
  private BlockchainData blockchainData = null;
  
    /**
   * the origin of the order
   */
  @JsonAdapter(OriginEnum.Adapter.class)
  public enum OriginEnum {
    
    MARKETPLACE("marketplace"),
    EXTERNAL("external");

    private String value;

    OriginEnum(String value) {
      this.value = value;
    }
    
    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }
    
    public static OriginEnum fromValue(String text) {
      for (OriginEnum b : OriginEnum.values()) {
        if (String.valueOf(b.value).equals(text)) {
          return b;
        }
      }
      return null;
    }
    
    public static class Adapter extends TypeAdapter<OriginEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final OriginEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public OriginEnum read(final JsonReader jsonReader) throws IOException {
        String value = jsonReader.nextString();
        return OriginEnum.fromValue(String.valueOf(value));
      }
    }
  }
  
  @SerializedName("origin")
  private OriginEnum origin = null;
  @SerializedName("result")
  private Object result = null;
  
    /**
   * Gets or Sets status
   */
  @JsonAdapter(StatusEnum.Adapter.class)
  public enum StatusEnum {
    
    PENDING("pending"),
    COMPLETED("completed"),
    FAILED("failed");

    private String value;

    StatusEnum(String value) {
      this.value = value;
    }
    
    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }
    
    public static StatusEnum fromValue(String text) {
      for (StatusEnum b : StatusEnum.values()) {
        if (String.valueOf(b.value).equals(text)) {
          return b;
        }
      }
      return null;
    }
    
    public static class Adapter extends TypeAdapter<StatusEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final StatusEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public StatusEnum read(final JsonReader jsonReader) throws IOException {
        String value = jsonReader.nextString();
        return StatusEnum.fromValue(String.valueOf(value));
      }
    }
  }
  
  @SerializedName("status")
  private StatusEnum status = null;
  @SerializedName("completion_date")
  private String completionDate = null;
  @SerializedName("call_to_action")
  private String callToAction = null;
  @SerializedName("content")
  private String content = null;
  @SerializedName("error")
  private Error error = null;
  
  public Order id(String id) {
    this.id = id;
    return this;
  }

  
  /**
  * unique identifier of this item
  * @return id
  **/
  @ApiModelProperty(required = true, value = "unique identifier of this item")
  public String getId() {
    return id;
  }
  public void setId(String id) {
    this.id = id;
  }
  
  public Order offerId(String offerId) {
    this.offerId = offerId;
    return this;
  }

  
  /**
  * the offer which this order was created from
  * @return offerId
  **/
  @ApiModelProperty(required = true, value = "the offer which this order was created from")
  public String getOfferId() {
    return offerId;
  }
  public void setOfferId(String offerId) {
    this.offerId = offerId;
  }
  
  public Order offerType(OfferTypeEnum offerType) {
    this.offerType = offerType;
    return this;
  }

  
  /**
  * Get offerType
  * @return offerType
  **/
  @ApiModelProperty(required = true, value = "")
  public OfferTypeEnum getOfferType() {
    return offerType;
  }
  public void setOfferType(OfferTypeEnum offerType) {
    this.offerType = offerType;
  }
  
  public Order title(String title) {
    this.title = title;
    return this;
  }

  
  /**
  * usually a brand name
  * @return title
  **/
  @ApiModelProperty(example = "Spotify", required = true, value = "usually a brand name")
  public String getTitle() {
    return title;
  }
  public void setTitle(String title) {
    this.title = title;
  }
  
  public Order description(String description) {
    this.description = description;
    return this;
  }

  
  /**
  * Get description
  * @return description
  **/
  @ApiModelProperty(example = "completed poll", required = true, value = "")
  public String getDescription() {
    return description;
  }
  public void setDescription(String description) {
    this.description = description;
  }
  
  public Order amount(Integer amount) {
    this.amount = amount;
    return this;
  }

  
  /**
  * kin amount
  * @return amount
  **/
  @ApiModelProperty(required = true, value = "kin amount")
  public Integer getAmount() {
    return amount;
  }
  public void setAmount(Integer amount) {
    this.amount = amount;
  }
  
  public Order blockchainData(BlockchainData blockchainData) {
    this.blockchainData = blockchainData;
    return this;
  }

  
  /**
  * Get blockchainData
  * @return blockchainData
  **/
  @ApiModelProperty(required = true, value = "")
  public BlockchainData getBlockchainData() {
    return blockchainData;
  }
  public void setBlockchainData(BlockchainData blockchainData) {
    this.blockchainData = blockchainData;
  }
  
  public Order origin(OriginEnum origin) {
    this.origin = origin;
    return this;
  }

  
  /**
  * the origin of the order
  * @return origin
  **/
  @ApiModelProperty(required = true, value = "the origin of the order")
  public OriginEnum getOrigin() {
    return origin;
  }
  public void setOrigin(OriginEnum origin) {
    this.origin = origin;
  }
  
  public Order result(Object result) {
    this.result = result;
    return this;
  }

  
  /**
  * * empty when no result (pending status, completed earn) * coupon code or confirm payment JWT when completed spend 
  * @return result
  **/
  @ApiModelProperty(value = "* empty when no result (pending status, completed earn) * coupon code or confirm payment JWT when completed spend ")
  public Object getResult() {
    return result;
  }
  public void setResult(Object result) {
    this.result = result;
  }
  
  public Order status(StatusEnum status) {
    this.status = status;
    return this;
  }

  
  /**
  * Get status
  * @return status
  **/
  @ApiModelProperty(required = true, value = "")
  public StatusEnum getStatus() {
    return status;
  }
  public void setStatus(StatusEnum status) {
    this.status = status;
  }
  
  public Order completionDate(String completionDate) {
    this.completionDate = completionDate;
    return this;
  }

  
  /**
  * UTC ISO
  * @return completionDate
  **/
  @ApiModelProperty(example = "2018-09-13T14:33:33Z", required = true, value = "UTC ISO")
  public String getCompletionDate() {
    return completionDate;
  }
  public void setCompletionDate(String completionDate) {
    this.completionDate = completionDate;
  }
  
  public Order callToAction(String callToAction) {
    this.callToAction = callToAction;
    return this;
  }

  
  /**
  * Get callToAction
  * @return callToAction
  **/
  @ApiModelProperty(example = "tap to reveal coupon", value = "")
  public String getCallToAction() {
    return callToAction;
  }
  public void setCallToAction(String callToAction) {
    this.callToAction = callToAction;
  }
  
  public Order content(String content) {
    this.content = content;
    return this;
  }

  
  /**
  * optional json payload defining a coupon page
  * @return content
  **/
  @ApiModelProperty(value = "optional json payload defining a coupon page")
  public String getContent() {
    return content;
  }
  public void setContent(String content) {
    this.content = content;
  }
  
  public Order error(Error error) {
    this.error = error;
    return this;
  }

  
  /**
  * Get error
  * @return error
  **/
  @ApiModelProperty(value = "")
  public Error getError() {
    return error;
  }
  public void setError(Error error) {
    this.error = error;
  }
  
  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Order order = (Order) o;
    return Objects.equals(this.id, order.id) &&
        Objects.equals(this.offerId, order.offerId) &&
        Objects.equals(this.offerType, order.offerType) &&
        Objects.equals(this.title, order.title) &&
        Objects.equals(this.description, order.description) &&
        Objects.equals(this.amount, order.amount) &&
        Objects.equals(this.blockchainData, order.blockchainData) &&
        Objects.equals(this.origin, order.origin) &&
        Objects.equals(this.result, order.result) &&
        Objects.equals(this.status, order.status) &&
        Objects.equals(this.completionDate, order.completionDate) &&
        Objects.equals(this.callToAction, order.callToAction) &&
        Objects.equals(this.content, order.content) &&
        Objects.equals(this.error, order.error);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, offerId, offerType, title, description, amount, blockchainData, origin, result, status, completionDate, callToAction, content, error);
  }
  
  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Order {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    offerId: ").append(toIndentedString(offerId)).append("\n");
    sb.append("    offerType: ").append(toIndentedString(offerType)).append("\n");
    sb.append("    title: ").append(toIndentedString(title)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    amount: ").append(toIndentedString(amount)).append("\n");
    sb.append("    blockchainData: ").append(toIndentedString(blockchainData)).append("\n");
    sb.append("    origin: ").append(toIndentedString(origin)).append("\n");
    sb.append("    result: ").append(toIndentedString(result)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("    completionDate: ").append(toIndentedString(completionDate)).append("\n");
    sb.append("    callToAction: ").append(toIndentedString(callToAction)).append("\n");
    sb.append("    content: ").append(toIndentedString(content)).append("\n");
    sb.append("    error: ").append(toIndentedString(error)).append("\n");
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



