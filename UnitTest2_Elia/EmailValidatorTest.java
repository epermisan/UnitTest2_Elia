package com.vogella.unittest.email;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

class EmailValidatorTest {
    @Test
    public void test1() {
        assertTrue(EmailValidator.isValidEmail("lars.vogel@gmail.com"));
    }

    @Test
    public void test2() {
        assertTrue(EmailValidator.isValidEmail("user@sub.domain.com"));
    }

    @Test
    @DisplayName("Ensure that a missing top level domain returns false")
    public void test3() {
        assertFalse(EmailValidator.isValidEmail("user@subdomain"));
    }

    @Test
    public void test4() {
        assertFalse(EmailValidator.isValidEmail("user@domain..com"));
    }

    @Test
    public void test5() {
        assertFalse(EmailValidator.isValidEmail("@domain.com"));
    }

    @Test
    public void test6() {
        assertFalse(EmailValidator.isValidEmail(""));
    }

    @Test
    public void test7() {
        assertFalse(EmailValidator.isValidEmail(null));
    }
}
