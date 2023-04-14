package Task1.eight;

import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

public class Time {
    private int hour;
    private int minute;
    private int second;

    public Time(int hour, int minute, int second) {
        this.hour = hour;
        this.minute = minute;
        this.second = second;
    }

    public int getHour() {
        return hour;
    }

    public void setHour(int hour) {
        this.hour = hour;
    }

    public int getMinute() {
        return minute;
    }

    public void setMinute(int minute) {
        this.minute = minute;
    }

    public int getSecond() {
        return second;
    }

    public void setSecond(int second) {
        this.second = second;
    }

    public void setTime(int hour, int minute, int second) {
        this.hour = hour;
        this.minute = minute;
        this.second = second;
    }

    @Override
    public String toString() {
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("hh:mm:ss");
        return formatter.format(LocalTime.of(hour, minute, second));
    }

    public String nextSecond() {
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("hh:mm:ss");
        return formatter.format(LocalTime.of(hour, minute, second+1));
    }

    public String previousSecond() {
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("hh:mm:ss");
        return formatter.format(LocalTime.of(hour, minute, second-1));
    }

}
