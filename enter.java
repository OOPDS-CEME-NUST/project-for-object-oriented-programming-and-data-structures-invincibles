package com.example.grace.myapplication;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class enter extends AppCompatActivity {
private EditText name;
private EditText password;
    private Button btn1;
    private Button bt2;
private int counter=5;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.enter);
        name=(EditText)findViewById(R.id.etname);
        password=(EditText)findViewById(R.id.etpassword);
        btn1=(Button)findViewById(R.id.btn1);
        bt2=(Button)findViewById(R.id.btn2);

        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                correct (name.getText().toString(),password.getText().toString());
                Intent intent =new Intent(enter.this,LoginActivity.class);
                startActivity(intent);

            }
        });
    }


    private void correct (String name, String password)
    {
        if((name=="Admin")&&(password=="1234"))
        {
            Intent intent =new Intent(enter.this,LoginActivity.class);
            startActivity(intent);

        }
else {
            counter--;
        }

        if (counter==0)
        {
            btn1.setEnabled(false);
        }
    }
}
