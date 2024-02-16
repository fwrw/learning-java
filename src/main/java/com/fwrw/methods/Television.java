package com.fwrw.methods;

public class Television {
  public boolean on = false;
  int channel = 1;
  int volume = 20;

  public void turnOn() {
    if (!on) {
      on = !on;
    }
  }

  public void turnOff() {
    if (on) {
      on = !on;
    }
  }
  
  public String currentCH() {
    return String.valueOf(channel);
  }

  public void prevCH() {
    if (channel > 1) {
      channel--;
    }
  }

  public void nextCH() {
    if (channel < 10) {
      channel++;
    }
  }
  
  public String currentVol() {
    return String.valueOf(volume);
  }

  public void decreaseVol() {
    if (volume > 0) {
      volume--;
    }
  }

  public void increaseVol() {
    if (volume < 100) {
      volume++;
    }
  }
}
