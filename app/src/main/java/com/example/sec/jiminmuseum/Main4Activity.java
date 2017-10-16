package com.example.sec.jiminmuseum;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TabHost;
import android.widget.Toast;

public class Main4Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main4);
        TabHost tabHost1 = (TabHost) findViewById(R.id.tabHost);
        tabHost1.setup();

        // 첫 번째 Tab. (탭 표시 텍스트:""), (페이지 뷰:"content1")
        TabHost.TabSpec ts1 = tabHost1.newTabSpec("Tab Spec 1");
        ts1.setContent(R.id.tab1);
        ts1.setIndicator("13");
        tabHost1.addTab(ts1);

        // 두 번째 Tab. (탭 표시 텍스트:""), (페이지 뷰:"content2")
        TabHost.TabSpec ts2 = tabHost1.newTabSpec("Tab Spec 2");
        ts2.setContent(R.id.tab2);
        ts2.setIndicator("14");
        tabHost1.addTab(ts2);

        // 세 번째 Tab. (탭 표시 텍스트:""), (페이지 뷰:"content2")
        TabHost.TabSpec ts3 = tabHost1.newTabSpec("Tab Spec 3");
        ts3.setContent(R.id.tab3);
        ts3.setIndicator("15");
        tabHost1.addTab(ts3);

        // 네 번째 Tab. (탭 표시 텍스트:""), (페이지 뷰:"content2")
        TabHost.TabSpec ts4 = tabHost1.newTabSpec("Tab Spec 4");
        ts4.setContent(R.id.tab4);
        ts4.setIndicator("15-2");
        tabHost1.addTab(ts4);

        // 다섯 번째 Tab. (탭 표시 텍스트:""), (페이지 뷰:"content2")
        TabHost.TabSpec ts5 = tabHost1.newTabSpec("Tab Spec 5");
        ts5.setContent(R.id.tab5);
        ts5.setIndicator("16");
        tabHost1.addTab(ts5);

        // 다섯 번째 Tab. (탭 표시 텍스트:""), (페이지 뷰:"content2")
        TabHost.TabSpec info = tabHost1.newTabSpec("Tab Spec 6");
        info.setContent(R.id.info);
        info.setIndicator("정보");
        tabHost1.addTab(info);
    }

    public void titleSet(View a){
        Intent i = new Intent(this, Main3Activity.class);
        startActivity(i);

        Toast toast = Toast.makeText(getApplicationContext(), "제목 설정하러 가기", Toast.LENGTH_SHORT);
        toast.show();

        finish();//액티비티 스택에서 제거
    }

    public void home(View h){
        Intent i = new Intent(this, MainActivity.class);
        startActivity(i);

        Toast toast = Toast.makeText(getApplicationContext(), "home", Toast.LENGTH_SHORT);
        toast.show();

        finish();//액티비티 백 스택에서 제거
    }

    public void end(View end){
        Toast toast = Toast.makeText(getApplicationContext(), "JiminMuseum 종료", Toast.LENGTH_SHORT);
        toast.show();

        finish();//액티비티 백 스택에서 제거
    }

}
