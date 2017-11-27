package com.zyk.lianxi;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.zyk.myarr.AddUtil;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        int add = AddUtil.add(1, 2);
        System.out.println("===="+add);

        //第一次修改

    }
}
