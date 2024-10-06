package com.example.pizzarecipes;

import android.content.Intent;
import android.os.Bundle;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class SplashActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_splash);
        Thread t=new Thread(){
            @Override
            public void run(){
                try {
                    sleep(5000);
                    Intent intent=new Intent(SplashActivity.this,ListPizzaActivity.class);
                    startActivity(intent);

                }
                catch (InterruptedException e){e.printStackTrace();}
            }
        };
        t.start();
    }
}