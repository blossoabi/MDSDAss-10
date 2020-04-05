package com.example.android.assignment10;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.widget.TextView;

import static com.example.android.assignment10.R.layout.activity_form_details;

public class form_details extends AppCompatActivity {

    private static final String MyPREFERENCES = "Myprefs";
    SharedPreferences sharedPreferences;

    TextView Name;
    TextView Value;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(activity_form_details);

        sharedPreferences = getSharedPreferences(MyPREFERENCES, Context.MODE_PRIVATE);

        Name = findViewById(R.id.textview_name);
        Value = findViewById(R.id.textview_value);

        if(sharedPreferences.contains("Name") &&
                sharedPreferences.contains("Value")){

            String name = sharedPreferences.getString("Name","");
            String value = sharedPreferences.getString("Value","");

            Name.setText(name);
            Value.setText(value);
        }
    }
}
