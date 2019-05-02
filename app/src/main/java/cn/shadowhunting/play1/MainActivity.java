package cn.shadowhunting.play1;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends Activity {
private Button main_play;
private Button main_continue;
private Button main_iden;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        init();
        buttononclick();
    }

    private void buttononclick() {
        main_play.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(MainActivity.this,breakActivity.class));
            }
        });
        main_continue.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(MainActivity.this,playActivity.class));
            }
        });
        main_iden.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(MainActivity.this,My.class));
            }
        });
    }

    private void init() {
        main_play=(Button)findViewById(R.id.main_play);
        main_continue=(Button)findViewById(R.id.main_continue);
        main_iden=(Button)findViewById(R.id.main_iden);
    }
}
