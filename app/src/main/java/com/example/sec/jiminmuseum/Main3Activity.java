package com.example.sec.jiminmuseum;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import org.w3c.dom.Text;

public class Main3Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main3);
    }

    public void copy(View a){
        EditText tit = (EditText)findViewById(R.id.writeTitle);

        TextView show = (TextView)findViewById(R.id.title);
        show.setText(" 제목: "+tit.getText());
    }

    public void back(View v){
        Intent i = new Intent(this, Main2Activity.class);
        startActivity(i);

        Toast.makeText(getApplicationContext(), "회원가입창으로 돌아가기", Toast.LENGTH_SHORT).show();

        finish();
    }

    public void home(View h){
        Intent i = new Intent(this, MainActivity.class);
        startActivity(i);

        Toast.makeText(getApplicationContext(), "Home!", Toast.LENGTH_SHORT).show();

        finish();
    }

    public void album(View a){
        Intent i =new Intent(this, Main4Activity.class);
        startActivity(i);

        Toast.makeText(getApplicationContext(), "지민이 연도별 내가 꼽은 최고의 순간들", Toast.LENGTH_SHORT).show();

        finish();
    }
}
