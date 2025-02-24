package org.example.b3_5;
import java.util.Arrays;

public class MyDate {
    private int year;
    private int month;
    private int day;

    public static final String[] MONTHS = {
            "Jan", "Feb", "Mar", "Apr", "May", "Jun",
            "Jul", "Aug", "Sep", "Oct", "Nov", "Dec"
    };

    public static final String[] DAYS = {
            "Sunday", "Monday", "Tuesday", "Wednesday",
            "Thursday", "Friday", "Saturday"
    };

    public static final int[] DAYS_IN_MONTHS = {
            31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31
    };

    public MyDate(int year, int month, int day) {
        setDate(year, month, day);
    }

    public void setDate(int year, int month, int day) {
        if (!isValidDate(year, month, day)) {
            throw new IllegalArgumentException("Invalid year, month, or day!");
        }
        this.year = year;
        this.month = month;
        this.day = day;
    }

    public static boolean isLeapYear(int year) {
        return (year % 4 == 0 && year % 100 != 0) || (year % 400 == 0);
    }

    public static boolean isValidDate(int year, int month, int day) {
        if (year < 1 || year > 9999 || month < 1 || month > 12) {
            return false;
        }
        int maxDay = DAYS_IN_MONTHS[month - 1];
        if (month == 2 && isLeapYear(year)) {
            maxDay = 29;
        }
        return day >= 1 && day <= maxDay;
    }

    public static int getDayOfWeek(int year, int month, int day) {
        if (!isValidDate(year, month, day)) {
            throw new IllegalArgumentException("Invalid date!");
        }
        int y = (month < 3) ? year - 1 : year;
        int m = (month < 3) ? month + 12 : month;
        int d = day;
        int k = y % 100;
        int j = y / 100;
        int dayOfWeek = (d + (13 * (m + 1)) / 5 + k + (k / 4) + (j / 4) - 2 * j) % 7;
        return (dayOfWeek + 7) % 7;
    }

    public int getYear() { return year; }
    public int getMonth() { return month; }
    public int getDay() { return day; }

    public void setYear(int year) {
        if (year < 1 || year > 9999) {
            throw new IllegalArgumentException("Invalid year!");
        }
        this.year = year;
    }

    public void setMonth(int month) {
        if (month < 1 || month > 12) {
            throw new IllegalArgumentException("Invalid month!");
        }
        this.month = month;
    }

    public void setDay(int day) {
        if (!isValidDate(this.year, this.month, day)) {
            throw new IllegalArgumentException("Invalid day!");
        }
        this.day = day;
    }

    public String toString() {
        return DAYS[getDayOfWeek(year, month, day)] + ", " + day + " " + MONTHS[month - 1] + " " + year;
    }

    public MyDate nextDay() {
        if (isValidDate(year, month, day + 1)) {
            day++;
        } else if (isValidDate(year, month + 1, 1)) {
            month++;
            day = 1;
        } else if (isValidDate(year + 1, 1, 1)) {
            year++;
            month = 1;
            day = 1;
        } else {
            throw new IllegalStateException("Year out of range!");
        }
        return this;
    }

    public MyDate nextMonth() {
        if (month == 12) {
            year++;
            month = 1;
        } else {
            month++;
        }
        if (!isValidDate(year, month, day)) {
            day = DAYS_IN_MONTHS[month - 1];
        }
        return this;
    }

    public MyDate nextYear() {
        if (year + 1 > 9999) {
            throw new IllegalStateException("Year out of range!");
        }
        year++;
        if (!isValidDate(year, month, day)) {
            day = isLeapYear(year) && month == 2 ? 29 : DAYS_IN_MONTHS[month - 1];
        }
        return this;
    }

    public MyDate previousDay() {
        if (isValidDate(year, month, day - 1)) {
            day--;
        } else if (isValidDate(year, month - 1, 31)) {
            month--;
            day = DAYS_IN_MONTHS[month - 1];
            if (month == 2 && isLeapYear(year)) {
                day = 29;
            }
        } else if (isValidDate(year - 1, 12, 31)) {
            year--;
            month = 12;
            day = 31;
        } else {
            throw new IllegalStateException("Year out of range!");
        }
        return this;
    }

    public MyDate previousMonth() {
        if (month == 1) {
            year--;
            month = 12;
        } else {
            month--;
        }
        if (!isValidDate(year, month, day)) {
            day = DAYS_IN_MONTHS[month - 1];
        }
        return this;
    }

    public MyDate previousYear() {
        if (year - 1 < 1) {
            throw new IllegalStateException("Year out of range!");
        }
        year--;
        if (!isValidDate(year, month, day)) {
            day = isLeapYear(year) && month == 2 ? 29 : DAYS_IN_MONTHS[month - 1];
        }
        return this;
    }
}
