package ca.collegeuniversel.budgetbuddy;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class AddExpense extends AppCompatActivity {
    private EditText Title, Amount;
    private Button add,cancel;
    private Spinner CategorySpinner;
    private ExpenseManager expenseManager;

    @Override
    protected  void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_add_expense);

        EditText Title = findViewById(R.id.editTextTitle);
        EditText Amount = findViewById(R.id.editTextAmount);
        Spinner CategorySpinner = findViewById(R.id.categorySpinner);
        Button add = findViewById(R.id.add);
        Button cancel= findViewById(R.id.cancel);

        expenseManager = new ExpenseManager(this);

        add.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String title = Title.getText().toString();
                double amount = Double.parseDouble(Amount.getText().toString());
                String selectedCategory = CategorySpinner.getSelectedItem().toString();toString();

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
