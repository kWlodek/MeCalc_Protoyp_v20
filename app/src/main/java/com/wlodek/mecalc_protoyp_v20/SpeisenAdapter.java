package com.wlodek.mecalc_protoyp_v20;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import org.w3c.dom.Text;

import java.util.List;

public class SpeisenAdapter extends RecyclerView.Adapter<SpeisenAdapter.MyViewHolder> {


    private List<Speisen> mSpeisen;

    public SpeisenAdapter(List<Speisen> mSpeisen){

        this.mSpeisen = mSpeisen;
    }

    public class MyViewHolder extends RecyclerView.ViewHolder{
        public TextView id, name, kcal;

        public MyViewHolder(View view){
            super(view);
            id = (TextView) view.findViewById(R.id.speise_id);
            name = (TextView) view.findViewById(R.id.speise_name);
            kcal = (TextView) view.findViewById(R.id.speise_kcal);

        }
    }


    @Override
    public MyViewHolder onCreateViewHolder(ViewGroup parent,int viewType){
        View itemView = LayoutInflater.from(parent.getContext()).inflate(R.layout.speise_item,parent,false);
        return new MyViewHolder(itemView);
    }

    @Override
    public void onBindViewHolder(MyViewHolder holder,int position){
        Speisen speisen = mSpeisen.get(position);
        holder.name.setText(speisen.getName());
        holder.kcal.setText(speisen.getKcal());
        holder.id.setText(speisen.getId());
    }

    @Override
    public int getItemCount(){
        return mSpeisen.size();
    }

}
