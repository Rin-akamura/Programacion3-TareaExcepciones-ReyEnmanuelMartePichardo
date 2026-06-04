public class NombreInvalidoException extends Exception{
    private String Mensaje;

    public NombreInvalidoException(String mensaje) {
        this.Mensaje = mensaje;
    }

    @Override
    public String getMessage() {
        return Mensaje;
    }
}