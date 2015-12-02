package minhd.weather.model;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.TimeZone;

import minhd.weather.R;

/**
 * Created by dekarvn on 27/11/15.
 */
public class Current {

    private String icon;
    private long time;
    private double temperature;
    private double humidity;
    private double precipichance;
    private String summary;
    private String timezone;

    public String getIcon() {
        return icon;
    }

    public void setIcon(String icon) {
        this.icon = icon;
    }

    public int getIconID() {
        return Forecast.getIconId(icon);
    }

    public long getTime() {
        return time;
    }

    public void setTime(long time) {
        this.time = time;
    }

    public String getFormattedTime() {
        SimpleDateFormat formatter = new SimpleDateFormat("h:mm a");
        formatter.setTimeZone(TimeZone.getTimeZone(getTimezone()));
        return formatter.format(new Date(getTime() * 1000));
    }

    public int getTemperature() {
        return (int) Math.round(temperature);
    }

    public void setTemperature(double temperature) {
        this.temperature = temperature;
    }

    public double getHumidity() {
        return humidity;
    }

    public void setHumidity(double humidity) {
        this.humidity = humidity;
    }

    public int getPrecipichance() {
        double precipPercentage = precipichance * 100;
        return (int) Math.round(precipichance);
    }

    public void setPrecipichance(double precipichance) {
        this.precipichance = precipichance;
    }

    public String getSummary() {
        return summary;
    }

    public void setSummary(String summary) {
        this.summary = summary;
    }

    public String getTimezone() {
        return timezone;
    }

    public void setTimezone(String timezone) {
        this.timezone = timezone;
    }
}
