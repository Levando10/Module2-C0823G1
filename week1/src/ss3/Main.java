package ss3;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        ArrayList<Student> cars = new ArrayList<Student>();
        Scanner scanner = new Scanner(System.in);

        int n = 1;
        while (n != 0) {
            System.out.println("----------------------------------------------------");
            System.out.println("1: Add new student ");
            System.out.println("2 :Delete Student ");
            System.out.println("3 :Show student ");
            System.out.println("0 : exit!!! ");
            System.out.print("Chọn chức năng : ");
            int choice = scanner.nextInt();
            switch (choice) {
                case 1:
                    scanner.nextLine();
                    System.out.println("Nhập tên : ");
                    String name = scanner.nextLine();

                    System.out.println("Nhập tuổi : ");
                    int age = scanner.nextInt();

                    System.out.println("Nhập chiều cao : ");
                    double height = scanner.nextDouble();
                    cars.add(new Student(name, age, height));
                    break;
                case 3:
                    System.out.println("----------------------------------------------------");
                    for (int i = 0; i < cars.size(); i++) {
                        System.out.println(cars.get(i));
                    }
                    break;
                case 0:
                    System.exit(0);

            }
        }
        ;


    }
}
