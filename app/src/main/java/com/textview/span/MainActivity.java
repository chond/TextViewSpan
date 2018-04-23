package com.textview.span;

import android.graphics.Color;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import utils.TextViewSpanUtils;

/**
 * desc：Demo
 * time：2018/4/23
 * auth：danshen@2dfire.com
 */
public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    private Button btTest;
    private TextView tvTestData;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        init();
    }

    private void init() {
        initView();
        initListener();
    }

    private void initView() {
        btTest = findViewById(R.id.btTest);
        tvTestData = findViewById(R.id.tvTestData);
    }

    private void initListener() {
        btTest.setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {
        switch (view.getId()) {
            case R.id.btTest:
                test();
                break;
        }
    }

    private void test() {
        String data = "变色，这个是测试数据，中划线，下划线，变大，变小，变大";
        TextViewSpanUtils.Builder builder = TextViewSpanUtils.getBuilder(this, data);
        builder.setStrikeThroughSpan(0, 2);
        builder.setColorSpan(0, 2, Color.RED);

        builder.setStrikeThroughSpan(11, 14);
        builder.setUnderlineSpan(15, 18);
        builder.setSizeSpan(data.length() - 2, data.length(), 40);
        tvTestData.setText(builder.create());
    }
}
