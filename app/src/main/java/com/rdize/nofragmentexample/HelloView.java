package com.rdize.nofragmentexample;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.LinearLayout;
import android.widget.TextView;

public class HelloView extends LinearLayout {
    TextView welcomeMessage;

    public HelloView(Context context, AttributeSet attrs) {
        super(context, attrs);
    }

    @Override protected void onFinishInflate() {
        super.onFinishInflate();
        welcomeMessage = (TextView) findViewById(R.id.hello_view_welcome_message);
    }

    public void setMessage(String name) {
        String message = "Hello " + name;
        welcomeMessage.setText(message);
    }
}
