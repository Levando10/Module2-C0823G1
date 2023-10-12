package ss3.quadraticequation;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a: ");
        double numA = scanner.nextDouble();
        System.out.print("Enter b: ");
        double numB = scanner.nextDouble();
        System.out.print("Enter : ");
        double numC = scanner.nextDouble();
        QuadraticEquation quadraticEquation = new QuadraticEquation(numA,numB,numC);

        double delta = quadraticEquation.getDiscriminant();
        double root1 = quadraticEquation.getRoot1();
        double root2 = quadraticEquation.getRoot2();

        if (delta >0){
            System.out.println("The equation has two roots " + root1 + " and " + root2);
        } else if (delta == 0) {
            System.out.println("The equaltion has one root " + root1);
        } else {
            System.out.println("The equation has no real roots!!!");
        }
    }

}
