package com.example.lenovo.finalgp_test1;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class CarActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate( savedInstanceState );
        setContentView( R.layout.activity_car );

        Button searchCar = (Button)findViewById( R.id.searchCarBtn);
        searchCar.setOnClickListener( new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent( CarActivity.this , ListOfCarsActivity.class );
                startActivity( intent );
            }
        } );
    }
}
