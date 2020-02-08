package com.rup.ureckon;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.CardView;
import android.view.View;

public class intern_events extends AppCompatActivity {

    private CardView uICC;
    private CardView tech_script;
    private CardView postx;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_intern_events);

        uICC = (CardView) findViewById(R.id.uicc);
        tech_script = (CardView) findViewById(R.id.tech_script);
        postx = (CardView) findViewById(R.id.postx);

        uICC.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(intern_events.this, uicc_register.class));
            }
        });

        tech_script.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(intern_events.this, techscript_register.class));
            }
        });

       postx.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(intern_events.this, postx_register.class));
            }
        });
    }
}
