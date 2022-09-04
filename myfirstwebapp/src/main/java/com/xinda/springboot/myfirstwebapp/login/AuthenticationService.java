package com.xinda.springboot.myfirstwebapp.login;

import org.springframework.stereotype.Service;

@Service
public class AuthenticationService {
    public boolean authenticate(String username, String password) {
        boolean isValidUsername = username.equalsIgnoreCase("llccing");
        boolean isValidPassword = password.equalsIgnoreCase("llccing");

        return isValidUsername && isValidPassword;
    }
}
