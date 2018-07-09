package com.mukundmurarka.Registrationform;

import android.content.Intent;
import android.content.SharedPreferences;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import com.mukundmurarka.ragistrationform.R;

public class Main2Activity extends AppCompatActivity {
    EditText Email,password;
    Button login;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        Email=findViewById(R.id.editText2);
        password=findViewById(R.id.editText3);
        login = findViewById(R.id.button);
        login.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                SharedPreferences sp = getApplicationContext().getSharedPreferences("my ref",0);
                String email_r= sp.getString("Email"," ");
                String pass_r= sp.getString("pwd"," ");

                if(Email.getText().toString().equals(email_r) && password.getText().toString().equals(pass_r))
                {
                    Intent intent = new Intent(Main2Activity.this,Main3Activity.class);
                    startActivity(intent);
                }
                else
                {
                    Toast.makeText(Main2Activity.this,"wrong email id or password ",Toast.LENGTH_LONG).show();
                }
            }
        });

    }
}
