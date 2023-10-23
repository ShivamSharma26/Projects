package com.etracker.ExpenseTracker.model;

import lombok.*;
import javax.validation.constraints.NotBlank;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@ToString
@Builder
public class CreateExpenseRequest {

    @NotBlank(message = "Expense Date can not be empty.")
    private String edate;

    private String edesc;

    private int amt;

    public Expense to(){
        return Expense.builder()
                .edate(edate)
                .edesc(edesc)
                .amt(amt)
                .build();
    }

}
