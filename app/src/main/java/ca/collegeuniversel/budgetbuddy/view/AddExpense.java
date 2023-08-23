package ca.collegeuniversel.budgetbuddy.view;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

import ca.collegeuniversel.budgetbuddy.viewModel.ExpenseManager;
import ca.collegeuniversel.budgetbuddy.R;

public class AddExpense extends AppCompatActivity {
    private EditText Title, Amount;
    private Button add,cancel;
    private Spinner spinner_category;
    private ExpenseManager expenseManager;

    @Override
    protected  void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_add_expense);

        EditText Title = findViewById(R.id.edit_Text_title);
        EditText Amount = findViewById(R.id.edit_Text_amount);
        Spinner spinner_category = findViewById(R.id.spinner_category);
        Button add = findViewById(R.id.button_add);
        Button cancel= findViewById(R.id.button_cancel);

        expenseManager = new ExpenseManager(this);

        add.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String title = Title.getText().toString();
                double amount = Double.parseDouble(Amount.getText().toString());
                String selectedCategory = spinner_category .getSelectedItem().toString();toString();

                // Create a new Expense object


                // Add the new expense to the ExpenseManager


                // Show a confirmation message
                Toast.makeText(AddExpense.this, "Expense added", Toast.LENGTH_SHORT).show();

                // Close the activity and return to the previous screen
                finish();
            }
        });
    }
}
