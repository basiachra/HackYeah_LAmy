package com.app.hackyeahlamy;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import com.app.hackyeahlamy.Paint.PaintActivity;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void lol(View view){
        Intent intent = new Intent(this, PaintActivity.class);
        startActivity(intent);
    }
}
