package com.mnnit.athleticmeet.activities;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import com.mnnit.athleticmeet.R;
import com.mnnit.athleticmeet.adapters.Schedule_Adapter;

import java.util.ArrayList;
import java.util.List;

public class Javelin_Throw extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_javelin__throw);
        //start
        RecyclerView rv= findViewById(R.id.listviewjavelin);
        List<DataWinner> list=fill();
        Schedule_Adapter sa=new Schedule_Adapter(list,getApplicationContext());
        rv.setAdapter(sa);
        rv.setLayoutManager(new LinearLayoutManager(getApplicationContext()));
        //end

    }
    public List<DataWinner> fill() {
        List<DataWinner> list = new ArrayList<>();
        list.add(new DataWinner("Feb 9:: 2:00 p.m.(InterCollege)\nJavelin Throw (Boys)"));
        list.add(new DataWinner("Feb 9:: 2:15 p.m.(IntraCollege)\nJavelin Throw (Boys)"));
        list.add(new DataWinner("Feb 9:: 2:45 p.m.(InterCollege)\nJavelin Throw (Girls)"));

        return  list;
    }
}
