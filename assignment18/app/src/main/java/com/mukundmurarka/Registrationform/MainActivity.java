package com.mukundmurarka.Registrationform;

import android.content.Intent;
import android.content.SharedPreferences;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.mukundmurarka.ragistrationform.R;

public class MainActivity extends AppCompatActivity {
    EditText fstname,lstname,phno,gen,email,pwd,conpwd;

     Button button;
     //CheckBox checkBox;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        fstname=findViewById(R.id.editText15);
        lstname=findViewById(R.id.editText16);
        phno=findViewById(R.id.editText18);
        gen=findViewById(R.id.editText19);
        email=findViewById(R.id.editText20);
        pwd=findViewById(R.id.editText21);
        conpwd=findViewById(R.id.editText22);
        button=findViewById(R.id.button2);

        button.setOnClickListener(new View.OnClickListener() {
           @Override
            public void onClick(View v) {
               SharedPreferences sp = getApplicationContext().getSharedPreferences("my ref",0);
               SharedPreferences.Editor editor = sp.edit();
               editor.putString(" First Name",fstname.getText().toString());
               editor.putString("Last Name",lstname.getText().toString());
               editor.putString("Phone num",phno.getText().toString());
               editor.putString("Gender",gen.getText().toString());
               editor.putString("Email",email.getText().toString());
               editor.putString("pwd",pwd.getText().toString());
               editor.putString("Confirm Pwd",conpwd.getText().toString());
               editor.commit();
               Intent intent=new Intent(MainActivity.this,Main2Activity.class);
               Toast.makeText(MainActivity.this,"register succesfully",Toast.LENGTH_LONG).show();
               startActivity(intent);
           }
        });

    }
}
