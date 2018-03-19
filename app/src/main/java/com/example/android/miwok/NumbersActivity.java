package com.example.android.miwok;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import android.widget.ListView;


import java.util.ArrayList;

public class NumbersActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.word_list);

        //Create a list of words
        ArrayList<Word> words = new ArrayList<Word>();

        //words.add("one")("lutti")
        words.add(new Word("one","lutti", R.drawable.number_one));
        //words.add("two")("ottiko")
        words.add(new Word("two","ottiko", R.drawable.number_two));
        //words.add("three")("tolookosu")
        words.add(new Word("three","tolookosu", R.drawable.number_three));
        //words.add("four")("oyyisa")
        words.add(new Word("four","oyyisa", R.drawable.number_four));
        //words.add("five")("massokka")
        words.add(new Word("five","massokka", R.drawable.number_five));
        //words.add("six")("temmokka")
        words.add(new Word("six","temmokka", R.drawable.number_six));
        //words.add("seven")("kenekaku")
        words.add(new Word("seven","kenekaku", R.drawable.number_seven));
        //words.add("eight")("kawinta"0
        words.add(new Word("eight","kawinta", R.drawable.number_eight));
        //words.add("nine")("wo'e")
        words.add(new Word("nine","wo'e", R.drawable.number_nine));
        //words.add("ten")("na'aacha")
        words.add(new Word("ten","na'aacha", R.drawable.number_ten));

        WordAdapter adapter = new WordAdapter(this, words, R.color.category_numbers);

        ListView listView = (ListView) findViewById(R.id.list);

        listView.setAdapter(adapter);







    }
}