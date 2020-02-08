package com.rup.ureckon;

import android.support.v7.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class DevelopersActivity extends AppCompatActivity {


    private Button github1, github2, link1, link2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_developers);


        github1 = (Button) findViewById(R.id.github);
        github2 = (Button) findViewById(R.id.github2);
        link1 = (Button) findViewById(R.id.linkedin);
        link2 = (Button) findViewById(R.id.linkedin2);

        github1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Uri uri = Uri.parse("https://github.com/TathagataBanerjee");
                startActivity(new Intent(Intent.ACTION_VIEW, uri));
            }
        });
        github2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Uri uri = Uri.parse("https://github.com/debjit31");
                startActivity(new Intent(Intent.ACTION_VIEW, uri));
            }
        });
        link1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Uri uri = Uri.parse("https://www.linkedin.com/in/tathagata-banerjee-ab2881123");
                startActivity(new Intent(Intent.ACTION_VIEW, uri));
            }
        });
        link2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Uri uri = Uri.parse("https://www.linkedin.com/in/debjit-chattopadhyay-710336188/");
                startActivity(new Intent(Intent.ACTION_VIEW, uri));
            }
        });
    }

    @Override
    public void onBackPressed() {

        super.onBackPressed();
        finish();
        startActivity(new Intent(this, MainActivity.class));
    }
}
