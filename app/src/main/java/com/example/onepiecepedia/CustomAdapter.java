package com.example.onepiecepedia;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.cardview.widget.CardView;
import androidx.navigation.Navigation;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class CustomAdapter extends RecyclerView.Adapter<CustomAdapter.MyViewHolder>  {

    private ArrayList<DataModel> dataSet;

    public CustomAdapter(ArrayList<DataModel> dataSet) {

        this.dataSet = dataSet;
    }

    public static class MyViewHolder extends RecyclerView.ViewHolder  {
        CardView cardView;
        TextView textViewName;
        TextView textViewRole;
        ImageView imageViewIcon;

        public MyViewHolder (View itemView )
        {
            super(itemView);

            cardView = (CardView) itemView.findViewById(R.id.card_view);
            textViewName = ( TextView) itemView.findViewById(R.id.textViewName);
            textViewRole = ( TextView) itemView.findViewById(R.id.textViewRole);
            imageViewIcon = (ImageView) itemView.findViewById(R.id.imageView);

        }

    }

    @NonNull
    @Override
    public MyViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int i) {

        View view = LayoutInflater.from(parent.getContext() ).inflate(R.layout.cards_layout , parent ,false);

        MyViewHolder myViewHolder = new MyViewHolder(view);

        return myViewHolder;
    }

    @Override
    public void onBindViewHolder(@NonNull MyViewHolder viewHolder,  int listPosition) {

        TextView textViewName = viewHolder.textViewName;
        TextView textViewRole = viewHolder.textViewRole;
        ImageView imageView = viewHolder.imageViewIcon;
        CardView cardView = viewHolder.cardView;

        textViewName.setText(dataSet.get(listPosition).getName());
        textViewRole.setText(dataSet.get(listPosition).getRole());
        imageView.setImageResource(dataSet.get(listPosition).getImage());


        cardView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Bundle bundle = new Bundle();
                int num = listPosition;
                String position = String.valueOf(num);
                bundle.putString("characterId",position);
                Navigation.findNavController(view).navigate(R.id.action_blankFragmentHome_to_blankFragmentDescription,bundle);
            }
        });


    }

    @Override
    public int getItemCount() {
        return dataSet.size();
    }
}

