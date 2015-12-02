package minhd.weather.adapters;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import minhd.weather.R;
import minhd.weather.model.Hour;

/**
 * Created by dekarvn on 30/11/15.
 */
public class HourAdapter extends RecyclerView.Adapter<HourAdapter.HourViewHolder{

    @Override
    public HourViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        return null;
    }

    @Override
    public void onBindViewHolder(HourViewHolder holder, int position) {

    }

    @Override
    public int getItemCount() {
        return 0;
    }

    public class HourViewHolder extends RecyclerView.ViewHolder {

        public TextView timeLabel;
        public TextView summaryLabel;
        public TextView temperatureLabel;
        public ImageView iconImageView;

        public HourViewHolder(View itemView) {
            super(itemView);
            timeLabel = (TextView) itemView.findViewById(R.id.timeLabel);
            summaryLabel = (TextView) itemView.findViewById(R.id.summaryLabel);
            temperatureLabel = (TextView) itemView.findViewById(R.id.temperatureLabel);
            iconImageView = (ImageView) itemView.findViewById(R.id.iconImageView);
        }
    }



}
