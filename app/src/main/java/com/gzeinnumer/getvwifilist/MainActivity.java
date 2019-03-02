package com.gzeinnumer.getvwifilist;

import android.net.wifi.WifiInfo;
import android.net.wifi.WifiManager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    Button btn;
    TextView infowifi;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btn=findViewById(R.id.idBtn);
        infowifi =findViewById(R.id.textInfo);

        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                WifiManager wifiManager = (WifiManager) getApplicationContext().getSystemService(WIFI_SERVICE);
                WifiInfo wifiInfo = wifiManager.getConnectionInfo();
                int ip = wifiInfo.getIpAddress();
                String macAddress = wifiInfo.getMacAddress();
                String bssid = wifiInfo.getBSSID();
                int rssi = wifiInfo.getRssi();
                int networkId = wifiInfo.getNetworkId();
                String ssid = wifiInfo.getSSID();
                String info = String.valueOf(ip)  + macAddress + bssid + String.valueOf(rssi) + String.valueOf(networkId) +ssid;
                infowifi.setText(info);

            }
        });
    }
}













