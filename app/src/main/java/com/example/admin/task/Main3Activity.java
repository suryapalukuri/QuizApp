package com.example.admin.task;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class Main3Activity extends AppCompatActivity {
    EditText edt1,edt2,edt3,edt4;
    TextView t1,t2,t3,t4;
    Button b1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main3);
        edt1=(EditText)findViewById(R.id.edt1);
        edt2=(EditText)findViewById(R.id.edt2);
        edt3=(EditText)findViewById(R.id.edt3);
        edt4=(EditText)findViewById(R.id.edt4);
        b1=(Button)findViewById(R.id.btn1);
        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String name=edt1.getText().toString();
                String password=edt2.getText().toString();
                String email=edt3.getText().toString();
                String phone=edt4.getText().toString();
                Intent i=new Intent(Main3Activity.this,Main2Activity.class);
                startActivity(i);
                ExampleDB db=new ExampleDB(Main3Activity.this);
                db.insert(name,password,email,phone);

            }
        });
    }
}
