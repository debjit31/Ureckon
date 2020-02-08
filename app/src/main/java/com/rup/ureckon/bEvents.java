package com.rup.ureckon;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.CardView;
import android.view.View;

public class bEvents extends AppCompatActivity {

    private CardView admaking;
    private CardView getsetsell;
    private CardView idea_preach;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_b_events);

        admaking = (CardView) findViewById(R.id.ad_making);
        getsetsell = (CardView) findViewById(R.id.get_set_sell);
        idea_preach = (CardView) findViewById(R.id.idea_preach);

        admaking.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(bEvents.this, admaking_register.class));
            }
        });

        getsetsell.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(bEvents.this, getsetsell_register.class));
            }
        });

        idea_preach.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(bEvents.this, ideapreach_register.class));
            }
        });
    }
}
