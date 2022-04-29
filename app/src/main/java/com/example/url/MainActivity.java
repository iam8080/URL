package com.example.url;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {
        EditText edit;
        Button  btn;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        btn =   (Button) findViewById(R.id.btn);
    edit =(EditText)findViewById(R.id.edt1);
    }

    public void sendURL(View view) {
       String  url = edit.getText().toString();
        Intent  intent  =   new Intent(Intent.ACTION_VIEW, Uri.parse(url));
        startActivity(Intent.createChooser(intent,"Choose  Browser"));
    }
}