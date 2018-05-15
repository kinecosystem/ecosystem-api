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
import io.swagger.client.model.Order;
import io.swagger.client.model.Paging;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 * a list of submitted orders
 */@ApiModel(description = "a list of submitted orders")
@javax.annotation.Generated(value = "io.swagger.codegen.languages.java.JavaClientCodegen", date = "2018-05-15T16:56:00.988+03:00")
public class OrderList {
@SerializedName("orders")
  private List<Order> orders = new ArrayList<Order>();
  @SerializedName("paging")
  private Paging paging = null;
  
  public OrderList orders(List<Order> orders) {
    this.orders = orders;
    return this;
  }

  public OrderList addOrdersItem(Order ordersItem) {
    
    this.orders.add(ordersItem);
    return this;
  }
  
  /**
  * Get orders
  * @return orders
  **/
  @ApiModelProperty(required = true, value = "")
  public List<Order> getOrders() {
    return orders;
  }
  public void setOrders(List<Order> orders) {
    this.orders = orders;
  }
  
  public OrderList paging(Paging paging) {
    this.paging = paging;
    return this;
  }

  
  /**
  * Get paging
  * @return paging
  **/
  @ApiModelProperty(value = "")
  public Paging getPaging() {
    return paging;
  }
  public void setPaging(Paging paging) {
    this.paging = paging;
  }
  
  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    OrderList orderList = (OrderList) o;
    return Objects.equals(this.orders, orderList.orders) &&
        Objects.equals(this.paging, orderList.paging);
  }

  @Override
  public int hashCode() {
    return Objects.hash(orders, paging);
  }
  
  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class OrderList {\n");
    
    sb.append("    orders: ").append(toIndentedString(orders)).append("\n");
    sb.append("    paging: ").append(toIndentedString(paging)).append("\n");
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



