package com.stavan.studentregistration;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    // Object References
    private EditText nameInput, surnameInput, numberInput, cityInput;
    private Button submitBtn;
    private TextView display;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // Objects / Components mapping
        nameInput = findViewById(R.id.nameInput);
        surnameInput = findViewById(R.id.surnameInput);
        numberInput = findViewById(R.id.numberInput);
        cityInput = findViewById(R.id.cityInput);
        submitBtn = findViewById(R.id.submitBtn);
        display = findViewById(R.id.display);


        submitBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                // work to be done after button click
                String name = nameInput.getText().toString();
                String surname = surnameInput.getText().toString();
                String number = numberInput.getText().toString();
                String city = cityInput.getText().toString();

                String answer = "Name is : " + name + " " + surname + "\n" +
                                "Number is : " + number + "\n" +
                                "City is : " + city + "\n";

                 display.setText(answer);
            }
        });
    }
}