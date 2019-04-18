package com.example.tugas2;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class VerifyAccount extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_verify_account);
    }

    public void onClickSendVerifyToken(View view) {
        Intent onVerifyAccount = new Intent(this, UserHome.class);
        startActivity(onVerifyAccount);
    }
}
