package com.neoflex.neoflexcalculate.request;

import lombok.AllArgsConstructor;
import lombok.Data;

import javax.validation.constraints.Future;
import javax.validation.constraints.Min;
import java.math.BigDecimal;
import java.util.Date;

@Data
@AllArgsConstructor
public class CalculateVacationPayRequest {
    @Min(0)
    private BigDecimal averageSalary;
    @Future
    private Date vacationStart;
    @Future
    private Date vacationEnd;
}
