package ss17.bai_tap.validate_phone_number;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Validation {
  private static final String PHONE_REGEX = "^\\d{2}-+0\\d{9}$";
  public static boolean validationPhoneNumber(String regex) {
    Pattern pattern = Pattern.compile(PHONE_REGEX);
    Matcher matcher = pattern.matcher(regex);
    return matcher.matches();
  }

}
