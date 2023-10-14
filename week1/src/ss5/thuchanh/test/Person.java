package ss5.thuchanh.test;

public class Person {

  private String name;
  private String email;
  public static String school = "Code Gym";

  public Person() {
    school = "Code Gym";
  }

  public Person(String name, String email) {
    this.name = name;
    this.email = email;
    school = "Code Gym";

  }

  public static String getSchool() {
    return school;
  }

  public static void setSchool(String school) {
    Person.school = school;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public String getEmail() {
    return email;
  }

  public void setEmail(String email) {
    this.email = email;
  }

  @Override
  public String toString() {
    return "Person{" +
        "name = '" + name + '\'' +
        ", email ='" + email + '\'' +
        ", school ='" + school + '\'' +
        '}';
  }
}
