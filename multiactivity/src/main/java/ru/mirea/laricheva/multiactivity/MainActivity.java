package ru.mirea.laricheva.multiactivity;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    private String TAG = MainActivity.class.getSimpleName().toString();
    private EditText editText;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void onSendDataToSecondActivity(View view){
        Intent secondIntent = new Intent(this, SecondActivity.class);
        editText = findViewById(R.id.editText);
        String text = editText.getText().toString();
        secondIntent.putExtra("key", "MIREA - Ларичева Мария Сергеевна\n" + text);
        startActivity(secondIntent);


    }

    @Override
    protected void onStart() {
        super.onStart();
        Log.d(TAG, "Invoke Start method");
    }

    @Override
    protected void onRestoreInstanceState(@NonNull Bundle savedInstanceState) {
        super.onRestoreInstanceState(savedInstanceState);
        Log.d(TAG, "Invoke RestoreInstanceState method");
//        String text = savedInstanceState.getString("data_value");
//        editText.setText(text);
    }

    @Override
    protected void onRestart() {
        super.onRestart();
        Log.d(TAG, "Invoke Restart method");
    }

    @Override
    protected void onPause() {
        super.onPause();
        Log.d(TAG, "Invoke Pause method");
    }

    @Override
    protected void onSaveInstanceState(@NonNull Bundle outState) {
        super.onSaveInstanceState(outState);
        Log.d(TAG, "Invoke SaveInstanceState method");
//        outState.putString("data_value", editText.getText().toString());
    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.d(TAG, "Invoke Stop method");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.d(TAG, "Invoke Destroy method");

    }

    @Override
    protected void onPostResume() {
        super.onPostResume();
        Log.d(TAG, "Invoke Resume method");
    }

    @Override
    protected void onPostCreate(@Nullable Bundle savedInstanceState) {
        super.onPostCreate(savedInstanceState);
        Log.d(TAG, "Invoke PostCreate method");
    }

    @Override
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        Log.d(TAG, "Invoke AttachedToWindow method");
    }

    @Override
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        Log.d(TAG, "Invoke DetachedFromWindow method");
    }
}