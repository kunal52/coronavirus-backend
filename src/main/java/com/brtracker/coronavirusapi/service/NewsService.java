package com.brtracker.coronavirusapi.service;

import com.brtracker.coronavirusapi.controller.dto.ArticleDto;
import org.springframework.data.domain.Pageable;

import java.util.List;

public interface NewsService {

    List<ArticleDto> getNews(Pageable pageable);

    void fetchNews();

}
