package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    private int jumlah = 0;
    private TextView sumTextView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        sumTextView = (TextView) findViewById(R.id.mainTextView);
    }

    public void kali(View view) {
        jumlah *= 8;
        if (sumTextView != null) sumTextView.setText(Integer.toString(jumlah));
        Toast toast = Toast.makeText(this, R.string.increment_btn, Toast.LENGTH_LONG);
        toast.show();
    }

    public void tambah(View view) {
        jumlah += 6;
        if (sumTextView != null) sumTextView.setText(Integer.toString(jumlah));
        Toast toast = Toast.makeText(this, R.string.toast_btn, Toast.LENGTH_LONG);
        toast.show();
    }
}