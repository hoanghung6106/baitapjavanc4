package org.example.b3_4;
public class MyTime {
    private int hour;
    private int minute;
    private int second;

    public MyTime(int hour, int minute, int second) {
        setTime(hour, minute, second);
    }

    public void setTime(int hour, int minute, int second) {
        if (!isValidTime(hour, minute, second)) {
            throw new IllegalArgumentException("Giờ, phút hoặc giây không hợp lệ!");
        }
        this.hour = hour;
        this.minute = minute;
        this.second = second;
    }

    private boolean isValidTime(int hour, int minute, int second) {
        return hour >= 0 && hour < 24 && minute >= 0 && minute < 60 && second >= 0 && second < 60;
    }

    public int getHour() {
        return hour;
    }

    public int getMinute() {
        return minute;
    }

    public int getSecond() {
        return second;
    }

    public void setHour(int hour) {
        if (hour < 0 || hour >= 24) throw new IllegalArgumentException("Giờ không hợp lệ!");
        this.hour = hour;
    }

    public void setMinute(int minute) {
        if (minute < 0 || minute >= 60) throw new IllegalArgumentException("Phút không hợp lệ!");
        this.minute = minute;
    }

    public void setSecond(int second) {
        if (second < 0 || second >= 60) throw new IllegalArgumentException("Giây không hợp lệ!");
        this.second = second;
    }

    public MyTime nextSecond() {
        second++;
        if (second == 60) {
            second = 0;
            minute++;
            if (minute == 60) {
                minute = 0;
                hour++;
                if (hour == 24) {
                    hour = 0;
                }
            }
        }
        return this;
    }

    public MyTime previousSecond() {
        second--;
        if (second == -1) {
            second = 59;
            minute--;
            if (minute == -1) {
                minute = 59;
                hour--;
                if (hour == -1) {
                    hour = 23;
                }
            }
        }
        return this;
    }

    public MyTime nextMinute() {
        minute++;
        if (minute == 60) {
            minute = 0;
            hour++;
            if (hour == 24) {
                hour = 0;
            }
        }
        return this;
    }

    public MyTime previousMinute() {
        minute--;
        if (minute == -1) {
            minute = 59;
            hour--;
            if (hour == -1) {
                hour = 23;
            }
        }
        return this;
    }

    public MyTime nextHour() {
        hour = (hour + 1) % 24;
        return this;
    }

    public MyTime previousHour() {
        hour = (hour == 0) ? 23 : hour - 1;
        return this;
    }

    public String toString() {
        return String.format("%02d:%02d:%02d", hour, minute, second);
    }
}
