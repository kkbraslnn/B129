package day30exceptionsinterface33session;

public class InvalidNumberException extends RuntimeException{

    public InvalidNumberException(String message){
        super(message);
    }
}