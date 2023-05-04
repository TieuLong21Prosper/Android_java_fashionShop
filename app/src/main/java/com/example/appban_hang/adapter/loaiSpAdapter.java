package com.example.appban_hang.adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import com.bumptech.glide.Glide;
import com.example.appban_hang.R;
import com.example.appban_hang.model.loaiSp;

import java.util.List;

public class loaiSpAdapter extends BaseAdapter {
    List<loaiSp> arrLoaiSp;
    Context context;
    //constructor

    public loaiSpAdapter( Context context,List<loaiSp> arrLoaiSp) {
        this.arrLoaiSp = arrLoaiSp;
        this.context = context;
    }

    @Override
    public int getCount() {
        return arrLoaiSp.size();
    }

    @Override
    public Object getItem(int position) {
        return null;
    }

    @Override
    public long getItemId(int position) {
        return 0;
    }
    public class ViewHolder{
        TextView textensp;
        ImageView imghinhanh;
    }
    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        ViewHolder viewHolder = null;
        if(convertView == null){
            viewHolder = new ViewHolder();
            LayoutInflater layoutInflater = (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
            convertView = layoutInflater.inflate(R.layout.item_sanpham,null);
            viewHolder.textensp = convertView.findViewById(R.id.item_tensp);
            viewHolder.imghinhanh = convertView.findViewById(R.id.item_image);
            convertView.setTag(viewHolder);
        }
        else{
            viewHolder = (ViewHolder) convertView.getTag();
        }
        viewHolder.textensp.setText(arrLoaiSp.get(position).getTenSanpham());
        Glide.with(context).load(arrLoaiSp.get(position).getHinhAnh()).into(viewHolder.imghinhanh);
        return convertView;
    }
}
