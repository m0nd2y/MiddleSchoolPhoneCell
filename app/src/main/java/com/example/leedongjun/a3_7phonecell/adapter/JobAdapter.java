package com.example.leedongjun.a3_7phonecell.adapter;

import android.app.Activity;
import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;
import com.example.leedongjun.a3_7phonecell.R;
import com.example.leedongjun.a3_7phonecell.model.Job;

import org.w3c.dom.Text;

import java.util.List;

public class JobAdapter extends ArrayAdapter<Job> {
    Activity activity;

    int resource;

    public JobAdapter(Context context, int resource, List<Job> objects) {
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
        Job item = getItem(position);

        if(item != null) {
            ImageView imageView = (ImageView) itemView.findViewById(R.id.imageView);
            TextView textView1 = (TextView) itemView.findViewById(R.id.textView1);
            TextView textView2 = (TextView) itemView.findViewById(R.id.textView2);

            imageView.setImageResource(item.getImage());
            textView1.setText(item.getTitle());
            textView2.setText(item.getDescription());
        }

        return itemView;
    }


}
