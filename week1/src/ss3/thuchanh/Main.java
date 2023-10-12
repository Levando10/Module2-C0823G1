package ss3.thuchanh;

public class Main {
    public static void main(String[] args) {
        Tivi tivi = new Tivi();
        tivi.turnOff();
        tivi.setChanel(20);
        tivi.setVolume(7);
        tivi.setVolume(99);

        System.out.println(tivi.toString());

        Tivi tivi1 = new Tivi();
        tivi1.turnOn();
        tivi1.setChanel(113);
        tivi1.setVolume(6);
        tivi1.volumeUp();

        System.out.println(tivi1.toString());
    }
}
