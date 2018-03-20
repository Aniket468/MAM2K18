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

public class Hurdles extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_hurdles);
        //start
        RecyclerView rv= findViewById(R.id.listviewhurldes);
        List<DataWinner> list=fill();
        Schedule_Adapter sa=new Schedule_Adapter(list,getApplicationContext());
        rv.setAdapter(sa);
        rv.setLayoutManager(new LinearLayoutManager(getApplicationContext()));
        //end


    }
    public List<DataWinner> fill() {
        List<DataWinner> list = new ArrayList<>();
        list.add(new DataWinner("Feb 9:: 9:30 a.m.(InterCollege)\n110m Hurdles (Boys)"));
        list.add(new DataWinner("Feb 9:: 9:45 a.m.(IntraCollege)\n110m Hurdles (Boys)"));
        list.add(new DataWinner("Feb 9:: 10:00 a.m.(IntraCollege)\n100m Hurdles (Girls)"));
        list.add(new DataWinner("Feb 9:: 11:45 a.m.(InterCollege)\n100m Hurdles (Girls)"));
        list.add(new DataWinner("Feb 10:: 9:45 a.m.(IntraCollege)\n400m Hurdles Final (Boys)"));
        list.add(new DataWinner("Feb 10:: 2:00 p.m.(InterCollege)\n400m Hurdles (Boys)"));
        return list;
    }

}
