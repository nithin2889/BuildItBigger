package com.learnwithme.javajokelibrary;

import java.util.Random;

public class ChuckNorris {
    private Random random = new Random();

    public String getJoke() {
        String joke;

        switch (random.nextInt(5)) {
            case 0:
                joke = "Chuck Norris doesn't ever call the wrong number. You just answer the wrong phone.";
                break;
            case 1:
                joke = "Chuck Norris has been to Mars already; he/’s the reason there are no signs of life.";
                break;
            case 2:
                joke = "Chuck Norris tried to lose weight. But Chuck Norris NEVER loses.";
                break;
            case 3:
                joke = "When Chuck Norris walks across the meadow, he doesn/’t smell the flowers. The flowers smell him.";
                break;
            default:
                joke = "How many push-ups did Chuck Norris do? He did them all.";
                break;
        }
        return joke;
    }
}