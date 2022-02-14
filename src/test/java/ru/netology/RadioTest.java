package ru.netology;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class RadioTest {

    Radio radio = new Radio();

    @Test
    void getNumberChanel() {
        int expected = 9;
        int actual = radio.getNumberChanel();
        assertEquals(expected, actual);
    }

    @Test
    void getCurrentChanel() {
        radio.setCurrentChanel(5);
        int expected = 5;
        int actual = radio.getCurrentChanel();

        assertEquals(expected, actual);
    }

    @Test
    void setCurrentChanel1() {
        radio.setCurrentChanel(8);
        int expected = 8;
        int actual = radio.getCurrentChanel();

        assertEquals(expected, actual);
    }

    @Test
    void setCurrentChanel2() {
        radio.setCurrentChanel(9);
        int expected = 9;
        int actual = radio.getCurrentChanel();

        assertEquals(expected, actual);
    }

    @Test
    void setCurrentChanel3() {
        radio.setCurrentChanel(10);
        int expected = 0;
        int actual = radio.getCurrentChanel();

        assertEquals(expected, actual);
    }

    @Test
    void setCurrentChanel4() {
        radio.setCurrentChanel(-1);
        int expected = 9;
        int actual = radio.getCurrentChanel();

        assertEquals(expected, actual);
    }

    @Test
    void setCurrentChanel5() {
        radio.setCurrentChanel(0);
        int expected = 0;
        int actual = radio.getCurrentChanel();

        assertEquals(expected, actual);
    }

    @Test
    void setCurrentChanel6() {
        radio.setCurrentChanel(1);
        int expected = 1;
        int actual = radio.getCurrentChanel();

        assertEquals(expected, actual);
    }

    @Test
    void next1() {
        radio.setCurrentChanel(0);
        radio.next();
        int expected = 1;
        int actual = radio.getCurrentChanel();

        assertEquals(expected, actual);
    }

    @Test
    void next2() {
        radio.setCurrentChanel(1);
        radio.next();
        int expected = 2;
        int actual = radio.getCurrentChanel();

        assertEquals(expected, actual);
    }

    @Test
    void next3() {
        radio.setCurrentChanel(8);
        radio.next();
        int expected = 9;
        int actual = radio.getCurrentChanel();

        assertEquals(expected, actual);
    }

    @Test
    void next4() {
        radio.setCurrentChanel(9);
        radio.next();
        int expected = 0;
        int actual = radio.getCurrentChanel();

        assertEquals(expected, actual);
    }

    @Test
    void prev1() {
        radio.setCurrentChanel(9);
        radio.prev();
        int expected = 8;
        int actual = radio.getCurrentChanel();

        assertEquals(expected, actual);
    }

    @Test
    void pre2() {
        radio.setCurrentChanel(6);
        radio.prev();
        int expected = 5;
        int actual = radio.getCurrentChanel();

        assertEquals(expected, actual);
    }

    @Test
    void prev3() {
        radio.setCurrentChanel(1);
        radio.prev();
        int expected = 0;
        int actual = radio.getCurrentChanel();

        assertEquals(expected, actual);
    }

    @Test
    void prev4() {
        radio.setCurrentChanel(0);
        radio.prev();
        int expected = 9;
        int actual = radio.getCurrentChanel();

        assertEquals(expected, actual);
    }

    @Test
    void getCurrentVolume() {
        radio.setCurrentVolume(5);
        int expected = 5;
        int actual = radio.getCurrentVolume();

        assertEquals(expected, actual);

    }

    @Test
    void setCurrentVolume1() {
        radio.setCurrentVolume(-1);
        int expected = 0;
        int actual = radio.getCurrentVolume();

        assertEquals(expected, actual);
    }

    @Test
    void setCurrentVolume2() {
        radio.setCurrentVolume(0);
        int expected = 0;
        int actual = radio.getCurrentVolume();

        assertEquals(expected, actual);
    }

    @Test
    void setCurrentVolume3() {
        radio.setCurrentVolume(1);
        int expected = 1;
        int actual = radio.getCurrentVolume();

        assertEquals(expected, actual);
    }

    @Test
    void setCurrentVolume4() {
        radio.setCurrentVolume(9);
        int expected = 9;
        int actual = radio.getCurrentVolume();

        assertEquals(expected, actual);
    }

    @Test
    void setCurrentVolume5() {
        radio.setCurrentVolume(10);
        int expected = 10;
        int actual = radio.getCurrentVolume();

        assertEquals(expected, actual);
    }

    @Test
    void setCurrentVolume6() {
        radio.setCurrentVolume(11);
        int expected = 10;
        int actual = radio.getCurrentVolume();

        assertEquals(expected, actual);
    }

    @Test
    public void up1() {
        radio.setCurrentVolume(0);
        int expected = 0;
        int actual = radio.getCurrentVolume();
        radio.up();

        assertEquals(expected, actual);
    }

    @Test
    public void up2() {
        radio.setCurrentVolume(1);
        int expected = 1;
        int actual = radio.getCurrentVolume();
        radio.up();

        assertEquals(expected, actual);
    }

    @Test
    public void up3() {
        radio.setCurrentVolume(9);
        int expected = 9;
        int actual = radio.getCurrentVolume();
        radio.up();

        assertEquals(expected, actual);
    }

    @Test
    public void up4() {
        radio.setCurrentVolume(11);
        int expected = 10;
        int actual = radio.getCurrentVolume();
        radio.up();

        assertEquals(expected, actual);
    }


    @Test
    public void down1() {
        radio.setCurrentVolume(10);
        int expected = 10;
        int actual = radio.getCurrentVolume();
        radio.down();

        assertEquals(expected, actual);
    }

    @Test
    public void down2() {
        radio.setCurrentVolume(1);
        int expected = 1;
        int actual = radio.getCurrentVolume();
        radio.down();

        assertEquals(expected, actual);
    }

    @Test
    public void down3() {
        radio.setCurrentVolume(0);
        int expected = 0;
        int actual = radio.getCurrentVolume();
        radio.down();

        assertEquals(expected, actual);
    }


}
