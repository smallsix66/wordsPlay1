package cn.shadowhunting.play1;

import android.app.Activity;
import android.os.Bundle;
import android.os.Handler;
import android.os.Message;
import android.view.View;
import android.widget.Button;

public class breakActivity extends Activity implements View.OnClickListener{

    private Button btn_time;
    private Button btn_words;
    private Button btn_fight;
    private String text_time = "30";
    private String text_words = "small\\nsix\\nintersted";
    private String title_time ="记忆时间\\n";
    private String title_words ="记忆单词\\n";
    private Handler handler = new Handler(){
        @Override
        public void handleMessage(Message msg) {
            super.handleMessage(msg);
            switch (msg.what){
                case 1:

                    break;
                case 2:

                    break;

            }
        }
    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_break);
        init();
    }

    private void init() {
        btn_time = findViewById(R.id.btn_time);
        btn_words = findViewById(R.id.btn_words);
        btn_fight = findViewById(R.id.btn_fight);

        btn_fight.setVisibility(View.INVISIBLE);

    }

    @Override
    public void onClick(View v) {
        switch (v.getId()){
            case R.id.btn_fight:
                startMemoryWords();
                break;
        }
    }

    private void startMemoryWords() {
        //calc
        Message msg = handler.obtainMessage();
        msg.what = 1;

    }
}
