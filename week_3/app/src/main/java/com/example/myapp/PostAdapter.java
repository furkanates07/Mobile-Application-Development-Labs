package com.example.myapp;

import android.app.Activity;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.List;

public class PostAdapter extends BaseAdapter {
    List<Post> postList;
    LayoutInflater inflater;

    public PostAdapter(Activity activity, List<Post> postList){
        this.postList = postList;
        inflater =(LayoutInflater) activity.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
    }

    @Override
    public int getCount() {
        return postList.size();
    }

    @Override
    public Object getItem(int position) {
        return postList.get(position);
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    @Override
    public View getView(int position, View view, ViewGroup viewGroup) {
        View rowView;
        rowView = inflater.inflate(R.layout.row,null);
        EditText txtMessage = (EditText) rowView.findViewById(R.id.txtMessage);
        TextView txtLocation = (TextView) rowView.findViewById(R.id.txLocation);
        ImageView imageView = (ImageView) rowView.findViewById(R.id.imageView);

        Post post = postList.get(position);
        txtMessage.setText(post.getMessage());
        imageView.setImageBitmap(post.getImage());
        if (post.getLocation() != null){
            txtLocation.setText(post.getLocation().getAltitude() + " " + post.getLocation().getLongitude());
        }
        imageView.setImageBitmap(post.getImage());
        return rowView;
    }
}
