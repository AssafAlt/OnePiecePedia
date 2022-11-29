package com.example.onepiecepedia;

import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;


public class BlankFragmentDescription extends Fragment {

    TextView name;
    TextView role;
    ImageView image;
    TextView desc;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view= inflater.inflate(R.layout.fragment_blank_description, container, false);
        name = view.findViewById(R.id.textViewProfileName);
        role = view.findViewById(R.id.textViewProfileRole);
        desc = view.findViewById(R.id.textViewProfileDesc);
        image = view.findViewById(R.id.imageViewprofile);
        String pos;
        int location;
        pos = getArguments().getString("characterId");
        location = Integer.parseInt(pos);

        name.setText(MyData.nameArray[location]);
        role.setText(MyData.roleArray[location]);
        desc.setText(MyData.descArray[location]);
        image.setImageResource(MyData.drawableArray[location]);
        return view;
    }
}