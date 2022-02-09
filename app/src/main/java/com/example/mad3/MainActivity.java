package com.example.mad3;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    EditText string;
     Button btn1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        string = (EditText) findViewById(R.id.string);

        btn1= (Button) findViewById(R.id.btn1);
        btn1.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                String name = string.getText().toString();

                if(name.length()!=0) {
                    // If name or password is not entered
                    Toast.makeText(getApplicationContext(), "string entered successfully", Toast.LENGTH_LONG).show();
                }
                else {
                    Toast.makeText(getApplicationContext(), "string not entered", Toast.LENGTH_LONG).show();
                }
                }

        });

    }
}