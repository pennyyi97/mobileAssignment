package com.example.sec.jiminmuseum;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void goto2(View a){
        Intent i = new Intent(this, Main2Activity.class);
        startActivity(i);
        finish();//액티비티 백 스택에서 제거

        Toast toast = Toast.makeText(getApplicationContext(), "Wellcome!", Toast.LENGTH_SHORT);
        toast.show();
    }
}
