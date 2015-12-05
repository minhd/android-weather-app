package minhd.weather.adapters;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.text.Layout;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import minhd.weather.R;
import minhd.weather.model.Hour;


public class HourAdapter extends RecyclerView.Adapter<HourAdapter.HourViewHolder>{

    private Hour[] hours;
    private Context context;

    public HourAdapter(Context context, Hour[] hours) {
        this.context = context;
        this.hours = hours;
    }

    @Override
    public HourViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.hourly_list_item, parent, false);
        return new HourViewHolder(view);
    }

    @Override
    public void onBindViewHolder(HourViewHolder holder, int position) {
        holder.bindHour(hours[position]);
    }

    @Override
    public int getItemCount() {
        return hours.length;
    }


    public class HourViewHolder extends RecyclerView.ViewHolder implements View.OnClickListener{

        public TextView timeLabel;
        public TextView summaryLabel;
        public TextView temperatureLabel;
        public ImageView iconImageView;
        private Context context;


        public HourViewHolder(View itemView) {
            super(itemView);
            timeLabel = (TextView) itemView.findViewById(R.id.timeLabel);
            summaryLabel = (TextView) itemView.findViewById(R.id.summaryLabel);
            temperatureLabel = (TextView) itemView.findViewById(R.id.temperatureLabel);
            iconImageView = (ImageView) itemView.findViewById(R.id.iconImageView);

            itemView.setOnClickListener(this);
        }

        public void bindHour(Hour hour) {
            timeLabel.setText(hour.getHour());
            summaryLabel.setText(hour.getSummary());
            temperatureLabel.setText(hour.getTemperature() + "");
            iconImageView.setImageResource(hour.getIconId());
        }

        @Override
        public void onClick(View v) {
            String time = (String) timeLabel.getText();
            String temperature = (String) temperatureLabel.getText();
            String summary = (String) summaryLabel.getText();
            String message = String.format("At %s it will be %s and %s", time, temperature, summary);
            Toast.makeText(context, message, Toast.LENGTH_LONG).show();
        }
    }


}
