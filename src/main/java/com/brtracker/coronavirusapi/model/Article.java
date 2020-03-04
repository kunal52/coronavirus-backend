
package com.brtracker.coronavirusapi.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import lombok.*;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "source",
    "author",
    "title",
    "description",
    "url",
    "urlToImage",
    "publishedAt",
    "content"
})
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
@ToString
public class Article {

    @JsonProperty("source")
    public Source source;
    @JsonProperty("author")
    public String author;
    @JsonProperty("title")
    public String title;
    @JsonProperty("description")
    public String description;
    @JsonProperty("url")
    public String url;
    @JsonProperty("urlToImage")
    public String urlToImage;
    @JsonProperty("publishedAt")
    public String publishedAt;
    @JsonProperty("content")
    public String content;

}
