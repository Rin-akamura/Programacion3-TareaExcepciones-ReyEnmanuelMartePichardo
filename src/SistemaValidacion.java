
import java.util.Scanner; 
public class SistemaValidacion {
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

            System.out.print("Ingrese su correo electronico");
            String Correo = scanner.nextLine();
            usuario.setCorreo(Correo);
            System.out.println();

            System.out.print("Ingrese su salario mensual: ");
            double Salario = scanner.nextDouble();
            usuario.setSalario(Salario);
            System.out.println();

            BancoDatos[TotalUsuarios] = usuario;
            TotalUsuarios++;
        }catch () {

        } catch() {

        } catch () {

        } finally {

        }
        
    }
}
