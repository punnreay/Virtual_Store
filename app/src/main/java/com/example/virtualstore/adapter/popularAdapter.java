package com.example.virtualstore.adapter;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.virtualstore.R;

import java.util.ArrayList;



public class popularAdapter extends RecyclerView.Adapter<popularAdapter.ViewHolder> {
    ArrayList<popularData> arraylist = new ArrayList<>();

    public popularAdapter(ArrayList<popularData> arraylist) {
        this.arraylist = arraylist;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        LayoutInflater layoutInflater = LayoutInflater.from(parent.getContext());
        View view = layoutInflater.inflate(R.layout.popular_viewholder,parent,false);
        popularAdapter.ViewHolder viewHolder = new popularAdapter.ViewHolder(view);
        return viewHolder;
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
        popularData popularData = arraylist.get(position);
        holder.title_pop.setText(popularData.getTitle_pop());
        holder.pic_pop.setImageResource(popularData.getPic_pop());
        holder.price.setText(String.valueOf(popularData.getPrice()));


    }

    @Override
    public int getItemCount() {
        return arraylist.size();
    }

    public static class ViewHolder extends RecyclerView.ViewHolder {
        TextView title_pop, price;
        ImageView pic_pop;
        TextView addToCart_Btn;
        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            title_pop = itemView.findViewById(R.id.title_pop);
            price = itemView.findViewById(R.id.price);
            pic_pop= itemView.findViewById(R.id.pic_pop);
            addToCart_Btn=itemView.findViewById(R.id.addToCart_btn);
        }
    }
}
