package com.mnnit.athleticmeet.adapters;

import android.support.v7.widget.CardView;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import com.mnnit.athleticmeet.R;

/**
 * Created by Ankit on 1/22/2018.
 */

public class Schedule_Holder extends RecyclerView.ViewHolder {

     TextView tv;
    Schedule_Holder(View itemView) {
        super(itemView);
        tv = itemView.findViewById(R.id.tv);
    }
}
