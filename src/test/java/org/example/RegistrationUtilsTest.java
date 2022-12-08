package org.example;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RegistrationUtilsTest {

    RegistrationUtils registrationUtils;


    @BeforeEach
    public void setUp()
    {
        registrationUtils = new RegistrationUtils();
    }


    @Test
    public void testIfValidateUserWork()
    {
        assertFalse(registrationUtils.validateUsertInput("houdy","1234",""));
        assertFalse(registrationUtils.validateUsertInput("houdy","","1234"));
        assertFalse(registrationUtils.validateUsertInput("","1234","1234"));
        assertFalse(registrationUtils.validateUsertInput("houdy","12345","1234"));
        assertTrue(registrationUtils.validateUsertInput("houdy","1234","1234"));
    }



}