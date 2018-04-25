package com.example.anis.projetm1;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.RecyclerView.Adapter;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

import java.util.List;

/**
 * Created by Anis on 4/4/2018.
 */

public class GridAdapter extends BaseAdapter
{

    private List<Line> lines;
    private final Context mContext;


    public GridAdapter(Context context, List<Line> lines)
    {
        this.mContext = context;
        this.lines = lines;
    }

    @Override
    public int getCount() {
        return lines.size();
    }

    @Override
    public Object getItem(int position) {
        return lines.get(position);
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        if(convertView == null){
            convertView = LayoutInflater.from(mContext).inflate(R.layout.list_lignes, parent, false);
        }
        TextView content = convertView.findViewById(R.id.itemName);
        content.setText(lines.get(position).getShortName());

        return convertView;
    }


}
