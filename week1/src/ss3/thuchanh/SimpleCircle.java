package ss3.thuchanh;

public class SimpleCircle {
    double radius;
    SimpleCircle(){
    }
    SimpleCircle(double newRadius){
        radius = newRadius;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }
    double getArea() {
        return radius * radius * Math.PI;
    }

    /* return the perimeter of this circle */
    double getPerimeter() {
        return 2 * radius * Math.PI;
    }

    @Override
    public String toString() {
        return "SimpleCircle{" +
                "radius=" + radius +
                '}';
    }
}
