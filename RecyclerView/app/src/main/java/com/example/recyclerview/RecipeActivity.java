//package com.example.recyclerview;
//
//import android.os.Bundle;
//import android.util.Log;
//import android.widget.ImageView;
//import android.widget.TextView;
//
//
//import androidx.annotation.Nullable;
//import androidx.appcompat.app.ActionBar;
//import androidx.appcompat.app.AppCompatActivity;
//import androidx.appcompat.widget.Toolbar;
//
//public class RecipeActivity extends AppCompatActivity {
//
//    @Override
//    protected void onCreate(@Nullable Bundle savedInstanceState) {
//        super.onCreate(savedInstanceState);
//        setContentView(R.layout.activity_recipe);
//        Log.d("TAG", "onClick: clicked on: 2 ");
//
//        getIncomingIntent();
//    }
//
//    private void getIncomingIntent() {
//        if (getIntent().hasExtra("full_recipe")) {
//            Log.d("TAG", "onClick: clicked on: 3 ");
//            String recipe = getIntent().getStringExtra("full_recipe");
//
//            setRecipe(recipe);
//        }
//    }
//
//    private void setRecipe(String recipe) {
//        TextView recipeText = findViewById(R.id.recipe_text);
//        recipeText.setText(recipe);
//    }
//}