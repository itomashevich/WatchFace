package com.rabbitstudio.watchface;

import android.app.Activity;
import android.os.Bundle;

public class WatchFaceConfiguration  extends Activity {

           @Override
        protected void onCreate(Bundle savedInstanceState) {
            super.onCreate(savedInstanceState);


            /*ComponentName name =
                    getIntent().getParcelableExtra(WatchFaceCompanion.EXTRA_WATCH_FACE_COMPONENT);
            TextView label = (TextView)findViewById(R.id.label);
            label.setText(label.getText() + " (" + name.getClassName() + ")");*/
        }
}
