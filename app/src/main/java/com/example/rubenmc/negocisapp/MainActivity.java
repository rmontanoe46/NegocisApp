package com.example.rubenmc.negocisapp;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity implements View.OnClickListener{

    private EditText camp;

    public Button businesses,restaurants,movies,weather,events,hotels,telefon;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        businesses=findViewById(R.id.btBusinesses);
        businesses.setOnClickListener(this);

        restaurants=findViewById(R.id.btRestaurants);
        restaurants.setOnClickListener(this);

        movies=findViewById(R.id.btMovies);
        movies.setOnClickListener(this);

        weather=findViewById(R.id.btWeather);
        weather.setOnClickListener(this);

        events=findViewById(R.id.btEvents);
        events.setOnClickListener(this);

        hotels=findViewById(R.id.btHotels);
        hotels.setOnClickListener(this);

        telefon=findViewById(R.id.telefon);
        telefon.setOnClickListener(this);


        camp=findViewById(R.id.edtTxt);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()){
            case R.id.btBusinesses:
                startActivity(new Intent(this, BusinessesActivity.class));
                break;

            case R.id.btRestaurants:
                startActivity(new Intent(this,RestaurantsActivity.class));
                break;
            case R.id.btMovies:
                startActivity(new Intent(this,MoviesActivity.class));
                break;

            case R.id.btWeather:
                startActivity(new Intent(this,MoviesActivity.class));
                break;

            case R.id.btEvents:
                startActivity(new Intent(this,EventsActivity.class));
                break;

            case R.id.btHotels:
                startActivity(new Intent(this,HotelsActivity.class));
                break;

            case R.id.telefon:
                Intent intent=new Intent(Intent.ACTION_DIAL);
                intent.setData(Uri.parse("tel:112"));

                startActivity(intent);


        }
    }
}
