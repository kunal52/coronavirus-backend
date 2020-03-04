package com.brtracker.coronavirusapi.controller;

import com.brtracker.coronavirusapi.controller.dto.ArticleDto;
import com.brtracker.coronavirusapi.model.Article;
import com.brtracker.coronavirusapi.model.News;
import com.brtracker.coronavirusapi.service.NewsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Pageable;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;


@RestController
@RequestMapping("news")
public class NewsController {

    @Autowired
    NewsService newsService;

    @GetMapping
    public ResponseEntity<List<ArticleDto>> getNews(Pageable pageable) {
        return ResponseEntity.ok(newsService.getNews(pageable));
    }

    @PostMapping("forceUpdate")
    public ResponseEntity<Void> forceUpdateNews() {
        newsService.fetchNews();
        return ResponseEntity.ok().build();
    }

}
