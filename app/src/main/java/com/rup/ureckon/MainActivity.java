package com.rup.ureckon;

import android.content.Intent;
import android.media.MediaPlayer;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.VideoView;
import android.view.MenuItem;
import android.support.annotation.NonNull;
import android.support.v4.view.GravityCompat;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.ActionBarDrawerToggle;
import android.support.v7.widget.Toolbar;
import android.support.design.widget.NavigationView;

import com.google.firebase.auth.FirebaseAuth;

public class MainActivity extends AppCompatActivity implements NavigationView.OnNavigationItemSelectedListener{

    private Button events,login;
    private VideoView video;
    private DrawerLayout drawer;
   /* private FirebaseAuth mAuth;
    private String Uid;*/
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        events=(Button)findViewById(R.id.events_button) ;
        login=(Button)findViewById(R.id.login_button) ;
        video=(VideoView)findViewById(R.id.tech_video);

        Toolbar toolbar = findViewById(R.id.toolbar2);
        setSupportActionBar(toolbar);

        drawer = findViewById(R.id.drawer_layout2);

        events.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent intent=new Intent(MainActivity.this, AllEvents.class);
                startActivity(intent);
            }
        });

        login.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent intent=new Intent(MainActivity.this, LoginActivity.class);
                startActivity(intent);
            }
        });

        NavigationView navigationView = findViewById(R.id.nav_view2);
        navigationView.setNavigationItemSelectedListener(this);

        ActionBarDrawerToggle toggle = new ActionBarDrawerToggle(this, drawer, toolbar,
                R.string.navigation_drawer_open, R.string.navigation_drawer_close);
        drawer.addDrawerListener(toggle);
        toggle.syncState();

        Uri uri = Uri.parse("android.resource://"+getPackageName()+"/"+R.raw.tech_background3);

        video.setVideoURI(uri);
        video.start();

        video.setOnPreparedListener(new MediaPlayer.OnPreparedListener() {
            @Override
            public void onPrepared(MediaPlayer mediaPlayer) {

                mediaPlayer.setLooping(true);
            }
        });

        /*mAuth= FirebaseAuth.getInstance();
        FirebaseUser user=mAuth.getCurrentUser();
        Uid=user.getUid();*/


    }

    @Override
    public boolean onNavigationItemSelected(@NonNull MenuItem item) {
        switch (item.getItemId()) {
            case R.id.nav_dashboard:
                Intent intent=new Intent(MainActivity.this, MainActivity.class);
                startActivity(intent);
                break;

            case R.id.nav_register:
                Intent intent2=new Intent(MainActivity.this, LoginActivity.class);
                startActivity(intent2);
                break;
            case R.id.nav_event:
                Intent intent3=new Intent(MainActivity.this,AllEvents.class);
                startActivity(intent3);
                break;
            case R.id.nav_about:

                Intent intent4=new Intent(MainActivity.this,HomeActivity.class);
                startActivity(intent4);
                break;
            case R.id.nav_glimpse:
                Intent intent5=new Intent(MainActivity.this,GlimpseActivity.class);
                startActivity(intent5);
                break;
            case R.id.nav_developer:
                Intent intent6=new Intent(MainActivity.this,DevelopersActivity.class);
                startActivity(intent6);
                break;
            case R.id.nav_logout:
                FirebaseAuth.getInstance().signOut();
                finish();
                startActivity(new Intent(MainActivity.this, MainActivity.class));
                break;
            case R.id.nav_team:
                Intent intent7=new Intent(MainActivity.this,TeamActivity.class);
                startActivity(intent7);
                break;
            case R.id.nav_platform:
                Intent intent8=new Intent(MainActivity.this,Platform.class);
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
            Intent a=new Intent(Intent.ACTION_MAIN);
            a.addCategory(Intent.CATEGORY_HOME);
            a.setFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
            startActivity(a);
        }
    }


}
