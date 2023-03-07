package ru.mirea.laricheva.intentfilter;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private Toast toast;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void onClickButton(View view){
        Uri address = Uri.parse("https://www.mirea.ru/");
        Intent openLinkIntent = new Intent(Intent.ACTION_VIEW, address);
//        startActivity(openLinkIntent);
        if (openLinkIntent.resolveActivity(getPackageManager()) != null) {
                startActivity(openLinkIntent);
            }
        else {
                Log.d("Intent", "Не получается обработать намерение!");
                toast = Toast.makeText(getApplicationContext(),
                        "Не получается обработать намерение!",
                        Toast.LENGTH_SHORT);
                toast.show();
            }

    }

    public void onClickButton2(View view){

        Intent shareIntent = new Intent(Intent.ACTION_SEND);
        shareIntent.setType("text/plain");
        shareIntent.putExtra(Intent.EXTRA_SUBJECT, "MIREA");
        shareIntent.putExtra(Intent.EXTRA_TEXT, "Ларичева Мария Сергеевна");
        startActivity(Intent.createChooser(shareIntent, "МОИ ФИО"));
    }

}