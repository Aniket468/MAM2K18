package com.mnnit.athleticmeet.fragments;

import android.content.Context;
import android.net.Uri;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import com.mnnit.athleticmeet.R;
import com.mnnit.athleticmeet.activities.DataWinner;
import com.mnnit.athleticmeet.activities.ListViewAdapter;
import com.mnnit.athleticmeet.adapters.Schedule_Adapter;

import java.util.ArrayList;
import java.util.List;


/**
 * A simple {@link Fragment} subclass.
 * Activities that contain this fragment must implement the
 * {@link OnFragmentInteractionListener} interface
 * to handle interaction events.
 * Use the {@link Fragmenter1#newInstance} factory method to
 * create an instance of this fragment.
 */
public class Fragmenter1 extends Fragment {
    // TODO: Rename parameter arguments, choose names that match
    // the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
    private static final String ARG_PARAM1 = "param1";
    private static final String ARG_PARAM2 = "param2";

    // TODO: Rename and change types of parameters
    private String mParam1;
    private String mParam2;
    private OnFragmentInteractionListener mListener;
    public Fragmenter1() {
        // Required empty public constructor
    }

    /**
     * Use this factory method to create a new instance of
     * this fragment using the provided parameters.
     *
     * @param param1 Parameter 1.
     * @param param2 Parameter 2.
     * @return A new instance of fragment Fragmenter1.
     */
    // TODO: Rename and change types and number of parameters
    public static Fragmenter1 newInstance(String param1, String param2) {
        Fragmenter1 fragment = new Fragmenter1();
        Bundle args = new Bundle();
        args.putString(ARG_PARAM1, param1);
        args.putString(ARG_PARAM2, param2);
        fragment.setArguments(args);
        return fragment;
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        if (getArguments() != null) {
            mParam1 = getArguments().getString(ARG_PARAM1);
            mParam2 = getArguments().getString(ARG_PARAM2);
        }

    }
    String[] values=new String[]{"9:30 a.m.  Opening Ceremony",
                                 "10:15 a.m.  100m Heats (BOYS)",
                                 "10:30 a.m.  Discuss Throw (BOYS)",
                                 "10:45 a.m.  100m Heats (Girls)",
                                 "11:00 a.m.  Discuss throw (GIRLS)",
                                 "11:45 a.m.  Long Jump (BOYS)",
                                 "LUNCH  1:00-2:00 p.m.",
            "2:00 p.m.  Long jump (GIRLS)",
            "2:00 p.m.  400m Heats (BOYS)",
            "2:30 p.m.  400m Heats (Girls)",
            "3:15 p.m.  1500m (BOYS)",
            "3:45 p.m.  1500m (GIRLS)",
            "4:00 p.m.  4x100m Relay Heats(BOYS)",
            "4:30 p.m.  4x100m Relay Heats(GIRLS)"};
    ListView lv;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View v = inflater.inflate(R.layout.fragment_fragmenter1, container, false);
        perform(v);
        return v;
      //  return inflater.inflate(R.layout.fragment_fragmenter1, container, false);
    }
    public void perform(View v) {
        ListView rv= v.findViewById(R.id.list);

        ListViewAdapter adapter=new ListViewAdapter(values,getActivity());
        rv.setAdapter(adapter);

    }

    // TODO: Rename method, update argument and hook method into UI event
    public void onButtonPressed(Uri uri) {
        if (mListener != null) {
            mListener.onFragmentInteraction(uri);
        }
    }


    @Override
    public void onAttach(Context context) {
        super.onAttach(context);
        if (context instanceof OnFragmentInteractionListener) {
            mListener = (OnFragmentInteractionListener) context;
        } else {
            throw new RuntimeException(context.toString()
                    + " must implement OnFragmentInteractionListener");
        }
    }


    @Override
    public void onDetach() {
        super.onDetach();
        mListener = null;
    }

    /**
     * This interface must be implemented by activities that contain this
     * fragment to allow an interaction in this fragment to be communicated
     * to the activity and potentially other fragments contained in that
     * activity.
     * <p>
     * See the Android Training lesson <a href=
     * "http://developer.android.com/training/basics/fragments/communicating.html"
     * >Communicating with Other Fragments</a> for more information.
     */
    public interface OnFragmentInteractionListener {
        // TODO: Update argument type and name
        void onFragmentInteraction(Uri uri);
    }
}