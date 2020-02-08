package com.rup.ureckon;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.CardView;
import android.view.View;
import android.widget.Toast;

public class flagShipEvents extends AppCompatActivity {


    private CardView uic,ureckathon,tech_expo;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_flag_ship_events);

        //Toast.makeText(this, "Button Works!!!", Toast.LENGTH_SHORT).show();

        uic = (CardView) findViewById(R.id.uic);
        ureckathon = (CardView) findViewById(R.id.ureckathon);
        tech_expo = (CardView) findViewById(R.id.tech_expo);

        uic.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(flagShipEvents.this, uic_register.class));
            }
        });

        ureckathon.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                startActivity(new Intent(flagShipEvents.this, ureckathon_register.class));
            }
        });

        tech_expo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                startActivity(new Intent(flagShipEvents.this, techexpo_register.class));
            }
        });
    }
}
