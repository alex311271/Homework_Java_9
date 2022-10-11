package ru.netology.Radio;

public class Radio {

    int volumeLevel;

    private int stationNumber;

    public int getStationNumber() {
        return stationNumber;
    }


    public void setStationNumber(int newStationNumber) {
        if (newStationNumber > 9) {
            newStationNumber = 0;
        }
        if (newStationNumber < 0) {
            newStationNumber = 9;
        }
        stationNumber = newStationNumber;

    }

    public void upStationNumber() {
        if (stationNumber < 9) {
            stationNumber = stationNumber + 1;
        } else stationNumber = 0;
    }

    public void downStationNumber() {
        if (stationNumber > 0) {
            stationNumber = stationNumber - 1;
        } else stationNumber = 9;
    }

    public void upVolumeLevel() {
        if (volumeLevel < 10) {
            volumeLevel++;
        } else volumeLevel = 10;
    }

    public void downVolumeLevel() {
        if (volumeLevel > 0) {
            volumeLevel--;
        } else volumeLevel = 0;
    }


}

