package com.example.sec.jiminmuseum;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.Toast;

public class Main2Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        //spinner 사용
        String[] str=getResources().getStringArray(R.array.emailArray); //arrays파일에 넣은 이메일주소 가져오기
        ArrayAdapter<String> adapter = new ArrayAdapter<String>(this, android.R.layout.simple_spinner_dropdown_item,str);//spinner에 가져온 주소 넣기
        Spinner spi = (Spinner)findViewById(R.id.spinner);
        spi.setAdapter(adapter);

        spi.setOnItemSelectedListener(
                new AdapterView.OnItemSelectedListener(){
                    //아이템 선택시 호출
                    @Override
                    public void onItemSelected(AdapterView<?> adapterView, View view, int i, long l) {
                        //spinner의 값 가져와서 edittext에 넣기
                        Spinner mySpinner=(Spinner) findViewById(R.id.spinner);
                        String text = mySpinner.getSelectedItem().toString();

                        EditText show = (EditText)findViewById(R.id.emailSet);
                        show.setText(text);
                    }

                    //아이템 미선택시 호출
                    @Override
                    public void onNothingSelected(AdapterView<?> adapterView) {

                    }
                }
        );

    }

    public void guest(View v){
        Intent i = new Intent(this, Main3Activity.class);
        startActivity(i);

        Toast.makeText(getApplicationContext(), "GUEST 님 환영합니다.", Toast.LENGTH_SHORT).show();

    }

    public void backLogin(View v){
        Intent i = new Intent(this, Main3Activity.class);
        startActivity(i);

        EditText join = (EditText) findViewById(R.id.JoinId);

        Toast toast = Toast.makeText(getApplicationContext(), join.getText()+"님 환영합니다.", Toast.LENGTH_SHORT);
        toast.show();

        finish();//액티비티 백 스택에서 제거
    }
}
