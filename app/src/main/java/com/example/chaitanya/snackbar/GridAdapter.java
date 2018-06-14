package com.example.chaitanya.snackbar;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;
public class GridAdapter extends BaseAdapter {
    private int icons[];
    private String numbers [];
    private Context context;
    private LayoutInflater layoutInflater;
    public GridAdapter(Context context,int icons[],String numbers[])

       {this.context =context;
       this.icons=icons;
       this.numbers=numbers;}
       @Override
    public int getCount() {
        return numbers.length;}
        @Override
    public Object getItem(int position) {
        return numbers[position];}
        @Override
    public long getItemId(int position) {
        return position;}
        @Override
    public View getView(int position, View convertView, ViewGroup parent) {
       View gridView=convertView;
       if (convertView==null){
           layoutInflater=(LayoutInflater)context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
           gridView=layoutInflater.inflate(R.layout.custom_layout,null);}
           ImageView icon=(ImageView)gridView.findViewById(R.id.icons);
        TextView number=(TextView)gridView.findViewById(R.id.numbers);
        icon.setImageResource(icons[position]);
        number.setText(numbers[position]);
        return gridView;}}
