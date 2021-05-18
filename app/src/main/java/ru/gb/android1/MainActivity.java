package ru.gb.android1;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Color;
import android.os.Bundle;
import android.text.Layout;
import android.view.View;
import android.widget.Button;
import android.widget.CalendarView;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.CompoundButton.OnCheckedChangeListener;
import android.widget.EditText;
import android.widget.Switch;
import android.widget.TextView;
import android.widget.ToggleButton;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        mainLayout();
    }

    private void mainLayout() {
        setContentView(R.layout.activity_main);
        TextView textView;
        Button button;
        EditText num1;
        EditText num2;
        Button resultButton;
        TextView resultText;
        Switch switch1;
        CheckBox checkBox;
        ToggleButton toggleButton;

        textView = findViewById(R.id.textView);
        button = findViewById(R.id.button);
        num1 = findViewById(R.id.num1);
        num2 = findViewById(R.id.num2);
        resultButton = findViewById(R.id.resultButton);
        resultText = findViewById(R.id.resultText);
        switch1 = findViewById(R.id.switch1);
        checkBox = findViewById(R.id.checkBox);
        toggleButton = findViewById(R.id.toggleButton);

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                secondLayout();
            }
        });

        resultButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int sum = Integer.parseInt(num1.getText().toString()) + Integer.parseInt(num2.getText().toString());
                resultText.setText(Integer.toString(sum));
            }
        });

        switch1.setOnCheckedChangeListener(new OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if (isChecked) {
                    textView.setTextColor(Color.parseColor(getString(R.color.red)));
                } else {
                    textView.setTextColor(Color.parseColor(getString(R.color.green)));
                }
            }
        });

        checkBox.setChecked(true);
        checkBox.setOnCheckedChangeListener(new OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if (checkBox.isChecked()) {
                    checkBox.setChecked(true);
                    toggleButton.setChecked(false);
                } else {
                    checkBox.setChecked(false);
                    toggleButton.setChecked(true);
                }
            }
        });

        toggleButton.setOnCheckedChangeListener(new OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if (toggleButton.isChecked()) {
                    toggleButton.setChecked(true);
                    checkBox.setChecked(false);
                } else {
                    toggleButton.setChecked(false);
                    checkBox.setChecked(true);
                }
            }
        });
    }

    private void secondLayout() {
        setContentView(R.layout.second_layout);
        TextView textView2;
        Button button2;
        EditText text;
        EditText textPersonName;
        EditText phone;
        EditText number;
        EditText textPassword;
        EditText textEmailAddress;
        CalendarView calendarView;

        textView2 = findViewById(R.id.textView2);
        button2 = findViewById(R.id.button2);
        text = findViewById(R.id.text);
        textPersonName = findViewById(R.id.textPersonName);
        phone = findViewById(R.id.phone);
        number = findViewById(R.id.number);
        textPassword = findViewById(R.id.textPassword);
        textEmailAddress = findViewById(R.id.textEmailAddress);
        calendarView = findViewById(R.id.calendarView);

        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mainLayout();
            }
        });
    }
}