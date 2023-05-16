package com.neoflex.neoflexcalculate.service;

import com.neoflex.neoflexcalculate.request.CalculateVacationPayRequest;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.math.BigDecimal;
import java.util.concurrent.TimeUnit;

@Service
@AllArgsConstructor
public class VacationPayService {


    public BigDecimal calculateVacationPay(CalculateVacationPayRequest request){
        BigDecimal salaryPerDay = request.getAverageSalary().divide(BigDecimal.valueOf(12)).divide(BigDecimal.valueOf(29.5));
        long diffInMillis = Math.abs(request.getVacationEnd().getTime() - request.getVacationStart().getTime());
        long workingDays = TimeUnit.DAYS.convert(diffInMillis, TimeUnit.MILLISECONDS);
        return salaryPerDay.multiply(BigDecimal.valueOf(workingDays));
    }
}
