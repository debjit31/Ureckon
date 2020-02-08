package com.rup.ureckon;

import android.media.MediaPlayer;
import android.net.Uri;
import android.support.annotation.NonNull;
import android.support.design.widget.NavigationView;
import android.support.v4.view.GravityCompat;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.ActionBarDrawerToggle;
import android.support.v7.app.AppCompatActivity;
import android.animation.ArgbEvaluator;
import android.animation.ObjectAnimator;
import android.animation.ValueAnimator;
import android.content.Intent;
import android.support.v7.widget.Toolbar;
import android.view.MenuItem;
import android.view.View;
import android.graphics.Color;

import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.VideoView;

import com.google.firebase.auth.FirebaseAuth;

public class HomeActivity extends AppCompatActivity implements NavigationView.OnNavigationItemSelectedListener{

    private ImageView fb,insta,twitter,gmail;
    private DrawerLayout drawer;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);

        fb=(ImageView)findViewById(R.id.fb);
        insta=(ImageView)findViewById(R.id.insta);
        twitter=(ImageView)findViewById(R.id.twitter);
        gmail=(ImageView)findViewById(R.id.gmail);

        Toolbar toolbar = findViewById(R.id.toolbar4);
        setSupportActionBar(toolbar);

        toolbar.setTitle("About Us");

        drawer = findViewById(R.id.drawer_layout4);
        NavigationView navigationView = findViewById(R.id.nav_view4);
        navigationView.setNavigationItemSelectedListener(this);

        ActionBarDrawerToggle toggle = new ActionBarDrawerToggle(this, drawer, toolbar,
                R.string.navigation_drawer_open, R.string.navigation_drawer_close);
        drawer.addDrawerListener(toggle);
        toggle.syncState();

        fb.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Uri uri = Uri.parse("https://www.facebook.com/ureckon.uemk/");
                startActivity(new Intent(Intent.ACTION_VIEW, uri));
            }
        });

        insta.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Uri uri = Uri.parse("https://www.instagram.com/ureckon.uemk/");
                startActivity(new Intent(Intent.ACTION_VIEW, uri));
            }
        });

       twitter.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Uri uri = Uri.parse("https://twitter.com/Ureckon_Uemk?ref_src=twsrc%5Egoogle%7Ctwcamp%5Eserp%7Ctwgr%5Eauthor");
                startActivity(new Intent(Intent.ACTION_VIEW, uri));
            }
        });

        gmail.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                String subject="Query regarding Ureckon 2020";

                Intent intent=new Intent(Intent.ACTION_SEND);
                intent.putExtra(Intent.EXTRA_EMAIL,new String[]{"ureckon.uemk@gmail.com"});
                intent.putExtra(Intent.EXTRA_SUBJECT,subject);
                intent.putExtra(Intent.EXTRA_TEXT,"");

                intent.setType("message/rfc822");
                startActivity(Intent.createChooser(intent,"Choose an email client"));

            }
        });
    }

    @Override
    public boolean onNavigationItemSelected(@NonNull MenuItem item) {
        switch (item.getItemId()) {
            case R.id.nav_dashboard:
                Intent intent=new Intent(HomeActivity.this, MainActivity.class);
                startActivity(intent);
                break;

            case R.id.nav_register:
                Intent intent2=new Intent(HomeActivity.this, LoginActivity.class);
                startActivity(intent2);
                break;
            case R.id.nav_event:
                Intent intent3=new Intent(HomeActivity.this,AllEvents.class);
                startActivity(intent3);
                break;
            case R.id.nav_about:
                Intent intent4=new Intent(HomeActivity.this,HomeActivity.class);
                startActivity(intent4);
                break;
            case R.id.nav_glimpse:
                Intent intent5=new Intent(HomeActivity.this,GlimpseActivity.class);
                startActivity(intent5);
                break;
            case R.id.nav_developer:
                Intent intent6=new Intent(HomeActivity.this,DevelopersActivity.class);
                startActivity(intent6);
                break;
            case R.id.nav_logout:
                FirebaseAuth.getInstance().signOut();
                finish();
                startActivity(new Intent(HomeActivity.this, MainActivity.class));
                break;
            case R.id.nav_team:
                Intent intent7=new Intent(HomeActivity.this,TeamActivity.class);
                startActivity(intent7);
                break;
            case R.id.nav_platform:
                Intent intent8=new Intent(HomeActivity.this,Platform.class);
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
