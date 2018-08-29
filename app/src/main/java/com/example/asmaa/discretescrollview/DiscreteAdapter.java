package com.example.asmaa.discretescrollview;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.squareup.picasso.Picasso;

import java.util.ArrayList;

import de.hdodenhof.circleimageview.CircleImageView;

public class DiscreteAdapter extends RecyclerView.Adapter<DiscreteAdapter.Holder> {

    private ArrayList<DiscreteModel> list;
    private Context context;


    public DiscreteAdapter(ArrayList<DiscreteModel> list, Context context) {
        this.list = list;
        this.context = context;
    }

    @NonNull
    @Override
    public Holder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view= LayoutInflater.from(context).inflate(R.layout.itemdiscrete,parent,false);
        return new Holder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull Holder holder, int position) {
        holder.Bind(list.get(position));


    }

    @Override
    public int getItemCount() {
        return list.size();
    }

    public class Holder extends RecyclerView.ViewHolder{

        CircleImageView image;
        TextView text;
        public Holder(View itemView) {
            super(itemView);

            image=itemView.findViewById(R.id.img_item);
            text=itemView.findViewById(R.id.text_item);

        }

        public void  Bind (DiscreteModel discreteModel){


            Picasso.with(context).load(discreteModel.getImg()).into(image);
            text.setText(discreteModel.getTitle());


        }
    }
}
