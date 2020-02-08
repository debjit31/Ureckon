package com.rup.ureckon;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.CardView;
import android.view.View;

public class codingEvents extends AppCompatActivity {

    private CardView coderanch;
    private CardView codegolf;
    private CardView debugger;
    private CardView spyder;
    private CardView pentesting;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_coding_events);


        coderanch = (CardView) findViewById(R.id.code_ranch);
        codegolf = (CardView) findViewById(R.id.code_golf);
        debugger = (CardView) findViewById(R.id.debugger);
        spyder = (CardView) findViewById(R.id.spyder);
        pentesting = (CardView) findViewById(R.id.pentest);

        coderanch.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(codingEvents.this, coderanch_register.class));
            }
        });

        codegolf.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(codingEvents.this, codegolf_register.class));
            }
        });

        debugger.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(codingEvents.this, debugger_register.class));
            }
        });

        spyder.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(codingEvents.this, spyder_register.class));
            }
        });

      pentesting.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(codingEvents.this, pentest_register.class));
            }
        });
    }
}
