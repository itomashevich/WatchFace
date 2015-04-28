package com.rabbitstudio.watchface;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.view.LayoutInflater;
import android.view.View;
import android.view.WindowInsets;

import com.rabbitstudio.watchface.util.ClockfaceHandler;
import com.ustwo.clockwise.WatchFace;
import com.ustwo.clockwise.WatchFaceTime;
import com.ustwo.clockwise.WatchShape;

public class MainWatchFace extends WatchFace {

    private View vClockface;

    private ClockfaceHandler clockfaceHandler;


    @Override
    protected void onTimeChanged(WatchFaceTime oldTime, WatchFaceTime newTime) {

        clockfaceHandler.onTimeChanged(oldTime, newTime);

        super.onTimeChanged(oldTime, newTime);
    }

    @Override
    protected void onDraw(Canvas canvas) {
        vClockface.draw(canvas);
    }

    @Override
    protected void onLayout(WatchShape shape, Rect screenBounds, WindowInsets screenInsets) {

        LayoutInflater inflater = (LayoutInflater)getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        if (WatchShape.CIRCLE.equals(shape)){
            vClockface = inflater.inflate(R.layout.rect_clockface, null);
        } else if (WatchShape.SQUARE.equals(shape)){
            vClockface = inflater.inflate(R.layout.round_clockface, null);
        }

        vClockface.layout(0, 0, screenBounds.width(), screenBounds.height());

        clockfaceHandler = new ClockfaceHandler(vClockface);

        super.onLayout(shape, screenBounds, screenInsets);
    }
}
