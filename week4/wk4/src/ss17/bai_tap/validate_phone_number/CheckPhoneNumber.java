package ss17.bai_tap.validate_phone_number;

public class CheckPhoneNumber {
  public static final String[] validPhone = new String[]{"84-0978489648", "84-0982009465"};
  public static final String[] invalidPhone = new String[]{"a8-22222222", "84-22b22222","84-9978489648"};

  public static void main(String[] args) {
    boolean isValid;
    for (String phone : validPhone){
      isValid = Validation.validationPhoneNumber(phone);
      System.out.println("Số điện thoại : " + phone + " " +isValid);
    }

    for (String phone : invalidPhone){
      isValid = Validation.validationPhoneNumber(phone);
      System.out.println("Số điện thoại : " + phone + " " +isValid);
    }

  }
}
