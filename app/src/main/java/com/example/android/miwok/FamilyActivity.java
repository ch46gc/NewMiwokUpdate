package com.example.android.miwok;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;

public class FamilyActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.word_list);

        //Create a new list of words
        ArrayList<Word> words = new ArrayList<Word>();
        //words.add("Father") and ("әpә").
        words.add(new Word("Father", "әpә", R.drawable.family_father));
        //words.add("Mother") and ("әṭa").
        words.add(new Word("Mother","әṭa", R.drawable.family_mother));
        //words.add("Son") and ("angsi").
        words.add(new Word("Son", "angsi", R.drawable.family_son));
        //words.add("Daughter") and ("tune").
        words.add(new Word("Daughter", "tune", R.drawable.family_daughter));
        //words.add("Older Brother") and ("taachi").
        words.add(new Word("Older Brother", "taachi", R.drawable.family_older_brother));
        //words.add("Younger Brother") and ("chalitti").
        words.add(new Word("Younger Brother", "chalitti", R.drawable.family_younger_brother));
        //words.add("Older Sister") and ("teṭe").
        words.add(new Word("Older Sister","teṭe", R.drawable.family_older_sister));
        //words.add("Younger Sister") and ("kolliti").
        words.add(new Word("Younger Sister", "kolliti", R.drawable.family_younger_sister));
        //words.add("Grandmother") and ("ama").
        words.add(new Word("Grandmother", "ama", R.drawable.family_grandmother));
        //words.add("Grandfather") and ("paapa").
        words.add(new Word("Grandfather", "paapa", R.drawable.family_grandfather));

        WordAdapter adapter = new WordAdapter(this, words, R.color.category_family);

        ListView listView = (ListView) findViewById(R.id.list);

        listView.setAdapter(adapter);

    }
}
