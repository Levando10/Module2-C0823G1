package ss7.thuchanh.animalvainterface;

public class Chicken extends Animal implements Edible {

  @Override
  public String makeSound() {
    return "Chíp chíp chip chip !!!";
  }

  @Override
  public String howToEat() {
    return "Chicken : Thit ga an ngon lam";
  }
}
