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
 * PagingCursors
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.java.JavaClientCodegen", date = "2018-10-31T11:02:17.956+02:00")
public class PagingCursors {
@SerializedName("after")
  private String after = null;
  @SerializedName("before")
  private String before = null;
  
  public PagingCursors after(String after) {
    this.after = after;
    return this;
  }

  
  /**
  * Get after
  * @return after
  **/
  @ApiModelProperty(example = "MTAxNTExOTQ1MjAwNzI5NDE", value = "")
  public String getAfter() {
    return after;
  }
  public void setAfter(String after) {
    this.after = after;
  }
  
  public PagingCursors before(String before) {
    this.before = before;
    return this;
  }

  
  /**
  * Get before
  * @return before
  **/
  @ApiModelProperty(example = "NDMyNzQyODI3OTQw", value = "")
  public String getBefore() {
    return before;
  }
  public void setBefore(String before) {
    this.before = before;
  }
  
  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PagingCursors pagingCursors = (PagingCursors) o;
    return Objects.equals(this.after, pagingCursors.after) &&
        Objects.equals(this.before, pagingCursors.before);
  }

  @Override
  public int hashCode() {
    return Objects.hash(after, before);
  }
  
  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PagingCursors {\n");
    
    sb.append("    after: ").append(toIndentedString(after)).append("\n");
    sb.append("    before: ").append(toIndentedString(before)).append("\n");
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



