package ru.mirea.laricheva.toastapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class
MainActivity extends AppCompatActivity {

    private Toast toast;
    private EditText editText;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void onClickButton(View view){
        editText = findViewById(R.id.editTextTextPersonName);
        int count = editText.getText().toString().length();
        toast = Toast.makeText(getApplicationContext(),
                String.format("СТУДЕНТ №17 ГРУППА БСБО-01-20 Количество символов - %s", count),
                Toast.LENGTH_SHORT);
        toast.show();
    }
}