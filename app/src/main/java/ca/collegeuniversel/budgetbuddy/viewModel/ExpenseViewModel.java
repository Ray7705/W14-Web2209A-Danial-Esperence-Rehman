package ca.collegeuniversel.budgetbuddy.viewModel;

import androidx.lifecycle.ViewModel;

import java.util.ArrayList;
import java.util.List;

import ca.collegeuniversel.budgetbuddy.entities.Expense;

public class ExpenseViewModel extends ViewModel {
    private final List<Expense> expenses = new ArrayList<>();

    public void addExpense(Expense expense) {
        expenses.add(expense);
    }

    public List<Expense> getExpenses() {
        return expenses;
    }
}
