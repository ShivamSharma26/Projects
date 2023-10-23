package com.etracker.ExpenseTracker.controller;

import com.etracker.ExpenseTracker.model.Expense;
import org.jetbrains.annotations.NotNull;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import com.etracker.ExpenseTracker.model.CreateExpenseRequest;
import java.util.ArrayList;
import java.util.List;
import com.etracker.ExpenseTracker.service.ExpenseService;
import org.springframework.web.bind.annotation.RestController;

import javax.validation.Valid;

@RestController
public class ExpenseController {

    private static Logger logger = LoggerFactory.getLogger(ExpenseController.class);
    /*@GetMapping("/expense")
    public Expense getExpense() {
        return new Expense(1,"09/10/2023","Book",500);
    }*/

   /* @GetMapping("/students")
    public List<Expense> getExpenses(){
        List<Expense> expenses = new ArrayList<>();
        expenses.add(new Expense(1,"08/10/2023","Pen",10));
        expenses.add(new Expense(2,"08/10/2023","Pencil",10));
        expenses.add(new Expense(3,"08/10/2023","Mobile",10000));
        expenses.add(new Expense(4,"08/10/2023","Laptop",100000));
        expenses.add(new Expense(5,"08/10/2023","Shirt",1000));
        return expenses;
    }*/

    @Autowired
    ExpenseService expenseService;

    @PostMapping("/expense")
    public void createExpense(@Valid @RequestBody CreateExpenseRequest createExpenseRequest){
        logger.info("CreateExpenseRequest : {}", createExpenseRequest);
        logger.info("Saving information into DB");

        expenseService.createExpense(createExpenseRequest);

    }

    @GetMapping("/expense")
    public Expense getExpenseById(@RequestParam("id") int id)  {

        return expenseService.getExpense(id);

    }

    @GetMapping("/expense/all")
    public static @NotNull List<Expense> getAllExpenses(){

        return ExpenseService.getExpenses();

    }

}
