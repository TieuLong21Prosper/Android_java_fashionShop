package com.example.appban_hang.retrofit;

import io.reactivex.rxjava3.core.Observable;

import com.example.appban_hang.model.SanPhamMoiModel;
import com.example.appban_hang.model.loaiSpModel;

import retrofit2.http.Field;
import retrofit2.http.FormUrlEncoded;
import retrofit2.http.GET;
import retrofit2.http.POST;

public interface ApiBanHang {
    @GET("getLoaisanpham.php")
    Observable<loaiSpModel> getLoaiSpModel();

    @GET("getspmoi.php")
    Observable<SanPhamMoiModel> getSpMoi();

    @POST("chitiet.php")
    @FormUrlEncoded
    Observable<SanPhamMoiModel> getSanPham(
            @Field("page") int page,
            @Field("loai") int loai
    );
}
