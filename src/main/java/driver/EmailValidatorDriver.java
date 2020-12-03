package driver;

import java.util.ArrayList;
import java.util.List;
import validator.EmailValidator;

public class EmailValidatorDriver {
    public static void main(String[] args) {
        List<String> emailList = new ArrayList<>();
        emailList.add("phil.fernandez@hcl.com");
        emailList.add("bugs-bunny@hotmail.com");
        emailList.add("fred((flitstone))@gmail.com"); // invalid email
        emailList.add("boss_man@company.org");
        emailList.add("boss_lady@@company.org"); // invalid email

        for (String email : emailList) {
            System.out.println("Email " + "[ " + email + " ] "
                    + (EmailValidator.validateEmail(email) ? "is valid" : "is invalid"));
        }
    }

}
