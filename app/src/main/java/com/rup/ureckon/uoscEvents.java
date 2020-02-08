package com.rup.ureckon;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.CardView;
import android.view.View;

public class uoscEvents extends AppCompatActivity {

    private CardView urecka;
    private CardView cluex;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_uosc_events);

        urecka = (CardView) findViewById(R.id.urecka);
        cluex = (CardView) findViewById(R.id.cluex);

        urecka.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(uoscEvents.this, urecka_register.class));
            }
        });

        cluex.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(uoscEvents.this, cluex_register.class));
            }
        });
    }
}
