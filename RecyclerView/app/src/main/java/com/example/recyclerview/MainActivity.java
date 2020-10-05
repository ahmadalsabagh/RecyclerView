package com.example.recyclerview;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.LinkedList;

public class MainActivity extends AppCompatActivity {
    private final LinkedList<String> mWordList = new LinkedList<>();
    private final LinkedList<String> mDescriptionList = new LinkedList<>();
    private final LinkedList<String> mRecipeList = new LinkedList<>();
    private RecyclerView mRecyclerView;
    private WordListAdapter mAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mWordList.add("Shawrma Hummus");
        mDescriptionList.add("You will only try this in the arabian lands. Trust me it is one of the best things you will ever taste" +
                " in your entire dull life");
        mRecipeList.add("Lorem ipsum dolor sit amet, consectetur adipiscing elit. Morbi ut metus magna. Fusce consequat est eu est porttitor, sit amet commodo augue dignissim. Donec eget viverra diam. Nam blandit id augue non tincidunt. Nunc eu tellus et enim suscipit vestibulum. Mauris dignissim pulvinar sem nec ultricies. Nam libero massa, euismod vitae velit sed, sagittis dignissim ligula. Aenean dui dolor, interdum vel facilisis in, rhoncus sit amet tellus. Aenean elementum quis ligula at rutrum. Vestibulum hendrerit tortor nec ante euismod iaculis. Fusce ultricies a risus sit amet luctus.");

        mWordList.add("Tabouleh Salad");
        mDescriptionList.add("Dont even get me started. If you've never tried this you are living under a rock");
        mRecipeList.add("Sed urna odio, pretium sit amet nisi at, dapibus ultrices nisi. Sed vitae neque varius ante gravida egestas a non ex. Mauris laoreet, nunc quis malesuada commodo, nisi mi vestibulum nulla, a tristique orci metus eu orci. Praesent vel ultricies lorem, sit amet semper mi. Morbi viverra, dolor volutpat vulputate fringilla, metus justo cursus lacus, sed sodales mi lacus at arcu. Fusce dignissim, ante in pharetra dignissim, neque justo pulvinar purus, a pretium tortor dolor quis dolor. Praesent fringilla massa sed dictum pellentesque. Sed libero libero, mattis quis mi quis, suscipit vulputate nibh. Praesent malesuada odio non lacinia porttitor. Aliquam semper mauris in sem lacinia, et semper ex luctus. Nunc a metus lacus. Suspendisse pretium id enim ac consectetur.");

        mWordList.add("Manakeesh");
        mDescriptionList.add("You will cry tears of happiness while eating a bite of this");
        mRecipeList.add("Maecenas ornare ut dolor quis eleifend. Nullam sagittis finibus nisi, id maximus quam commodo in. Duis ut lectus lorem. Morbi porttitor tempor elit. Nulla non mattis quam. Donec laoreet pretium mauris eu convallis. Nulla vestibulum metus ut metus rhoncus, et faucibus nibh maximus. Sed vel nibh velit. Nunc sit amet eros efficitur orci aliquam imperdiet et non tortor. Nunc vel quam quis lacus egestas egestas. Pellentesque ac neque hendrerit, fermentum quam et, pulvinar augue. Donec vitae arcu non ante convallis pretium. Phasellus convallis, purus ac hendrerit venenatis, purus lacus euismod urna, pellentesque faucibus lorem turpis ac arcu. Ut interdum condimentum fermentum.");

        mWordList.add("Falafel");
        mDescriptionList.add("If you're broke and cannot afford much, try this out. It's the arab equivalent of instant noodles.");
        mRecipeList.add("Mauris in tortor ex. Ut vehicula malesuada neque, vel varius metus. Proin lectus lectus, condimentum non metus nec, luctus sollicitudin massa. Aenean vel dictum velit. Sed tincidunt, nunc eu tincidunt maximus, odio ante porta lorem, eget faucibus justo elit nec mauris. Sed sed lorem id nunc ullamcorper molestie. Vestibulum interdum odio at nisl tincidunt hendrerit. Etiam feugiat consequat quam sit amet fermentum. Integer sodales ipsum quis velit varius, in fringilla erat vestibulum. Interdum et malesuada fames ac ante ipsum primis in faucibus. Mauris sit amet arcu ullamcorper elit tempus blandit. Mauris blandit tincidunt nisl id pharetra. Nunc metus leo, fermentum varius sapien sagittis, porttitor tristique sapien. Vestibulum ornare velit vel libero ornare vestibulum. Interdum et malesuada fames ac ante ipsum primis in faucibus. Nullam arcu arcu, feugiat et ipsum quis, placerat tempus lorem.");

        mWordList.add("Wara' Anab");
        mDescriptionList.add("It might not look appetising but once you eat one there's no stopping.");
        mRecipeList.add("Cras pulvinar non urna ac consequat. Duis nisl ipsum, tristique sit amet sapien nec, tristique mattis erat. Duis felis nisi, vestibulum a blandit a, rhoncus ut erat. Nulla pretium dui a justo tristique eleifend. Donec ante massa, elementum vitae lorem quis, hendrerit posuere ante. Pellentesque sed imperdiet nulla. Cras fermentum erat quis gravida faucibus. Interdum et malesuada fames ac ante ipsum primis in faucibus. Vestibulum vestibulum at ipsum quis posuere. Maecenas eu ipsum dui. In fringilla ornare diam, a convallis diam convallis cursus. Integer sagittis erat lectus, eu pharetra ante suscipit eu. Nullam auctor, dolor eu pretium finibus, arcu metus consectetur ligula, vel euismod leo enim nec lacus. Integer arcu odio, porta a sagittis quis, rutrum maximus mauris. Integer aliquet tellus vel ante rhoncus, quis pretium justo molestie.");

        mWordList.add("Bizza");
        mDescriptionList.add("Common misconception to think this is pizza, its not. It's added arab deliciousness.");
        mRecipeList.add("Nunc auctor congue odio, ac egestas mauris gravida ut. Quisque faucibus arcu quis ipsum eleifend commodo. Nunc volutpat sapien vel orci elementum hendrerit. Donec est sapien, sollicitudin quis efficitur sed, laoreet non eros. Praesent suscipit nibh nec lacus lobortis placerat at sed nisi. Ut tincidunt ligula et massa convallis vestibulum. Pellentesque quam mi, lobortis sed maximus sed, aliquam eget sapien. Nullam nisi lectus, bibendum porta elit in, finibus semper dolor. Vestibulum id orci a purus faucibus lacinia. Quisque porttitor dignissim velit nec imperdiet. Nam pellentesque lectus ligula, vitae facilisis tellus ullamcorper eget. Donec nulla felis, auctor id ante id, luctus hendrerit purus. Sed condimentum luctus enim a vestibulum. Fusce pharetra finibus justo, in placerat urna placerat ut. Maecenas cursus orci in lacus blandit, vitae vehicula sem dignissim. Vivamus at tellus sed quam ullamcorper dignissim.");

        mWordList.add("Chicken Nuggets");
        mDescriptionList.add("You can never go wrong with chicken nuggets!");
        mRecipeList.add("Fusce blandit odio in nisi fermentum, semper luctus sem rutrum. Vestibulum vel semper magna. Maecenas ultrices consectetur rhoncus. Phasellus id est risus. Nullam dictum tempor orci id egestas. Aenean non est enim. Cras aliquam facilisis ornare. Nulla consectetur urna nec tincidunt volutpat. Suspendisse id eros aliquet, vestibulum velit vitae, porttitor neque. Integer et ullamcorper turpis.");

        mWordList.add("Yummy Nuggets");
        mDescriptionList.add("An alternative to chicken nuggets");
        mRecipeList.add("Aliquam finibus dolor vitae eros eleifend, nec feugiat magna facilisis. Curabitur luctus mauris sed purus laoreet, sit amet pharetra velit faucibus. Integer nulla tellus, consectetur eu aliquam nec, euismod vel diam. Sed pharetra purus vitae enim pretium condimentum. In hac habitasse platea dictumst. Nullam viverra ultrices risus. Donec orci enim, pretium non lacinia ut, ornare id dolor. Etiam porttitor, mi a placerat eleifend, lectus lectus interdum purus,");

        mWordList.add("Burger King");
        mDescriptionList.add("Have it your way");
        mRecipeList.add("Ut sagittis leo nec molestie ornare. Aliquam gravida felis nec arcu imperdiet sollicitudin. Duis condimentum tempor eleifend. Sed laoreet, diam sed auctor varius, lectus libero hendrerit arcu, sit amet vehicula metus quam et tellus. Orci varius natoque penatibus et magnis dis parturient montes, nascetur ridiculus mus. Etiam ullamcorper dolor at ligula volutpat, vitae tincidunt lectus euismod. Maecenas tincidunt magna et nisl egestas dapibus. Donec et euismod magna, id fermentum mauris.");

        mWordList.add("Mcdonalds");
        mDescriptionList.add("Disgusting. But some people like it.");
        mRecipeList.add("Nulla dolor lectus, sodales a auctor a, accumsan at quam. Proin ipsum elit, tempus at rutrum non, tincidunt eu lacus. In elit eros, blandit id elementum non, egestas quis magna. Quisque sollicitudin sed augue sit amet vulputate. Nulla id eros et diam faucibus laoreet. Integer nulla ligula, accumsan sit amet mauris a, interdum euismod urna. Proin dapibus ultricies tellus id vehicula. Proin laoreet, erat in dictum semper, magna nulla rutrum augue, molestie tempor est quam eu leo. In vel tortor maximus, lobortis risus nec, placerat risus. Aenean pharetra sapien lorem, cursus tristique ex interdum vel. Pellentesque habitant morbi tristique senectus et netus et malesuada fames ac turpis egestas. Aliquam erat volutpat.");

        // Get a handle to the RecyclerView.
        mRecyclerView = findViewById(R.id.recyclerview);
        // Create an adapter and supply the data to be displayed.
        mAdapter = new WordListAdapter(this, mWordList, mDescriptionList, mRecipeList);
        // Connect the adapter with the RecyclerView.
        mRecyclerView.setAdapter(mAdapter);
        // Give the RecyclerView a default layout manager.
        mRecyclerView.setLayoutManager(new LinearLayoutManager(this));

    }
}