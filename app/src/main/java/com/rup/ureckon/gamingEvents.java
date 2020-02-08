package com.rup.ureckon;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.CardView;
import android.view.View;

public class gamingEvents extends AppCompatActivity {

    private CardView rainbow_six;
    private CardView pubg;
    private CardView fifa;
    private CardView csgo;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_gaming_events);

        rainbow_six= (CardView) findViewById(R.id.rainbow_six_seige);
        pubg= (CardView) findViewById(R.id.pubg);
        fifa= (CardView) findViewById(R.id.fifa);
        csgo= (CardView) findViewById(R.id.csgo);

        rainbow_six.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(gamingEvents.this, rainbow_six_seige_register.class));
            }
        });

        pubg.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(gamingEvents.this, pubg_register.class));
            }
        });

        fifa.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(gamingEvents.this, fifa_register.class));
            }
        });

        csgo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(gamingEvents.this, csgo_register.class));
            }
        });
    }
}
