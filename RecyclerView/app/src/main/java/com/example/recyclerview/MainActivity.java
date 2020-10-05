package com.example.recyclerview;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.LinkedList;

public class MainActivity extends AppCompatActivity {
    private final LinkedList<String> mWordList = new LinkedList<>();
    private final LinkedList<String> mDescriptionList = new LinkedList<>();
    private RecyclerView mRecyclerView;
    private WordListAdapter mAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mWordList.add("Shawrma Hummus");
        mDescriptionList.add("You will only try this in the arabian lands. Trust me it is one of the best things you will ever taste" +
                " in your entire dull life");

        mWordList.add("Tabouleh Salad");
        mDescriptionList.add("Dont even get me started. If you've never tried this you are living under a rock");

        mWordList.add("Manakeesh");
        mDescriptionList.add("You will cry tears of happiness while eating a bite of this");

        mWordList.add("Falafel");
        mDescriptionList.add("If you're broke and cannot afford much, try this out. It's the arab equivalent of instant noodles.");

        mWordList.add("Wara' Anab");
        mDescriptionList.add("It might not look appetising but once you eat one there's no stopping.");

        mWordList.add("Bizza");
        mDescriptionList.add("Common misconception to think this is pizza, its not. It's added arab deliciousness.");

        mWordList.add("Chicken Nuggets");
        mDescriptionList.add("You can never go wrong with chicken nuggets!");

        mWordList.add("Yummy Nuggets");
        mDescriptionList.add("An alternative to chicken nuggets");

        mWordList.add("Burger King");
        mDescriptionList.add("Have it your way");

        mWordList.add("Mcdonalds");
        mDescriptionList.add("Disgusting. But some people like it.");

        // Get a handle to the RecyclerView.
        mRecyclerView = findViewById(R.id.recyclerview);
        // Create an adapter and supply the data to be displayed.
        mAdapter = new WordListAdapter(this, mWordList, mDescriptionList);
        // Connect the adapter with the RecyclerView.
        mRecyclerView.setAdapter(mAdapter);
        // Give the RecyclerView a default layout manager.
        mRecyclerView.setLayoutManager(new LinearLayoutManager(this));

    }
}