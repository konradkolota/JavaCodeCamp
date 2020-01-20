package com.kk;

public class EndOfLimitException extends Exception {
    public EndOfLimitException() {

    }

    public EndOfLimitException(String message){
        super(message);
    }
}
