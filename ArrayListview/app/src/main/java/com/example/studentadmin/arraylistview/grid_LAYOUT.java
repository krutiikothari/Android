package com.example.studentadmin.arraylistview;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.GridView;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;

public class grid_LAYOUT extends AppCompatActivity implements AdapterView.OnItemClickListener{

    GridView g;
    Integer num[]={1,2,3,4,5,6,7,8};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_grid__layout);
        g = (GridView) findViewById(R.id.gridv);
        ArrayAdapter<Integer> adapter =
                new ArrayAdapter<Integer>(this,android.R.layout.simple_list_item_1,num);
        g.setAdapter(adapter);
        g.setOnItemClickListener(this);
    }

    @Override
    public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
        TextView temp = (TextView) view;
        Toast.makeText(this, temp.getText() + "" + i, Toast.LENGTH_SHORT).show();

    }
}
