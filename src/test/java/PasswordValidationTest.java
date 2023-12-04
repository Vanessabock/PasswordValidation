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
    public void isPasswordLengthMin8Test_whenO38In_thenFalse(){
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
    public void hasDigitsTest_when8048HcIe7_thenTrue(){
        //GIVEN
        String password = "8048KHcIe7";
        //WHEN
        boolean check = PasswordValidation.hasDigits(password);
        //THEN
        assertTrue(check);
    }

    @Test
    public void hasDigitsTest_whenAbdjvZU_thenFalse(){
        //GIVEN
        String password = "AbdjvZU";
        //WHEN
        boolean check = PasswordValidation.hasDigits(password);
        //THEN
        assertFalse(check);
    }

    // Password contains uppercase and lowercase letters tests
    @Test
    public void hasUppercaseAndLowercaseLettersTest_whenOncje84Hdj_thenTrue(){
        //GIVEN
        String password = "Oncje84Hdj";
        //WHEN
        boolean check = PasswordValidation.hasUppercaseAndLowercaseLetters(password);
        //THEN
        assertTrue(check);
    }

    @Test
    public void hasUppercaseAndLowercaseLettersTest_whenjfjru864_thenFalse(){
        //GIVEN
        String password = "jfjru864";
        //WHEN
        boolean check = PasswordValidation.hasUppercaseAndLowercaseLetters(password);
        //THEN
        assertFalse(check);
    }

    @Test
    public void hasUppercaseAndLowercaseLettersTest_whenHDJ7866GH_thenFalse(){
        //GIVEN
        String password = "HDJ7866GH";
        //WHEN
        boolean check = PasswordValidation.hasUppercaseAndLowercaseLetters(password);
        //THEN
        assertFalse(check);
    }

    // Password is Commonly Used Password tests
    @Test
    public void isCommonlyUsedPasswordTest_whenPassword1_thenTrue(){
        //GIVEN
        String password = "Password1";
        //WHEN
        boolean check = PasswordValidation.isCommonlyUsedPassword(password);
        //THEN
        assertTrue(check);
    }

    @Test
    public void isCommonlyUsedPasswordTest_when389Hkdb3_thenTFalse(){
        //GIVEN
        String password = "389Hkdb3";
        //WHEN
        boolean check = PasswordValidation.isCommonlyUsedPassword(password);
        //THEN
        assertFalse(check);
    }

}