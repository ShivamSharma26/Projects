package com.etracker.ExpenseTracker.model;

//import jakarta.persistence.Entity;
import lombok.*;

import javax.persistence.*;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@ToString
@Table(name="expenses")
public class Expense {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    private String edate;

    private String edesc;

    private int amt;
}
