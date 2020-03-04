
package com.brtracker.coronavirusapi.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

import java.util.List;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "status",
    "totalResults",
    "articles"
})
public class News {

    @JsonProperty("status")
    public String status;
    @JsonProperty("totalResults")
    public Integer totalResults;
    @JsonProperty("articles")
    public List<Article> articles = null;

}
