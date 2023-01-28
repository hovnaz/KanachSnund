package am.kanachsnund.kanachsnund.exseption;

public class FileNotExistException extends RuntimeException {

    public FileNotExistException(String message) {
        super(message);
    }
}
