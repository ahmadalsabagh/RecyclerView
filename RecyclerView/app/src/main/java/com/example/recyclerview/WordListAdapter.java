package com.example.recyclerview;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;
import java.util.LinkedList;

public class WordListAdapter extends RecyclerView.Adapter<WordListAdapter.WordViewHolder> {
    private final LinkedList<String> mWordList;
    private final LinkedList<String> mDescriptionList;
    private LayoutInflater mInflater;

    public WordListAdapter(Context context, LinkedList<String> wordList,LinkedList<String> descriptionList){
        mInflater = LayoutInflater.from(context);
        this.mWordList = wordList;
        this.mDescriptionList = descriptionList;
    }

    @NonNull
    @Override
    public WordListAdapter.WordViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View mItemView = mInflater.inflate(R.layout.wordlist_item, parent, false);
        return new WordViewHolder(mItemView);
    }

    @Override
    public void onBindViewHolder(@NonNull WordListAdapter.WordViewHolder holder, int position) {
        String mCurrent = mWordList.get(position);
        String descriptionCurrent = mDescriptionList.get(position);
        holder.wordItemView.setText(mCurrent);
        holder.descriptionItemView.setText(descriptionCurrent);
    }

    @Override
    public int getItemCount() {
        return mWordList.size();
    }

    class WordViewHolder extends RecyclerView.ViewHolder{
        public final TextView wordItemView;
        public final TextView descriptionItemView;
        //final WordListAdapter mAdapter;

        public WordViewHolder(View itemView){
            super(itemView);
            wordItemView = itemView.findViewById(R.id.word);
            descriptionItemView = itemView.findViewById(R.id.description);
            //this.mAdapter = adapter;

        }

    }
}
