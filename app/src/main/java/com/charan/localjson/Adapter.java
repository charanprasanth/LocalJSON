package com.charan.localjson;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.cardview.widget.CardView;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

public class Adapter extends RecyclerView.Adapter<RecyclerView.ViewHolder> {

    Context context;
    List<Object> listRecyclerItem;

    public Adapter(Context context, List<Object> listRecyclerItem) {
        this.context = context;
        this.listRecyclerItem = listRecyclerItem;
    }

    @NonNull
    @Override
    public RecyclerView.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View layoutView = LayoutInflater.from(parent.getContext()).inflate(R.layout.item,parent,false);
        return new Viewholder((layoutView));
    }

    @Override
    public void onBindViewHolder(@NonNull RecyclerView.ViewHolder viewholder, int position) {
        Viewholder holder = (Viewholder) viewholder;
        Holidays holidays = (Holidays) listRecyclerItem.get(position);

        holder.name.setText(holidays.getName());
        holder.date.setText(holidays.getDate());
        holder.item.setOnClickListener(v -> {
            Toast.makeText(context, holidays.getName(), Toast.LENGTH_SHORT).show();
        });
    }

    @Override
    public int getItemCount() {
        return listRecyclerItem.size();
    }

    public class Viewholder extends RecyclerView.ViewHolder{

        TextView name,date;
        CardView item;

        public Viewholder(@NonNull View itemView) {
            super(itemView);

            name = itemView.findViewById(R.id.name);
            date = itemView.findViewById(R.id.date);
            item = itemView.findViewById(R.id.item);
        }
    }
}
