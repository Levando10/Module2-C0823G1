package ss3.thuchanh;

public class Tivi {
    int chanel = 1;
    int volume = 1;
    boolean on = false;

    Tivi() {
    }

    public int getChanel() {
        return chanel;
    }

    public void setChanel(int chanel) {
        if (on && chanel >= 1 && chanel <= 120) {
            this.chanel = chanel;
        }

    }

    public int getVolume() {
        return volume;
    }

    public void setVolume(int volume) {
        if (on && volume >= 1 && volume <= 7) {
            this.volume = volume;
        }

    }

    public boolean isOn() {
        return on;
    }


    //method
    public void turnOn() {
        on = true;
    }

    public void turnOff() {
        on = false;
    }
    public void channelDown() {
        if (on && chanel > 1)
            chanel--;
    }

    public void volumeUp() {
        if (on && volume < 7)
            volume++;
    }

    @Override
    public String toString() {
        return "Tivi{" +
                "chanel=" + chanel +
                ", volume=" + volume +
                ", on=" + on +
                '}';
    }
}
