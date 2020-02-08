package com.rup.ureckon;

import android.app.ProgressDialog;
import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.android.volley.AuthFailureError;
import com.android.volley.DefaultRetryPolicy;
import com.android.volley.Request;
import com.android.volley.RequestQueue;
import com.android.volley.Response;
import com.android.volley.RetryPolicy;
import com.android.volley.VolleyError;
import com.android.volley.toolbox.StringRequest;
import com.android.volley.toolbox.Volley;
import com.google.firebase.auth.FirebaseAuth;

import java.util.HashMap;
import java.util.Map;

public class team_register extends AppCompatActivity {
    EditText team_name,team_leader,team_contact,team_email,team_college,part1,part2,part3;
    String event_name;
    Button register;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_team_register);

        team_name=(EditText)findViewById(R.id.team_name);
        team_leader=(EditText)findViewById(R.id.team_leader_name);
        team_contact=(EditText)findViewById(R.id.team_contact);
        team_email=(EditText)findViewById(R.id.team_email);
        team_college=(EditText)findViewById(R.id.team_college);
        part1=(EditText)findViewById(R.id.part1_uid);
        part2=(EditText)findViewById(R.id.part2_uid);
        part3=(EditText)findViewById(R.id.part3_uid);
        register=(Button)findViewById(R.id.reg_btn);

        event_name = getIntent().getStringExtra("event");

        register.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                if(event_name.equals("uic")) {
                    uic();
                }

               else if(event_name.equals("ureckathon")) {
                    ureckathon();
                }

                else if(event_name.equals("techexpo")) {
                    techexpo();
                }

                else if(event_name.equals("robo_dangal")) {
                    robodangal();
                }

                else if(event_name.equals("robo_league")) {
                    roboleague();
                }

                else if(event_name.equals("nft")) {
                    need_for_torque();
                }

                else if(event_name.equals("dirrecion")) {
                    dirrecion();
                }

                else if(event_name.equals("htg")) {
                    hold_the_grip();
                }

                else if(event_name.equals("aerostorm")) {
                    aerostorm();
                }

                else if(event_name.equals("bridgeonics")) {
                    bridgeonics();
                }

                else if(event_name.equals("coderanch")) {
                    coderanch();
                }

                else if(event_name.equals("codegolf")) {
                    codegolf();
                }

                else if(event_name.equals("spyder")) {
                    spyder();
                }

                else if(event_name.equals("debugger")) {
                    debugger();
                }

                else if(event_name.equals("pentest")) {
                    pentest();
                }

                else if(event_name.equals("rainbow")) {
                    rainbow_six_seige();
                }

                else if(event_name.equals("pubg")) {
                    pubg();
                }

                else if(event_name.equals("fifa")) {
                    fifa();
                }

                else if(event_name.equals("csgo")) {
                    csgo();
                }

                else if(event_name.equals("urecka")) {
                    urecka();
                }

                else if(event_name.equals("cluex")) {
                    cluex();
                }

                else if(event_name.equals("admaking")) {
                    admaking();
                }



                else if(event_name.equals("getsetsell")) {
                    getsetsell();
                }

                else if(event_name.equals("idea")) {
                    idea_preach();
                }

                else if(event_name.equals("hb")) {
                    healthy_bites();
                }

                else if(event_name.equals("biote")) {
                    biote_exp();
                }

                else if(event_name.equals("thinktech")) {
                    thinktech();
                }

                else if(event_name.equals("uicc")) {
                    uicc();
                }

                else if(event_name.equals("techscript")) {
                    techscript();
                }

                else if(event_name.equals("postx")) {
                    postx();
                }


            }
        });
    }

    private void bridgeonics() {

        final ProgressDialog loading = ProgressDialog.show(this,"Adding Item","Please wait");
        final String tn =team_name.getText().toString().trim();
        final String tl = team_leader.getText().toString().trim();
        final String contact = team_contact.getText().toString().trim();
        final String email = team_email.getText().toString().trim();
        final String college = team_college.getText().toString().trim();
        final String p1 = part1.getText().toString().trim();
        final String p2 = part2.getText().toString().trim();
        final String p3 = part3.getText().toString().trim();

        StringRequest stringRequest = new StringRequest(Request.Method.POST, "https://script.google.com/macros/s/AKfycbwge160qPvam_aD_adJBj3GOQPG1rutjPwUmn6HpuKJuYEib1z7/exec",
                new Response.Listener<String>() {
                    @Override
                    public void onResponse(String response) {

                        loading.dismiss();
                        Toast.makeText(team_register.this,response,Toast.LENGTH_LONG).show();
                   /* Intent intent = new Intent(getApplicationContext(),SignUpActivity.class);
                    startActivity(intent);*/

                    }
                },
                new Response.ErrorListener() {
                    @Override
                    public void onErrorResponse(VolleyError error) {

                    }
                }
        ) {
            @Override
            protected Map<String, String> getParams() {
                Map<String, String> parmas = new HashMap<>();

                //here we pass params
                parmas.put("action","addItem1");
                parmas.put("team_name",tn);
                parmas.put("team_leader",tl);
                parmas.put("contact",contact);
                parmas.put("email",email);
                parmas.put("college",college);
                parmas.put("participant1",p1);
                parmas.put("participant2",p2);
                parmas.put("participant3",p3);

                return parmas;
            }
        };

        int socketTimeOut = 50000;// u can change this .. here it is 50 seconds

        RetryPolicy retryPolicy = new DefaultRetryPolicy(socketTimeOut, 0, DefaultRetryPolicy.DEFAULT_BACKOFF_MULT);
        stringRequest.setRetryPolicy(retryPolicy);

        RequestQueue queue = Volley.newRequestQueue(this);

        queue.add(stringRequest);


    }

    private void coderanch() {

        final ProgressDialog loading = ProgressDialog.show(this,"Adding Item","Please wait");
        final String tn =team_name.getText().toString().trim();
        final String tl = team_leader.getText().toString().trim();
        final String contact = team_contact.getText().toString().trim();
        final String email = team_email.getText().toString().trim();
        final String college = team_college.getText().toString().trim();
        final String p1 = part1.getText().toString().trim();
        final String p2 = part2.getText().toString().trim();
        final String p3 = part3.getText().toString().trim();

        StringRequest stringRequest = new StringRequest(Request.Method.POST, "https://script.google.com/macros/s/AKfycbwKbyLXX-Eb5eu-oyHvNzil1aYaeGH_VqNnNG8OOM2CAf5V7Ls/exec",
                new Response.Listener<String>() {
                    @Override
                    public void onResponse(String response) {

                        loading.dismiss();
                        Toast.makeText(team_register.this,response,Toast.LENGTH_LONG).show();
                   /* Intent intent = new Intent(getApplicationContext(),SignUpActivity.class);
                    startActivity(intent);*/

                    }
                },
                new Response.ErrorListener() {
                    @Override
                    public void onErrorResponse(VolleyError error) {

                    }
                }
        ) {
            @Override
            protected Map<String, String> getParams() {
                Map<String, String> parmas = new HashMap<>();

                //here we pass params
                parmas.put("action","addItem1");
                parmas.put("team_name",tn);
                parmas.put("team_leader",tl);
                parmas.put("contact",contact);
                parmas.put("email",email);
                parmas.put("college",college);
                parmas.put("participant1",p1);
                parmas.put("participant2",p2);
                parmas.put("participant3",p3);

                return parmas;
            }
        };

        int socketTimeOut = 50000;// u can change this .. here it is 50 seconds

        RetryPolicy retryPolicy = new DefaultRetryPolicy(socketTimeOut, 0, DefaultRetryPolicy.DEFAULT_BACKOFF_MULT);
        stringRequest.setRetryPolicy(retryPolicy);

        RequestQueue queue = Volley.newRequestQueue(this);

        queue.add(stringRequest);


    }

    private void codegolf(){

        final ProgressDialog loading = ProgressDialog.show(this,"Adding Item","Please wait");
        final String tn =team_name.getText().toString().trim();
        final String tl = team_leader.getText().toString().trim();
        final String contact = team_contact.getText().toString().trim();
        final String email = team_email.getText().toString().trim();
        final String college = team_college.getText().toString().trim();
        final String p1 = part1.getText().toString().trim();
        final String p2 = part2.getText().toString().trim();
        final String p3 = part3.getText().toString().trim();

        StringRequest stringRequest = new StringRequest(Request.Method.POST, "https://script.google.com/macros/s/AKfycbz7hBQnIdIQndOBi6GaCMq4egXZAZVo0-amDNJViXl_pukEsho7/exec",
                new Response.Listener<String>() {
                    @Override
                    public void onResponse(String response) {

                        loading.dismiss();
                        Toast.makeText(team_register.this,response,Toast.LENGTH_LONG).show();
                   /* Intent intent = new Intent(getApplicationContext(),SignUpActivity.class);
                    startActivity(intent);*/

                    }
                },
                new Response.ErrorListener() {
                    @Override
                    public void onErrorResponse(VolleyError error) {

                    }
                }
        ) {
            @Override
            protected Map<String, String> getParams() {
                Map<String, String> parmas = new HashMap<>();

                //here we pass params
                parmas.put("action","addItem1");
                parmas.put("team_name",tn);
                parmas.put("team_leader",tl);
                parmas.put("contact",contact);
                parmas.put("email",email);
                parmas.put("college",college);
                parmas.put("participant1",p1);
                parmas.put("participant2",p2);
                parmas.put("participant3",p3);

                return parmas;
            }
        };

        int socketTimeOut = 50000;// u can change this .. here it is 50 seconds

        RetryPolicy retryPolicy = new DefaultRetryPolicy(socketTimeOut, 0, DefaultRetryPolicy.DEFAULT_BACKOFF_MULT);
        stringRequest.setRetryPolicy(retryPolicy);

        RequestQueue queue = Volley.newRequestQueue(this);

        queue.add(stringRequest);


    }

    private void spyder() {

        final ProgressDialog loading = ProgressDialog.show(this,"Adding Item","Please wait");
        final String tn =team_name.getText().toString().trim();
        final String tl = team_leader.getText().toString().trim();
        final String contact = team_contact.getText().toString().trim();
        final String email = team_email.getText().toString().trim();
        final String college = team_college.getText().toString().trim();
        final String p1 = part1.getText().toString().trim();
        final String p2 = part2.getText().toString().trim();
        final String p3 = part3.getText().toString().trim();

        StringRequest stringRequest = new StringRequest(Request.Method.POST, "https://script.google.com/macros/s/AKfycbwkFMYUGitDLUZwa4G00Y3RcuJMl2xa0C921c5ZN9AHU-iDp0g/exec",
                new Response.Listener<String>() {
                    @Override
                    public void onResponse(String response) {

                        loading.dismiss();
                        Toast.makeText(team_register.this,response,Toast.LENGTH_LONG).show();
                   /* Intent intent = new Intent(getApplicationContext(),SignUpActivity.class);
                    startActivity(intent);*/

                    }
                },
                new Response.ErrorListener() {
                    @Override
                    public void onErrorResponse(VolleyError error) {

                    }
                }
        ) {
            @Override
            protected Map<String, String> getParams() {
                Map<String, String> parmas = new HashMap<>();

                //here we pass params
                parmas.put("action","addItem1");
                parmas.put("team_name",tn);
                parmas.put("team_leader",tl);
                parmas.put("contact",contact);
                parmas.put("email",email);
                parmas.put("college",college);
                parmas.put("participant1",p1);
                parmas.put("participant2",p2);
                parmas.put("participant3",p3);

                return parmas;
            }
        };

        int socketTimeOut = 50000;// u can change this .. here it is 50 seconds

        RetryPolicy retryPolicy = new DefaultRetryPolicy(socketTimeOut, 0, DefaultRetryPolicy.DEFAULT_BACKOFF_MULT);
        stringRequest.setRetryPolicy(retryPolicy);

        RequestQueue queue = Volley.newRequestQueue(this);

        queue.add(stringRequest);


    }

    private void debugger() {

        final ProgressDialog loading = ProgressDialog.show(this,"Adding Item","Please wait");
        final String tn =team_name.getText().toString().trim();
        final String tl = team_leader.getText().toString().trim();
        final String contact = team_contact.getText().toString().trim();
        final String email = team_email.getText().toString().trim();
        final String college = team_college.getText().toString().trim();
        final String p1 = part1.getText().toString().trim();
        final String p2 = part2.getText().toString().trim();
        final String p3 = part3.getText().toString().trim();

        StringRequest stringRequest = new StringRequest(Request.Method.POST, "https://script.google.com/macros/s/AKfycbwn1ZoXlhSQG03TGBT4c43MWjD-HqJFJDwbolADyOvP__82b5Pq/exec",
                new Response.Listener<String>() {
                    @Override
                    public void onResponse(String response) {

                        loading.dismiss();
                        Toast.makeText(team_register.this,response,Toast.LENGTH_LONG).show();
                   /* Intent intent = new Intent(getApplicationContext(),SignUpActivity.class);
                    startActivity(intent);*/

                    }
                },
                new Response.ErrorListener() {
                    @Override
                    public void onErrorResponse(VolleyError error) {

                    }
                }
        ) {
            @Override
            protected Map<String, String> getParams() {
                Map<String, String> parmas = new HashMap<>();

                //here we pass params
                parmas.put("action","addItem1");
                parmas.put("team_name",tn);
                parmas.put("team_leader",tl);
                parmas.put("contact",contact);
                parmas.put("email",email);
                parmas.put("college",college);
                parmas.put("participant1",p1);
                parmas.put("participant2",p2);
                parmas.put("participant3",p3);

                return parmas;
            }
        };

        int socketTimeOut = 50000;// u can change this .. here it is 50 seconds

        RetryPolicy retryPolicy = new DefaultRetryPolicy(socketTimeOut, 0, DefaultRetryPolicy.DEFAULT_BACKOFF_MULT);
        stringRequest.setRetryPolicy(retryPolicy);

        RequestQueue queue = Volley.newRequestQueue(this);

        queue.add(stringRequest);


    }

    private void pentest() {

        final ProgressDialog loading = ProgressDialog.show(this,"Adding Item","Please wait");
        final String tn =team_name.getText().toString().trim();
        final String tl = team_leader.getText().toString().trim();
        final String contact = team_contact.getText().toString().trim();
        final String email = team_email.getText().toString().trim();
        final String college = team_college.getText().toString().trim();
        final String p1 = part1.getText().toString().trim();
        final String p2 = part2.getText().toString().trim();
        final String p3 = part3.getText().toString().trim();

        StringRequest stringRequest = new StringRequest(Request.Method.POST, "https://script.google.com/macros/s/AKfycbwYQ_WWFfo_VrMGNJwAq-p7xcWNe3vP3hCpbkJzdHdjTvEYVgsC/exec",
                new Response.Listener<String>() {
                    @Override
                    public void onResponse(String response) {

                        loading.dismiss();
                        Toast.makeText(team_register.this,response,Toast.LENGTH_LONG).show();
                   /* Intent intent = new Intent(getApplicationContext(),SignUpActivity.class);
                    startActivity(intent);*/

                    }
                },
                new Response.ErrorListener() {
                    @Override
                    public void onErrorResponse(VolleyError error) {

                    }
                }
        ) {
            @Override
            protected Map<String, String> getParams() {
                Map<String, String> parmas = new HashMap<>();

                //here we pass params
                parmas.put("action","addItem1");
                parmas.put("team_name",tn);
                parmas.put("team_leader",tl);
                parmas.put("contact",contact);
                parmas.put("email",email);
                parmas.put("college",college);
                parmas.put("participant1",p1);
                parmas.put("participant2",p2);
                parmas.put("participant3",p3);

                return parmas;
            }
        };

        int socketTimeOut = 50000;// u can change this .. here it is 50 seconds

        RetryPolicy retryPolicy = new DefaultRetryPolicy(socketTimeOut, 0, DefaultRetryPolicy.DEFAULT_BACKOFF_MULT);
        stringRequest.setRetryPolicy(retryPolicy);

        RequestQueue queue = Volley.newRequestQueue(this);

        queue.add(stringRequest);


    }

    private void rainbow_six_seige() {

        final ProgressDialog loading = ProgressDialog.show(this,"Adding Item","Please wait");
        final String tn =team_name.getText().toString().trim();
        final String tl = team_leader.getText().toString().trim();
        final String contact = team_contact.getText().toString().trim();
        final String email = team_email.getText().toString().trim();
        final String college = team_college.getText().toString().trim();
        final String p1 = part1.getText().toString().trim();
        final String p2 = part2.getText().toString().trim();
        final String p3 = part3.getText().toString().trim();

        StringRequest stringRequest = new StringRequest(Request.Method.POST, "https://script.google.com/macros/s/AKfycbySY0696js6LGkNxSVw2XDGlCCw2cYuwJ5d2nFyJ7zn4rPND5k/exec",
                new Response.Listener<String>() {
                    @Override
                    public void onResponse(String response) {

                        loading.dismiss();
                        Toast.makeText(team_register.this,response,Toast.LENGTH_LONG).show();
                   /* Intent intent = new Intent(getApplicationContext(),SignUpActivity.class);
                    startActivity(intent);*/

                    }
                },
                new Response.ErrorListener() {
                    @Override
                    public void onErrorResponse(VolleyError error) {

                    }
                }
        ) {
            @Override
            protected Map<String, String> getParams() {
                Map<String, String> parmas = new HashMap<>();

                //here we pass params
                parmas.put("action","addItem1");
                parmas.put("team_name",tn);
                parmas.put("team_leader",tl);
                parmas.put("contact",contact);
                parmas.put("email",email);
                parmas.put("college",college);
                parmas.put("participant1",p1);
                parmas.put("participant2",p2);
                parmas.put("participant3",p3);

                return parmas;
            }
        };

        int socketTimeOut = 50000;// u can change this .. here it is 50 seconds

        RetryPolicy retryPolicy = new DefaultRetryPolicy(socketTimeOut, 0, DefaultRetryPolicy.DEFAULT_BACKOFF_MULT);
        stringRequest.setRetryPolicy(retryPolicy);

        RequestQueue queue = Volley.newRequestQueue(this);

        queue.add(stringRequest);


    }

    private void pubg() {

        final ProgressDialog loading = ProgressDialog.show(this,"Adding Item","Please wait");
        final String tn =team_name.getText().toString().trim();
        final String tl = team_leader.getText().toString().trim();
        final String contact = team_contact.getText().toString().trim();
        final String email = team_email.getText().toString().trim();
        final String college = team_college.getText().toString().trim();
        final String p1 = part1.getText().toString().trim();
        final String p2 = part2.getText().toString().trim();
        final String p3 = part3.getText().toString().trim();

        StringRequest stringRequest = new StringRequest(Request.Method.POST, "https://script.google.com/macros/s/AKfycbylk0-TpbnRUljAn_xIB4VLcgRegPO4Pum7asq12NGUIy-w00mY/exec",
                new Response.Listener<String>() {
                    @Override
                    public void onResponse(String response) {

                        loading.dismiss();
                        Toast.makeText(team_register.this,response,Toast.LENGTH_LONG).show();
                   /* Intent intent = new Intent(getApplicationContext(),SignUpActivity.class);
                    startActivity(intent);*/

                    }
                },
                new Response.ErrorListener() {
                    @Override
                    public void onErrorResponse(VolleyError error) {

                    }
                }
        ) {
            @Override
            protected Map<String, String> getParams() {
                Map<String, String> parmas = new HashMap<>();

                //here we pass params
                parmas.put("action","addItem1");
                parmas.put("team_name",tn);
                parmas.put("team_leader",tl);
                parmas.put("contact",contact);
                parmas.put("email",email);
                parmas.put("college",college);
                parmas.put("participant1",p1);
                parmas.put("participant2",p2);
                parmas.put("participant3",p3);

                return parmas;
            }
        };

        int socketTimeOut = 50000;// u can change this .. here it is 50 seconds

        RetryPolicy retryPolicy = new DefaultRetryPolicy(socketTimeOut, 0, DefaultRetryPolicy.DEFAULT_BACKOFF_MULT);
        stringRequest.setRetryPolicy(retryPolicy);

        RequestQueue queue = Volley.newRequestQueue(this);

        queue.add(stringRequest);


    }

    private void fifa() {

        final ProgressDialog loading = ProgressDialog.show(this,"Adding Item","Please wait");
        final String tn =team_name.getText().toString().trim();
        final String tl = team_leader.getText().toString().trim();
        final String contact = team_contact.getText().toString().trim();
        final String email = team_email.getText().toString().trim();
        final String college = team_college.getText().toString().trim();
        final String p1 = part1.getText().toString().trim();
        final String p2 = part2.getText().toString().trim();
        final String p3 = part3.getText().toString().trim();

        StringRequest stringRequest = new StringRequest(Request.Method.POST, "https://script.google.com/macros/s/AKfycbx78RvrCJqkWx7Gyx58g8pp1QFPK0vwRPUwGCIZKxBL63wtNLo/exec",
                new Response.Listener<String>() {
                    @Override
                    public void onResponse(String response) {

                        loading.dismiss();
                        Toast.makeText(team_register.this,response,Toast.LENGTH_LONG).show();
                   /* Intent intent = new Intent(getApplicationContext(),SignUpActivity.class);
                    startActivity(intent);*/

                    }
                },
                new Response.ErrorListener() {
                    @Override
                    public void onErrorResponse(VolleyError error) {

                    }
                }
        ) {
            @Override
            protected Map<String, String> getParams() {
                Map<String, String> parmas = new HashMap<>();

                //here we pass params
                parmas.put("action","addItem1");
                parmas.put("team_name",tn);
                parmas.put("team_leader",tl);
                parmas.put("contact",contact);
                parmas.put("email",email);
                parmas.put("college",college);
                parmas.put("participant1",p1);
                parmas.put("participant2",p2);
                parmas.put("participant3",p3);

                return parmas;
            }
        };

        int socketTimeOut = 50000;// u can change this .. here it is 50 seconds

        RetryPolicy retryPolicy = new DefaultRetryPolicy(socketTimeOut, 0, DefaultRetryPolicy.DEFAULT_BACKOFF_MULT);
        stringRequest.setRetryPolicy(retryPolicy);

        RequestQueue queue = Volley.newRequestQueue(this);

        queue.add(stringRequest);


    }

    private void csgo() {

        final ProgressDialog loading = ProgressDialog.show(this,"Adding Item","Please wait");
        final String tn =team_name.getText().toString().trim();
        final String tl = team_leader.getText().toString().trim();
        final String contact = team_contact.getText().toString().trim();
        final String email = team_email.getText().toString().trim();
        final String college = team_college.getText().toString().trim();
        final String p1 = part1.getText().toString().trim();
        final String p2 = part2.getText().toString().trim();
        final String p3 = part3.getText().toString().trim();

        StringRequest stringRequest = new StringRequest(Request.Method.POST, "https://script.google.com/macros/s/AKfycbwuE-yCVqata0Pj9I81Q_h8sEwiNsQQeivk_zYT1CmTZMLti-g/exec",
                new Response.Listener<String>() {
                    @Override
                    public void onResponse(String response) {

                        loading.dismiss();
                        Toast.makeText(team_register.this,response,Toast.LENGTH_LONG).show();
                   /* Intent intent = new Intent(getApplicationContext(),SignUpActivity.class);
                    startActivity(intent);*/

                    }
                },
                new Response.ErrorListener() {
                    @Override
                    public void onErrorResponse(VolleyError error) {

                    }
                }
        ) {
            @Override
            protected Map<String, String> getParams() {
                Map<String, String> parmas = new HashMap<>();

                //here we pass params
                parmas.put("action","addItem1");
                parmas.put("team_name",tn);
                parmas.put("team_leader",tl);
                parmas.put("contact",contact);
                parmas.put("email",email);
                parmas.put("college",college);
                parmas.put("participant1",p1);
                parmas.put("participant2",p2);
                parmas.put("participant3",p3);

                return parmas;
            }
        };

        int socketTimeOut = 50000;// u can change this .. here it is 50 seconds

        RetryPolicy retryPolicy = new DefaultRetryPolicy(socketTimeOut, 0, DefaultRetryPolicy.DEFAULT_BACKOFF_MULT);
        stringRequest.setRetryPolicy(retryPolicy);

        RequestQueue queue = Volley.newRequestQueue(this);

        queue.add(stringRequest);


    }

    private void urecka() {

        final ProgressDialog loading = ProgressDialog.show(this,"Adding Item","Please wait");
        final String tn =team_name.getText().toString().trim();
        final String tl = team_leader.getText().toString().trim();
        final String contact = team_contact.getText().toString().trim();
        final String email = team_email.getText().toString().trim();
        final String college = team_college.getText().toString().trim();
        final String p1 = part1.getText().toString().trim();
        final String p2 = part2.getText().toString().trim();
        final String p3 = part3.getText().toString().trim();

        StringRequest stringRequest = new StringRequest(Request.Method.POST, "https://script.google.com/macros/s/AKfycbwJpqWtScpMnliDATrrsVSOZCqsF2UgW3qyM-jYW5EO2oCr_tk/exec",
                new Response.Listener<String>() {
                    @Override
                    public void onResponse(String response) {

                        loading.dismiss();
                        Toast.makeText(team_register.this,response,Toast.LENGTH_LONG).show();
                   /* Intent intent = new Intent(getApplicationContext(),SignUpActivity.class);
                    startActivity(intent);*/

                    }
                },
                new Response.ErrorListener() {
                    @Override
                    public void onErrorResponse(VolleyError error) {

                    }
                }
        ) {
            @Override
            protected Map<String, String> getParams() {
                Map<String, String> parmas = new HashMap<>();

                //here we pass params
                parmas.put("action","addItem1");
                parmas.put("team_name",tn);
                parmas.put("team_leader",tl);
                parmas.put("contact",contact);
                parmas.put("email",email);
                parmas.put("college",college);
                parmas.put("participant1",p1);
                parmas.put("participant2",p2);
                parmas.put("participant3",p3);

                return parmas;
            }
        };

        int socketTimeOut = 50000;// u can change this .. here it is 50 seconds

        RetryPolicy retryPolicy = new DefaultRetryPolicy(socketTimeOut, 0, DefaultRetryPolicy.DEFAULT_BACKOFF_MULT);
        stringRequest.setRetryPolicy(retryPolicy);

        RequestQueue queue = Volley.newRequestQueue(this);

        queue.add(stringRequest);


    }

    private void cluex() {

        final ProgressDialog loading = ProgressDialog.show(this,"Adding Item","Please wait");
        final String tn =team_name.getText().toString().trim();
        final String tl = team_leader.getText().toString().trim();
        final String contact = team_contact.getText().toString().trim();
        final String email = team_email.getText().toString().trim();
        final String college = team_college.getText().toString().trim();
        final String p1 = part1.getText().toString().trim();
        final String p2 = part2.getText().toString().trim();
        final String p3 = part3.getText().toString().trim();

        StringRequest stringRequest = new StringRequest(Request.Method.POST, "https://script.google.com/macros/s/AKfycbxUrwijnLu8L4r1Ps3FkXwcPa-M2suMb6qlQce3mBCg7ddp0cH8/exec",
                new Response.Listener<String>() {
                    @Override
                    public void onResponse(String response) {

                        loading.dismiss();
                        Toast.makeText(team_register.this,response,Toast.LENGTH_LONG).show();
                   /* Intent intent = new Intent(getApplicationContext(),SignUpActivity.class);
                    startActivity(intent);*/

                    }
                },
                new Response.ErrorListener() {
                    @Override
                    public void onErrorResponse(VolleyError error) {

                    }
                }
        ) {
            @Override
            protected Map<String, String> getParams() {
                Map<String, String> parmas = new HashMap<>();

                //here we pass params
                parmas.put("action","addItem1");
                parmas.put("team_name",tn);
                parmas.put("team_leader",tl);
                parmas.put("contact",contact);
                parmas.put("email",email);
                parmas.put("college",college);
                parmas.put("participant1",p1);
                parmas.put("participant2",p2);
                parmas.put("participant3",p3);

                return parmas;
            }
        };

        int socketTimeOut = 50000;// u can change this .. here it is 50 seconds

        RetryPolicy retryPolicy = new DefaultRetryPolicy(socketTimeOut, 0, DefaultRetryPolicy.DEFAULT_BACKOFF_MULT);
        stringRequest.setRetryPolicy(retryPolicy);

        RequestQueue queue = Volley.newRequestQueue(this);

        queue.add(stringRequest);


    }

    private void admaking() {

        final ProgressDialog loading = ProgressDialog.show(this,"Adding Item","Please wait");
        final String tn =team_name.getText().toString().trim();
        final String tl = team_leader.getText().toString().trim();
        final String contact = team_contact.getText().toString().trim();
        final String email = team_email.getText().toString().trim();
        final String college = team_college.getText().toString().trim();
        final String p1 = part1.getText().toString().trim();
        final String p2 = part2.getText().toString().trim();
        final String p3 = part3.getText().toString().trim();

        StringRequest stringRequest = new StringRequest(Request.Method.POST, "https://script.google.com/macros/s/AKfycbwaBE_2-LIL6g9l8h0Sw4vWHXodZghYFn1di_JfdtWCpX0k0-Qu/exec",
                new Response.Listener<String>() {
                    @Override
                    public void onResponse(String response) {

                        loading.dismiss();
                        Toast.makeText(team_register.this,response,Toast.LENGTH_LONG).show();
                   /* Intent intent = new Intent(getApplicationContext(),SignUpActivity.class);
                    startActivity(intent);*/

                    }
                },
                new Response.ErrorListener() {
                    @Override
                    public void onErrorResponse(VolleyError error) {

                    }
                }
        ) {
            @Override
            protected Map<String, String> getParams() {
                Map<String, String> parmas = new HashMap<>();

                //here we pass params
                parmas.put("action","addItem1");
                parmas.put("team_name",tn);
                parmas.put("team_leader",tl);
                parmas.put("contact",contact);
                parmas.put("email",email);
                parmas.put("college",college);
                parmas.put("participant1",p1);
                parmas.put("participant2",p2);
                parmas.put("participant3",p3);

                return parmas;
            }
        };

        int socketTimeOut = 50000;// u can change this .. here it is 50 seconds

        RetryPolicy retryPolicy = new DefaultRetryPolicy(socketTimeOut, 0, DefaultRetryPolicy.DEFAULT_BACKOFF_MULT);
        stringRequest.setRetryPolicy(retryPolicy);

        RequestQueue queue = Volley.newRequestQueue(this);

        queue.add(stringRequest);


    }

    private void getsetsell() {

        final ProgressDialog loading = ProgressDialog.show(this,"Adding Item","Please wait");
        final String tn =team_name.getText().toString().trim();
        final String tl = team_leader.getText().toString().trim();
        final String contact = team_contact.getText().toString().trim();
        final String email = team_email.getText().toString().trim();
        final String college = team_college.getText().toString().trim();
        final String p1 = part1.getText().toString().trim();
        final String p2 = part2.getText().toString().trim();
        final String p3 = part3.getText().toString().trim();

        StringRequest stringRequest = new StringRequest(Request.Method.POST, "https://script.google.com/macros/s/AKfycby8BqtWWy09ND1kDuzstfiveEW2zI_uQjSvWKNkVmnmzRl3rXI/exec",
                new Response.Listener<String>() {
                    @Override
                    public void onResponse(String response) {

                        loading.dismiss();
                        Toast.makeText(team_register.this,response,Toast.LENGTH_LONG).show();
                   /* Intent intent = new Intent(getApplicationContext(),SignUpActivity.class);
                    startActivity(intent);*/

                    }
                },
                new Response.ErrorListener() {
                    @Override
                    public void onErrorResponse(VolleyError error) {

                    }
                }
        ) {
            @Override
            protected Map<String, String> getParams() {
                Map<String, String> parmas = new HashMap<>();

                //here we pass params
                parmas.put("action","addItem1");
                parmas.put("team_name",tn);
                parmas.put("team_leader",tl);
                parmas.put("contact",contact);
                parmas.put("email",email);
                parmas.put("college",college);
                parmas.put("participant1",p1);
                parmas.put("participant2",p2);
                parmas.put("participant3",p3);

                return parmas;
            }
        };

        int socketTimeOut = 50000;// u can change this .. here it is 50 seconds

        RetryPolicy retryPolicy = new DefaultRetryPolicy(socketTimeOut, 0, DefaultRetryPolicy.DEFAULT_BACKOFF_MULT);
        stringRequest.setRetryPolicy(retryPolicy);

        RequestQueue queue = Volley.newRequestQueue(this);

        queue.add(stringRequest);


    }

    private void idea_preach() {

        final ProgressDialog loading = ProgressDialog.show(this,"Adding Item","Please wait");
        final String tn =team_name.getText().toString().trim();
        final String tl = team_leader.getText().toString().trim();
        final String contact = team_contact.getText().toString().trim();
        final String email = team_email.getText().toString().trim();
        final String college = team_college.getText().toString().trim();
        final String p1 = part1.getText().toString().trim();
        final String p2 = part2.getText().toString().trim();
        final String p3 = part3.getText().toString().trim();

        StringRequest stringRequest = new StringRequest(Request.Method.POST, "https://script.google.com/macros/s/AKfycbx5C5A7uF8ZB8vUNzGoV7MvDPadd1tRz6W-pz2ldzxRyumrR-Vd/exec",
                new Response.Listener<String>() {
                    @Override
                    public void onResponse(String response) {

                        loading.dismiss();
                        Toast.makeText(team_register.this,response,Toast.LENGTH_LONG).show();
                   /* Intent intent = new Intent(getApplicationContext(),SignUpActivity.class);
                    startActivity(intent);*/

                    }
                },
                new Response.ErrorListener() {
                    @Override
                    public void onErrorResponse(VolleyError error) {

                    }
                }
        ) {
            @Override
            protected Map<String, String> getParams() {
                Map<String, String> parmas = new HashMap<>();

                //here we pass params
                parmas.put("action","addItem1");
                parmas.put("team_name",tn);
                parmas.put("team_leader",tl);
                parmas.put("contact",contact);
                parmas.put("email",email);
                parmas.put("college",college);
                parmas.put("participant1",p1);
                parmas.put("participant2",p2);
                parmas.put("participant3",p3);

                return parmas;
            }
        };

        int socketTimeOut = 50000;// u can change this .. here it is 50 seconds

        RetryPolicy retryPolicy = new DefaultRetryPolicy(socketTimeOut, 0, DefaultRetryPolicy.DEFAULT_BACKOFF_MULT);
        stringRequest.setRetryPolicy(retryPolicy);

        RequestQueue queue = Volley.newRequestQueue(this);

        queue.add(stringRequest);


    }

    private void healthy_bites() {

        final ProgressDialog loading = ProgressDialog.show(this,"Adding Item","Please wait");
        final String tn =team_name.getText().toString().trim();
        final String tl = team_leader.getText().toString().trim();
        final String contact = team_contact.getText().toString().trim();
        final String email = team_email.getText().toString().trim();
        final String college = team_college.getText().toString().trim();
        final String p1 = part1.getText().toString().trim();
        final String p2 = part2.getText().toString().trim();
        final String p3 = part3.getText().toString().trim();

        StringRequest stringRequest = new StringRequest(Request.Method.POST, "https://script.google.com/macros/s/AKfycbwuK37Wscw7x0J1e-RlGrI_2LWsFwztO6HaeqpUeGA3lzNz60fb/exec",
                new Response.Listener<String>() {
                    @Override
                    public void onResponse(String response) {

                        loading.dismiss();
                        Toast.makeText(team_register.this,response,Toast.LENGTH_LONG).show();
                   /* Intent intent = new Intent(getApplicationContext(),SignUpActivity.class);
                    startActivity(intent);*/

                    }
                },
                new Response.ErrorListener() {
                    @Override
                    public void onErrorResponse(VolleyError error) {

                    }
                }
        ) {
            @Override
            protected Map<String, String> getParams() {
                Map<String, String> parmas = new HashMap<>();

                //here we pass params
                parmas.put("action","addItem1");
                parmas.put("team_name",tn);
                parmas.put("team_leader",tl);
                parmas.put("contact",contact);
                parmas.put("email",email);
                parmas.put("college",college);
                parmas.put("participant1",p1);
                parmas.put("participant2",p2);
                parmas.put("participant3",p3);

                return parmas;
            }
        };

        int socketTimeOut = 50000;// u can change this .. here it is 50 seconds

        RetryPolicy retryPolicy = new DefaultRetryPolicy(socketTimeOut, 0, DefaultRetryPolicy.DEFAULT_BACKOFF_MULT);
        stringRequest.setRetryPolicy(retryPolicy);

        RequestQueue queue = Volley.newRequestQueue(this);

        queue.add(stringRequest);


    }

    private void biote_exp() {

        final ProgressDialog loading = ProgressDialog.show(this,"Adding Item","Please wait");
        final String tn =team_name.getText().toString().trim();
        final String tl = team_leader.getText().toString().trim();
        final String contact = team_contact.getText().toString().trim();
        final String email = team_email.getText().toString().trim();
        final String college = team_college.getText().toString().trim();
        final String p1 = part1.getText().toString().trim();
        final String p2 = part2.getText().toString().trim();
        final String p3 = part3.getText().toString().trim();

        StringRequest stringRequest = new StringRequest(Request.Method.POST, "https://script.google.com/macros/s/AKfycbxMZYuZvngnV9Fo75UD9WayKYlmeBwOCoqaULLrk6FuKzAsEg8/exec",
                new Response.Listener<String>() {
                    @Override
                    public void onResponse(String response) {

                        loading.dismiss();
                        Toast.makeText(team_register.this,response,Toast.LENGTH_LONG).show();
                   /* Intent intent = new Intent(getApplicationContext(),SignUpActivity.class);
                    startActivity(intent);*/

                    }
                },
                new Response.ErrorListener() {
                    @Override
                    public void onErrorResponse(VolleyError error) {

                    }
                }
        ) {
            @Override
            protected Map<String, String> getParams() {
                Map<String, String> parmas = new HashMap<>();

                //here we pass params
                parmas.put("action","addItem1");
                parmas.put("team_name",tn);
                parmas.put("team_leader",tl);
                parmas.put("contact",contact);
                parmas.put("email",email);
                parmas.put("college",college);
                parmas.put("participant1",p1);
                parmas.put("participant2",p2);
                parmas.put("participant3",p3);

                return parmas;
            }
        };

        int socketTimeOut = 50000;// u can change this .. here it is 50 seconds

        RetryPolicy retryPolicy = new DefaultRetryPolicy(socketTimeOut, 0, DefaultRetryPolicy.DEFAULT_BACKOFF_MULT);
        stringRequest.setRetryPolicy(retryPolicy);

        RequestQueue queue = Volley.newRequestQueue(this);

        queue.add(stringRequest);


    }

    private void thinktech() {

        final ProgressDialog loading = ProgressDialog.show(this,"Adding Item","Please wait");
        final String tn =team_name.getText().toString().trim();
        final String tl = team_leader.getText().toString().trim();
        final String contact = team_contact.getText().toString().trim();
        final String email = team_email.getText().toString().trim();
        final String college = team_college.getText().toString().trim();
        final String p1 = part1.getText().toString().trim();
        final String p2 = part2.getText().toString().trim();
        final String p3 = part3.getText().toString().trim();

        StringRequest stringRequest = new StringRequest(Request.Method.POST, "https://script.google.com/macros/s/AKfycbxzh3QLvcVrnxbYWfW3-NgVuwd_gtRyMk38PWXTaOHy7iJUNXWU/exec",
                new Response.Listener<String>() {
                    @Override
                    public void onResponse(String response) {

                        loading.dismiss();
                        Toast.makeText(team_register.this,response,Toast.LENGTH_LONG).show();
                   /* Intent intent = new Intent(getApplicationContext(),SignUpActivity.class);
                    startActivity(intent);*/

                    }
                },
                new Response.ErrorListener() {
                    @Override
                    public void onErrorResponse(VolleyError error) {

                    }
                }
        ) {
            @Override
            protected Map<String, String> getParams() {
                Map<String, String> parmas = new HashMap<>();

                //here we pass params
                parmas.put("action","addItem1");
                parmas.put("team_name",tn);
                parmas.put("team_leader",tl);
                parmas.put("contact",contact);
                parmas.put("email",email);
                parmas.put("college",college);
                parmas.put("participant1",p1);
                parmas.put("participant2",p2);
                parmas.put("participant3",p3);

                return parmas;
            }
        };

        int socketTimeOut = 50000;// u can change this .. here it is 50 seconds

        RetryPolicy retryPolicy = new DefaultRetryPolicy(socketTimeOut, 0, DefaultRetryPolicy.DEFAULT_BACKOFF_MULT);
        stringRequest.setRetryPolicy(retryPolicy);

        RequestQueue queue = Volley.newRequestQueue(this);

        queue.add(stringRequest);


    }

    private void uicc() {

        final ProgressDialog loading = ProgressDialog.show(this,"Adding Item","Please wait");
        final String tn =team_name.getText().toString().trim();
        final String tl = team_leader.getText().toString().trim();
        final String contact = team_contact.getText().toString().trim();
        final String email = team_email.getText().toString().trim();
        final String college = team_college.getText().toString().trim();
        final String p1 = part1.getText().toString().trim();
        final String p2 = part2.getText().toString().trim();
        final String p3 = part3.getText().toString().trim();

        StringRequest stringRequest = new StringRequest(Request.Method.POST, "https://script.google.com/macros/s/AKfycbwiL6Sm8-pTu4PNkINu-JmdQZ1k-s9tyoOCP0cVX03bJGmT57U/exec",
                new Response.Listener<String>() {
                    @Override
                    public void onResponse(String response) {

                        loading.dismiss();
                        Toast.makeText(team_register.this,response,Toast.LENGTH_LONG).show();
                   /* Intent intent = new Intent(getApplicationContext(),SignUpActivity.class);
                    startActivity(intent);*/

                    }
                },
                new Response.ErrorListener() {
                    @Override
                    public void onErrorResponse(VolleyError error) {

                    }
                }
        ) {
            @Override
            protected Map<String, String> getParams() {
                Map<String, String> parmas = new HashMap<>();

                //here we pass params
                parmas.put("action","addItem1");
                parmas.put("team_name",tn);
                parmas.put("team_leader",tl);
                parmas.put("contact",contact);
                parmas.put("email",email);
                parmas.put("college",college);
                parmas.put("participant1",p1);
                parmas.put("participant2",p2);
                parmas.put("participant3",p3);

                return parmas;
            }
        };

        int socketTimeOut = 50000;// u can change this .. here it is 50 seconds

        RetryPolicy retryPolicy = new DefaultRetryPolicy(socketTimeOut, 0, DefaultRetryPolicy.DEFAULT_BACKOFF_MULT);
        stringRequest.setRetryPolicy(retryPolicy);

        RequestQueue queue = Volley.newRequestQueue(this);

        queue.add(stringRequest);


    }

    private void techscript() {

        final ProgressDialog loading = ProgressDialog.show(this,"Adding Item","Please wait");
        final String tn =team_name.getText().toString().trim();
        final String tl = team_leader.getText().toString().trim();
        final String contact = team_contact.getText().toString().trim();
        final String email = team_email.getText().toString().trim();
        final String college = team_college.getText().toString().trim();
        final String p1 = part1.getText().toString().trim();
        final String p2 = part2.getText().toString().trim();
        final String p3 = part3.getText().toString().trim();

        StringRequest stringRequest = new StringRequest(Request.Method.POST, "https://script.google.com/macros/s/AKfycbyC7n0-WwM8wzRGSYSfbQ1OPacNLbS4_zbxPmAXUVSAch1cVV4/exec",
                new Response.Listener<String>() {
                    @Override
                    public void onResponse(String response) {

                        loading.dismiss();
                        Toast.makeText(team_register.this,response,Toast.LENGTH_LONG).show();
                   /* Intent intent = new Intent(getApplicationContext(),SignUpActivity.class);
                    startActivity(intent);*/

                    }
                },
                new Response.ErrorListener() {
                    @Override
                    public void onErrorResponse(VolleyError error) {

                    }
                }
        ) {
            @Override
            protected Map<String, String> getParams() {
                Map<String, String> parmas = new HashMap<>();

                //here we pass params
                parmas.put("action","addItem1");
                parmas.put("team_name",tn);
                parmas.put("team_leader",tl);
                parmas.put("contact",contact);
                parmas.put("email",email);
                parmas.put("college",college);
                parmas.put("participant1",p1);
                parmas.put("participant2",p2);
                parmas.put("participant3",p3);

                return parmas;
            }
        };

        int socketTimeOut = 50000;// u can change this .. here it is 50 seconds

        RetryPolicy retryPolicy = new DefaultRetryPolicy(socketTimeOut, 0, DefaultRetryPolicy.DEFAULT_BACKOFF_MULT);
        stringRequest.setRetryPolicy(retryPolicy);

        RequestQueue queue = Volley.newRequestQueue(this);

        queue.add(stringRequest);


    }

    private void postx() {

        final ProgressDialog loading = ProgressDialog.show(this,"Adding Item","Please wait");
        final String tn =team_name.getText().toString().trim();
        final String tl = team_leader.getText().toString().trim();
        final String contact = team_contact.getText().toString().trim();
        final String email = team_email.getText().toString().trim();
        final String college = team_college.getText().toString().trim();
        final String p1 = part1.getText().toString().trim();
        final String p2 = part2.getText().toString().trim();
        final String p3 = part3.getText().toString().trim();

        StringRequest stringRequest = new StringRequest(Request.Method.POST, "https://script.google.com/macros/s/AKfycbxS-8Z1EjCiE1Ko6EqMS00xHjKo_oDzTBu9ab_EpMi6RKqYXvI/exec",
                new Response.Listener<String>() {
                    @Override
                    public void onResponse(String response) {

                        loading.dismiss();
                        Toast.makeText(team_register.this,response,Toast.LENGTH_LONG).show();
                   /* Intent intent = new Intent(getApplicationContext(),SignUpActivity.class);
                    startActivity(intent);*/

                    }
                },
                new Response.ErrorListener() {
                    @Override
                    public void onErrorResponse(VolleyError error) {

                    }
                }
        ) {
            @Override
            protected Map<String, String> getParams() {
                Map<String, String> parmas = new HashMap<>();

                //here we pass params
                parmas.put("action","addItem1");
                parmas.put("team_name",tn);
                parmas.put("team_leader",tl);
                parmas.put("contact",contact);
                parmas.put("email",email);
                parmas.put("college",college);
                parmas.put("participant1",p1);
                parmas.put("participant2",p2);
                parmas.put("participant3",p3);

                return parmas;
            }
        };

        int socketTimeOut = 50000;// u can change this .. here it is 50 seconds

        RetryPolicy retryPolicy = new DefaultRetryPolicy(socketTimeOut, 0, DefaultRetryPolicy.DEFAULT_BACKOFF_MULT);
        stringRequest.setRetryPolicy(retryPolicy);

        RequestQueue queue = Volley.newRequestQueue(this);

        queue.add(stringRequest);


    }

    private void aerostorm() {

        final ProgressDialog loading = ProgressDialog.show(this,"Adding Item","Please wait");
        final String tn =team_name.getText().toString().trim();
        final String tl = team_leader.getText().toString().trim();
        final String contact = team_contact.getText().toString().trim();
        final String email = team_email.getText().toString().trim();
        final String college = team_college.getText().toString().trim();
        final String p1 = part1.getText().toString().trim();
        final String p2 = part2.getText().toString().trim();
        final String p3 = part3.getText().toString().trim();

        StringRequest stringRequest = new StringRequest(Request.Method.POST, "https://script.google.com/macros/s/AKfycbwuF14ZI2F6b86CyoNETcu3_vzjDcsBD1ZjdFv4WwKqtOgq6Ec/exec",
                new Response.Listener<String>() {
                    @Override
                    public void onResponse(String response) {

                        loading.dismiss();
                        Toast.makeText(team_register.this,response,Toast.LENGTH_LONG).show();
                   /* Intent intent = new Intent(getApplicationContext(),SignUpActivity.class);
                    startActivity(intent);*/

                    }
                },
                new Response.ErrorListener() {
                    @Override
                    public void onErrorResponse(VolleyError error) {

                    }
                }
        ) {
            @Override
            protected Map<String, String> getParams() {
                Map<String, String> parmas = new HashMap<>();

                //here we pass params
                parmas.put("action","addItem1");
                parmas.put("team_name",tn);
                parmas.put("team_leader",tl);
                parmas.put("contact",contact);
                parmas.put("email",email);
                parmas.put("college",college);
                parmas.put("participant1",p1);
                parmas.put("participant2",p2);
                parmas.put("participant3",p3);

                return parmas;
            }
        };

        int socketTimeOut = 50000;// u can change this .. here it is 50 seconds

        RetryPolicy retryPolicy = new DefaultRetryPolicy(socketTimeOut, 0, DefaultRetryPolicy.DEFAULT_BACKOFF_MULT);
        stringRequest.setRetryPolicy(retryPolicy);

        RequestQueue queue = Volley.newRequestQueue(this);

        queue.add(stringRequest);


    }

    private void hold_the_grip()
    {
        final ProgressDialog loading = ProgressDialog.show(this,"Adding Item","Please wait");
        final String tn =team_name.getText().toString().trim();
        final String tl = team_leader.getText().toString().trim();
        final String contact = team_contact.getText().toString().trim();
        final String email = team_email.getText().toString().trim();
        final String college = team_college.getText().toString().trim();
        final String p1 = part1.getText().toString().trim();
        final String p2 = part2.getText().toString().trim();
        final String p3 = part3.getText().toString().trim();

        StringRequest stringRequest = new StringRequest(Request.Method.POST, "https://script.google.com/macros/s/AKfycbxsfmchND_2Vj_tXe6Wih_yAQNMH705HuqLrB9lDVhIGcNmwnmi/exec",
                new Response.Listener<String>() {
                    @Override
                    public void onResponse(String response) {

                        loading.dismiss();
                        Toast.makeText(team_register.this,response,Toast.LENGTH_LONG).show();
                   /* Intent intent = new Intent(getApplicationContext(),SignUpActivity.class);
                    startActivity(intent);*/

                    }
                },
                new Response.ErrorListener() {
                    @Override
                    public void onErrorResponse(VolleyError error) {

                    }
                }
        ) {
            @Override
            protected Map<String, String> getParams() {
                Map<String, String> parmas = new HashMap<>();

                //here we pass params
                parmas.put("action","addItem1");
                parmas.put("team_name",tn);
                parmas.put("team_leader",tl);
                parmas.put("contact",contact);
                parmas.put("email",email);
                parmas.put("college",college);
                parmas.put("participant1",p1);
                parmas.put("participant2",p2);
                parmas.put("participant3",p3);

                return parmas;
            }
        };

        int socketTimeOut = 50000;// u can change this .. here it is 50 seconds

        RetryPolicy retryPolicy = new DefaultRetryPolicy(socketTimeOut, 0, DefaultRetryPolicy.DEFAULT_BACKOFF_MULT);
        stringRequest.setRetryPolicy(retryPolicy);

        RequestQueue queue = Volley.newRequestQueue(this);

        queue.add(stringRequest);
    }

    private void dirrecion() {

        final ProgressDialog loading = ProgressDialog.show(this,"Adding Item","Please wait");
        final String tn =team_name.getText().toString().trim();
        final String tl = team_leader.getText().toString().trim();
        final String contact = team_contact.getText().toString().trim();
        final String email = team_email.getText().toString().trim();
        final String college = team_college.getText().toString().trim();
        final String p1 = part1.getText().toString().trim();
        final String p2 = part2.getText().toString().trim();
        final String p3 = part3.getText().toString().trim();

        StringRequest stringRequest = new StringRequest(Request.Method.POST, "https://script.google.com/macros/s/AKfycbyJFMT9FLExgilMX_je5NA01NSc0CWeO3NhLFm58N33i4elH25v/exec",
                new Response.Listener<String>() {
                    @Override
                    public void onResponse(String response) {

                        loading.dismiss();
                        Toast.makeText(team_register.this,response,Toast.LENGTH_LONG).show();
                   /* Intent intent = new Intent(getApplicationContext(),SignUpActivity.class);
                    startActivity(intent);*/

                    }
                },
                new Response.ErrorListener() {
                    @Override
                    public void onErrorResponse(VolleyError error) {

                    }
                }
        ) {
            @Override
            protected Map<String, String> getParams() {
                Map<String, String> parmas = new HashMap<>();

                //here we pass params
                parmas.put("action","addItem1");
                parmas.put("team_name",tn);
                parmas.put("team_leader",tl);
                parmas.put("contact",contact);
                parmas.put("email",email);
                parmas.put("college",college);
                parmas.put("participant1",p1);
                parmas.put("participant2",p2);
                parmas.put("participant3",p3);

                return parmas;
            }
        };

        int socketTimeOut = 50000;// u can change this .. here it is 50 seconds

        RetryPolicy retryPolicy = new DefaultRetryPolicy(socketTimeOut, 0, DefaultRetryPolicy.DEFAULT_BACKOFF_MULT);
        stringRequest.setRetryPolicy(retryPolicy);

        RequestQueue queue = Volley.newRequestQueue(this);

        queue.add(stringRequest);

    }

    private void roboleague() {

        final ProgressDialog loading = ProgressDialog.show(this,"Adding Item","Please wait");
        final String tn =team_name.getText().toString().trim();
        final String tl = team_leader.getText().toString().trim();
        final String contact = team_contact.getText().toString().trim();
        final String email = team_email.getText().toString().trim();
        final String college = team_college.getText().toString().trim();
        final String p1 = part1.getText().toString().trim();
        final String p2 = part2.getText().toString().trim();
        final String p3 = part3.getText().toString().trim();

        StringRequest stringRequest = new StringRequest(Request.Method.POST, "https://script.google.com/macros/s/AKfycbw46Q4ZjRVEIHgoGvXOhJmB6P32Ouq28IQAIv_sJ2B5Jy5Q7qGx/exec",
                new Response.Listener<String>() {
                    @Override
                    public void onResponse(String response) {

                        loading.dismiss();
                        Toast.makeText(team_register.this,response,Toast.LENGTH_LONG).show();
                   /* Intent intent = new Intent(getApplicationContext(),SignUpActivity.class);
                    startActivity(intent);*/

                    }
                },
                new Response.ErrorListener() {
                    @Override
                    public void onErrorResponse(VolleyError error) {

                    }
                }
        ) {
            @Override
            protected Map<String, String> getParams() {
                Map<String, String> parmas = new HashMap<>();

                //here we pass params
                parmas.put("action","addItem1");
                parmas.put("team_name",tn);
                parmas.put("team_leader",tl);
                parmas.put("contact",contact);
                parmas.put("email",email);
                parmas.put("college",college);
                parmas.put("participant1",p1);
                parmas.put("participant2",p2);
                parmas.put("participant3",p3);

                return parmas;
            }
        };

        int socketTimeOut = 50000;// u can change this .. here it is 50 seconds

        RetryPolicy retryPolicy = new DefaultRetryPolicy(socketTimeOut, 0, DefaultRetryPolicy.DEFAULT_BACKOFF_MULT);
        stringRequest.setRetryPolicy(retryPolicy);

        RequestQueue queue = Volley.newRequestQueue(this);

        queue.add(stringRequest);

    }

    private void techexpo() {

        final ProgressDialog loading = ProgressDialog.show(this,"Adding Item","Please wait");
        final String tn =team_name.getText().toString().trim();
        final String tl = team_leader.getText().toString().trim();
        final String contact = team_contact.getText().toString().trim();
        final String email = team_email.getText().toString().trim();
        final String college = team_college.getText().toString().trim();
        final String p1 = part1.getText().toString().trim();
        final String p2 = part2.getText().toString().trim();
        final String p3 = part3.getText().toString().trim();

        StringRequest stringRequest = new StringRequest(Request.Method.POST, "https://script.google.com/macros/s/AKfycbzbhOC7yjwgX42K9q_-O96sgJVJNRQzzT7RCWyktQDSm4BO0rHF/exec",
                new Response.Listener<String>() {
                    @Override
                    public void onResponse(String response) {

                        loading.dismiss();
                        Toast.makeText(team_register.this,response,Toast.LENGTH_LONG).show();
                   /* Intent intent = new Intent(getApplicationContext(),SignUpActivity.class);
                    startActivity(intent);*/

                    }
                },
                new Response.ErrorListener() {
                    @Override
                    public void onErrorResponse(VolleyError error) {

                    }
                }
        ) {
            @Override
            protected Map<String, String> getParams() {
                Map<String, String> parmas = new HashMap<>();

                //here we pass params
                parmas.put("action","addItem1");
                parmas.put("team_name",tn);
                parmas.put("team_leader",tl);
                parmas.put("contact",contact);
                parmas.put("email",email);
                parmas.put("college",college);
                parmas.put("participant1",p1);
                parmas.put("participant2",p2);
                parmas.put("participant3",p3);

                return parmas;
            }
        };

        int socketTimeOut = 50000;// u can change this .. here it is 50 seconds

        RetryPolicy retryPolicy = new DefaultRetryPolicy(socketTimeOut, 0, DefaultRetryPolicy.DEFAULT_BACKOFF_MULT);
        stringRequest.setRetryPolicy(retryPolicy);

        RequestQueue queue = Volley.newRequestQueue(this);

        queue.add(stringRequest);


    }

    private void robodangal() {

        final ProgressDialog loading = ProgressDialog.show(this,"Adding Item","Please wait");
        final String tn =team_name.getText().toString().trim();
        final String tl = team_leader.getText().toString().trim();
        final String contact = team_contact.getText().toString().trim();
        final String email = team_email.getText().toString().trim();
        final String college = team_college.getText().toString().trim();
        final String p1 = part1.getText().toString().trim();
        final String p2 = part2.getText().toString().trim();
        final String p3 = part3.getText().toString().trim();

        StringRequest stringRequest = new StringRequest(Request.Method.POST, "https://script.google.com/macros/s/AKfycbx6b9HN8p1GurFou-wuOqyv0hcj16AmjhYxQ8azLEyMBt4aIdJn/exec",
                new Response.Listener<String>() {
                    @Override
                    public void onResponse(String response) {

                        loading.dismiss();
                        Toast.makeText(team_register.this,response,Toast.LENGTH_LONG).show();
                   /* Intent intent = new Intent(getApplicationContext(),SignUpActivity.class);
                    startActivity(intent);*/

                    }
                },
                new Response.ErrorListener() {
                    @Override
                    public void onErrorResponse(VolleyError error) {

                    }
                }
        ) {
            @Override
            protected Map<String, String> getParams() {
                Map<String, String> parmas = new HashMap<>();

                //here we pass params
                parmas.put("action","addItem1");
                parmas.put("team_name",tn);
                parmas.put("team_leader",tl);
                parmas.put("contact",contact);
                parmas.put("email",email);
                parmas.put("college",college);
                parmas.put("participant1",p1);
                parmas.put("participant2",p2);
                parmas.put("participant3",p3);

                return parmas;
            }
        };

        int socketTimeOut = 50000;// u can change this .. here it is 50 seconds

        RetryPolicy retryPolicy = new DefaultRetryPolicy(socketTimeOut, 0, DefaultRetryPolicy.DEFAULT_BACKOFF_MULT);
        stringRequest.setRetryPolicy(retryPolicy);

        RequestQueue queue = Volley.newRequestQueue(this);

        queue.add(stringRequest);


    }

    private void need_for_torque() {

        final ProgressDialog loading = ProgressDialog.show(this,"Adding Item","Please wait");
        final String tn =team_name.getText().toString().trim();
        final String tl = team_leader.getText().toString().trim();
        final String contact = team_contact.getText().toString().trim();
        final String email = team_email.getText().toString().trim();
        final String college = team_college.getText().toString().trim();
        final String p1 = part1.getText().toString().trim();
        final String p2 = part2.getText().toString().trim();
        final String p3 = part3.getText().toString().trim();

        StringRequest stringRequest = new StringRequest(Request.Method.POST, "https://script.google.com/macros/s/AKfycbwTxnGDPJhT5iQgT8lpzWxIA_9T62j5mX7GdqzOTY3qPGgp7oI/exec",
                new Response.Listener<String>() {
                    @Override
                    public void onResponse(String response) {

                        loading.dismiss();
                        Toast.makeText(team_register.this,response,Toast.LENGTH_LONG).show();
                   /* Intent intent = new Intent(getApplicationContext(),SignUpActivity.class);
                    startActivity(intent);*/

                    }
                },
                new Response.ErrorListener() {
                    @Override
                    public void onErrorResponse(VolleyError error) {

                    }
                }
        ) {
            @Override
            protected Map<String, String> getParams() {
                Map<String, String> parmas = new HashMap<>();

                //here we pass params
                parmas.put("action","addItem1");
                parmas.put("team_name",tn);
                parmas.put("team_leader",tl);
                parmas.put("contact",contact);
                parmas.put("email",email);
                parmas.put("college",college);
                parmas.put("participant1",p1);
                parmas.put("participant2",p2);
                parmas.put("participant3",p3);

                return parmas;
            }
        };

        int socketTimeOut = 50000;// u can change this .. here it is 50 seconds

        RetryPolicy retryPolicy = new DefaultRetryPolicy(socketTimeOut, 0, DefaultRetryPolicy.DEFAULT_BACKOFF_MULT);
        stringRequest.setRetryPolicy(retryPolicy);

        RequestQueue queue = Volley.newRequestQueue(this);

        queue.add(stringRequest);


    }



    private void uic() {

        final ProgressDialog loading = ProgressDialog.show(this,"Adding Item","Please wait");
        final String tn =team_name.getText().toString().trim();
        final String tl = team_leader.getText().toString().trim();
        final String p1 = part1.getText().toString().trim();
        final String p2 = part2.getText().toString().trim();
        final String p3 = part3.getText().toString().trim();

    StringRequest stringRequest = new StringRequest(Request.Method.POST, "https://script.google.com/macros/s/AKfycbyQ2UuS8pEWijkF_gjQAzpk0olcg3Fax4cFzUqIZ3vSQX-Kg01g/exec",
            new Response.Listener<String>() {
                @Override
                public void onResponse(String response) {

                    loading.dismiss();
                    Toast.makeText(team_register.this,response,Toast.LENGTH_LONG).show();
                   /* Intent intent = new Intent(getApplicationContext(),SignUpActivity.class);
                    startActivity(intent);*/

                }
            },
            new Response.ErrorListener() {
                @Override
                public void onErrorResponse(VolleyError error) {

                }
            }
    ) {
        @Override
        protected Map<String, String> getParams() {
            Map<String, String> parmas = new HashMap<>();

            //here we pass params
            parmas.put("action","addItem1");
            parmas.put("team_name",tn);
            parmas.put("team_leader",tl);
            parmas.put("participant1",p1);
            parmas.put("participant2",p2);
            parmas.put("participant3",p3);

            return parmas;
        }
    };

    int socketTimeOut = 50000;// u can change this .. here it is 50 seconds

    RetryPolicy retryPolicy = new DefaultRetryPolicy(socketTimeOut, 0, DefaultRetryPolicy.DEFAULT_BACKOFF_MULT);
        stringRequest.setRetryPolicy(retryPolicy);

    RequestQueue queue = Volley.newRequestQueue(this);

        queue.add(stringRequest);


}

    private void ureckathon() {

        final ProgressDialog loading = ProgressDialog.show(this,"Adding Item","Please wait");
        final String tn =team_name.getText().toString().trim();
        final String tl = team_leader.getText().toString().trim();
        final String contact = team_contact.getText().toString().trim();
        final String email = team_email.getText().toString().trim();
        final String college = team_college.getText().toString().trim();
        final String p1 = part1.getText().toString().trim();
        final String p2 = part2.getText().toString().trim();
        final String p3 = part3.getText().toString().trim();

        StringRequest stringRequest = new StringRequest(Request.Method.POST, "https://script.google.com/macros/s/AKfycbzbhOC7yjwgX42K9q_-O96sgJVJNRQzzT7RCWyktQDSm4BO0rHF/exec",
                new Response.Listener<String>() {
                    @Override
                    public void onResponse(String response) {

                        loading.dismiss();
                        Toast.makeText(team_register.this,response,Toast.LENGTH_LONG).show();
                   /* Intent intent = new Intent(getApplicationContext(),SignUpActivity.class);
                    startActivity(intent);*/

                    }
                },
                new Response.ErrorListener() {
                    @Override
                    public void onErrorResponse(VolleyError error) {

                    }
                }
        ) {
            @Override
            protected Map<String, String> getParams() {
                Map<String, String> parmas = new HashMap<>();

                //here we pass params
                parmas.put("action","addItem1");
                parmas.put("team_name",tn);
                parmas.put("team_leader",tl);
                parmas.put("contact",contact);
                parmas.put("email",email);
                parmas.put("college",college);
                parmas.put("participant1",p1);
                parmas.put("participant2",p2);
                parmas.put("participant3",p3);

                return parmas;
            }
        };

        int socketTimeOut = 50000;// u can change this .. here it is 50 seconds

        RetryPolicy retryPolicy = new DefaultRetryPolicy(socketTimeOut, 0, DefaultRetryPolicy.DEFAULT_BACKOFF_MULT);
        stringRequest.setRetryPolicy(retryPolicy);

        RequestQueue queue = Volley.newRequestQueue(this);

        queue.add(stringRequest);


    }
}
