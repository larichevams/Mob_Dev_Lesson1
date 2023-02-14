package ru.mirea.laricheva.lesson1.buttonclicker;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

//    @Override

    private TextView textViewStudent;
    private Button btnWhoAmI;
    private Button btnItIsNotMe ;
    private CheckBox chBox;

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        textViewStudent = findViewById(R.id.tvOut);
        btnWhoAmI = findViewById(R.id.btnWhoAmI);
        btnItIsNotMe = findViewById(R.id.btnItIsNotMe);
        chBox = findViewById(R.id.checkBox);

        View.OnClickListener oclBtnWhoAmI = new View.OnClickListener() {
//            @Override
            public void onClick(View v) {
                textViewStudent.setText("Мой номер по списку №17");
                chBox.setChecked(!chBox.isChecked());
            }
        };

        btnWhoAmI.setOnClickListener(oclBtnWhoAmI);
    }

    public void oclBtnItIsNotMe(View v)
    {
        textViewStudent.setText("Это не я!");
        chBox.setChecked(!chBox.isChecked());
    }
}