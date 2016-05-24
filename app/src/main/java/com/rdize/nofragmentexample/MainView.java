package com.rdize.nofragmentexample;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.LinearLayout;

public class MainView extends LinearLayout {
    Button button;
    public MainView(Context context, AttributeSet attrs) {
        super(context, attrs);
    }

    @Override protected void onFinishInflate() {
        super.onFinishInflate();
        button = (Button) findViewById(R.id.main_view_button);
        button.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View v) {
                MainActivity mainActivity = (MainActivity) getContext();
                EditText name = (EditText) findViewById(R.id.main_view_edittext);
                mainActivity.getContainer().showName(name.getText().toString());
            }
        });
    }
}
