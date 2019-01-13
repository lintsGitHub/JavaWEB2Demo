package org.lint.entity;

import java.util.Date;

public class BookLog {
    private int logID;
    private String logMag;
    private Date logDate;

    public BookLog(String logMag) {
        this.logMag = logMag;
    }

    public BookLog() {
    }

    public int getLogID() {
        return logID;
    }

    public void setLogID(int logID) {
        this.logID = logID;
    }

    public String getLogMag() {
        return logMag;
    }

    public void setLogMag(String logMag) {
        this.logMag = logMag;
    }

    public Date getLogDate() {
        return logDate;
    }

    public void setLogDate(Date logDate) {
        this.logDate = logDate;
    }
}
