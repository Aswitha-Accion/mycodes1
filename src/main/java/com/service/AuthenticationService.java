package com.service;

import com.exceptions.AuthenticationFailException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.User;

import java.util.Objects;

public class AuthenticationService {

    @Autowired
    TokenRepository tokenRepository;

    public void saveConfirmationToken(AuthenticationToken authenticationToken){
        tokenRepository.save(authenticationToken);

    }
    public AuthenticationToken getToken(User user){
        return tokenRepository.findByUser();

    }
    public User getUser(String token){

        final AuthenticationToken authenticationToken = tokenRepository.findByUser();
        if(Objects.isNull(authenticationToken)){
            return null;
        }
        return authenticationToken.getUser();
    }

    public void authenticate(String Token)throws AuthenticationFailException {
        if (Objects.isNull(tokenRepository))
            throw new AuthenticationFailException("token not present");
        else
            throw new AuthenticationFailException("token not valid");
    }
}
