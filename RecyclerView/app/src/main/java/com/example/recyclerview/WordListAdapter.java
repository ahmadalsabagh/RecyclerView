package com.example.recyclerview;

import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

public class WordListAdapter extends RecyclerView.Adapter<WordListAdapter.WordViewHolder> {
    @NonNull
    @Override
    public WordListAdapter.WordViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        return null;
    }

    @Override
    public void onBindViewHolder(@NonNull WordListAdapter.WordViewHolder holder, int position) {

    }

    @Override
    public int getItemCount() {
        return 0;
    }

    class WordViewHolder extends RecyclerView.ViewHolder{
        public final TextView wordItemView;
        final WordListAdapter mAdapter;

    }
}
