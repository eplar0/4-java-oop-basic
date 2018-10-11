package com.example.task02;

public class TimeSpan {
    private int hours;
    private int minutes;
    private int seconds;

    TimeSpan() {
        hours = 0;
        minutes = 0;
        seconds = 0;
    }

    TimeSpan(int hours, int minutes, int seconds) {
        this.hours = hours;
        this.minutes = minutes;
        this.seconds = seconds;
    }

    public int getHours() {
        return this.hours;
    }

    public void setHours(int hours) {
        this.hours = hours;
    }

    public int getMinutes() {
        return this.minutes;
    }

    public void setMinutes(int minutes) {
        this.minutes = minutes;
    }

    public int getSeconds() {
        return this.seconds;
    }

    public void setSeconds(int seconds) {
        this.seconds = seconds;
    }

    void add(TimeSpan time) {
        this.hours += time.hours;
        this.minutes += time.minutes;
        if (this.minutes >= 60) {
            this.minutes -= 60;
            this.hours += 1;
        }
        this.seconds += time.seconds;
        if (this.seconds >= 60) {
            this.seconds -= 60;
            this.minutes += 1;
            if (this.minutes >= 60) {
                this.minutes -= 60;
                this.hours += 1;
            }
        }
    }

    void subtract(TimeSpan time) {
        if ((hours > time.hours) || (hours == time.hours && minutes > time.minutes) ||
                (hours == time.hours && minutes == time.minutes && seconds > time.seconds)) {
            this.hours = 0;
            this.minutes = 0;
            this.seconds = 0;
        }
        else {
            this.hours -= time.hours;
            this.minutes -= time.minutes;
            if (this.minutes < 0) {
                this.minutes += 60;
                this.hours -= 1;
            }
            this.seconds -= time.seconds;
            if (this.seconds < 0) {
                this.seconds += 60;
                this.minutes -= 1;
                if (this.minutes < 0) {
                    this.minutes += 60;
                    this.hours -= 1;
                }
            }
        }
    }

    public String toString() {
        return "Hours: " + this.hours + "; minutes: " + this.minutes + "; seconds: " + this.seconds;
    }

}
