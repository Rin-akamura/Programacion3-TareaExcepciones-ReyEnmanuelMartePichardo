public class CorreoInvalidoException extends Exception {
    private String Message;

    public CorreoInvalidoException(String message){
        this.Message = message;
    }

    @Override
    public String getMessage() {
        return Message;
    }
}
