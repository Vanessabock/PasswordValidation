import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.Random;

public class PasswordValidation {
    public static void main(String[] args) {
        System.out.println("Hello World");
        System.out.println(generateRandomPassword());
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

    public static String generateRandomPassword(){
        Random rand = new Random();
        String setOfChars= "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789!@#$%^&*()-_=+";
        StringBuilder password = new StringBuilder();
        boolean isValidPassword = false;
        String pw = "";

        while (!isValidPassword){
            password.setLength(0);
            int length = rand.nextInt(5) + 8;
            for (int i = 0; i < length; i++) {
                password.append(setOfChars.charAt(rand.nextInt(setOfChars.length())));
            }
            pw = password.toString();
            if (isPasswordLengthMin8(pw) && hasDigits(pw) && hasUppercaseAndLowercaseLetters(pw) && !isCommonlyUsedPassword(pw) && hasSpecialCharacter(pw)){
                isValidPassword = true;
            }
        }
        return pw;
    }
}
