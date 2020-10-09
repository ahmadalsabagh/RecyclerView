package com.example.recyclerview.dummy;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Helper class for providing sample content for user interfaces created by
 * Android template wizards.
 * <p>
 * TODO: Replace all uses of this class before publishing your app.
 */
public class DummyContent {

    /**
     * An array of sample (dummy) items.
     */
    public static final List<DummyItem> ITEMS = new ArrayList<DummyItem>();

    /**
     * A map of sample (dummy) items, by ID.
     */
    public static final Map<String, DummyItem> ITEM_MAP = new HashMap<String, DummyItem>();

    static {
        addItem(new DummyItem("1","Shawrma Hummus","You will only try this in the arabian lands. Trust me it is one of the best things you will ever taste\" +\n" +
                "                \" in your entire dull life"));
        addItem(new DummyItem("2","Tabouleh Salad","Dont even get me started. If you've never tried this you are living under a rock"));
        addItem(new DummyItem("3","Manakeesh","You will cry tears of happiness while eating a bite of this"));

    }

    private static void addItem(DummyItem item) {
        ITEMS.add(item);
        ITEM_MAP.put(item.id, item);
    }


    /**
     * A dummy item representing a piece of content.
     */
    public static class DummyItem {
        public final String id;
        public final String recipeTitle;
        public final String recipeDescription;

        public DummyItem(String id, String recipeTitle, String recipeDescription) {
            this.id = id;
            this.recipeTitle = recipeTitle;
            this.recipeDescription = recipeDescription;

        }

        @Override
        public String toString() {
            return recipeTitle;
        }
    }
}