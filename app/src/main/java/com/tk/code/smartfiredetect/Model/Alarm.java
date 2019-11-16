package com.tk.code.smartfiredetect.Model;

import java.util.Date;

public class Alarm {
    private Date detectedDate;
    private int installationDate;
    private boolean isFireDetect;

    public Alarm() {
    }

    public Alarm(Date detectedDate, int installationDate, boolean isFireDetect) {
        this.detectedDate = detectedDate;
        this.installationDate = installationDate;
        this.isFireDetect = isFireDetect;
    }

    public Date getDetectedDate() {
        return detectedDate;
    }

    public void setDetectedDate(Date detectedDate) {
        this.detectedDate = detectedDate;
    }

    public int getInstallationDate() {
        return installationDate;
    }

    public void setInstallationDate(int installationDate) {
        this.installationDate = installationDate;
    }

    public boolean isFireDetect() {
        return isFireDetect;
    }

    public void setFireDetect(boolean fireDetect) {
        isFireDetect = fireDetect;
    }
}
