package com.example.Shopthoitrangnamnu.Presenter;

public interface IGioHang {
    void OnSucess();

    void OnFail();

    void getDataSanPham(String id, String id_sp,String tensp, Long giatien, String hinhanh, String loaisp, Long soluong, String kichco, Long type, String mausac);
}
