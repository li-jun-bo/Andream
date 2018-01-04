package com.dream.william.view.custom.hencoder.view06.sample;

import android.content.Context;
import android.support.annotation.Nullable;
import android.util.AttributeSet;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.RelativeLayout;

import com.dream.william.R;


public class Sample04Alpha extends RelativeLayout {

    Button animateBt;
    ImageView imageView;
    int state = 0;

    public Sample04Alpha(Context context) {
        super(context);
    }

    public Sample04Alpha(Context context, @Nullable AttributeSet attrs) {
        super(context, attrs);
    }

    public Sample04Alpha(Context context, @Nullable AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
    }

    @Override
    protected void onAttachedToWindow() {
        super.onAttachedToWindow();

        animateBt =  findViewById(R.id.animateBt);
        imageView =  findViewById(R.id.imageView);

        animateBt.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(final View v) {
                switch (state) {
                    case 0:
                        imageView.animate().alpha(0);
                        break;
                    case 1:
                        imageView.animate().alpha(1);
                        break;
                }
                state++;
                if (state == 2) {
                    state = 0;
                }
            }
        });
    }
}