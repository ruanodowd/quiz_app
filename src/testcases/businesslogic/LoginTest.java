package businesslogic;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;


class LoginTest {
    @Test
    void authUsername(){
        assertEquals(2, Login.authenticateUsername("ruan", "password"));
        assertEquals(0, Login.authenticateUsername("wrongusername", "wrongpassword"));
        assertEquals(0, Login.authenticateUsername("ruan", "\" or \"\"=\""));
    }
}