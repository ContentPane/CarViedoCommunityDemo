package com.example.monkey.carviedocommunitydemo.View;

import android.content.Context;
import android.support.annotation.Nullable;
import android.util.AttributeSet;
import android.view.View;

import com.example.monkey.carviedocommunitydemo.R;

public class FocusIndicator extends View{
    private int mState;
    private static final int STATE_IDLE = 0;    // 空闲状态
    private static final int STATE_FOCUSING = 1;    // 成功对焦状态
    private static final int STATE_FINISHING = 2;   // 失败对焦状态

    private Runnable mDisappear = new Disappear();
    private Runnable mEndAction = new EndAction();

    private static final int SCALING_UP_TIME = 800; // 成功对焦缩放动画时间
    private static final int SCALING_DOWN_TIME = 200; // 失败对焦缩放动画时间
    private static final int DISAPPEAR_TIMEOUT = 200;

    public FocusIndicator(Context context, @Nullable AttributeSet attrs) {
        super(context, attrs);
    }

    public void focus() {
        if (mState == STATE_IDLE) {
            setBackgroundResource(R.drawable.ic_focus_focusing); // 白色框框空闲状态
            animate().withLayer().setDuration(SCALING_UP_TIME)  // withLayer()通过设置HardWare Layer渲染进入缓存
                    .scaleX(2f).scaleY(2f);  //放大动画
            mState = STATE_FOCUSING;  // 进入对焦状态
        }
    }

    public void focusSuccess() {
        if (mState == STATE_FOCUSING) {
            setBackgroundResource(R.drawable.ic_focus_focused);
            animate().withLayer().setDuration(SCALING_DOWN_TIME).scaleX(1f)
                    .scaleY(1f).withEndAction(mEndAction);
            mState = STATE_FINISHING;
        }
    }

    public void focusFail() {
        if (mState == STATE_FOCUSING) {
            setBackgroundResource(R.drawable.ic_focus_failed);
            animate().withLayer().setDuration(SCALING_DOWN_TIME).scaleX(1f)
                    .scaleY(1f).withEndAction(mEndAction);
            mState = STATE_FINISHING;
        }
    }

    public void focusCancel() {
        animate().cancel();
        removeCallbacks(mDisappear);
        mDisappear.run();
        setScaleX(1f);
        setScaleY(1f);
    }

    private class EndAction implements Runnable {
        @Override
        public void run() {
            // Keep the focus indicator for some time.
            postDelayed(mDisappear, DISAPPEAR_TIMEOUT);
        }
    }

    private class Disappear implements Runnable {
        @Override
        public void run() {
            setBackgroundDrawable(null);
            mState = STATE_IDLE;
        }
    }
}
