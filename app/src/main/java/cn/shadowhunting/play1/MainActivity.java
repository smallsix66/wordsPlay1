package cn.shadowhunting.play1;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends Activity implements View.OnClickListener{
private Button main_play;
private Button main_setting;
private Button main_info;
private Button main_join;
private Button main_exit;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        init();

    }
    private void init() {
        main_play=(Button)findViewById(R.id.main_play);
        main_setting=(Button)findViewById(R.id.main_setting);
        main_info=(Button)findViewById(R.id.main_info);
        main_join=(Button)findViewById(R.id.main_join);
        main_exit=(Button)findViewById(R.id.main_exit);

        main_play.setOnClickListener(this);
        main_setting.setOnClickListener(this);
        main_info.setOnClickListener(this);
        main_join.setOnClickListener(this);
        main_exit.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()){
            case R.id.main_play:
                startActivity(new Intent(MainActivity.this,breakActivity.class));
                break;
            case R.id.main_setting:
                Toast.makeText(this, "开发中", Toast.LENGTH_SHORT).show();
                break;
            case R.id.main_info:
                startActivity(new Intent(MainActivity.this,My.class));
                break;
            case R.id.main_join:
                Toast.makeText(this, "开发中", Toast.LENGTH_SHORT).show();
                break;
            case R.id.main_exit:
                Toast.makeText(this, "开发中", Toast.LENGTH_SHORT).show();
                break;
        }

    }
}
