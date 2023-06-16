package br.com.dicadeumdev.API.services.exceptions;

public class DataIntegratyViolationException extends RuntimeException{
    public DataIntegratyViolationException(String message){
        super(message);
    }
    
}
