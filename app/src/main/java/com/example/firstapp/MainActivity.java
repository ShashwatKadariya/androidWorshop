package com.example.firstapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.EditText;
import android.widget.Toast;
import android.widget.Spinner;
import android.widget.Button;

public class MainActivity extends AppCompatActivity implements AdapterView.OnItemSelectedListener
{

    private EditText fname, lname, username, email, number;
    private Button add;

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Spinner spinner = findViewById(R.id.spinner1);
        ArrayAdapter<CharSequence> adapter = ArrayAdapter.createFromResource(this,
                R.array.gender, android.R.layout.simple_spinner_item);
        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spinner.setAdapter(adapter);
        spinner.setOnItemSelectedListener(this);


//        getting data

        fname = findViewById(R.id.Rfname);
        lname = findViewById(R.id.Rlname);
        username = findViewById(R.id.Rusername);
        email = findViewById(R.id.Remail);
        number = findViewById(R.id.Rnumber);

        Button add = (Button) findViewById(R.id.RegisterButton);

        add.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String FirstName = fname.getText().toString();
                String LastName = lname.getText().toString();
                String Username = username.getText().toString();
                String Email = email.getText().toString();
                String Number = number.getText().toString();

                Intent intent = new Intent(MainActivity.this, DisplayData.class);

                intent.putExtra("keyFirstName", FirstName);
                intent.putExtra("keyLastName", LastName);
                intent.putExtra("keyUsername", Username);
                intent.putExtra("keyEmail", Email);
                intent.putExtra("keyNumber", Number);

                startActivity(intent);

            }
        });


    }

    @Override
    public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
        String text = parent.getItemAtPosition(position).toString();
        Toast.makeText(parent.getContext(), text, Toast.LENGTH_SHORT).show();
    }

    @Override
    public void onNothingSelected(AdapterView<?> parent) {

    }
}