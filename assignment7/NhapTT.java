package com.assignment7;

import java.sql.Struct;

public class NhapTT {
    public String ten;
    public String donvi;
    public Float gia;
    public Integer soluong;

    public String getTen() {
        return ten;
    }
    public void setTen(String ten) {
        this.ten = ten;
    }
    public Float getGia() {
        return gia;
    }
    public void setGia(Float gia) {
        this.gia = gia;
    }
    public String getDonvi() {
        return donvi;
    }
    public void setDonvi(String donvi) {
        this.donvi = donvi;
    }
    public Integer getSoluong() {
        return soluong;
    }
    public void setSoluong(Integer soluong) {
        this.soluong = soluong;
    }



    public String toQLSP(){
        String sp = "\n------------";
        sp+= "\n"+getTen();
        sp+= "\n"+getGia();
        sp+= "\n"+getDonvi();
        sp+= "\n"+getSoluong();
        return sp;
    }

    public NhapTT() {
    }

    public NhapTT(String ten, Float gia, String donvi, Integer soluong) {
        this.ten = ten;
        this.gia = gia;
        this.donvi = donvi;
        this.soluong = soluong;
    }



}
