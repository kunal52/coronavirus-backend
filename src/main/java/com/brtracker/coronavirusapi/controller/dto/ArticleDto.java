package com.brtracker.coronavirusapi.controller.dto;


import lombok.*;

@Builder
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class ArticleDto {

    String source;
    String author;
    String url;
    String title;
    String description;
    String urlToImage;
    String publishedAt;
    String content;

}
