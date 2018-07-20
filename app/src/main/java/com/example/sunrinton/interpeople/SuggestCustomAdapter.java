package com.example.sunrinton.interpeople;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

import java.util.ArrayList;

public class SuggestCustomAdapter extends BaseAdapter {

    ArrayList<SuggestData> items = new ArrayList<>();
    Context mContext;

    public SuggestCustomAdapter(ArrayList<SuggestData> items, Context mContext) {
        this.items = items;
        this.mContext = mContext;
    }

    @Override
    public int getCount() {
        return items.size();
    }

    @Override
    public Object getItem(int position) {
        return position;
    }

    @Override
    public long getItemId(int position) {
        return 0;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        View v = LayoutInflater.from(mContext).inflate(R.layout.item_list_suggestion,null);
        TextView content = v.findViewById(R.id.TV_suggest);
        content.setText(items.get(position).getContent());

        return v;
    }
}
