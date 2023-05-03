package com.example.Shopthoitrangnamnu.Presenter;

public interface GioHangView {
    void OnSucess();

    void OnFail();

    void getDataSanPham(String id, String idsp,String tensp, Long giatien, String hinhanh, String loaisp, Long soluong, String kichco, Long type, String mausac);
}
