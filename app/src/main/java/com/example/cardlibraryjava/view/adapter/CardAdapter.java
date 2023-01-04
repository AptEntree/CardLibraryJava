package com.example.cardlibraryjava.view.adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.cardlibraryjava.R;
import com.example.cardlibraryjava.model.objects.Card;

import java.util.ArrayList;

public class CardAdapter extends RecyclerView.Adapter<CardAdapter.CardViewHolder> {

    private int mNumberItems;
    private Enum mCardType;
    
    public CardAdapter(int numberItems, Enum cardType){
        //TODO change the number list to the size of the array that contains all cards
        mNumberItems = numberItems;
        mCardType = cardType;
    }
    @NonNull
    @Override
    public CardViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int viewType) {
        Context context = viewGroup.getContext();
        View view = LayoutInflater.from(context).inflate(
                R.layout.card_list_item,
                viewGroup,
                false);

        return new CardViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull CardViewHolder holder, int position) {
        holder.bind(position);
    }

    @Override
    public int getItemCount() {
        return mNumberItems;
    }

    class CardViewHolder extends RecyclerView.ViewHolder {

        private TextView mCardItemQtd;
        private TextView mCardItemName;
        private ArrayList<Card> mCardList;

        public CardViewHolder(@NonNull View itemView) {
            super(itemView);
            mCardItemQtd = itemView.findViewById(R.id.card_item_qtd);
            mCardItemName = itemView.findViewById(R.id.card_item_name);
            //TODO get card list from controller
        }

        void bind(int listIndex) {

            mCardItemQtd.setText(String.valueOf(listIndex));
            mCardItemName.setText("AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA");

        }
    }
}
