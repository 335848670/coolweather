package com.coolweather.android.db;

import org.litepal.crud.DataSupport;

public class Province extends DataSupport{
    private int id;
    private String provincceName;
    private int provinceCode;
    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }
    public String getProvinceName(){
        return provincceName;
    }
    public static void setProvinceName(String provincceName) {
        this.provincceName = provincceName;
    }
    public int getProvinceCode() {
        return provinceCode;
    }
    public void setProvinceCode(int provinceCode) {
        this.provinceCode = provinceCode;
    }
}

