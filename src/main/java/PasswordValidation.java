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
}
