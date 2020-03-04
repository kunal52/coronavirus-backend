package com.brtracker.coronavirusapi.service.impl;

import com.brtracker.coronavirusapi.api.NewsApi;
import com.brtracker.coronavirusapi.controller.dto.ArticleDto;
import com.brtracker.coronavirusapi.entity.ArticleEntity;
import com.brtracker.coronavirusapi.model.Article;
import com.brtracker.coronavirusapi.model.News;
import com.brtracker.coronavirusapi.repository.ArticleRepository;
import com.brtracker.coronavirusapi.service.NewsService;
import com.brtracker.coronavirusapi.utils.ObjectMapperUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Pageable;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.logging.Logger;
import java.util.stream.Collectors;

@Service
public class NewsServiceImpl implements NewsService {

    private final Logger logger = Logger.getLogger(NewsServiceImpl.class.getSimpleName());

    @Autowired
    NewsApi newsApi;

    @Autowired
    ArticleRepository articleRepository;

    @Autowired
    ObjectMapperUtils objectMapperUtils;


    @Override
    public List<ArticleDto> getNews(Pageable pageable) {
        return objectMapperUtils.mapAll(articleRepository.findAll(pageable).get().collect(Collectors.toList()), ArticleDto.class);
    }

    @Override
    @Scheduled(fixedRate = 200000)
    public void fetchNews() {
        News news = newsApi.getNews("7965fb9a95fe47d7ade6c35a1e3c1d15", "coronavirus");
        List<Article> articles = news.articles;
        List<ArticleEntity> articleEntities = objectMapperUtils.mapAll(articles, ArticleEntity.class);
        articleRepository.saveAll(articleEntities);
    }


}
