public class Usuario {
    private String Nombre;
    private String Correo;
    private int Edad;
    private double Salario;

    public Usuario() {
        Nombre = "";
        Correo = "";
        Edad = 0;
        Salario = 0.0;
    }

    public Usuario (String Nombre, String Correo, int Edad, double Salario){
        this.Nombre = Nombre;
        this.Correo = Correo;
        this.Edad = Edad;
        this.Salario = Salario;
    }

    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }

    public String getNombre() {
        return Nombre;
    }

    public void setCorreo(String Correo) {
        this.Correo = Correo;
    }

    public String getCorreo() {
        return Correo;
    }

    public void setEdad(int Edad) {
        this.Edad = Edad;
    }

    public int getEdad() {
        return Edad;
    }

    public void setSalario (double Salario) {
        this.Salario = Salario;
    }

    public double getSalario() {
        return Salario;
    }
}
