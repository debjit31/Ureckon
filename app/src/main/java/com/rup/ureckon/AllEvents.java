package com.rup.ureckon;

import android.content.Intent;
import android.support.annotation.NonNull;
import android.support.design.widget.NavigationView;
import android.support.v4.view.GravityCompat;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.ActionBarDrawerToggle;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.CardView;
import android.support.v7.widget.Toolbar;
import android.view.MenuItem;
import android.view.View;
import com.google.firebase.auth.FirebaseAuth;

public class AllEvents extends AppCompatActivity implements NavigationView.OnNavigationItemSelectedListener{

    private CardView flagship, robotics, coding, gaming, uosc, bevents, misc, inter;
    private DrawerLayout drawer;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_all_events);

        flagship = (CardView) findViewById(R.id.flagship);
        robotics = (CardView) findViewById(R.id.robotics);
        coding = (CardView) findViewById(R.id.coding);
        gaming = (CardView) findViewById(R.id.gaming);
        uosc = (CardView) findViewById(R.id.uosc);
        bevents = (CardView) findViewById(R.id.bevents);
        misc = (CardView) findViewById(R.id.misc);
        inter = (CardView) findViewById(R.id.international);

        Toolbar toolbar = findViewById(R.id.toolbar3);
        setSupportActionBar(toolbar);

        toolbar.setTitle("Events");

        drawer = findViewById(R.id.drawer_layout3);
        NavigationView navigationView = findViewById(R.id.nav_view3);
        navigationView.setNavigationItemSelectedListener(this);

        ActionBarDrawerToggle toggle = new ActionBarDrawerToggle(this, drawer, toolbar,
                R.string.navigation_drawer_open, R.string.navigation_drawer_close);
        drawer.addDrawerListener(toggle);
        toggle.syncState();

        flagship.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(AllEvents.this, flagShipEvents.class));
            }
        });
        robotics.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(AllEvents.this, roboticEvents.class));
            }
        });
        coding.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(AllEvents.this, codingEvents.class));
            }
        });
        gaming.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(AllEvents.this, gamingEvents.class));
            }
        });
        uosc.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(AllEvents.this, uoscEvents.class));
            }
        });
        bevents.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(AllEvents.this, bEvents.class));
            }
        });
        misc.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(AllEvents.this, miscEvents.class));
            }
        });
        inter.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(AllEvents.this, intern_events.class));
            }
        });

    }

    @Override
    public boolean onNavigationItemSelected(@NonNull MenuItem item) {
        switch (item.getItemId()) {
            case R.id.nav_dashboard:
                Intent intent=new Intent(AllEvents.this, MainActivity.class);
                startActivity(intent);
                break;

            case R.id.nav_register:
                Intent intent2=new Intent(AllEvents.this, LoginActivity.class);
                startActivity(intent2);
                break;
            case R.id.nav_event:
                Intent intent3=new Intent(AllEvents.this,AllEvents.class);
                startActivity(intent3);
                break;
            case R.id.nav_about:
                Intent intent4=new Intent(AllEvents.this,HomeActivity.class);
                startActivity(intent4);
                break;
            case R.id.nav_glimpse:
                Intent intent5=new Intent(AllEvents.this,GlimpseActivity.class);
                startActivity(intent5);
                break;
            case R.id.nav_developer:
                Intent intent6=new Intent(AllEvents.this,DevelopersActivity.class);
                startActivity(intent6);
                break;
            case R.id.nav_logout:
                FirebaseAuth.getInstance().signOut();
                finish();
                startActivity(new Intent(AllEvents.this, MainActivity.class));
                break;
            case R.id.nav_team:
                Intent intent7=new Intent(AllEvents.this,TeamActivity.class);
                startActivity(intent7);
                break;
            case R.id.nav_platform:
                Intent intent8=new Intent(AllEvents.this,Platform.class);
                startActivity(intent8);
                break;
        }

        drawer.closeDrawer(GravityCompat.START);
        return true;
    }

    @Override
    public void onBackPressed() {
        if (drawer.isDrawerOpen(GravityCompat.START)) {
            drawer.closeDrawer(GravityCompat.START);
        } else {
            super.onBackPressed();
            finish();
            startActivity(new Intent(this, MainActivity.class));
        }
    }
}
