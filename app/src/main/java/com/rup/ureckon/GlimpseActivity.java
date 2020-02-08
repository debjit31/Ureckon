package com.rup.ureckon;

import android.content.Intent;
import android.support.annotation.NonNull;
import android.support.design.widget.NavigationView;
import android.support.v4.view.GravityCompat;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.ActionBarDrawerToggle;
import android.support.v7.app.AppCompatActivity;

import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.view.MenuItem;

import com.google.firebase.auth.FirebaseAuth;

public class GlimpseActivity extends AppCompatActivity implements NavigationView.OnNavigationItemSelectedListener {

    DrawerLayout drawer;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_glimpse);

        Toolbar toolbar = findViewById(R.id.toolbar5);
        setSupportActionBar(toolbar);



        drawer = findViewById(R.id.drawer_layout5);
        NavigationView navigationView = findViewById(R.id.nav_view5);
        navigationView.setNavigationItemSelectedListener(this);

        ActionBarDrawerToggle toggle = new ActionBarDrawerToggle(this, drawer, toolbar,
                R.string.navigation_drawer_open, R.string.navigation_drawer_close);
        drawer.addDrawerListener(toggle);
        toggle.syncState();
    }

    @Override
    public boolean onNavigationItemSelected(@NonNull MenuItem item) {
        switch (item.getItemId()) {
            case R.id.nav_dashboard:
                Intent intent=new Intent(GlimpseActivity.this, MainActivity.class);
                startActivity(intent);
                break;

            case R.id.nav_register:
                Intent intent2=new Intent(GlimpseActivity.this, LoginActivity.class);
                startActivity(intent2);
                break;
            case R.id.nav_event:
                Intent intent3=new Intent(GlimpseActivity.this,AllEvents.class);
                startActivity(intent3);
                break;
            case R.id.nav_about:
                Intent intent4=new Intent(GlimpseActivity.this,HomeActivity.class);
                startActivity(intent4);
                break;

            case R.id.nav_glimpse:
                Intent intent5=new Intent(GlimpseActivity.this,GlimpseActivity.class);
                startActivity(intent5);
                break;

            case R.id.nav_developer:
                Intent intent6=new Intent(GlimpseActivity.this,DevelopersActivity.class);
                startActivity(intent6);
                break;

            case R.id.nav_logout:
                FirebaseAuth.getInstance().signOut();
                finish();
                startActivity(new Intent(GlimpseActivity.this, MainActivity.class));
                break;
            case R.id.nav_team:
                Intent intent7=new Intent(GlimpseActivity.this,TeamActivity.class);
                startActivity(intent7);
                break;
            case R.id.nav_platform:
                Intent intent8=new Intent(GlimpseActivity.this,Platform.class);
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
