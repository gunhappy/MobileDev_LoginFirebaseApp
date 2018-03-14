package com.example.gun.loginfirebase;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.auth.FirebaseUser;

public class SignIn extends AppCompatActivity {
    private FirebaseAuth mAuth;
    private TextView email;
    private Button signOut, newPost, viewPosts;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sign_in);

        mAuth = FirebaseAuth.getInstance();
        signOut = (Button)findViewById(R.id.signout);
        email = (TextView)findViewById(R.id.result);
        newPost = (Button)findViewById(R.id.newPost);
        viewPosts = (Button)findViewById(R.id.viewPosts);

        if(mAuth.getCurrentUser() == null){
            finish();
            startActivity(new Intent(getApplicationContext(),MainActivity.class));
        } else {
            FirebaseUser user = mAuth.getCurrentUser();
            email.setText("Welcome " + user.getEmail());
        }

        signOut.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mAuth.signOut();
                finish();
                startActivity(new Intent(getApplicationContext(),MainActivity.class));
            }
        });

        newPost.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(getApplicationContext(), NewPost.class));
            }
        });

        viewPosts.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(getApplicationContext(), ViewPosts.class));
            }
        });
    }
}
