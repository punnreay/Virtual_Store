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

public class caltegoryAdapter extends RecyclerView.Adapter<caltegoryAdapter.ViewHolder> {
    ArrayList<caltegotyDATA> arrayList = new ArrayList<>();

    public caltegoryAdapter(ArrayList<caltegotyDATA> arrayList) {
        this.arrayList = arrayList;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        LayoutInflater layoutInflater = LayoutInflater.from(parent.getContext());
        View view = layoutInflater.inflate(R.layout.category_viewholder,parent,false);
        ViewHolder viewHolder = new ViewHolder(view);
        return viewHolder;
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
    caltegotyDATA caltegotyDATA = arrayList.get(position);
    holder.item_name.setText(caltegotyDATA.getItem_name());
    holder.item_pic.setImageResource(caltegotyDATA.getItem_pic());
    }

    @Override
    public int getItemCount() {
        return arrayList.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {
        TextView item_name;
        ImageView item_pic;
        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            item_name = itemView.findViewById(R.id.item_name);
            item_pic = itemView.findViewById(R.id.item_pic);
        }
    }
}
