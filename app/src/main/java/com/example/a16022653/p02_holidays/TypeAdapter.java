package com.example.a16022653.p02_holidays;

import android.content.Context;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;
import java.util.ArrayList;

public class TypeAdapter extends ArrayAdapter {
    private ArrayList<Type> type;
    private Context context;
    private TextView tv1;
    private ImageView ivP;

    public TypeAdapter(Context context, int resource, ArrayList<Type> objects){
        super(context,resource,objects);

        type = objects;
        this.context = context;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        LayoutInflater inflater = (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        View rowVIew = inflater.inflate(R.layout.row, parent, false);
        tv1 = (TextView) rowVIew.findViewById(R.id.typeName);
        ivP = (ImageView) rowVIew.findViewById(R.id.imageView);
        Type currentType = type.get(position);
        tv1.setText(currentType.getName());
        Log.d("problem", "getView: "+currentType.getImage());
        if (currentType.getImage().equals("nye")) {
            ivP.setImageResource(R.drawable.firework);
        } else if (currentType.getImage().equals("labor")){
            ivP.setImageResource(R.drawable.holidays);
        }else if (currentType.getImage().equals("cny")){
            ivP.setImageResource(R.drawable.lantern);
        }else if (currentType.getImage().equals("friday")){
            ivP.setImageResource(R.drawable.cross);
        }
        return rowVIew;
    }
}


