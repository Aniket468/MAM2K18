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

public class Shotput extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_shotput);

        //start
        RecyclerView rv= findViewById(R.id.listviewshotput);
        List<DataWinner> list=fill();
        Schedule_Adapter sa=new Schedule_Adapter(list,getApplicationContext());
        rv.setAdapter(sa);
        rv.setLayoutManager(new LinearLayoutManager(getApplicationContext()));
        //end

    }
    public List<DataWinner> fill(){
        List<DataWinner> list=new ArrayList<>();
        list.add(new DataWinner("Feb 9:: 10:00 a.m.(InterCollege)\nShotput(Boys)"));
        list.add(new DataWinner("Feb 9:: 10:30 a.m.(IntraCollege)\nShotput(Boys)"));
        list.add(new DataWinner("Feb 9:: 11:00 a.m.(InterCollege)\nShotput(Girls)"));
        list.add(new DataWinner("Feb 9:: 11:30 a.m.(IntraCollege)\nShotput(Girls)"));

        return  list;
    }

}
