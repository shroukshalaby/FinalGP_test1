package com.example.lenovo.finalgp_test1;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import java.util.List;

/**
 * Created by LENOVO on 2018-03-06.
 */

public class CarAdapter extends RecyclerView.Adapter<CarAdapter.ViewHolder> {

    private Context context;
    private List<CarClass> list;

    public CarAdapter(Context context, List<CarClass> list) {
        this.context = context;
        this.list = list;
    }

    @Override
    public ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View v = LayoutInflater.from(context).inflate(R.layout.single_car, parent, false);
        return new ViewHolder(v);
    }

    @Override
    public void onBindViewHolder(ViewHolder holder, int position) {
        CarClass carClass = list.get(position);
        holder.textCarModel.setText(carClass.getCar_model());
        holder.textCarPrice.setText(String.valueOf(carClass.getRent_price()));
    }

    @Override
    public int getItemCount() {
        return list.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder
    {
        public TextView textCarModel, textCarPrice;
        public ViewHolder(View itemView) {
            super(itemView);
            textCarModel= itemView.findViewById(R.id.txtCarModel);
            textCarPrice= itemView.findViewById(R.id.txtCarPrice);
        }
    }
}
