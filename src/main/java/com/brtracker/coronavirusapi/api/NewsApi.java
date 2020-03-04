package com.brtracker.coronavirusapi.api;

import com.brtracker.coronavirusapi.model.News;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@FeignClient(value = "newsApi", url = "http://newsapi.org/v2/")
public interface NewsApi {

    @GetMapping("/top-headlines")
    News getNews(@RequestParam("apiKey") String apiKey,@RequestParam("q")String query);

}
