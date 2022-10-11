package ru.netology.Radio;


import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class RadioTest {

    @Test
    public void StationNumber() {
        Radio statnum = new Radio();
        statnum.setStationNumber(2);

        int expected = 2;
        int actual = statnum.getStationNumber();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void overMaxStationNumber() {
        Radio overstatnum = new Radio();
        overstatnum.setStationNumber(11);

        int expected = 0;
        int actual = overstatnum.getStationNumber();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void belowMinStationNumber() {
        Radio belowminstatnum = new Radio();
        belowminstatnum.setStationNumber(-2);

        int expected = 9;
        int actual = belowminstatnum.getStationNumber();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void upStationNumber() {
        Radio upstatnum = new Radio();
        upstatnum.upStationNumber();
        upstatnum.upStationNumber();
        upstatnum.upStationNumber();

        int expected = 3;
        int actual = upstatnum.getStationNumber();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void upOverMaxStationNumber() {
        Radio changedata = new Radio();
        changedata.setStationNumber(9);
        changedata.upStationNumber();

        int expected = 0;
        int actual = changedata.getStationNumber();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void downStationNumber() {
        Radio downstatnum = new Radio();
        downstatnum.setStationNumber(5);
        downstatnum.downStationNumber();

        int expected = 4;
        int actual = downstatnum.getStationNumber();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void downBelowMinStationNumber() {
        Radio changedata = new Radio();
        changedata.downStationNumber();

        int expected = 9;
        int actual = changedata.getStationNumber();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void upVolumeLevel() {
        Radio changeVolume = new Radio();
        changeVolume.upVolumeLevel();
        changeVolume.upVolumeLevel();

        int expected = 2;
        int actual = changeVolume.volumeLevel;

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void downVolumeLevel() {
        Radio changVolume = new Radio();
        changVolume.upVolumeLevel();
        changVolume.upVolumeLevel();
        changVolume.downVolumeLevel();

        int expected = 1;
        int actual = changVolume.volumeLevel;

        Assertions.assertEquals(expected, actual);

    }


    @Test
    public void overMaxVolumeLevel() {
        Radio changeVolume = new Radio();
        changeVolume.upVolumeLevel();
        changeVolume.upVolumeLevel();
        changeVolume.upVolumeLevel();
        changeVolume.upVolumeLevel();
        changeVolume.upVolumeLevel();
        changeVolume.upVolumeLevel();
        changeVolume.upVolumeLevel();
        changeVolume.upVolumeLevel();
        changeVolume.upVolumeLevel();
        changeVolume.upVolumeLevel();
        changeVolume.upVolumeLevel();

        int expected = 10;
        int actual = changeVolume.volumeLevel;

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void belowMinVolumeLevel() {
        Radio changVolume = new Radio();
        changVolume.downVolumeLevel();
        changVolume.downVolumeLevel();

        int expected = 0;
        int actual = changVolume.volumeLevel;

        Assertions.assertEquals(expected, actual);

    }

}

