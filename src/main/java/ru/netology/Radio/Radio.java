package ru.netology.Radio;

public class Radio {


    int minVolumeLevel = 0;
    int maxVolumeLevel = 10;
    int volumeLevel = minVolumeLevel;

    private int minStationNumber = 0;
    private int maxStationNumber = 9;
    private int stationNumber = minStationNumber;

    public Radio(int size) {
        maxStationNumber = minStationNumber + size - 1;
    }

    public Radio(int minVolumeLevel, int maxVolumeLevel) {
        this.minVolumeLevel = minVolumeLevel;
        this.maxVolumeLevel = maxVolumeLevel;
        volumeLevel = minVolumeLevel;
    }

    public int getMinStationNumber() {
        return minStationNumber;
    }

    public int getMaxStationNumber() {
        return maxStationNumber;
    }


    public int getStationNumber() {
        return stationNumber;
    }


    public void setStationNumber(int newStationNumber) {
        if (newStationNumber > maxStationNumber) {
            newStationNumber = 0;
        }
        if (newStationNumber < minStationNumber) {
            newStationNumber = 9;
        }
        stationNumber = newStationNumber;

    }

    public void upStationNumber() {
        if (stationNumber < maxStationNumber) {
            stationNumber = stationNumber + 1;
        } else stationNumber = 0;
    }

    public void downStationNumber() {
        if (stationNumber > minStationNumber) {
            stationNumber = stationNumber - 1;
        } else stationNumber = 9;
    }

    public void upVolumeLevel() {
        if (volumeLevel < maxVolumeLevel) {
            volumeLevel++;
        } else volumeLevel = maxVolumeLevel;
    }

    public void downVolumeLevel() {
        if (volumeLevel > minVolumeLevel) {
            volumeLevel--;
        } else volumeLevel = minVolumeLevel;
    }


}

