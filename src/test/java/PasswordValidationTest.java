import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PasswordValidationTest {

    // Password length tests -> Minimum length is 8 characters
    @Test
    public void isPasswordLengthMin8Test_whenTJfu48I0_thenTrue(){
        //GIVEN
        String password = "TJfu48I0";
        //WHEN
        boolean check = PasswordValidation.isPasswordLengthMin8(password);
        //THEN
        assertTrue(check);
    }

    @Test
    public void isPasswordLengthMin8Test_whenO38In_thenTrue(){
        //GIVEN
        String password = "O38In";
        //WHEN
        boolean check = PasswordValidation.isPasswordLengthMin8(password);
        //THEN
        assertFalse(check);
    }

    @Test
    public void isPasswordLengthMin8Test_whenPSw368Mfhc_thenTrue(){
        //GIVEN
        String password = "PSw368Mfhc";
        //WHEN
        boolean check = PasswordValidation.isPasswordLengthMin8(password);
        //THEN
        assertTrue(check);
    }

    // Password contains digits tests
    @Test
    public void hasDigits_when8048HcIe7_thenTrue(){
        //GIVEN
        String password = "8048KHcIe7";
        //WHEN
        boolean check = PasswordValidation.hasDigits(password);
        //THEN
        assertTrue(check);
    }

    @Test
    public void hasDigits_whenAbdjvZU_thenTrue(){
        //GIVEN
        String password = "AbdjvZU";
        //WHEN
        boolean check = PasswordValidation.hasDigits(password);
        //THEN
        assertFalse(check);
    }

    // Password contains uppercase and lowercase letters
    @Test
    public void hasUppercaseAndLowercaseLetters_whenOncje84Hdj_thenTrue(){
        //GIVEN
        String password = "Oncje84Hdj";
        //WHEN
        boolean check = PasswordValidation.hasUppercaseAndLowercaseLetters(password);
        //THEN
        assertTrue(check);
    }

    @Test
    public void hasUppercaseAndLowercaseLetters_whenjfjru864_thenTrue(){
        //GIVEN
        String password = "jfjru864";
        //WHEN
        boolean check = PasswordValidation.hasUppercaseAndLowercaseLetters(password);
        //THEN
        assertFalse(check);
    }

    @Test
    public void hasUppercaseAndLowercaseLetters_whenHDJ7866GH_thenTrue(){
        //GIVEN
        String password = "HDJ7866GH";
        //WHEN
        boolean check = PasswordValidation.hasUppercaseAndLowercaseLetters(password);
        //THEN
        assertFalse(check);
    }

}