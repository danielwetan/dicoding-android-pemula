package com.dicoding.thesahabas;


import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.bumptech.glide.Glide;

import java.util.ArrayList;

public class ListSahabasAdapter extends RecyclerView.Adapter<ListSahabasAdapter.ListViewHolder> {

    private ArrayList<Sahabas> listSahabas;

    private OnItemClickCallback onItemClickCallback;

    public void setOnItemClickCallback(OnItemClickCallback onItemClickCallback) {
        this.onItemClickCallback = onItemClickCallback;
    }

    public ListSahabasAdapter(ArrayList<Sahabas> list) {
        this.listSahabas = list;
    }


    @NonNull
    @Override
    public ListViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int viewType) {
        View view = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.list_view_sahabas, viewGroup, false);
        return new ListViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull final ListViewHolder holder, int position) {
        Sahabas sahabas = listSahabas.get(position);
        Glide.with(holder.itemView.getContext())
                .load(sahabas.getPhoto())
                .fitCenter()
                .into(holder.imgPhoto);
        holder.lvName.setText(sahabas.getName());
        holder.lvDetail.setText(sahabas.getDetail());

        holder.itemView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                onItemClickCallback.onItemClicked(listSahabas.get(holder.getAdapterPosition()));
            }
        });
    }

    @Override
    public int getItemCount() {
        return listSahabas.size();
    }

    public class ListViewHolder extends RecyclerView.ViewHolder {
        ImageView imgPhoto;
        TextView lvName, lvDetail;

        public ListViewHolder(@NonNull View itemView) {
            super(itemView);
            imgPhoto = itemView.findViewById(R.id.list_view_photos);
            lvName = itemView.findViewById(R.id.list_view_name);
            lvDetail = itemView.findViewById(R.id.list_view_detail);

        }
    }
}
