package ss3.fan;

public class Main {

  public static void main(String[] args) {

    Fan fan1 = new Fan();
    Fan fan2 = new Fan();

    fan1.turnOn();
    fan1.setSpeed(3);
    fan1.setRadius(15);
    fan1.setColor("yellow");
    System.out.println(fan1.toString());

    fan2.turnOff();
    fan2.setSpeed(2);
    fan2.setRadius(10);
    System.out.println(fan2.toString());

  }
}
