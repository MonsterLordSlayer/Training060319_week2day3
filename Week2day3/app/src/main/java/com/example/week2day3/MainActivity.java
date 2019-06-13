package com.example.week2day3;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {
    SharedPreferences sharedPreferences;
    EditText etFirstname;
    EditText etLastname;
    EditText etAddress;
    EditText etCity;
    EditText etState;
    EditText etZip;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        etFirstname=findViewById(R.id.etFirstName);
        etLastname=findViewById(R.id.etLastName);
        etAddress=findViewById(R.id.etAddress);
        etCity=findViewById(R.id.etCity);
        etState=findViewById(R.id.etState);
        etZip=findViewById(R.id.etZip);
        sharedPreferences = getSharedPreferences("shared_pref",MODE_PRIVATE);
    }
    private void storeToSharePref(String key,String string){
        SharedPreferences.Editor editor=sharedPreferences.edit();
        editor.putString(key,string);
        editor.apply();
    }
    public void onClick(View v){
        storeToSharePref("FirstName",etFirstname.getText().toString());
        storeToSharePref("LastName",etLastname.getText().toString());
        storeToSharePref("Address",etAddress.getText().toString());
        storeToSharePref("City",etCity.getText().toString());
        storeToSharePref("State",etState.getText().toString());
        storeToSharePref("Zip",etZip.getText().toString());
        Intent intent= new Intent(this,DisplayActivity.class);
        startActivity(intent);

    }
    private String retrieveFromSharePref(String key){
        return sharedPreferences.getString(key,"Nothing");
    }
}
