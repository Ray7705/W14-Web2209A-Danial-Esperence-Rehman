package ca.collegeuniversel.budgetbuddy.entities;

import androidx.annotation.NonNull;

public class Expense {
    private  final long id;
    private String title;
    private double amount;
    private String category;

    public Expense(long id, String title, double amount) {
        this.id = id;
        this.title = title;
        this.amount = amount;
        this.category = category;
    }

    public Expense(long id, Expense expense, long id1) {
        this.id = id1;
    }


    @NonNull

    public String getTitle() {
        return title;
    }

    public double getAmount() {
        return amount;
    }

    public String getCategory() {
        return category;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }

    public void setCategory(String category) {
        this.category = category;
    }
}

