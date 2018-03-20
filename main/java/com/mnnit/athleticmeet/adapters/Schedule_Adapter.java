package com.mnnit.athleticmeet.adapters;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.mnnit.athleticmeet.R;
import com.mnnit.athleticmeet.activities.DataWinner;

import java.util.Collection;
import java.util.Collections;
import java.util.List;

/**
 * Created by Ankit on 1/22/2018.
 */

public class Schedule_Adapter extends RecyclerView.Adapter<Schedule_Holder> {
    List<DataWinner> list= Collections.emptyList();
    Context ctx;
    public Schedule_Adapter(List<DataWinner> list, Context context){
        this.ctx=context;
        this.list=list;
    }
    @Override
    public Schedule_Holder onCreateViewHolder(ViewGroup parent, int viewType) {
        View v= LayoutInflater.from(parent.getContext()).inflate(R.layout.row_schedule,parent,false);
        Schedule_Holder h=new Schedule_Holder(v);
        return h;
    }

    @Override
    public void onBindViewHolder(Schedule_Holder holder, int position) {
        holder.tv.setText(list.get(position).title);
    }

    @Override
    public int getItemCount() {
        return list.size();
    }
}
