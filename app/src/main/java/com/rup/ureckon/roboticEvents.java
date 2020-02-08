package com.rup.ureckon;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.CardView;
import android.view.View;

public class roboticEvents extends AppCompatActivity {

    private CardView robo_dangal;
    private CardView roboleague;
    private CardView nft;
    private CardView dirrecion;
    private CardView htg;
    private CardView aerostorm;
    private CardView bridgeonics;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_robotic_events);

        robo_dangal = (CardView) findViewById(R.id.robo_dangal);
        roboleague = (CardView) findViewById(R.id.robo_league);
        nft = (CardView) findViewById(R.id.need_for_torque);
        dirrecion = (CardView) findViewById(R.id.dirrecion);
        htg = (CardView) findViewById(R.id.hold_the_grip);
        aerostorm = (CardView) findViewById(R.id.aerostorm);
        bridgeonics = (CardView) findViewById(R.id.bridgeonics);

        robo_dangal.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(roboticEvents.this, robo_dangal_register.class));
            }
        });

        roboleague.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(roboticEvents.this, roboleague_register.class));
            }
        });

        nft.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(roboticEvents.this, needfortorque_register.class));
            }
        });

        dirrecion.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(roboticEvents.this, direcion_register.class));
            }
        });

        htg.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(roboticEvents.this, holdthegrip_register.class));
            }
        });

        aerostorm.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(roboticEvents.this, aerostorm_register.class));
            }
        });

        bridgeonics.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(roboticEvents.this, bridgeonics_register.class));
            }
        });

    }
}
