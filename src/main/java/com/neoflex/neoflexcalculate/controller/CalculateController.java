package com.neoflex.neoflexcalculate.controller;

import com.neoflex.neoflexcalculate.request.CalculateVacationPayRequest;
import com.neoflex.neoflexcalculate.service.VacationPayService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import javax.validation.Valid;
import java.math.BigDecimal;

@RestController
@RequiredArgsConstructor
@RequestMapping("/calculate")
public class CalculateController {
    private final VacationPayService vacationPayService;

    @GetMapping
    public BigDecimal calculate(@RequestParam @Valid CalculateVacationPayRequest request){
        return vacationPayService.calculateVacationPay(request);
    }
}
