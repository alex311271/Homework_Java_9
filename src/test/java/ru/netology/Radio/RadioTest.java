package ru.netology.Radio;


import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class RadioTest {

    @Test
    public void volume (){
        Radio radio = new Radio(0, 100);

        Assertions.assertEquals(0, radio.minVolumeLevel);
        Assertions.assertEquals(100, radio.maxVolumeLevel);
        Assertions.assertEquals(0, radio.volumeLevel);
    }

    @Test
    public void station (){
        Radio radio = new Radio(15);
                Assertions.assertEquals(14, radio.getMaxStationNumber());
    }

    @Test
    public void StationNumber() {
        Radio statnum = new Radio(10);
        statnum.setStationNumber(2);

        Assertions.assertEquals(2, statnum.getStationNumber());
    }

    @Test
    public void overMaxStationNumber() {
        Radio overstatnum = new Radio(10);
        overstatnum.setStationNumber(11);

       Assertions.assertEquals(0, overstatnum.getStationNumber());
    }

    @Test
    public void belowMinStationNumber() {
        Radio belowminstatnum = new Radio(10);
        belowminstatnum.setStationNumber(-2);


        Assertions.assertEquals(9, belowminstatnum.getStationNumber());
    }

    @Test
    public void upStationNumber() {
        Radio upstatnum = new Radio(10);
        upstatnum.upStationNumber();
        upstatnum.upStationNumber();
        upstatnum.upStationNumber();

        Assertions.assertEquals(3, upstatnum.getStationNumber());
    }

    @Test
    public void upOverMaxStationNumber() {
        Radio changedata = new Radio(15);
        changedata.setStationNumber(14);
        changedata.upStationNumber();

        Assertions.assertEquals(0, changedata.getStationNumber());
    }

    @Test
    public void downStationNumber() {
        Radio downstatnum = new Radio(10);
        downstatnum.setStationNumber(5);
        downstatnum.downStationNumber();


        Assertions.assertEquals(4, downstatnum.getStationNumber());
    }

    @Test
    public void downBelowMinStationNumber() {
        Radio changedata = new Radio(10);
        changedata.downStationNumber();


        Assertions.assertEquals(9, changedata.getStationNumber());
    }

    @Test
    public void upVolumeLevel() {
        Radio changeVolume = new Radio(10);
        changeVolume.upVolumeLevel();
        changeVolume.upVolumeLevel();


        Assertions.assertEquals(2, changeVolume.volumeLevel);
    }

    @Test
    public void downVolumeLevel() {
        Radio changVolume = new Radio(10);
        changVolume.upVolumeLevel();
        changVolume.upVolumeLevel();
        changVolume.downVolumeLevel();


        Assertions.assertEquals(1, changVolume.volumeLevel);

    }


    @Test
    public void overMaxVolumeLevel() {
        Radio changeVolume = new Radio( 0, 5);
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



        Assertions.assertEquals(5, changeVolume.volumeLevel);
    }

    @Test
    public void belowMinVolumeLevel() {
        Radio changVolume = new Radio(0, 100);
        changVolume.downVolumeLevel();
        changVolume.downVolumeLevel();



        Assertions.assertEquals(0, changVolume.volumeLevel);

    }

}

