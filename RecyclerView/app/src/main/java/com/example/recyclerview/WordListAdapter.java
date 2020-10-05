package com.example.recyclerview;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;
import java.util.LinkedList;
import java.util.List;

public class WordListAdapter extends RecyclerView.Adapter<WordListAdapter.WordViewHolder> {
    private final LinkedList<String> mWordList;
    private final LinkedList<String> mDescriptionList;
    //private LayoutInflater mInflater;
    private Context mContext;

    public WordListAdapter(Context context, LinkedList<String> wordList,LinkedList<String> descriptionList){
        //mInflater = LayoutInflater.from(context);
        this.mContext = context;
        this.mWordList = wordList;
        this.mDescriptionList = descriptionList;
    }

    @NonNull
    @Override
    public WordListAdapter.WordViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        //View mItemView = mInflater.inflate(R.layout.wordlist_item, parent, false);
        //return new WordViewHolder(mItemView);
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.wordlist_item, parent, false);
        WordViewHolder holder = new WordViewHolder(view);
        return holder;
    }



    @Override
    public void onBindViewHolder(@NonNull WordListAdapter.WordViewHolder holder, int position) {
        String mCurrent = mWordList.get(position);
        String descriptionCurrent = mDescriptionList.get(position);
        holder.wordItemView.setText(mCurrent);
        holder.descriptionItemView.setText(descriptionCurrent);

        holder.parentBox.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
               Toast.makeText(mContext, "hi", Toast.LENGTH_SHORT).show();
            }
        });
    }

    @Override
    public int getItemCount() {
        return mWordList.size();
    }

    class WordViewHolder extends RecyclerView.ViewHolder{
        public final TextView wordItemView;
        public final TextView descriptionItemView;
        LinearLayout parentBox;
        //final WordListAdapter mAdapter;

        public WordViewHolder(View itemView){
            super(itemView);
            wordItemView = itemView.findViewById(R.id.word);
            descriptionItemView = itemView.findViewById(R.id.description);
            parentBox = itemView.findViewById(R.id.parent_box);
            //this.mAdapter = adapter;

        }

    }
}
