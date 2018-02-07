package edu.wctc.timediff;

import java.util.ArrayList;

/**
 * Created by SGraf on 2/7/2018.
 */

public class time {

    private String num1;
    private String num2;

    private ArrayList parts = new ArrayList();
    private ArrayList parts1 = new ArrayList();

    public time(String num1, String num2) {
        this.num1 = num1;
        this.num2 = num2;
    }

    public String getTime() {
        return num1;
    }

    public void setTime(String num1) {
        this.num1 = num1;
    }

    public String getSecondTime() {
        return num2;
    }

    public void setSecondTime(String num2) {
        this.num2 = num2;
    }

    public int getHourOne() {
        String hours = getTime();
        String[] parts = hours.split(":");
        String hourOne = parts[0];

        int result = Integer.parseInt(hourOne);

        return result;
    }

    public int getMinuteOne() {
        String hours = getTime();
        String[] parts = hours.split(":");
        String minuteOne = parts[1];

        int result = Integer.parseInt(minuteOne);

        return result;
    }

    public int getHourTwo() {
        String hours1 = getSecondTime();
        String[] parts1 = hours1.split(":");
        String HourTwo = parts1[0];

        int result = Integer.parseInt(HourTwo);

        return result;
    }

    public int getMinuteTwo() {
        String hours1 = getSecondTime();
        String[] parts1 = hours1.split(":");
        String minuteTwo = parts1[1];

        int result = Integer.parseInt(minuteTwo);

        return result;
    }

    public int getHours() {
        return Math.abs(getHourTwo() - getHourOne());
    }

    public int getMinutes() {
        return Math.abs((getMinuteTwo() - getMinuteOne()));
    }

    public String minutes() {
        if (getMinutes() < 10) {
            return ("0" + getMinutes());
        } else {
            return ("" + getMinutes());
        }
    }

    @Override
    public String toString() {
        return "The difference: " + getHours() + ":" + minutes();
    }
}
