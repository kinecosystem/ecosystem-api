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
import java.util.ArrayList;
import java.util.List;

/**
 * MultiChoicePollAnswer
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.java.JavaClientCodegen", date = "2018-01-29T14:22:38.269+02:00")
public class MultiChoicePollAnswer {

    /**
   * Gets or Sets contentType
   */
  @JsonAdapter(ContentTypeEnum.Adapter.class)
  public enum ContentTypeEnum {
    
    MULTICHOICEPOLLANSWER("MultiChoicePollAnswer");

    private String value;

    ContentTypeEnum(String value) {
      this.value = value;
    }
    
    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }
    
    public static ContentTypeEnum fromValue(String text) {
      for (ContentTypeEnum b : ContentTypeEnum.values()) {
        if (String.valueOf(b.value).equals(text)) {
          return b;
        }
      }
      return null;
    }
    
    public static class Adapter extends TypeAdapter<ContentTypeEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final ContentTypeEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public ContentTypeEnum read(final JsonReader jsonReader) throws IOException {
        String value = jsonReader.nextString();
        return ContentTypeEnum.fromValue(String.valueOf(value));
      }
    }
  }
  
  @SerializedName("content_type")
  private ContentTypeEnum contentType = null;
  @SerializedName("answers")
  private List<Integer> answers = null;
  
  public MultiChoicePollAnswer contentType(ContentTypeEnum contentType) {
    this.contentType = contentType;
    return this;
  }

  
  /**
  * Get contentType
  * @return contentType
  **/
  @ApiModelProperty(value = "")
  public ContentTypeEnum getContentType() {
    return contentType;
  }
  public void setContentType(ContentTypeEnum contentType) {
    this.contentType = contentType;
  }
  
  public MultiChoicePollAnswer answers(List<Integer> answers) {
    this.answers = answers;
    return this;
  }

  public MultiChoicePollAnswer addAnswersItem(Integer answersItem) {
    
    if (this.answers == null) {
      this.answers = new ArrayList<Integer>();
    }
    
    this.answers.add(answersItem);
    return this;
  }
  
  /**
  * Get answers
  * @return answers
  **/
  @ApiModelProperty(value = "")
  public List<Integer> getAnswers() {
    return answers;
  }
  public void setAnswers(List<Integer> answers) {
    this.answers = answers;
  }
  
  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    MultiChoicePollAnswer multiChoicePollAnswer = (MultiChoicePollAnswer) o;
    return Objects.equals(this.contentType, multiChoicePollAnswer.contentType) &&
        Objects.equals(this.answers, multiChoicePollAnswer.answers);
  }

  @Override
  public int hashCode() {
    return Objects.hash(contentType, answers);
  }
  
  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class MultiChoicePollAnswer {\n");
    
    sb.append("    contentType: ").append(toIndentedString(contentType)).append("\n");
    sb.append("    answers: ").append(toIndentedString(answers)).append("\n");
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


