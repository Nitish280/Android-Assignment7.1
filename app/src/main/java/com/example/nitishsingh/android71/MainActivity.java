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

    private EditText userEdt;
    private Button Searchbutton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        userEdt=(EditText)findViewById(R.id.editText);

        Searchbutton = (Button) findViewById(R.id.button2);
        Searchbutton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                final String searchTerms = userEdt.getText().toString();

                Log.d("Search Keywords: ", searchTerms);

                Intent intent = new Intent(Intent.ACTION_VIEW);
                intent.setData(Uri.parse("https://www.google.co.in/search?q=" + searchTerms));
                startActivity(intent);
            }
        });
    }

}

