package ss7.thuchanh.animalvainterface;


public class test {

  public static void main(String[] args) {
    Object[] objects = {new Tiger(), new Chicken(), new Orange(), new Apple()};

    for (int i = 0; i < objects.length; i++) {

      if (objects[i] instanceof Edible) {
        System.out.println(((Edible) objects[i]).howToEat());
      }
      if (objects[i] instanceof Animal) {
        System.out.println(((Animal) objects[i]).makeSound());
      }
    }

  }
}
