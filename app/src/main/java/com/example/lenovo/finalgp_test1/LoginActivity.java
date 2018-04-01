package com.example.lenovo.finalgp_test1;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.CardView;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class LoginActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate( savedInstanceState );
        setContentView( R.layout.activity_login );

        EditText emailET = (EditText) findViewById( R.id.email );
        EditText passwordET = (EditText) findViewById( R.id.password);

        Button signinBtn = (Button) findViewById( R.id.loginBtn );
        signinBtn.setOnClickListener( new View.OnClickListener() {
            @Override
            public void onClick(View view)
            {
                Intent intent = new Intent( LoginActivity.this , HomeActivity.class );
                startActivity( intent );
            }
        } );


        Button signupBtn = (Button) findViewById( R.id.signupBtn );
        signupBtn.setOnClickListener( new View.OnClickListener() {
            @Override
            public void onClick(View view)
            {
                Intent intent = new Intent( LoginActivity.this , HomeActivity.class );
                startActivity( intent );
            }
        } );

    }
}
