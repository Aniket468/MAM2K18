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

public class LongJump extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_long_jump);

        //start
        RecyclerView rv= findViewById(R.id.listviewlongjump);
        List<DataWinner> list=fill();
        Schedule_Adapter sa=new Schedule_Adapter(list,getApplicationContext());
        rv.setAdapter(sa);
        rv.setLayoutManager(new LinearLayoutManager(getApplicationContext()));
        //end


    }
    public List<DataWinner> fill(){
        List<DataWinner> list=new ArrayList<>();
        list.add(new DataWinner("Feb 8:: 11:45 a.m.(InterCollege)\n Long Jump (Boys)"));
        list.add(new DataWinner("Feb 8:: 12:00 a.m.(IntraCollege)\n Long Jump (Boys)"));
        list.add(new DataWinner("Feb 8:: 2:00 p.m.(InterCollege)\nLong Jump (Girls)"));
        list.add(new DataWinner( "Feb 8:: 2:30 p.m.(IntraCollege)\n Long Jump (Girls)"));

        return  list;
    }
}
