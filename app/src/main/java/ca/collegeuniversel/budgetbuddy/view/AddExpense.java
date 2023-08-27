package ca.collegeuniversel.budgetbuddy.view;

import android.content.Context;
import android.icu.text.Transliterator;
import android.os.Bundle;
import android.util.AttributeSet;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.Spinner;
import android.widget.Toast;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import ca.collegeuniversel.budgetbuddy.R;

public class AddExpense extends LinearLayout {
    private EditText Title, Amount;
    private Spinner Spinner_category;

    public AddExpense(Context context) {
        super(context);
        inflate(context, R.layout.activity_add_expense, this);
        Title = findViewById(R.id.edit_Text_title);
        Amount = findViewById(R.id.edit_Text_amount);
        Spinner_category = findViewById(R.id.spinner_category);
    }

    public AddExpense(Context context, @Nullable AttributeSet attrs) {
        super(context, attrs);
        inflate(context, R.layout.activity_add_expense,this);
        Title= findViewById(R.id.edit_Text_title);
        Amount= findViewById(R.id.edit_Text_amount);
        Spinner_category= findViewById(R.id.spinner_category);
    }

    public void setTitle(String title) {
        Title.setText(title);
    }

    public void setAmount(double amount){
        Amount.setText(Double.toString(amount));
    }
    public void setSpinner_category(String spinner_category) {
        ArrayAdapter<String> adapter = (ArrayAdapter<String>) Spinner_category.getAdapter();
        int position = adapter.getPosition(spinner_category);
        Spinner_category.setSelection(position);
    }


}

