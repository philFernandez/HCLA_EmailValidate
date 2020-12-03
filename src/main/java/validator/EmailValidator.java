package validator;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * EmailValidator is an abstraction of the Pattern and Matcher types organized such that their use
 * if for validating email addresses.
 * 
 * @author Phil Fernandez
 */
public class EmailValidator {

    private static final String REGEX = "^[A-Za-z0-9+_.-]+@[A-Za-z0-9+_.-]+$";
    private static final Pattern PATTERN = Pattern.compile(REGEX);

    public static boolean validateEmail(String email) {
        Matcher matcher = PATTERN.matcher(email);
        return matcher.matches();
    }

}
