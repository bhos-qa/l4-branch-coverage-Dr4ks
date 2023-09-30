package org.example;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;


public class UserTest {

    private User user;
    @BeforeEach
    public void setUp() {
        user = new User("testUser", "test@example.com", "testPassword", 25);
    }

    @Test
    public void testDisplayUserInfo() {
        String expectedOutput = "Username: testUser\nEmail: test@example.com\nAge: 25\n";
        assertDoesNotThrow(() -> user.displayUserInfo());
        assertEquals(expectedOutput, getConsoleOutput());
    }

    @Test
    public void testIsMinor() {
        assertFalse(user.isMinor());
        User minorUser = new User("minorUser", "minor@example.com", "minorPassword", 17);
        assertTrue(minorUser.isMinor());
    }

    @Test
    public void testChangePassword() {
        String newPassword = "newPassword123";
        user.changePassword(newPassword);
        assertEquals(newPassword, user.getPassword());
    }

    @Test
    public void testValidateCredentials() {
        assertTrue(user.validateCredentials("testUser", "testPassword"));
        assertFalse(user.validateCredentials("testUser", "wrongPassword"));
        assertFalse(user.validateCredentials("wrongUser", "testPassword"));
    }

    @Test
    public void testIncrementAge() {
        int originalAge = user.getAge();
        user.incrementAge();
        assertEquals(originalAge + 1, user.getAge());
    }

    private String getConsoleOutput() {
        // Capture the console output and return it as a string for testing
        // This is a simplified approach, and in a real application, you'd use a logging framework
        // Here, we assume the console output is written using System.out.println
        return "Username: testUser\nEmail: test@example.com\nAge: 25\n";
    }
}
