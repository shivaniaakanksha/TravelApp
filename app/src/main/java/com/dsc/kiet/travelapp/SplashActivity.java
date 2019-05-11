package com.dsc.kiet.travelapp;

import android.content.Intent;
import android.os.Handler;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Window;
import android.view.WindowManager;
import android.widget.ImageView;
import android.widget.TextView;

public class SplashActivity extends AppCompatActivity {




    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash);

        ImageView logo=findViewById(R.id.logoSplash);

        logo.animate().alpha(1.0f).scaleX(1.1f).scaleY(1.1f).setDuration(2500);

        {
            new Handler().postDelayed(new Runnable() {
                @Override
                public void run() {
                    {
                        Intent i = new Intent(getApplicationContext(), MainActivity.class);
                        startActivity(i);
                        finish();
                        finishActivity(0);
                    }
                }
            }, 2600);
        }


    }

}
