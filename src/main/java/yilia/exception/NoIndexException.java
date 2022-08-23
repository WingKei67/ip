package yilia.exception;

public class NoIndexException extends Exception {
    public String operation;
    public NoIndexException(String operation) {
        this.operation = operation;
    }
    @Override
    public String getMessage() {
        return "Please specify the index of items to " + operation;
    }
}