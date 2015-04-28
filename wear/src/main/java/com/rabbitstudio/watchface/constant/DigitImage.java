package com.rabbitstudio.watchface.constant;

import com.rabbitstudio.watchface.R;

public enum DigitImage {
    ZERO(R.drawable.digit_0),
    ONE(R.drawable.digit_1),
    TWO(R.drawable.digit_2),
    THREE(R.drawable.digit_3),
    FOUR(R.drawable.digit_4),
    FIVE(R.drawable.digit_5),
    SIX(R.drawable.digit_6),
    SEVEN(R.drawable.digit_7),
    EIGHT(R.drawable.digit_8),
    NINE(R.drawable.digit_9);

    private final int imageId;

    private DigitImage(int imageId){
        this.imageId = imageId;
    }

    public int getImageId(){
        return imageId;
    }

    public static DigitImage getImageByDigit(int digit){
        switch(digit){
            case 0 : return ZERO;
            case 1 : return ONE;
            case 2 : return TWO;
            case 3 : return THREE;
            case 4 : return FOUR;
            case 5 : return FIVE;
            case 6 : return SIX;
            case 7 : return SEVEN;
            case 8 : return EIGHT;
            case 9 : return NINE;
            default:
                throw new IllegalArgumentException("Method accepts only digits, no numbers. You passed '" + digit + "'");
        }
    }
}
