package com.learnwithme.buildapps.builditbigger;

import android.app.Application;
import android.support.test.runner.AndroidJUnit4;
import android.test.ApplicationTestCase;

import org.junit.Test;
import org.junit.runner.RunWith;

import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;

/**
 * Created by Nithin on 17/07/2017.
 */
@RunWith(AndroidJUnit4.class)
public class JokeTest extends ApplicationTestCase<Application> implements OnJokeRecievedListener {
    CountDownLatch signal;
    String joke;

    public JokeTest() {
        super(Application.class);
    }

    @Test
    public void testJoke() {
        try {
            signal = new CountDownLatch(1);
            // Invoking get() method so that it retrieves a joke on the UI thread
            new EndpointsAsyncTask().execute(this).get();
            signal.await(10, TimeUnit.SECONDS);
            assertNotNull("joke is null", joke);
            assertFalse("joke is empty", joke.isEmpty());
        } catch (Exception e) {
            fail();
        }
    }

    @Override
    public void onRecieved(String joke) {
        this.joke = joke;
        signal.countDown();
    }
}