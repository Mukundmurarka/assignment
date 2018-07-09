package com.mukundmurarka.Registrationform;

import android.content.SharedPreferences;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

import com.mukundmurarka.ragistrationform.R;

public class Main3Activity extends AppCompatActivity {
    TextView fst_name,last_name,phno,gen,mail,pwd;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main3);
        SharedPreferences sp = getApplicationContext().getSharedPreferences("my ref",0);
        fst_name = findViewById(R.id.textView4);
        last_name = findViewById(R.id.textView5);
        phno = findViewById(R.id.textView6);
        gen =  findViewById(R.id.textView7);
        mail = findViewById(R.id.textView8);
        pwd =  findViewById(R.id.textView9);
        String fstname_f = sp.getString("First Name"," ");
        String lstname_f = sp.getString("Last Name"," ");

        String phno_f = sp.getString("Phone num"," ");

        String gen_f = sp.getString("Gender"," ");
        String mail_f = sp.getString("Email"," ");
        String pwd_f = sp.getString("Pwd"," ");
        fst_name.setText(fstname_f);
        last_name.setText(lstname_f);
        phno.setText(phno_f);
        gen.setText(gen_f);
        mail.setText(mail_f);
        pwd.setText(pwd_f);



    }
}
