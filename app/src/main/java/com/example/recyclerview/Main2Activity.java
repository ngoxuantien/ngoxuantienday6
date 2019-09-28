package com.example.recyclerview;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class Main2Activity extends AppCompatActivity {
private TextView textView,textView1,textView2,textView3;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        textView=findViewById(R.id.name1) ;
        textView1=findViewById(R.id.tiendeptroai) ;
        textView2=findViewById(R.id.name2) ;
        textView3=findViewById(R.id.name3) ;
        Intent intent=getIntent();

        //Contact contact1= (Contact) intent.getSerializableExtra("t1");


        textView.setText( intent.getStringExtra("ten"));
        textView1.setText( intent.getStringExtra("ten"));
        textView2.setText( intent.getStringExtra("ten"));
        textView3.setText( intent.getStringExtra("ten"));



    }
}
