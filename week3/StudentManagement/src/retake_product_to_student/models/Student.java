package retake_product_to_student.models;

public class Student implements Comparable<Student>{

  private Integer id;
  private String name;
  private Integer score;

  public Student() {
  }

  public Student(Integer id, String name, Integer score) {
    this.id = id;
    this.name = name;
    this.score = score;
  }

  public Student(String name, Integer score) {
    this.name = name;
    this.score = score;
  }

  public Integer getId() {
    return id;
  }

  public void setId(Integer id) {
    this.id = id;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public Integer getScore() {
    return score;
  }

  public void setScore(Integer score) {
    this.score = score;
  }

  @Override
  public String toString() {
    return "Id sinh viên : " + id + " Tên sinh viên : " + name + " Điểm thi : " + score;
  }

  @Override
  public int compareTo(Student o) {
    return (int) (o.getScore() - this.getScore());
  }
}
