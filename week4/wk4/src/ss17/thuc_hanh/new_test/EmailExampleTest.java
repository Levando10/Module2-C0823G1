package ss17.thuc_hanh.new_test;

public class EmailExampleTest {
  private static EmailExample emailExample;
  public static final String[] validEmail = new String[]{"a@gmail.com", "ab@yahoo.com", "abc@hotmail.com"};
  public static final String[] invalidEmail = new String[]{"@gmail.com", "ab@gmail.", "@#abc@gmail.com"};

  public static void main(String args[]) {
    emailExample = new EmailExample();
    boolean checkEmail = emailExample.validate("s@s.com");
    System.out.println(checkEmail);

//    for (String email : validEmail) {
//      boolean isvalid = emailExample.validate(email);
//      System.out.println("Email is " + email + " is valid: " + isvalid);
//    }
//    for (String email : invalidEmail) {
//      boolean isvalid = emailExample.validate(email);
//      System.out.println("Email is " + email + " is valid: " + isvalid);
//    }
  }
}
