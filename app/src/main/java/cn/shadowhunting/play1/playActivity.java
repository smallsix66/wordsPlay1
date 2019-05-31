package cn.shadowhunting.play1;

import android.app.Activity;
import android.os.Bundle;

public class playActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(new MySurfaceView(this));
    }
}
