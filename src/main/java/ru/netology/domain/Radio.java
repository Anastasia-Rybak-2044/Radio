package ru.netology.domain;

public class Radio {
    private int currentStation;
    private int minStation;
    private int maxStation;
    private int maxStationByDefault = 10;
    private int currentVolume;
    private int minVolume;
    private int maxVolume = 100;

    public Radio(int currentStation, int maxStation, int currentVolume) {
        this.currentStation = currentStation;
        this.maxStation = maxStation;
        this.currentVolume = currentVolume;
    }

    public Radio() {
    }

    public int getCurrentStation() {
        return currentStation;
    }
    public void setCurrentStation(int currentStation)
    {
        this.currentStation = currentStation;
    }

    public int getMinStation()
    {
        return minStation;
    }
    public void setMinStation (int minStation) {
        this.minStation = minStation;
    }
    public int getMaxStation()
    {
        return maxStation;
    }
    public void setMaxStation(int maxStation) {
        if (maxStation <= 0) {
            maxStation = maxStationByDefault;
        }
        this.maxStation = maxStation;
    }
    public int getMaxStationByDefault() {
        return maxStationByDefault;
    }
    public void setMaxStationByDefault(int maxStationByDefault) {
        this.maxStationByDefault = maxStationByDefault;
    }


    public void increaseStation() {
        if (currentStation >= maxStation) {
            currentStation = minStation;
        } else currentStation = currentStation + 1;
    }
    public void decreaseStation() {
        if (currentStation <= minStation) {
            currentStation = maxStation;
        } else currentStation = currentStation - 1;
    }

    public int getCurrentVolume()
    {
        return currentVolume;
    }
    public void setCurrentVolume(int currentVolume)
    {
        this.currentVolume = currentVolume;
    }

    public int getMinVolume()
    {
        return minVolume;
    }
    public void setMinVolume(int minVolume)
    {
        this.minVolume = minVolume;
    }
    public int getMaxVolume()
    {
        return maxVolume;
    }
    public void setMaxVolume(int maxVolume)
    {
        this.maxVolume = maxVolume;
    }

    public void increaseVolume() {
        if (currentVolume >= maxVolume) {
            return;
        }
        currentVolume = currentVolume +1;
    }

    public void decreaseVolume() {
        if (currentVolume <= minVolume) {
            return;
        }
        currentVolume = currentVolume - 1;
    }

}

