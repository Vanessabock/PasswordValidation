import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class PasswordValidation {
    public static void main(String[] args) {
        System.out.println("Hello World");
    }

    public static boolean isPasswordLengthMin8(String password) {
        // Check for password length -> at least 8 characters
        return password.length() >= 8;
    }

    public static boolean hasDigits(String password) {
        // Check for digits
        return password.matches(".*\\d.*");
    }

    public static boolean hasUppercaseAndLowercaseLetters(String password) {
        // Check for uppercase's and lowercase's
        char charValue;
        boolean uppercase = false, lowercase = false;
        for (int i = 0; i < password.length(); i++){
            charValue = password.charAt(i);
            if (Character.isUpperCase(charValue)){
                uppercase = true;
            }
            if (Character.isLowerCase(charValue)){
                lowercase = true;
            }
        }
        return uppercase && lowercase;
    }

    public static boolean isCommonlyUsedPassword(String password) {
        // Check if password is commonly used password
        String[] badPasswords = {"Aa345678", "password", "Password1", "A123456b", "111111Aa",
                "AbCdEfGh", "ABCD1234", "1234abcd"};
        for (String badPassword : badPasswords) {
            if (password.equals(badPassword)) {
                return true;
            }
        }
        return false;
    }

    public static boolean hasSpecialCharacter(String password) {
        Pattern p = Pattern.compile("[^a-z0-9 ]", Pattern.CASE_INSENSITIVE);
        Matcher m = p.matcher(password);
        return m.find();
    }
}
