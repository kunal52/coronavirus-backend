package com.brtracker.coronavirusapi.repository;

import com.brtracker.coronavirusapi.entity.ArticleEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ArticleRepository extends JpaRepository<ArticleEntity,String> {
}
