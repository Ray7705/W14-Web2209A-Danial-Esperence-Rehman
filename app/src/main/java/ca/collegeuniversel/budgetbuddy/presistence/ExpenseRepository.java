package ca.collegeuniversel.budgetbuddy.presistence;

import android.content.ContentValues;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

import ca.collegeuniversel.budgetbuddy.entities.Expense;

public class ExpenseRepository {

    private DatabaseHelper helper;

    public ExpenseRepository(DatabaseHelper helper) {
        this.helper = Objects.requireNonNull(helper);
    }


    public List<Expense> getAll() {
        String query = "SELECT id, name, calories, quantity FROM Expenses;";

        SQLiteDatabase database = helper.getReadableDatabase();
        try (Cursor cursor = database.rawQuery(query, null)) {
            ArrayList<Expense> expenses = new ArrayList<>();
            while (cursor.moveToNext())
                expenses.add(readNextExpense(cursor));
            return expenses;
        }

    }

    public Expense get(long id) {
        String query = "SELECT id, title,amount, category FROM expenses WHERE id = ?;";

        String[] parameters = new String[]{String.valueOf(id)};

        SQLiteDatabase database = helper.getReadableDatabase();
        try (Cursor cursor = database.rawQuery(query, parameters)) {
            if (cursor.moveToNext())
                return readNextExpense(cursor);
            return null;
        }

    }

    private Expense readNextExpense(Cursor cursor) {
        long id = cursor.getLong(0);
        String title = cursor.getString(1);
        double amount = cursor.getInt(2);

        return new Expense(id, title, amount);
    }
    public Expense add(Expense expense) {
        Objects.requireNonNull(expense);

        ContentValues values = new ContentValues();
        values.put("title", expense.getTitle());
        values.put("amount", expense.getAmount());
        values.put("category", expense.getCategory());

        SQLiteDatabase database = helper.getWritableDatabase();
        long id = database.insert("items", null, values);
        if (id != -1)
            return new Expense(id, expense, id);
        return null;
    }
}