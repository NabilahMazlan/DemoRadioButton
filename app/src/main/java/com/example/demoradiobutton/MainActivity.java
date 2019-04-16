package com.example.demoradiobutton;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    Button btn1;
    RadioButton rb;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btn1 = findViewById(R.id.buttonOK);

        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                 RadioGroup rg1 = findViewById(R.id.radioGroup);

                int selectedButtoId = rg1.getCheckedRadioButtonId();

                rb = findViewById(selectedButtoId);

                Toast.makeText(MainActivity.this, rb.getText(), Toast.LENGTH_SHORT).show();

            }
        });
    }
}
