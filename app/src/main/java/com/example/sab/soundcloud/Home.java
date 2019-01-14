package com.example.sab.soundcloud;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import java.util.ArrayList;
import java.util.Arrays;

public class Home extends AppCompatActivity {

    RecyclerView recyclerView;
    LinearLayoutManager linearLayoutManager;
    Adapter adapter;
    ArrayList<Persons> contacts;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);
        initViews();
        setContacts();
    }

    private void setContacts() {
        contacts.add(new Persons("DilliWaliye","Neha Kakkar",R.drawable.ic_file_download));
        contacts.add(new Persons("Chor dia wo rasta","Arjit Singh",R.drawable.ic_file_download));
        contacts.add(new Persons("Tere yaar batherey ney","Manindar buttar",R.drawable.ic_file_download));

    }

    private void initViews() {
        recyclerView=findViewById(R.id.recycler_view);
        linearLayoutManager=new LinearLayoutManager(this);
        contacts=new ArrayList<>();
        adapter=new Adapter(contacts,this);
        recyclerView.setLayoutManager(linearLayoutManager);
        recyclerView.setAdapter(adapter);

    }

}
