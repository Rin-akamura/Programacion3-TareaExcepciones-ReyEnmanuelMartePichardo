public class EdadInvalidaException extends Exception {
    private String Message;

    public EdadInvalidaException (String message) {
        this.Message = message;
    }

    @Override
    public String getMessage() {
        return Message;
    }
}
