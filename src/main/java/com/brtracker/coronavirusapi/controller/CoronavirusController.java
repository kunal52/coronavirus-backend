package com.brtracker.coronavirusapi.controller;

import com.brtracker.coronavirusapi.controller.dto.TotalDto;
import com.brtracker.coronavirusapi.service.CoronaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("corona")
public class CoronavirusController {

    @Autowired
    CoronaService coronaService;

    @GetMapping("total")
    public ResponseEntity<TotalDto> getTotals()
    {
        return ResponseEntity.ok(coronaService.getTotal());
    }

}
