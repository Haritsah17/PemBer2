package com.example.myapplication;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import java.util.List;
import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

public class Koneksi extends RecyclerView.Adapter<Tampilan> {


    Context context;
    List<Isi> items;

    public Koneksi(Context context, List<Isi> items) {
        this.context = context;
        this.items = items;
    }

    @NonNull
    @Override
    public Tampilan onCreateViewHolder(@NonNull  ViewGroup parent, int viewType) {
        return new Tampilan(LayoutInflater.from(context).inflate(R.layout.isi_view,parent,false));
    }

    @Override
    public void onBindViewHolder(@NonNull Tampilan holder, int position) {
        holder.nameView.setText(items.get(position).getName());
        holder.nimView.setText(items.get(position).getNim());
        holder.imageView.setImageResource(items.get(position).getImage());
    }

    @Override
    public int getItemCount() {
        return items.size();
    }
}