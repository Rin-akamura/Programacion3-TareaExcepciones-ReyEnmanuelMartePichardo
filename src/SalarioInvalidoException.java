public class SalarioInvalidoException extends Exception {
    private String Message;

    public SalarioInvalidoException(String message) {
        this.Message = message;
    }

    @Override
    public String getMessage() {
        return Message;
    }
}
