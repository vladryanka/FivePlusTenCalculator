package com.smorzhok.calculator;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        EditText editText = findViewById(R.id.editTextAnswer);
        Button button = findViewById(R.id.buttonAnswer);
        TextView correctAnswer = findViewById(R.id.textViewCorrectAnswer);
        TextView incorrectAnswer = findViewById(R.id.textViewIncorrectAnswer);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String text = editText.getText().toString();
                if (text.equals("15")){
                    correctAnswer.setVisibility(View.VISIBLE);
                    incorrectAnswer.setVisibility(View.GONE);
                } else
                {
                    correctAnswer.setVisibility(View.GONE);
                    incorrectAnswer.setVisibility(View.VISIBLE);
                }
            }
        });
    }
}