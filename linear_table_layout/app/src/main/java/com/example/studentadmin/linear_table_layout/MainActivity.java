package com.example.studentadmin.linear_table_layout;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {
    EditText E1;
    EditText E2;
    EditText E3;
    EditText E4;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void nextpg(View view)
    {
        E1 = (EditText) findViewById(R.id.editText);
        E2= (EditText) findViewById(R.id.editText2);
        E3=(EditText) findViewById(R.id.editText3);
        E4=(EditText) findViewById(R.id.editText4);
        String s= E1.getText().toString();
        String s1= E2.getText().toString();
        String s2= E3.getText().toString();
        String s3=E4.getText().toString();

        Intent intent =new Intent(this,Main2Activity.class);
        intent.putExtra("name",s);
        intent.putExtra("title",s1);
        intent.putExtra("phone",s2);
        intent.putExtra("email",s3);
        startActivity(intent);
    }
}
