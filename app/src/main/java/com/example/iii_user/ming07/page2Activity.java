package com.example.iii_user.ming07;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.TextView;

public class page2Activity extends AppCompatActivity {
        private TextView mesg;
        private int Lottery;
        public page2Activity(){
            Log.i("ming", "page2Activity()");
        }
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_page2);
        Log.i("ming", "page2Activity():onCreate()");
        mesg = (TextView)findViewById(R.id.page2_mesg);

        Intent it = getIntent();

        String username = it.getStringExtra("username");
        Boolean sound = it.getBooleanExtra("sound", true);
        Integer level = it.getIntExtra("level", 1);

        Lottery =   (int) (Math.random()*49+1);
        mesg.setText("username: "+username+"\n"
                        +"sound: "+(sound?"on":"off")+"\n"
                            +"level: "+level+"\n"+"Lottery"+Lottery+"\n");
    }
    public void back1(View view){
        finish();
    }
    public void back2(View view){
        Intent it = new Intent(this,MainActivity.class);
        startActivity(it);
    }

    @Override
    public void finish() {
        Intent it = new Intent();
        setResult(Lottery);
        super.finish();
    }
}
