package com.example.stud.recycle_view;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        RecyclerView rvLista = findViewById(R.id.rvLista);

        ListAdapter ListAdapter = new ListAdapter();
        rvLista.setAdapter(ListAdapter);

        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(this);
                rvLista.setLayoutManager(linearLayoutManager);

    }
}
