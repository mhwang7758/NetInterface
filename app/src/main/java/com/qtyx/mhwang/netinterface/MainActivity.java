package com.qtyx.mhwang.netinterface;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import com.qtyx.mhwang.service.INetService;
import com.qtyx.mhwang.service.NetServiceUtil;

import java.util.HashMap;
import java.util.Map;

public class MainActivity extends Activity {

    TextView tv_text;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button button = findViewById(R.id.btn_test);
        tv_text = findViewById(R.id.tv_text);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Map<String,Object> map = new HashMap<>();
                map.put("username","admin");
                map.put("password","admin123");
                map.put("pos","123456");
                INetService service = NetServiceUtil.getService();
//                boolean connect = NetServiceUtil.connect(map);
                boolean connect = service.connect(map);
                if (connect){
                    updateText("连接成功");
                }
            }
        });
    }

    void updateText(final String msg){
        runOnUiThread(new Runnable() {
            @Override
            public void run() {
                tv_text.setText(msg);
            }
        });
    }
}