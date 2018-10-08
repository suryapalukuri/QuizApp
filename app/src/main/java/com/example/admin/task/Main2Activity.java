package com.example.admin.task;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class Main2Activity extends AppCompatActivity {
    TextView t1,t2,t3;
    EditText edt1,edt2;
    Button b1,b2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        edt1=(EditText)findViewById(R.id.edt1);
        edt2=(EditText)findViewById(R.id.edt2);
        b1=(Button)findViewById(R.id.btn1);
        b2=(Button)findViewById(R.id.btn2);
        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                boolean isValid=true;
                String e1=edt1.getText().toString();
                String e2=edt2.getText().toString();
                if (e1.isEmpty()) {
                    isValid=false;
                    edt1.setError("Invalid Username");


                }

                else {
                    Intent i = new Intent(Main2Activity.this, Main4Activity.class);
                    startActivity(i);

                }
            }
        });
        b2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i=new Intent(Main2Activity.this,Main3Activity.class);
                startActivity(i);


            }
        });
    }
}
