package com.etracker.ExpenseTracker.service;

import org.jetbrains.annotations.NotNull;
import org.springframework.stereotype.Service;
import com.etracker.ExpenseTracker.model.CreateExpenseRequest;
import com.etracker.ExpenseTracker.model.Expense;
import com.etracker.ExpenseTracker.repository.ExpenseRepository;
import org.springframework.beans.factory.annotation.Autowired;
import java.util.Optional;
import java.util.List;

@Service
public class ExpenseService {
    @Autowired
    ExpenseRepository expenseRepository;


    public void createExpense(CreateExpenseRequest createExpenseRequest) {

        Expense expense = createExpenseRequest.to();
        expenseRepository.save(expense);
    }

    public Expense getExpense(int id)
    {

       Optional<Expense> expenseOptional = expenseRepository.findById(id);

       if(expenseOptional.isPresent()){
           return expenseOptional.get();
       }

      return expenseRepository.findById(id).orElse(null);


    }

    public static  List<Expense> getExpenses() {

        return expenseRepository.findAll();
    }
}


