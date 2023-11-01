package ss17.bai_tap.check_name_class;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Validation {
  private static final String NAME_REGEX = "^^[CAP]\\d{4}[GHIK]$";

  public Validation() {
  }

  public static boolean validationNameClass(String regex) {
    Pattern pattern = Pattern.compile(NAME_REGEX);
    Matcher matcher = pattern.matcher(regex);
    return matcher.matches();
  }

}
