package com.rdize.nofragmentexample;

import android.app.Activity;
import android.os.Bundle;

public class MainActivity extends Activity {

    private Container container;

    @Override protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        container = (Container) findViewById(R.id.container);
    }
    @Override public void onBackPressed() {
        boolean handled = container.onBackPressed();
        if(!handled) {
            finish();
        }
    }
    public Container getContainer() {
        return container;
    }
}