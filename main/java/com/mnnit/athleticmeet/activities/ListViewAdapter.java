package com.mnnit.athleticmeet.activities;

import android.app.Activity;
import android.content.res.AssetManager;
import android.graphics.Typeface;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

import com.mnnit.athleticmeet.R;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Locale;

import static com.mnnit.athleticmeet.activities.Constants.FIRST_COLUMN;
import static com.mnnit.athleticmeet.activities.Constants.SECOND_COLUMN;

/**
 * Created by Aniket Kumar on 23-Jan-18.
 */

public class ListViewAdapter extends BaseAdapter {

    Activity activity;
    TextView txtFirst;
    TextView txtSecond;
    String []ar;
    String []br;
    public ListViewAdapter(String []ar,Activity activity){
        super();
       this.activity=activity;
        this.ar=ar;

    }

    @Override
    public int getCount() {
        // TODO Auto-generated method stub
        return ar.length;
    }

    @Override
    public Object getItem(int position) {
        // TODO Auto-generated method stub
        return ar[position];
    }

    @Override
    public long getItemId(int position) {
        // TODO Auto-generated method stub
        return 0;
    }



    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        // TODO Auto-generated method stub



        LayoutInflater inflater=activity.getLayoutInflater();

        if(convertView == null) {

            convertView = inflater.inflate(R.layout.new_schedule, null);
        }
            txtFirst=(TextView) convertView.findViewById(R.id.timepic);
            txtSecond=(TextView) convertView.findViewById(R.id.schedule);
//        AssetManager am = activity.getApplicationContext().getAssets();
//
//        Typeface typeface = Typeface.createFromAsset(am,
//                String.format(Locale.US, "fonts/%s", "Choco_Cooky.ttf"));
//
//        txtSecond.setTypeface(typeface);
       // txtFirst.setTypeface(typeface);

            txtFirst.setText(ar[position].split("  ")[0]);
            txtSecond.setText(ar[position].split("  ")[1]);





        return convertView;
    }

}