package com.example.week2day3;

import androidx.appcompat.app.AppCompatActivity;

import android.content.SharedPreferences;
import android.os.Bundle;
import android.widget.TextView;

public class DisplayActivity extends AppCompatActivity {
    SharedPreferences sharedPreferences;
    TextView tvFirstName;
    TextView tvLastName;
    TextView tvAddress;
    TextView tvCity;
    TextView tvState;
    TextView tvZip;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_display);
        sharedPreferences=getSharedPreferences("shared_pref",MODE_PRIVATE);
        tvFirstName=findViewById(R.id.tvFirstName);
        tvLastName=findViewById(R.id.tvLastName);
        tvAddress=findViewById(R.id.tvAddress);
        tvCity=findViewById(R.id.tvCity);
        tvState=findViewById(R.id.tvState);
        tvZip=findViewById(R.id.tvZip);
        tvFirstName.setText(sharedPreferences.getString("FirstName","Nothing"));
        tvLastName.setText(sharedPreferences.getString("LastName","Nothing"));
        tvAddress.setText(sharedPreferences.getString("Address","Nothing"));
        tvCity.setText(sharedPreferences.getString("City","Nothing"));
        tvState.setText(sharedPreferences.getString("State","Nothing"));
        tvZip.setText(sharedPreferences.getString("Zip","Nothing"));
    }
}
