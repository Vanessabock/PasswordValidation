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
}
