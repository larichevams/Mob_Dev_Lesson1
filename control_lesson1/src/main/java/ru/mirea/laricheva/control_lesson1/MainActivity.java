package ru.mirea.laricheva.control_lesson1;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        TextView tv = findViewById(R.id.textViewStudentNew);
        TextView myTextView = (TextView) findViewById(R.id.textViewNew);
        myTextView.setText("New text in MIREA");
        tv.setText("Hello, students!");
        Button button = findViewById(R.id.buttonNew);
        button.setText("MireaButton");
        CheckBox checkBox = findViewById(R.id.checkBoxNew);
        checkBox.setChecked(true);
    }
}