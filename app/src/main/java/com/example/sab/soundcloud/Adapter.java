package com.example.sab.soundcloud;


import android.content.Context;
import android.content.Intent;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

public class Adapter extends RecyclerView.Adapter<Adapter.Vholder> {
    ArrayList<Persons> data;
    Context context;
    Persons person;

    // data to be shown is stored in string array , passed to constructor
    public Adapter(ArrayList<Persons> data, Context context) {
        this.data = data;
        this.context = context;
    }

    @NonNull
    @Override
    // creates views and holds them together
    public Vholder onCreateViewHolder(@NonNull ViewGroup parent, int i) {
        // returns corresponding objects to the views created in layout file
        LayoutInflater layoutInflater= LayoutInflater.from(context);
        View view=layoutInflater.inflate(R.layout.row,parent,false);
        return new Vholder(view,context,data);
    }

    @Override
    // binds views and data together
    public void onBindViewHolder(@NonNull Vholder vholder, int position) {
         person= data.get(position);
        vholder.txt_name.setText(person.name);
        vholder.txt_num.setText(person.number);
        vholder.img_person.setImageResource(person.image);
    }

    @Override
    public int getItemCount() {
        return data.size();
    }

    public  class Vholder extends RecyclerView.ViewHolder implements View.OnClickListener {
        public TextView txt_name, txt_num;
        public ImageView img_person;
        ArrayList<Persons>data=new ArrayList<Persons>();
        Context context;
        public Vholder(@NonNull View itemView,Context context,ArrayList<Persons>data) {
            super(itemView);
            this.data=data;
            this.context=context;
            txt_name=itemView.findViewById(R.id.txt_person_name);
            txt_num=itemView.findViewById(R.id.txt_person_num);
            img_person=itemView.findViewById(R.id.img_contact);
            itemView.setOnClickListener(this);
        }

        @Override
        public void onClick(View view) {
            int position=getAdapterPosition();
            Persons persons=this.data.get(position);
            Intent intent=new Intent(this.context,songPlayer.class);
            intent.putExtra("txt_name",persons.getName());
            intent.putExtra("txt_title",persons.getNumber());
            intent.putExtra("txt_img",persons.getImage());

            this.context.startActivity(intent);
        }
    }
}
