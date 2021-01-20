package com.example.mygridviewdemo;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

public class CustomAdapter extends BaseAdapter {

    Context context;
    int[] flags;
    String[] countryNames;

    private LayoutInflater inflater;

    CustomAdapter(Context context, int[] flags, String[] countryNames){
        this.context=context;
        this.flags=flags;
        this.countryNames=countryNames;

    }

    @Override
    public int getCount() {
        return countryNames.length;
    }

    @Override
    public Object getItem(int i) {
        return null;
    }

    @Override
    public long getItemId(int i) {
        return 0;
    }

    @Override
    public View getView(int i, View view, ViewGroup viewGroup) {

        if (view==null){

            inflater= (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
            view = inflater.inflate(R.layout.sample_view, viewGroup, false);


        }

        ImageView imageView = view.findViewById(R.id.imageViewId);
        TextView textView = view.findViewById(R.id.textViewID);

        imageView.setImageResource(flags[i]);
        textView.setText(countryNames[i]);

        return view;
    }
}
