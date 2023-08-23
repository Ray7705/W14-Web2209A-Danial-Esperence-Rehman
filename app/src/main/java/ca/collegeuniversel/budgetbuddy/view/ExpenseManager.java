package ca.collegeuniversel.budgetbuddy.view;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.LinearLayout;

import androidx.annotation.Nullable;

import java.util.ArrayList;
import java.util.List;

import ca.collegeuniversel.budgetbuddy.entities.Expense;

public class ExpenseManager extends LinearLayout {
    private final List<Expense> expenses = new ArrayList<>();

    public ExpenseManager(Context context) {
        super(context);
    }

    public ExpenseManager(Context context, @Nullable AttributeSet attrs) {
        super(context, attrs);
    }

    public void addExpense(Expense expense) {
        expenses.add(expense);
    }

    public List<Expense> getExpenses() {
        return expenses;
    }
}

