package com.tk.code.smartfiredetect.Model;

import java.util.List;

public class Building {
    private List<Floor> floor;

    public Building() {
    }

    public Building(List<Floor> floor) {
        this.floor = floor;
    }

    public List<Floor> getFloor() {
        return floor;
    }

    public void setFloor(List<Floor> floor) {
        this.floor = floor;
    }
}
