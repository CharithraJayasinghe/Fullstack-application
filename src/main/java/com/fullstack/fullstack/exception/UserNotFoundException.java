package com.fullstack.fullstack.exception;

public class UserNotFoundException extends RuntimeException{
    public UserNotFoundException (Long id){
        super("user not found with id " + id );
    }
}
