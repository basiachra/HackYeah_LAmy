package com.app.hackyeahlamy;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import com.app.hackyeahlamy.Paint.PaintView;
import android.util.DisplayMetrics;
import android.view.Menu;
import android.view.MenuInflater;

public class MainActivity extends AppCompatActivity {

    private PaintView paintView;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
            paintView = (PaintView) findViewById(R.id.paintView);
            DisplayMetrics metrics = new DisplayMetrics();
            getWindowManager().getDefaultDisplay().getMetrics(metrics);
            paintView.init(metrics);
        }

        @Override
        public boolean onCreateOptionsMenu(Menu menu) {
            MenuInflater menuInflater = getMenuInflater();
            menuInflater.inflate(R.menu.main, menu);
            return super.onCreateOptionsMenu(menu);
        }

}
