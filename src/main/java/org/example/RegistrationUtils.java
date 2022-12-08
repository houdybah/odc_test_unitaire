package org.example;

public class RegistrationUtils {

    public boolean validateUsertInput(String username, String password, String confirmPassword)
    {
        if(username.isEmpty() || password.isEmpty() || confirmPassword.isEmpty() ){
            return false;
        }
        if (!password.equals(confirmPassword)){
            return false;
        }
        return true;
    }

}
