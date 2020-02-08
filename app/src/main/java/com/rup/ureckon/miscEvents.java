package com.rup.ureckon;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.CardView;
import android.view.View;

public class miscEvents extends AppCompatActivity {

    private CardView healthy_bites;
    private CardView biote_exp;
    private CardView think_tech;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_misc_events);

        healthy_bites = (CardView) findViewById(R.id.healthy_bites);
        biote_exp = (CardView) findViewById(R.id.biote_exp);
        think_tech = (CardView) findViewById(R.id.think_tech);

        healthy_bites.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(miscEvents.this, healthy_bites_register.class));
            }
        });

        biote_exp.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(miscEvents.this, biote_register.class));
            }
        });

        think_tech.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(miscEvents.this, thinktech_register.class));
            }
        });
    }
}
