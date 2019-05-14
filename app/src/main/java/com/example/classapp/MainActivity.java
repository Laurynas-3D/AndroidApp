package com.example.classapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;
import android.widget.ToggleButton;

public class MainActivity extends AppCompatActivity {

    Button btn;
    ToggleButton tbtn;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btn = findViewById(R.id.button1);

        tbtn = findViewById(R.id.toggleButton2);

    }

    public void btn_Click(View V){ //view V links btnClick appears on activity attributes


        Log.e("btnClick", "Hey! Veikia!");

    }

    public void makeTost(View V ){
        Toast.makeText(this, "My 1st toast", Toast.LENGTH_LONG).show();

    }

    public void nextActivity(View V ){

        String username = "Laurynas";

        Intent i = new Intent(this,Main3Activity.class );

        i.putExtra("intVal", 25);
      //  i.putExtra("strVal", "myString");
        i.putExtra("strVal", username);
        startActivity(i);
        finish();

    }

    public void togglebutton(View v){
        if(tbtn.isChecked()){
            Log.e("TogBtn","Button is ON");
        }
        else{
            Log.e("TogBtn","Button is OFF");
        }
    }

}
