package com.example.tugas2;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class OnBoarding extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_on_boarding);
    }

    public void onClickVerifyButton(View view) {
        Intent onVerifyAccount = new Intent(this, VerifyAccount.class);
        startActivity(onVerifyAccount);
    }
}
