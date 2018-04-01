package com.example.lenovo.finalgp_test1;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class ToursActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate( savedInstanceState );
        setContentView( R.layout.activity_tours );

        Button searchTourBtn = (Button)findViewById(R.id.searchToursBtn);


        searchTourBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent( ToursActivity.this , ListOfToursActivity.class );
                startActivity( intent );
            }
        });
    }
}
