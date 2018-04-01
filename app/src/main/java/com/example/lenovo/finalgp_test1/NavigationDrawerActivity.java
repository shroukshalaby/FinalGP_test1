package com.example.lenovo.finalgp_test1;

import android.content.Intent;
import android.support.annotation.NonNull;
import android.support.design.widget.NavigationView;
import android.support.v4.view.GravityCompat;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.ActionBarDrawerToggle;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;

public class NavigationDrawerActivity extends AppCompatActivity
    implements NavigationView.OnNavigationItemSelectedListener
{
    private DrawerLayout mDrawerLayout;
    private ActionBarDrawerToggle mActionBar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate( savedInstanceState );
        setContentView( R.layout.activity_navigation_drawer );

        mDrawerLayout = (DrawerLayout)findViewById( R.id.drawer_layout);
        mActionBar= new ActionBarDrawerToggle( this , mDrawerLayout , R.string.open, R.string.close );
        mDrawerLayout.addDrawerListener( mActionBar );
        mActionBar.syncState();
        getSupportActionBar().setDisplayHomeAsUpEnabled( true );

    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.drawermenu, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item)
    {

        if(mActionBar.onOptionsItemSelected( item ))
        {
            return true;
        }
        return super.onOptionsItemSelected( item );

    }

    @Override
    public boolean onNavigationItemSelected(@NonNull MenuItem item) {
        int id = item.getItemId();

         if (id == R.id.profile) {
            Intent i = new Intent( this, EditProfileActivity.class );
            startActivity( i );
        } else if (id == R.id.flights) {
            Intent i = new Intent( this, FlightActivity.class );
            startActivity( i );
        } else if (id == R.id.hotels) {
            Intent i = new Intent( this, HotelActivity.class );
            startActivity( i );
        } else if (id == R.id.cars) {
            Intent i = new Intent( this, CarActivity.class );
            startActivity( i );
        } else if (id == R.id.tours) {
            Intent i = new Intent( this, ToursActivity.class );
            startActivity( i );
        }
        else if (id == R.id.currency_converter)
        {
            Intent i = new Intent(this ,CurrencyConverterActivity.class );
            startActivity( i );
        }
        else if (id == R.id.signOut)
        {
            Intent i = new Intent(this ,LoginActivity.class );
            startActivity( i );
        }
        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        drawer.closeDrawer( GravityCompat.START);
        return true;

    }
}
