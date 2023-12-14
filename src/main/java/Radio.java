public class Radio {
    private int numberOfStations = 10;
    private int maxStation = numberOfStations - 1;
    private int currentStation = 0;
    private int currentVolume;

    public Radio(int numberOfStations) {
        if (numberOfStations == 0) {
            numberOfStations = this.numberOfStations;
        }
        maxStation = numberOfStations - 1;
    }

    public Radio() {
    }

    public int getCurrentStation() {
        return currentStation;
    }

    public void setCurrentStation(int newCurrentStation) {
        if (newCurrentStation < 0) {
            return;
        }
        if (newCurrentStation > maxStation) {
            return;
        }
        currentStation = newCurrentStation;
    }

    public void nextStation() {
        if (currentStation < maxStation) {
            currentStation++;
        } else {
            currentStation = 0;
        }
    }

    public void prevStation() {
        if (currentStation > 0) {
            currentStation--;
        } else {
            currentStation = maxStation;
        }
    }

    public int getCurrentVolume() {
        return currentVolume;
    }

    /**
     * Для удобства параметризации автотестов
     *
     * @param newCurrentVolume должен быть в пределах от 0 до 100
     */
    public void setCurrentVolume(int newCurrentVolume) {
        currentVolume = newCurrentVolume;
    }

    public void incVolume() {
        if (currentVolume < 100) {
            currentVolume++;
        }
    }

    public void decVolume() {
        if (currentVolume > 0) {
            currentVolume--;
        }
    }
}
