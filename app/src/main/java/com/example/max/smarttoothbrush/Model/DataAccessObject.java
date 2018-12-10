package com.example.max.smarttoothbrush.Model;

import android.content.SharedPreferences;
import android.support.v7.app.AppCompatActivity;

public class DataAccessObject extends AppCompatActivity {
    private SharedPreferences sharedPreference;
    private SharedPreferences.Editor editor;
    private String fileName;
    private Boolean isCreated;

    //构造函数，指定一个文件名
    public DataAccessObject(String fileName) {
        this.fileName = fileName;
        this.sharedPreference = getSharedPreferences(this.fileName,MODE_PRIVATE);
        this.editor = sharedPreference.edit();
        this.isCreated = sharedPreference.getBoolean("isCreated",false);
    }

    //方便判断，返回文件名
    public String getUserName() {
        return fileName;
    }

    //在创建时判断文件是否存在
    public Boolean getCreated() {
        return isCreated;
    }

    //下面为同名函数，可以根据valued的类型自动选择执行哪一个函数，并根据关键词保存
    public void save(String key, String value){
        editor.putString(key, value);
        editor.apply();
        setCreated();
    }

    public void save(String key, int value){
        editor.putInt(key, value);
        editor.apply();
        setCreated();
    }

    public void save(String key, Boolean value){
        editor.putBoolean(key, value);
        editor.apply();
        setCreated();
    }

    public void save(String key, Float value){
        editor.putFloat(key,value);
        editor.apply();
        setCreated();
    }


    //根据关键词来获取数据，并传入默认值，如果没有就返回默认值
    public int getInt(String key,int defValue ){
        int result = sharedPreference.getInt(key,defValue);
        return result;
    }

    public String getString(String key, String defValue){
        String result = sharedPreference.getString(key, defValue);
        return result;
    }

    public Boolean getBoolean(String key, Boolean defValue){
        Boolean result = sharedPreference.getBoolean(key, defValue);
        return result;
    }

    //标记文件已存在
    private void setCreated(){
        if(!this.isCreated){
            editor.putBoolean("isCreated",true);
        }
    }
}
