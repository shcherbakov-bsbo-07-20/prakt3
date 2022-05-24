package ru.mirea.shcherbakov.resultactivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

import androidx.appcompat.app.AppCompatActivity;

public class DataActivity extends AppCompatActivity {
    private EditText universityText;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_data);
        universityText = findViewById(R.id.universityEdit);
    }

    public void sendResult(View view) {
        Intent intent = new Intent();
        intent.putExtra("name", universityText.getText().toString());
        setResult(RESULT_OK, intent);
        finish();
    }
}
