package com.example.sree.ieee;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.List;

public class ListAdapter extends RecyclerView.Adapter<ListAdapter.Viewholder> {

     private Context context;

    public ListAdapter(Context context, List<ListItem> listItems) {
        this.context = context;
        this.listItems = listItems;
    }

    private List<ListItem> listItems;

    @NonNull
    @Override
    public Viewholder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
        LayoutInflater inflater = LayoutInflater.from(context);
        View view = inflater.inflate(R.layout.list_layout,null);
        Viewholder holder = new Viewholder(view);
        return holder;

    }

    @Override
    public void onBindViewHolder(@NonNull Viewholder viewholder, int i) {
        //getting the product of the specified position
        ListItem item = listItems.get(i);

        //binding the data with the viewholder views
        viewholder.textView.setText(item.getText());
        viewholder.id.setImageDrawable(context.getDrawable(item.getImage()));

        viewholder.imageView.setImageDrawable(context.getDrawable(item.getImage()));


    }

    @Override
    public int getItemCount() {
        return listItems.size();
    }

    class Viewholder extends RecyclerView.ViewHolder{

        ImageView imageView,id;
        TextView textView;


        public Viewholder(@NonNull View itemView) {
            super(itemView);

            id = itemView.findViewById(R.id.textViewTitle);
            textView = itemView.findViewById(R.id.textViewPrice);
            imageView = itemView.findViewById(R.id.imageView);
        }
    }


}
