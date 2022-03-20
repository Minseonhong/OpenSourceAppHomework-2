package com.example.project2;

import androidx.activity.result.contract.ActivityResultContracts;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.RadioGroup;
import android.widget.Toast;

public class Project2_7 extends AppCompatActivity {
    Button button1;
    Button button2;
    RadioGroup radio;
    EditText edittext;
    ImageView imageView_01;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_project27);
        button1 = (Button) findViewById(R.id.btnShowText);
        edittext =(EditText) findViewById(R.id.btnHelloText);
        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(getApplicationContext(), edittext.getText(),
                        Toast.LENGTH_SHORT).show();
            }
        });
        button2 = (Button) findViewById(R.id.btnOpenPage);
        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent url = new Intent(Intent.ACTION_VIEW, Uri.parse(""+edittext.getText()));
                startActivity(url);
            }
        });
        imageView_01 = (ImageView) findViewById(R.id.image);
        imageView_01.setImageResource(R.drawable.android11);

        radio = (RadioGroup) findViewById((R.id.group1));
        radio.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup radioGroup, int i) {
                switch(i){
                    case R.id.btn11:
                        imageView_01.setImageResource(R.drawable.android11);
                        break;
                    case R.id.btn12:
                        imageView_01.setImageResource(R.drawable.android12);
                        break;
                }
            }
        });
        getSupportActionBar().setDisplayShowHomeEnabled(true);
        getSupportActionBar().setIcon(R.drawable.android12);
    }
}