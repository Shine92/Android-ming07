package com.example.iii_user.ming07;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
        public MainActivity(){
            Log.i("ming","MainActivity()");
        }
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Log.i("ming", "MainActivity():onCreate()");

        }
            public void test1(View view){
                Intent it = new Intent(this,page2Activity.class);
                startActivity(it);
            }
            public void test2(View view){
                Intent it = new Intent(this,page2Activity.class);
                it.putExtra("username","ming");
                it.putExtra("sound",false);
                it.putExtra("level",2);
                startActivity(it);
            }
            public void test3(View view){
                Intent it = new Intent(this,page2Activity.class);
                it.putExtra("username","ming");
                it.putExtra("sound",false);
                it.putExtra("level",3);
                startActivityForResult(it, 4);
            }
    public void test4(View view){
        Intent it = new Intent(this,page3Activity.class);
        Bundle b0 = new Bundle();
        b0.putInt("data1",0);
        b0.putString("data2","ming");
        it.putExtra("data1",b0);
    }

    @Override
    protected void onActivityResult(int requestCode, int resultCode, Intent data) {
        super.onActivityResult(requestCode, resultCode, data);
        Log.i("ming", "onActivityResult()"+resultCode);
    }

    @Override
    protected void onRestart() {
        super.onRestart();
        Log.i("ming","onRestart()");
    }

    @Override
    protected void onStart() {
        super.onStart();
        Log.i("ming", "onStart()");
    }

    @Override
    protected void onResume() {
        super.onResume();
        Log.i("ming", "onResume()");

    }
}

