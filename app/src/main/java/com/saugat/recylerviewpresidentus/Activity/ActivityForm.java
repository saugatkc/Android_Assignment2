package com.saugat.recylerviewpresidentus.Activity;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Spinner;

import com.saugat.recylerviewpresidentus.R;

public class ActivityForm extends AppCompatActivity {
    EditText etName, etEmail, etAge;
    Spinner spinner;
    Button btnRegister;

    public static final String country[] = {
            "Nepal",
            "India",
            "USA",
            "China",
            "Korea",
            "Ireland"

    };


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_form);

        initView();

        ArrayAdapter adapter = new ArrayAdapter<>(this,
                R.layout.support_simple_spinner_dropdown_item,
                country);

        spinner.setAdapter(adapter);

        btnRegister.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String name, email, age, country;
                name = etName.getText().toString();
                email = etEmail.getText().toString();
                age = etAge.getText().toString();
                country = spinner.getSelectedItem().toString();

                Intent intentForm = new Intent(ActivityForm.this, DetailsDisplay.class);
                intentForm.putExtra("formName", name);
                intentForm.putExtra("formEmail", email);
                intentForm.putExtra("formAge", age);
                intentForm.putExtra("formCountry", country);
                startActivity(intentForm);
            }
        });
    }


    private void initView() {
        etName = findViewById(R.id.etName);
        etEmail = findViewById(R.id.etEmail);
        etAge = findViewById((R.id.etAge));
        btnRegister = findViewById(R.id.btnRegister);
        spinner = findViewById(R.id.spinner);
    }
}