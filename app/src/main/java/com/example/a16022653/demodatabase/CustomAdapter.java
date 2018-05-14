package com.example.a16022653.demodatabase;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import java.util.ArrayList;

public class CustomAdapter extends ArrayAdapter<Task> {
    private ArrayList<Task> task;
    private Context context;
    private TextView tvID;
    private TextView tvDesc;
    private TextView tvDate;

    public CustomAdapter(Context context, int resource, ArrayList<Task> objects){
        super(context, resource, objects);
        task = objects;
        this.context = context;
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        LayoutInflater inflater = (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        View rowView = inflater.inflate(R.layout.row, parent, false);

        tvID = rowView.findViewById(R.id.textView2);
        tvDesc = rowView.findViewById(R.id.textView3);
        tvDate = rowView.findViewById(R.id.textView4);

        Task currentTask = task.get(position);

        tvID.setText(currentTask.getId() + "");
        tvDesc.setText(currentTask.getDescription());
        tvDate.setText(currentTask.getDate());

        return rowView;
    }
}
