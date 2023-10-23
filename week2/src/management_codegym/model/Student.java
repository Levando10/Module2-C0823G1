package management_codegym.model;

public class Student extends Person{
private String classes;
private int score;

  public Student(int id, String name, String dateOfBirth, String gender) {
    super(id, name, dateOfBirth, gender);
  }

  public Student(int id, String name, String dateOfBirth, String gender, String classes,
      int score) {
    super(id, name, dateOfBirth, gender);
    this.classes = classes;
    this.score = score;
  }

  public String getClasses() {
    return classes;
  }

  public void setClasses(String classes) {
    this.classes = classes;
  }

  public int getScore() {
    return score;
  }

  public void setScore(int score) {
    this.score = score;
  }

  @Override
  public String toString() {
    return  super.toString() + "{" +
        "classes='" + classes + '\'' +
        ", score=" + score +
        "} " ;
  }
}
