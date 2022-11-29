package com.example.onepiecepedia;

import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.DefaultItemAnimator;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import java.util.ArrayList;

/**
 * A simple {@link Fragment} subclass.
 * Use the  factory method to
 * create an instance of this fragment.
 */
public class BlankFragmentHome extends Fragment {
    private ArrayList<DataModel> dataSet;

    private RecyclerView recycleView;
    private LinearLayoutManager layoutManager;
    private CustomAdapter addapter;



    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_blank_home, container, false);
        recycleView = view.findViewById(R.id.my_recycler_view);

        layoutManager = new LinearLayoutManager(getContext()); // new GridLayoutManager
        recycleView.setLayoutManager(layoutManager);


        recycleView.setItemAnimator(new DefaultItemAnimator());

        dataSet = new ArrayList<DataModel>();

        for(int i=0 ; i<MyData.nameArray.length ; i++)
        {
            dataSet.add(new DataModel(
                    MyData.nameArray[i],
                    MyData.roleArray[i],
                    MyData.id_[i],
                    MyData.drawableArray[i]


            ));
        }

        addapter = new CustomAdapter(dataSet);
        recycleView.setAdapter(addapter);
        return  view;
    }
}