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

public class Relay_Race extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_relay__race);

        RecyclerView rv= findViewById(R.id.listviewrelay);
        List<DataWinner> list=fill();
        Schedule_Adapter sa=new Schedule_Adapter(list,getApplicationContext());
        rv.setAdapter(sa);
        rv.setLayoutManager(new LinearLayoutManager(getApplicationContext()));
        //end

    }
    public List<DataWinner> fill(){
        List<DataWinner> list=new ArrayList<>();
        list.add(new DataWinner("Feb 8:: 4:00 p.m.(InterCollege)\n4X100m Heats(Boys)"));
        list.add(new DataWinner("Feb 8:: 4:15 p.m.(IntraCollege)\n4X100m Relay Time Trial(Boys)"));
        list.add(new DataWinner("Feb 8:: 4:30 p.m.(InterCollege)\n4X100m Heats(Girls)"));
        list.add(new DataWinner("Feb 8:: 4:45 p.m.(IntraCollege)\n4X100m Relay Time Trial(Girls)"));

        list.add(new DataWinner("Feb 9:: 11:00 a.m.(InterCollege)\n4X400m Relay Time Trial(Boys)"));
        list.add(new DataWinner("Feb 9:: 11:20 a.m.(InterCollege)\n4X400m Relay Time Trial(Girls)"));
        list.add(new DataWinner("Feb 9:: 11:40 a.m.(IntraCollege)\n4X400m Relay Time Trial(Boys)"));
        list.add(new DataWinner("Feb 9:: 12:00 a.m.(IntraCollege)\n4X400m Relay Time Trial(Girls)"));
        list.add(new DataWinner("Feb 10:: 2:40 p.m.(InterCollege)\n4X100m Finals(Boys)"));
        list.add(new DataWinner("Feb 10:: 2:55 p.m.(InterCollege)\n4X100m Finals(Girls)"));
        return  list;
    }

}
