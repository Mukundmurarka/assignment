package com.mukundmurarka.ragistrationform;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {
    EditText editText;

     Button button;
     //CheckBox checkBox;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        editText=findViewById(R.id.editText15);
        editText=findViewById(R.id.editText16);
        editText=findViewById(R.id.editText18);
        editText=findViewById(R.id.editText19);
        editText=findViewById(R.id.editText20);
        editText=findViewById(R.id.editText21);
        editText=findViewById(R.id.editText22);
        button=findViewById(R.id.button2);
       // checkBox=findViewById(R.id.checkBox);
        //checkBox=findViewById(R.id.checkBox3);
        button.setOnClickListener(new View.OnClickListener() {
           @Override
            public void onClick(View v) {
               Intent intent=new Intent(MainActivity.this,Main2Activity.class);
               startActivity(intent);
           }
        });

    }
}
