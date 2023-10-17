package ss7.thuchanh.animal;

public class test {

  public static void main(String[] args) {

    Object[] objects = {new Tiger(), new Chicken(), new Apple(), new Lion(), new Orange()};

    for (int i = 0; i < objects.length; i++) {

      if (objects[i] instanceof Edible) {
        System.out.println(((Edible) objects[i]).howToEat());
      }

      if (objects[i] instanceof Animal) {

        System.out.println(((Animal) objects[i]).sound());

      }

    }

  }
}
