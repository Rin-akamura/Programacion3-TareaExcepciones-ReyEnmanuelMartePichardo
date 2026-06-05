
import java.util.Scanner; 
public class SistemaValidacion {
    private NombreInvalidoException n = null;
    private EdadInvalidaException e = null;
    private CorreoInvalidoException c = null;
    private SalarioInvalidoException s = null;

    Scanner scanner = new Scanner(System.in);
    Usuario[] BancoDatos = new Usuario[100];
    int TotalUsuarios = 0;

    public SistemaValidacion() {
    }


    public void RegistrarUsuario() {
        Usuario usuario = new Usuario();
        try{
            System.out.print("Ingrese su nombre(es): ");
            String Nombre = scanner.nextLine();
            usuario.setNombre(Nombre);
            System.out.println();

            System.out.print("Ingrese su edad: ");
            int Edad = scanner.nextInt();
            scanner.nextLine();
            usuario.setEdad(Edad);
            System.out.println();

            System.out.print("Ingrese su correo electronico: ");
            String Correo = scanner.nextLine();
            usuario.setCorreo(Correo);
            System.out.println();

            System.out.print("Ingrese su salario mensual: ");
            double Salario = scanner.nextDouble();
            scanner.nextLine();
            usuario.setSalario(Salario);
            System.out.println();
            ValidarUsuario(Nombre, Correo, Edad, Salario);

            BancoDatos[TotalUsuarios] = usuario;
            TotalUsuarios++;

            System.out.println("Usuario registrado existosamente");

        }catch (NombreInvalidoException n) {
            System.out.println("Error al registrar al usuario: " + n.getMessage());
        }catch(EdadInvalidaException e) {
            System.out.println("Error al registrar al Usuario: " + e.getMessage());
        }catch (CorreoInvalidoException c) {
            System.out.println("Error al registrar al Usuario: " + c.getMessage());
        }catch (SalarioInvalidoException s){
            System.out.println("Error al registrar al Usuario: " + s.getMessage());
        }finally {

            System.out.println("Proceso finalizado...");
        }
        
    }

    public void ValidarUsuario (String Nombre, String Correo, int Edad, double Salario) throws NombreInvalidoException, EdadInvalidaException, CorreoInvalidoException, SalarioInvalidoException{
        if(Nombre.isEmpty()){
            throw new NombreInvalidoException("El nombre no puede estar vacio. Que se sepa, no te registraron sin nombre.");
        } else if(Nombre.length() < 3) {
            throw new NombreInvalidoException("El nombre debe tener al menos 3 caracteres");
        }

        if(Edad < 18){
            throw new EdadInvalidaException("La edad debe ser mayor o igual a 18 años");
        } else if(Edad > 100){
            throw new EdadInvalidaException("La edad no puede ser mayor a 100 años. Ni que fueras momia, animal");
        }

        if(!Correo.contains("@")){
            throw new CorreoInvalidoException("El correo electronico no es valido");
        } else if(!Correo.contains(".")){
            throw new CorreoInvalidoException("El correo electronico no es valido");
        }

        if (Salario < 0) {
            throw new SalarioInvalidoException("El salario debe ser mayor que 0");
        }
    }
}
