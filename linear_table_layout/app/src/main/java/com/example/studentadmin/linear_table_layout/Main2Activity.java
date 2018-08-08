package com.example.studentadmin.linear_table_layout;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class Main2Activity extends AppCompatActivity {

    TextView t;
    TextView t1;
    TextView t2;
    TextView t3;
    Button b1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        Intent intent = getIntent();
        String extra=intent.getStringExtra("name");
        t=(TextView) findViewById(R.id.t1);
        String extra1=intent.getStringExtra("title");
        t1=(TextView) findViewById(R.id.t2);
        String extra2=intent.getStringExtra("phone");
        t2=(TextView) findViewById(R.id.t3);
        String extra3=intent.getStringExtra("email");
        t3=(TextView) findViewById(R.id.t4);
        t.setText(extra);
        t1.setText(extra1);
        t2.setText(extra2);
        t3.setText(extra3);
    }

    public void prevpg(View view)
    {
        Intent intent =new Intent(this,MainActivity.class);
        startActivity(intent);

    }

}
