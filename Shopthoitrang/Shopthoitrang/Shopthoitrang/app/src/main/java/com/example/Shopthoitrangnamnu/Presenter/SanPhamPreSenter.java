package com.example.Shopthoitrangnamnu.Presenter;

import com.example.Shopthoitrangnamnu.Model.SanPhamModels;

public class SanPhamPreSenter implements  ISanPham{
    private SanPhamModels sanPhamModels;
    private  SanPhamView callback;
    public   SanPhamPreSenter(SanPhamView callback){
        this.callback=callback;
        sanPhamModels = new SanPhamModels(this);

    }
    public void HandlegetDataSanPham(){
        sanPhamModels.HandlegetDataSanPham();
    }

    public void HandlegetDataSanPhamTU(){
        sanPhamModels.HandlegetDataSanPhamThucUong();
    }
    public void HandlegetDataSanPhamHQ(){
        sanPhamModels.HandlegetDataSanPhamHanQuoc();
    }

    public void HandlegetDataSanPhamMC(){
        sanPhamModels.HandlegetDataSanPhamMiCay();
    }
    public void HandlegetDataSanPhamYT(){
        sanPhamModels.HandlegetDataSanPhamYeuThich();
    }
    public void HandlegetDataSanPhamLau(){
        sanPhamModels.HandlegetDataSanPhamLau();
    }
    public void HandlegetDataSanPhamGY(){
        sanPhamModels.HandlegetDataSanPhamGoiY();
    }
    @Override
    public void getDataSanPham(String id, String tensp, Long giatien, String hinhanh, String loaisp, String mota, Long soluong,
                               String kichco, Long type,String mausac) {
       callback.getDataSanPham(id,tensp,giatien,hinhanh,loaisp,mota,soluong,kichco,type,mausac);
    }
    @Override
    public void getDataSanPhamTU(String id, String tensp, Long giatien, String hinhanh, String loaisp, String mota, Long soluong,
                               String kichco, Long type,String mausac) {
        callback.getDataSanPhamTU(id,tensp,giatien,hinhanh,loaisp,mota,soluong,kichco,type,mausac);
    }
    @Override
    public void getDataSanPhamHQ(String id, String tensp, Long giatien, String hinhanh, String loaisp, String mota, Long soluong,
                                 String kichco, Long type,String mausac) {
        callback.getDataSanPhamHQ(id,tensp,giatien,hinhanh,loaisp,mota,soluong,kichco,type,mausac);
    }
    @Override
    public void getDataSanPhamMC(String id, String tensp, Long giatien, String hinhanh, String loaisp, String mota, Long soluong,
                                 String kichco, Long type,String mausac) {
        callback.getDataSanPhamMC(id,tensp,giatien,hinhanh,loaisp,mota,soluong,kichco,type,mausac);
    }
    @Override
    public void getDataSanPhamYT(String id, String tensp, Long giatien, String hinhanh, String loaisp, String mota, Long soluong,
                                 String kichco, Long type,String mausac) {
        callback.getDataSanPhamYT(id,tensp,giatien,hinhanh,loaisp,mota,soluong,kichco,type,mausac);
    }
    @Override
    public void getDataSanPhamLau(String id, String tensp, Long giatien, String hinhanh, String loaisp, String mota, Long soluong,
                                 String kichco, Long type,String mausac) {
        callback.getDataSanPhamLau(id,tensp,giatien,hinhanh,loaisp,mota,soluong,kichco,type,mausac);
    }
    @Override
    public void getDataSanPhamGY(String id, String tensp, Long giatien, String hinhanh, String loaisp, String mota, Long soluong,
                                 String kichco, Long type,String mausac) {
        callback.getDataSanPhamGY(id,tensp,giatien,hinhanh,loaisp,mota,soluong,kichco,type,mausac);
    }
    @Override
    public void OnEmptyList() {
        callback.OnEmptyList();
    }
// truyen dữ liệu qua màn hình
    @Override
    public void getDataSanPhamNB(String id, String tensp, Long giatien, String hinhanh, String loaisp, String mota, Long soluong, String kichco, Long type, String mausac) {
        callback.getDataSanPhamNB(id,tensp,giatien,hinhanh,loaisp,mota,soluong,kichco,type,mausac);
    }

    public void HandlegetDataSanPham(String loaisp,int type) {
        sanPhamModels.HandlegetDataSanPham(loaisp,type);
    }


    public void HandlegetDataSanPhamNB() {
        sanPhamModels.HandlegetDataSanPhamNoiBat();
    }

}
