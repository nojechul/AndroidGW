package com.example.sunrinton.interpeople;

import android.app.Service;
import android.bluetooth.BluetoothAdapter;
import android.bluetooth.BluetoothClass;
import android.bluetooth.BluetoothGatt;
import android.bluetooth.BluetoothGattCharacteristic;
import android.bluetooth.BluetoothGattService;
import android.bluetooth.BluetoothManager;
import android.content.Context;
import android.content.Intent;
import android.os.Handler;
import android.os.IBinder;
import android.support.annotation.Nullable;
import java.text.SimpleDateFormat;
import java.util.*;
import java.util.List;

public class BluetoothService extends Service {
    @Nullable
    @Override
    public IBinder onBind(Intent intent) {
        return null;
    }
  /*  String DB_IN;

    private BluetoothGattCharacteristic mCharacteristic = null;
    private BluetoothAdapter mBluetoothAdapter = null;
    private BluetoothGatt mBluetoothGatt = null;
    private Handler mHandler = new Handler();
    private String string = null;
    List<String> stringArray = null;
    public String address = null;
    public BluetoothManager mBluetoothManager = null;


    @Nullable
    @Override
    public IBinder onBind(Intent intent) {
        return null;
    }

    @Override
    public int onStartCommand(Intent intent, int flags, int startId) {
        if(intent != null){
            address = intent.getStringExtra("address");
        }
        if (mBluetoothAdapter == null && address != ""){
            getAdapter();
        }
        if (mBluetoothGatt == null && mBluetoothAdapter!=null&&address != ""){
            getGatt();
        }
        return Service.START_STICKY;
    }

    private void getAdapter(){
        BluetoothManager mBluetoothManager = (BluetoothManager) getSystemService(Context.BLUETOOTH_SERVICE);
        mBluetoothAdapter = mBluetoothManager.getAdapter();

    }

    private void getGatt(){
        mBluetoothGatt = mBluetoothAdapter.getRemoteDevice(address).connectGatt(this,true, mBluetoothGattCallBack);
        mBluetoothGatt.discoverServices();
    }

    private void setNotification(){

         }
    }*/
}
