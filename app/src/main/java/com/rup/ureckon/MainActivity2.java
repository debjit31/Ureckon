package com.rup.ureckon;

import android.app.ProgressDialog;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.auth.FirebaseUser;
import com.google.firebase.database.DataSnapshot;
import com.google.firebase.database.DatabaseError;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;
import com.google.firebase.database.ValueEventListener;

import android.support.annotation.NonNull;

import android.widget.TextView;
import android.widget.Toast;
import java.util.HashMap;

public class MainActivity2 extends AppCompatActivity {

    private Button button,check;
    private TextView aid;
    private String name1,college1,email1;
    private FirebaseAuth mAuth;
    private DatabaseReference detailsRef,countRef;
    private String Uid,count,resultString;
    private int c=0000,a=0,result=0;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        final ProgressDialog loading = ProgressDialog.show(this,"Generating ID","Please wait");
        button=(Button)findViewById(R.id.lg_out);
        check=(Button)findViewById(R.id.chck);
        aid=(TextView)findViewById(R.id.unique_id);

        name1 = getIntent().getStringExtra("name");
        college1 = getIntent().getStringExtra("college");
        email1 = getIntent().getStringExtra("email");
        // city1 = getIntent().getStringExtra("city");

        mAuth=FirebaseAuth.getInstance();
        FirebaseUser user=mAuth.getCurrentUser();
        Uid=user.getUid();

        detailsRef= FirebaseDatabase.getInstance().getReference().child("Users").child(Uid);
        countRef= FirebaseDatabase.getInstance().getReference().child("count");

        /*if(email1!=null)
        {
            SubmitDetails();
        }*/

      countRef.addListenerForSingleValueEvent(new ValueEventListener() {
          @Override
          public void onDataChange(@NonNull DataSnapshot dataSnapshot) {

              count=dataSnapshot.child("c").getValue(String.class);

                a=Integer.parseInt(count)+1;

                result=c+a;
                resultString = "UR"+String.valueOf(result);

                aid.setText(resultString);
                loading.dismiss();

                IncrementCount(result,resultString);

             // Toast.makeText(MainActivity2.this, resultString, Toast.LENGTH_SHORT).show();
          }

          @Override
          public void onCancelled(@NonNull DatabaseError databaseError) {

          }
      });

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                FirebaseAuth.getInstance().signOut();
                finish();
                startActivity(new Intent(MainActivity2.this, SignUpActivity.class));
            }
        });

        check.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent intent= new Intent(MainActivity2.this,AllEvents.class);

                startActivity(intent);
               // SubmitDetails();
            }
        });
    }

    private void IncrementCount(int result, final String resultString) {

       String updated_count=String.valueOf(result) ;
        HashMap<String, Object> productMap = new HashMap<>();

        productMap.put("c",updated_count);
        // productMap.put("city", city1);


        countRef.updateChildren(productMap)
                .addOnCompleteListener(new OnCompleteListener<Void>() {
                    @Override
                    public void onComplete(@NonNull Task<Void> task)
                    {
                        if (task.isSuccessful())
                        {

                           SubmitDetails(resultString);
                        }
                        else
                        {

                            String message = task.getException().toString();
                            Toast.makeText(MainActivity2.this, "Error: " + message, Toast.LENGTH_SHORT).show();
                        }
                    }
                });
    }

    private void SubmitDetails(String updated_result)
    {


        HashMap<String, Object> productMap = new HashMap<>();

        productMap.put("name",name1);
        productMap.put("institution",college1);
        productMap.put("email",email1);
        productMap.put("uid",updated_result);
        // productMap.put("city", city1);


        detailsRef.updateChildren(productMap)
                .addOnCompleteListener(new OnCompleteListener<Void>() {
                    @Override
                    public void onComplete(@NonNull Task<Void> task)
                    {
                        if (task.isSuccessful())
                        {


                            Toast.makeText(MainActivity2.this, "Details added successfully..", Toast.LENGTH_SHORT).show();

                        }
                        else
                        {

                            String message = task.getException().toString();
                            Toast.makeText(MainActivity2.this, "Error: " + message, Toast.LENGTH_SHORT).show();
                        }
                    }
                });
    }

}
