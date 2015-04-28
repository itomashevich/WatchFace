package com.rabbitstudio.watchface.util;

import android.view.View;
import android.widget.ImageView;

import com.rabbitstudio.watchface.R;
import com.rabbitstudio.watchface.constant.DigitImage;
import com.ustwo.clockwise.WatchFaceTime;

public class ClockfaceHandler {

    private ImageView
            ivHour_x10,
            ivHour_x1,
            ivMinute_x10,
            ivMinute_x1;

    public ClockfaceHandler(View vClockface){
        ivHour_x10 = (ImageView) vClockface.findViewById(R.id.clockface_ivHour_x10);
        ivHour_x1 = (ImageView) vClockface.findViewById(R.id.clockface_ivHour_x1);
        ivMinute_x10 = (ImageView) vClockface.findViewById(R.id.clockface_ivMinute_x10);
        ivMinute_x1 = (ImageView) vClockface.findViewById(R.id.clockface_ivMinute_x1);
    }

    public void onTimeChanged(WatchFaceTime oldTime, WatchFaceTime curTime){
        if (curTime.hasHourChanged(oldTime)){
            int hour_x1 = curTime.hour % 10;
            int hour_x10 = curTime.hour / 10;

            ivHour_x10.setImageResource(DigitImage.getImageByDigit(hour_x10).getImageId());
            ivHour_x1.setImageResource(DigitImage.getImageByDigit(hour_x1).getImageId());
        }
        if (curTime.hasMinuteChanged(oldTime)){
            int minute_x1 = curTime.minute % 10;
            int minute_x10 = curTime.minute / 10;

            ivMinute_x10.setImageResource(DigitImage.getImageByDigit(minute_x10).getImageId());
            ivMinute_x1.setImageResource(DigitImage.getImageByDigit(minute_x1).getImageId());
        }
    }
}
