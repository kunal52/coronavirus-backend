package com.brtracker.coronavirusapi.service;

import com.brtracker.coronavirusapi.controller.dto.TotalDto;

public interface CoronaService {

    TotalDto getTotal();
    void fetchVirusData();


}
