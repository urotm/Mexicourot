package com.example.yourapp;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {


    private TextView nameLabel;
    private EditText nameInput;
    private TextView emailLabel;
    private EditText emailInput;
    private TextView phoneLabel;
    private EditText phoneInput;
    private TextView aboutMeLabel;
    private EditText aboutMeInput;
    private Button saveButton;

    
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        nameLabel = findViewById(R.id.nameLabel);
        nameInput = findViewById(R.id.nameInput);
        emailLabel = findViewById(R.id.emailLabel);
        emailInput = findViewById(R.id.emailInput);
        phoneLabel = findViewById(R.id.phoneLabel);
        phoneInput = findViewById(R.id.phoneInput);
        aboutMeLabel = findViewById(R.id.aboutMeLabel);
        aboutMeInput = findViewById(R.id.aboutMeInput);
        saveButton = findViewById(R.id.saveButton);


        saveButton.setOnClickListener(new View.OnClickListener() {
            
            public void onClick(View v) {

                String name = nameInput.getText().toString();
                String email = emailInput.getText().toString();
                String phone = phoneInput.getText().toString();
                String aboutMe = aboutMeInput.getText().toString();


            }
        });
    }
}
