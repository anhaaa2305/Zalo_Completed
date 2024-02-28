package com.haluuvananh.zalo_completed;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TabHost;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        TabHost tabHost = findViewById(R.id.tab_host);
        tabHost.setup();

        TabHost.TabSpec spec = tabHost.newTabSpec("SỐ ĐIỆN THOẠI");
        spec.setContent(R.id.tab1);
        spec.setIndicator("SỐ ĐIỆN THOẠI");
        tabHost.addTab(spec);

        spec = tabHost.newTabSpec("QUÉT MÃ QR");
        spec.setContent(R.id.tab2);
        spec.setIndicator("QUÉT MÃ QR");
        tabHost.addTab(spec);

    }
}