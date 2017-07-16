package com.example.nitishsingh.android71;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {
    
    // declaration
    private EditText userEdt;
    private Button Searchbutton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {//here we are creatig the main method
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        userEdt=(EditText)findViewById(R.id.editText);
        Searchbutton = (Button) findViewById(R.id.button2);
        Searchbutton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {//here we are creating the on click method
                //here creating the string
                final String searchTerms = userEdt.getText().toString();

                Log.d("Search Keywords: ", searchTerms);
                //here we are using intent to pass the data from one page to another page
                Intent intent = new Intent(Intent.ACTION_VIEW);
                //here we are setting the data
                intent.setData(Uri.parse("https://www.google.co.in/search?q=" + searchTerms));
                //here we are starting the activity
                startActivity(intent);
            }
        });
    }

}

