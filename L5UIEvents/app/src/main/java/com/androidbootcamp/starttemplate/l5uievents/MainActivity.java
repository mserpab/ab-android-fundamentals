package com.androidbootcamp.starttemplate.l5uievents;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.signin_layout);
        Button loginButton = findViewById(R.id.signinButton);
        EditText UsarnameEditText = findViewById(R.id.idText)
        loginButton.setOnClickListener new View.OnClickListener(){


        }
    }
}
