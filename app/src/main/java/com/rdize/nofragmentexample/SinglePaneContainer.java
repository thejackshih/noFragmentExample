package com.rdize.nofragmentexample;

import android.content.Context;
import android.transition.TransitionManager;
import android.util.AttributeSet;
import android.view.View;
import android.widget.LinearLayout;

public class SinglePaneContainer extends LinearLayout implements Container {
    MainView mainView;

    public SinglePaneContainer(Context context, AttributeSet attrs) {
        super(context, attrs);
    }

    @Override protected void onFinishInflate() {
        super.onFinishInflate();
        View.inflate(getContext(), R.layout.main_view, this);
        mainView = (MainView) getChildAt(0);
    }

    @Override public boolean onBackPressed() {
        if(!rootViewAttached()) {
            removeViewAt(0);
            addView(mainView);
            return true;
        }
        return false;
    }

    @Override public void showName(String name) {
        TransitionManager.beginDelayedTransition(this);
        if(rootViewAttached()) {
            removeViewAt(0);
            View.inflate(getContext(), R.layout.hello_view, this);
        }
        HelloView helloView = (HelloView) getChildAt(0);
        helloView.setMessage(name);
    }
    private boolean rootViewAttached() {
        return mainView.getParent() != null;
    }
}