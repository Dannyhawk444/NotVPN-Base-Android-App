package com.example.notvpn;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.graphics.Color;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RelativeLayout;

import java.util.Random;

public class Settings_Menu extends AppCompatActivity{
    public String[] colorArray = {"#9dc4c3", "#a4b6c0", "566777", "#1c7097", "#e01449", "#8591ca", "#384936"};
    public RelativeLayout bck;
    @SuppressLint("ResourceType")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_settings__menu);

        //Background Randomize Button
        Button btn_ch = findViewById(R.id.floatingActionButton3);
        bck = findViewById(R.layout.activity_settings__menu);

        btn_ch.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Random i = new Random();
                int c = i.nextInt(7 - 1) + 1;

                bck.setBackgroundColor(Color.parseColor(colorArray[c]));
            }
        });

        Button button = findViewById(R.id.floatingActionButton2);
        button.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                openMainActivity();
            }
        });
    }

    private void openMainActivity() {
        Intent intent = new Intent(this, MainActivity.class);
        startActivity(intent);
    }



        }




