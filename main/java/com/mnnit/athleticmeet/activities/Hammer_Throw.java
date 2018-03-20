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

public class Hammer_Throw extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_hammer__throw);


        //start
        RecyclerView rv= findViewById(R.id.listviewhammer);
        List<DataWinner> list=fill();
        Schedule_Adapter sa=new Schedule_Adapter(list,getApplicationContext());
        rv.setAdapter(sa);
        rv.setLayoutManager(new LinearLayoutManager(getApplicationContext()));
        //end


    }


    public List<DataWinner> fill(){
        List<DataWinner> list=new ArrayList<>();
        list.add(new DataWinner("Feb 10:: 11:30 a.m.(InterCollege)\nHammer Throw (Boys)"));
        list.add(new DataWinner("Feb 10:: 12:00 a.m.(IntraCollege)\nHammer Throw (Boys)"));
        list.add(new DataWinner("Feb 10:: 12:30 p.m.(InterCollege)\nHammer Throw (Girls)"));
        list.add(new DataWinner("Feb 10:: 1:00 p.m.(IntraCollege)\nHammer Throw (Girls)"));

        return  list;
    }

}
