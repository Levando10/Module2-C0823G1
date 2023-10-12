package ss3.fan;

public class Fan {
    private int speed = 1;
    private boolean on;
    private String color = "Blue";
    private double radius = 5;

    public Fan() {
        this.speed = speed;
        this.on = false;
        this.color = color;
        this.radius = radius;
    }


    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        if (on && speed > 0 && speed <= 3) {
            this.speed = speed;
        }

    }

    public boolean isOn() {
        return on;
    }

    public void setOn(boolean on) {
        this.on = on;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        if (on) {
            this.color = color;
        }

    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        if (on) {
            this.radius = radius;
        }

    }

    // turn on and turn Off
    public void turnOn() {
        this.on = true;
    }

    public void turnOff() {
        this.on = false;
    }

    //set Speed


    @Override
    public String toString() {
        if (on) {
            return "Fan{" + "fan is on " +
                    " speed= " + speed +
                    ", on= " + on +
                    ", color='" + color + '\'' +
                    ", radius=" + radius +
                    '}';
        } else {
            return "fan is off";
        }

    }
}
