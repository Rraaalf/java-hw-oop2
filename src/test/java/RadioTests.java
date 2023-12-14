import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvFileSource;

public class RadioTests {

    @ParameterizedTest
    @CsvFileSource(files = "src/test/resources/stations/setStations.csv")
    public void testSetStations(int setStation, int expected) {
        Radio radio = new Radio();
        radio.setCurrentStation(0);

        radio.setCurrentStation(setStation);
        int actual = radio.getCurrentStation();

        Assertions.assertEquals(expected, actual);
    }

    @ParameterizedTest
    @CsvFileSource(files = "src/test/resources/stations/setStationsFlex.csv")
    public void testSetStationsFlex(int numberOfStations, int setStation, int expected) {
        Radio radio = new Radio(numberOfStations);
        radio.setCurrentStation(0);

        radio.setCurrentStation(setStation);
        int actual = radio.getCurrentStation();

        Assertions.assertEquals(expected, actual);
    }

    @ParameterizedTest
    @CsvFileSource(files = "src/test/resources/stations/nextStation.csv")
    public void testNextStation(int currentStation, int expected) {
        Radio radio = new Radio();
        radio.setCurrentStation(currentStation);

        radio.nextStation();
        int actual = radio.getCurrentStation();

        Assertions.assertEquals(expected, actual);
    }

    @ParameterizedTest
    @CsvFileSource(files = "src/test/resources/stations/nextStationFlex.csv")
    public void testNextStationFlex(int numberOfStations, int currentStation, int expected) {
        Radio radio = new Radio(numberOfStations);
        radio.setCurrentStation(currentStation);

        radio.nextStation();
        int actual = radio.getCurrentStation();

        Assertions.assertEquals(expected, actual);
    }

    @ParameterizedTest
    @CsvFileSource(files = "src/test/resources/stations/prevStation.csv")
    public void testPrevStation(int currentStation, int expected) {
        Radio radio = new Radio();
        radio.setCurrentStation(currentStation);

        radio.prevStation();
        int actual = radio.getCurrentStation();

        Assertions.assertEquals(expected, actual);
    }

    @ParameterizedTest
    @CsvFileSource(files = "src/test/resources/stations/prevStationFlex.csv")
    public void testPrevStationFlex(int numberOfStations, int currentStation, int expected) {
        Radio radio = new Radio(numberOfStations);
        radio.setCurrentStation(currentStation);

        radio.prevStation();
        int actual = radio.getCurrentStation();

        Assertions.assertEquals(expected, actual);
    }

    @ParameterizedTest
    @CsvFileSource(files = "src/test/resources/volume/incVolume.csv")
    public void testIncVolume(int setVolume, int expected) {
        Radio radio = new Radio();
        radio.setCurrentVolume(setVolume);

        radio.incVolume();
        int actual = radio.getCurrentVolume();

        Assertions.assertEquals(expected, actual);
    }

    @ParameterizedTest
    @CsvFileSource(files = "src/test/resources/volume/decVolume.csv")
    public void testDecVolume(int setVolume, int expected) {
        Radio radio = new Radio();
        radio.setCurrentVolume(setVolume);

        radio.decVolume();
        int actual = radio.getCurrentVolume();

        Assertions.assertEquals(expected, actual);
    }
}
