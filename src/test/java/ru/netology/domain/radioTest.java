
package ru.netology.domain;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class RadioTest {
    @Test
    public void SetCurrentStation() {
        Radio radio = new Radio(4, 10, 50);
        int expected = 4;
        assertEquals(expected, radio.getCurrentStation());
    }
    @Test
    public void SetMinStation() {
        Radio radio = new Radio(4,15, 50);
        int expected = 0;
        assertEquals(expected, radio.getMinStation());
    }
    @Test
    public void SetMaxStation() {
        Radio radio = new Radio(4,15, 50);
        int expected = 15;
        assertEquals(expected, radio.getMaxStation());
    }
    @Test
    public void SetMaxStationByDefault() {
        Radio radio2 = new Radio();
        int expected = 10;
        assertEquals(expected, radio2.getMaxStationByDefault());
    }
    @Test
    public void increaseStation() {
        Radio radio = new Radio(3, 26, 50);
        radio.increaseStation();
        int expected = 4;
        assertEquals(expected, radio.getCurrentStation());
        }
    @Test
    public void decreaseStation() {
        Radio radio = new Radio(5, 9,50);
        radio.decreaseStation();
        int expected = 4;
        assertEquals(expected, radio.getCurrentStation());
    }
    @Test
    public void increaseStationOverMax() {
        Radio radio = new Radio(15,15,50);
        radio.increaseStation();
        int expected = 0;
        assertEquals(expected, radio.getCurrentStation());
    }
    @Test
    public void decreaseStationBelowMin() {
        Radio radio = new Radio(0,16,50);
        radio.decreaseStation();
        int expected = 16;
        assertEquals(expected, radio.getCurrentStation());
    }
    @Test
    public void SetCurrentVolume() {
        Radio radio = new Radio(4, 9, 50);
        int expected = 50;
        assertEquals(expected, radio.getCurrentVolume());
    }
    @Test
    public void IncreaseVolume() {
        Radio radio = new Radio(4,9, 48);
        radio.increaseVolume();
        int expected = 49;
        assertEquals(expected, radio.getCurrentVolume());
    }
    @Test
    public void DecreaseVolume() {
        Radio radio = new Radio(5, 9,52);
        radio.decreaseVolume();
        int expected = 51;
        assertEquals(expected, radio.getCurrentVolume());
    }
    @Test
    public void IncreaseVolumeOverMax() {
        Radio radio = new Radio(5, 9, 100);
        radio.increaseVolume();
        int expected = 100;
        assertEquals(expected, radio.getCurrentVolume());
    }
    @Test
    public void DecreaseVolumeBelowMin() {
        Radio radio = new Radio(5,9,0);
        radio.decreaseVolume();
        int expected = 0;
        assertEquals(expected, radio.getCurrentVolume());
    }

    @Test
    void getCurrentStation() {
    }

    @Test
    void getMinStation() {
    }

    @Test
    void getMaxStation() {
    }

    @Test
    void getCurrentVolume() {
    }

    @Test
    void getMinVolume() {
    }

    @Test
    void setMinVolume() {
    }

    @Test
    void getMaxVolume() {
    }

    @Test
    void setMaxVolume() {
    }
}

