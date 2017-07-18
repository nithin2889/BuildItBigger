package com.learnwithme.buildapps.droidjokelibrary;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

import com.github.library.bubbleview.BubbleTextView;

public class JokeDisplayActivity extends AppCompatActivity {
    public final static String INTENT_KEY = "JOKE_INTENT_KEY";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.joke_display_activity);

        String joke = getIntent().getStringExtra(INTENT_KEY);
        BubbleTextView tv_bubble = (BubbleTextView) findViewById(R.id.textview_joke);
        tv_bubble.setText(joke);
        if(tv_bubble.getVisibility() == View.INVISIBLE) {
            tv_bubble.setVisibility(View.VISIBLE);
        }
    }
}