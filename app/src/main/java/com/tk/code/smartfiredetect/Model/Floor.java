package com.tk.code.smartfiredetect.Model;

import java.util.List;

public class Floor {
    private int floor;
    private List<Alarm> alarm;

    public Floor() {
    }

    public Floor(int floor, List<Alarm> alarm) {
        this.floor = floor;
        this.alarm = alarm;
    }

    public int getFloor() {
        return floor;
    }

    public void setFloor(int floor) {
        this.floor = floor;
    }

    public List<Alarm> getAlarm() {
        return alarm;
    }

    public void setAlarm(List<Alarm> alarm) {
        this.alarm = alarm;
    }
}
