package com.example.vakhomaghradze;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    EditText firstName;
    EditText lastName;
    EditText age;
    Button btnReg;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        firstName = findViewById(R.id.editTextName);
        lastName = findViewById(R.id.editTextSurname);
        age = findViewById(R.id.editTextNumber);
        btnReg = (Button)findViewById(R.id.button1);

        btnReg.setOnClickListener(new View.OnClickListener() {


            @Override
            public void onClick(View v) {
                if (firstName.getText().toString().length() == 0) {
                    firstName.setError("Name Not Entered");
                    firstName.requestFocus();
                }
                if (lastName.getText().toString().length() == 0) {
                    lastName.setError("Surname Not Entered");
                    lastName.requestFocus();
                }
                if (age.getText().toString().isEmpty()) {
                    age.setError("You Must Enter Your Age");
                    age.requestFocus();
                }
                else {
                    Toast.makeText(getApplicationContext(), "You Registered Successfully", Toast.LENGTH_SHORT).show();
                }

            }
        }
    }
 }
