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
        addItem(new DummyItem("1","Shawrma Hummus","You will only try this in the arabian lands. Trust me it is one of the best things you will ever taste in your entire dull life","Lorem ipsum dolor sit amet, consectetur adipiscing elit. Curabitur nec fermentum augue. Suspendisse maximus iaculis consequat. Integer id rutrum libero. Duis sit amet ipsum sit amet lacus mollis condimentum. Nullam mattis purus quam, eu placerat diam facilisis nec. Praesent quis dui a ante condimentum efficitur eu in erat. Integer rutrum ligula quis nisi congue, sed viverra nulla tincidunt. Nulla eget turpis dapibus, malesuada nunc at, convallis nunc. Nulla vitae tortor eu ipsum dignissim commodo non id leo. Etiam libero est, rhoncus nec nisi ut, vehicula sollicitudin sapien. Nulla orci velit, fringilla sed dictum a, hendrerit sit amet risus. In consequat luctus neque, eget volutpat justo euismod ut. Vestibulum placerat malesuada ex, in faucibus lectus laoreet ut. Mauris et hendrerit risus. In hac habitasse platea dictumst. Interdum et malesuada fames ac ante ipsum primis in faucibus."));
        addItem(new DummyItem("2","Tabouleh Salad","Dont even get me started. If you've never tried this you are living under a rock","Phasellus suscipit rutrum sem sit amet volutpat. Fusce aliquam volutpat posuere. Mauris a est ac nisl tristique posuere et a mauris. Suspendisse potenti. Nunc consequat diam vitae erat accumsan pulvinar. In hac habitasse platea dictumst. Nunc eleifend eros in augue fringilla, id gravida ipsum lobortis. Aliquam fringilla ac tellus ut lacinia. In hac habitasse platea dictumst. Nulla quam magna, fermentum vel iaculis quis, varius eu ligula. Praesent turpis lacus, bibendum non lorem a, euismod malesuada lectus. Vivamus varius tristique urna, ut pellentesque tortor molestie a. Sed tempor risus vel nisi viverra aliquet. Sed vel nibh tempus, maximus tellus vel, egestas magna. Vivamus sed mollis elit. Etiam dictum magna et velit varius, ut semper lectus ullamcorper. Suspendisse vitae lacinia orci. Ut non nunc luctus, rutrum urna et, congue neque."));
        addItem(new DummyItem("3","Manakeesh","You will cry tears of happiness while eating a bite of this","Maecenas sed elementum urna, eget semper ante. Nam sollicitudin laoreet ultricies. Nunc tincidunt, ex et convallis gravida, urna est maximus massa, ut vulputate enim nulla et purus. Praesent suscipit placerat enim, eget vestibulum est feugiat eu. Aliquam a magna sit amet orci dignissim sollicitudin ornare ultrices erat. Nunc id convallis dolor. Pellentesque mollis rutrum massa ut posuere. Sed ut dignissim nulla, vel hendrerit lorem. Aliquam mollis vehicula rhoncus. Sed tempor risus vel nisi viverra aliquet. Sed vel nibh tempus, maximus tellus vel, egestas magna. Vivamus sed mollis elit. Etiam dictum magna et velit varius, ut semper lectus ullamcorper. Suspendisse vitae lacinia orci. Ut non nunc luctus, rutrum urna et, congue neque."));
        addItem(new DummyItem("4","Falafel","If you're broke and cannot afford much, try this out. It's the arab equivalent of instant noodles.","Phasellus suscipit rutrum sem sit amet volutpat. Fusce aliquam volutpat posuere. Mauris a est ac nisl tristique posuere et a mauris. Suspendisse potenti. Nunc consequat diam vitae erat accumsan pulvinar. In hac habitasse platea dictumst. Nunc eleifend eros in augue fringilla, id gravida ipsum lobortis. Aliquam fringilla ac tellus ut lacinia. In hac habitasse platea dictumst. Nulla quam magna, fermentum vel iaculis quis, varius eu ligula. Praesent turpis lacus, bibendum non lorem a, euismod malesuada lectus. Vivamus varius tristique urna, ut pellentesque tortor molestie a."));
        addItem(new DummyItem("5","Wara' Anab","It might not look appetising but once you eat one there's no stopping.","Nunc vel diam id lectus semper fermentum. Phasellus a venenatis dui. Aliquam blandit consectetur justo vel vehicula. Sed placerat nulla et sapien placerat, nec ornare ante laoreet. Ut tincidunt gravida rhoncus. Aliquam congue feugiat tortor, sed feugiat odio egestas ac. Sed tempus a augue quis dignissim. Aliquam pretium nibh quis magna euismod, quis volutpat est molestie. Etiam imperdiet feugiat augue. Proin convallis pellentesque facilisis. Donec sed ultricies elit. Mauris consequat sem eget arcu sodales iaculis."));
        addItem(new DummyItem("6","Bizza","Common misconception to think this is pizza, its not. It's added arab deliciousness.","Sed ac lorem dictum dolor dictum convallis eget et justo. Praesent aliquam eget elit fringilla porta. Nullam congue ipsum id vestibulum imperdiet. Quisque cursus tellus sit amet tellus condimentum semper. Nunc hendrerit turpis sit amet libero porta aliquet. Sed at nulla ut arcu ullamcorper lacinia vel ac diam. Maecenas placerat porta sapien at sodales."));
        addItem(new DummyItem("7","Chicken Nuggets","You can never go wrong with chicken nuggets!","Sed ac lorem dictum dolor dictum convallis eget et justo. Praesent aliquam eget elit fringilla porta. Nullam congue ipsum id vestibulum imperdiet. Quisque cursus tellus sit amet tellus condimentum semper. Nunc hendrerit turpis sit amet libero porta aliquet. Sed at nulla ut arcu ullamcorper lacinia vel ac diam. Maecenas placerat porta sapien at sodales."));
        addItem(new DummyItem("8","Yummy Nuggets","An alternative to chicken nuggets","Nunc vel diam id lectus semper fermentum. Phasellus a venenatis dui. Aliquam blandit consectetur justo vel vehicula. Sed placerat nulla et sapien placerat, nec ornare ante laoreet. Ut tincidunt gravida rhoncus. Aliquam congue feugiat tortor, sed feugiat odio egestas ac. Sed tempus a augue quis dignissim. Aliquam pretium nibh quis magna euismod, quis volutpat est molestie. Etiam imperdiet feugiat augue. Proin convallis pellentesque facilisis. Donec sed ultricies elit. Mauris consequat sem eget arcu sodales iaculis."));
        addItem(new DummyItem("9","Mcdonalds","Disgusting. But some people like it.","Sed ac lorem dictum dolor dictum convallis eget et justo. Praesent aliquam eget elit fringilla porta. Nullam congue ipsum id vestibulum imperdiet. Quisque cursus tellus sit amet tellus condimentum semper. Nunc hendrerit turpis sit amet libero porta aliquet. Sed at nulla ut arcu ullamcorper lacinia vel ac diam. Maecenas placerat porta sapien at sodales."));

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
        public final String recipeDetail;

        public DummyItem(String id, String recipeTitle, String recipeDescription, String recipeDetail) {
            this.id = id;
            this.recipeTitle = recipeTitle;
            this.recipeDescription = recipeDescription;
            this.recipeDetail = recipeDetail;

        }

        @Override
        public String toString() {
            return recipeTitle;
        }
    }
}