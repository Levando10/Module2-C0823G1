package ss3.thuchanh;

public class ClassAndObject {
    public static void main(String[] args) {
        SimpleCircle circle = new SimpleCircle(3.5);
        SimpleCircle circle2 = new SimpleCircle(5.8);
        SimpleCircle circle3 = new SimpleCircle(31.5);
        System.out.println(circle3.toString() + circle3.getArea());
        System.out.println(circle2.toString() + circle2.getArea());
        System.out.println(circle.toString() + circle.getArea());

    }
}
