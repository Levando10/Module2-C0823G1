package ss7.thuchanh.animal;

public class Chicken extends Animal implements Edible {

  @Override
  public String sound() {
    return "Hello kittt!!!";
  }

  @Override
  public String howToEat() {
    return "Ăn được nha cha nội!!!";
  }
  
}
