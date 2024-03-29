package com.etracker.ExpenseTracker.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.etracker.ExpenseTracker.model.Expense;

@Repository
public interface ExpenseRepository extends JpaRepository<Expense, Integer> {

}
