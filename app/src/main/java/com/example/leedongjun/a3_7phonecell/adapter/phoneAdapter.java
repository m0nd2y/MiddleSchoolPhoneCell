package com.example.leedongjun.a3_7phonecell.adapter;

/**
 * Created by Lee Dong Jun on 2017-03-16.
 */

import android.app.Activity;
import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;
import com.example.leedongjun.a3_7phonecell.R;
import com.example.leedongjun.a3_7phonecell.model.phone;

import org.w3c.dom.Text;

import java.util.List;

public class phoneAdapter extends ArrayAdapter<phone> {
    Activity activity;

    int resource;

    public  phoneAdapter(Context context, int resource, List<phone> objects) {
        super(context, resource, objects);

        activity = (Activity) context;
        this.resource = resource;
    }
    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        View itemView = convertView;

        if(itemView == null) {
            itemView = this.activity.getLayoutInflater().inflate(this.resource,null);
        }
        phone item = getItem(position);

        if(item != null) {
            TextView textView1 = (TextView) itemView.findViewById(R.id.textView1);
            textView1.setText(item.getTitle());
        }

        return itemView;
    }
}

