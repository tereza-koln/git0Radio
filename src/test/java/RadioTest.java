import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class RadioTest {


    @Test

    public void testCount() {
        Radio radio = new Radio(10);

        radio.setCurrentStation(5);

        int actual = radio.getCurrentStation();
        int expected = 5;
        Assertions.assertEquals(expected, actual);
    }

    @Test

    public void test() {
        Radio radio = new Radio();

        radio.setCurrentStation(6);

        int actual = radio.getCurrentStation();
        int expected = 6;
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void testUnderStation() {
        Radio radio = new Radio();

        radio.setCurrentStation(-2);

        int actual = radio.getCurrentStation();
        int expected = 0;
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void testUpperStation() {
        Radio radio = new Radio();

        radio.setCurrentStation(11);

        int actual = radio.getCurrentStation();
        int expected = 0;
        Assertions.assertEquals(expected, actual);
    }

    @Test

    public void testVolume() {
        Radio radio = new Radio();

        radio.setCurrentVolume(15);

        int actual = radio.getCurrentVolume();
        int expected = 15;
        Assertions.assertEquals(expected, actual);
    }

    @Test

    public void testUnderVolume() {
        Radio radio = new Radio();

        radio.setCurrentVolume(-1);

        int actual = radio.getCurrentVolume();
        int expected = 0;
        Assertions.assertEquals(expected, actual);
    }

    @Test

    public void testUpperVolume() {
        Radio radio = new Radio();

        radio.setCurrentVolume(103);

        int actual = radio.getCurrentVolume();
        int expected = 0;
        Assertions.assertEquals(expected, actual);
    }

    @Test

    public void testNext() {
        Radio radio = new Radio();

        radio.setCurrentStation(8);
        radio.next();

        int actual = radio.getCurrentStation();
        int expected = 9;
        Assertions.assertEquals(expected, actual);
    }

    @Test

    public void testNext2() {
        Radio radio = new Radio();

        radio.setCurrentStation(9);
        radio.next();

        int actual = radio.getCurrentStation();
        int expected = 1;
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void testPrev() {
        Radio radio = new Radio();

        radio.setCurrentStation(1);
        radio.prev();

        int actual = radio.getCurrentStation();
        int expected = 9;
        Assertions.assertEquals(expected, actual);

    }

    @Test
    public void testPrev2() {
        Radio radio = new Radio();

        radio.setCurrentStation(5);
        radio.prev();

        int actual = radio.getCurrentStation();
        int expected = 4;
        Assertions.assertEquals(expected, actual);

    }

    @Test
    public void increaseVolume() {
        Radio radio = new Radio();

        radio.setCurrentVolume(100);
        radio.increaseVolume();

        int actual = radio.getCurrentVolume();
        int expected = 100;
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void increaseVolume2() {
        Radio radio = new Radio();

        radio.setCurrentVolume(35);
        radio.increaseVolume();

        int actual = radio.getCurrentVolume();
        int expected = 36;
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void decreaseVolume() {
        Radio radio = new Radio();

        radio.setCurrentVolume(0);
        radio.decreaseVolume();

        int actual = radio.getCurrentVolume();
        int expected = 0;
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void decreaseVolume2() {
        Radio radio = new Radio();

        radio.setCurrentVolume(10);
        radio.decreaseVolume();

        int actual = radio.getCurrentVolume();
        int expected = 9;
        Assertions.assertEquals(expected, actual);
    }

}
