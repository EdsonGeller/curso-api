package br.com.dicadeumdev.API.services.exceptions;

public class ObjNotFoundException extends RuntimeException{
    public ObjNotFoundException(String message){
        super(message);
    }
    
}
