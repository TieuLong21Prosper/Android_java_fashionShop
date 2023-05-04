package com.example.appban_hang.model;

public class loaiSp {
    private int id;
    private String tenSanpham;
    private String hinhAnh;
    //constructor

    public loaiSp(int id, String tenSanpham, String hinhAnh) {
        this.id = id;
        this.tenSanpham = tenSanpham;
        this.hinhAnh = hinhAnh;
    }

    //getter aand setter
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTenSanpham() {
        return tenSanpham;
    }

    public void setTenSanpham(String tenSanpham) {
        this.tenSanpham = tenSanpham;
    }

    public String getHinhAnh() {
        return hinhAnh;
    }

    public void setHinhAnh(String hinhAnh) {
        this.hinhAnh = hinhAnh;
    }
}
