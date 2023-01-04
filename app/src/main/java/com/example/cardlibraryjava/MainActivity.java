package com.example.cardlibraryjava;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.view.Menu;

import com.example.cardlibraryjava.util.CardType;
import com.example.cardlibraryjava.view.adapter.CardAdapter;

public class MainActivity extends AppCompatActivity {

    private static final int NUM_LIST_ITEMS = 100;
    private CardAdapter mAdapter;
    private RecyclerView mCardList;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mCardList = findViewById(R.id.rv_card_list);

        LinearLayoutManager layoutManager = new LinearLayoutManager(this);
        mCardList.setLayoutManager(layoutManager);
        mCardList.setHasFixedSize(true);

        mAdapter = new CardAdapter(NUM_LIST_ITEMS, CardType.MAGIC);

        mCardList.setAdapter(mAdapter);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.main_menu,menu);
        return true;
    }
}