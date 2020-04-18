package com.example.addpayments;

import androidx.appcompat.app.AppCompatActivity;

import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Spinner;
import android.widget.AdapterView;


import android.os.Bundle;

public class MainActivity extends AppCompatActivity implements AdapterView.OnItemSelectedListener{
    String period[]={"Monthly","Quaterly","Half Yearly","Annually"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Spinner spin=(Spinner) findViewById(R.id.spinner2);
        spin.setOnItemSelectedListener(this);
        Spinner spin2=(Spinner) findViewById(R.id.spinner3);
        spin2.setOnItemSelectedListener(this);

        ArrayAdapter<String> aa= new ArrayAdapter<String>(this,android.R.layout.simple_spinner_item,period);
        aa.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spin.setAdapter(aa);

        ArrayAdapter<String> aa2= new ArrayAdapter<String>(this,android.R.layout.simple_spinner_item,period);
        aa2.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spin2.setAdapter(aa2);

    }

    @Override
    public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {

    }

    @Override
    public void onNothingSelected(AdapterView<?> parent) {

    }
}
