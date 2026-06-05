import java.util.Scanner;
public class Main {
    static Scanner sc = new Scanner(System.in);
    static SistemaValidacion usuario = new SistemaValidacion();
    public static void main(String[] args) {
        int b = 0;

        do{
            System.out.println("===================================================");
            System.out.println("           .::REGISTRO DE USUARIOS::.              ");
            System.out.println("===================================================");
            System.out.println("1. Registrar Usuario");
            System.out.println("2. Salir");

            System.out.print("Ingrese la opcion deseada: ");
            b = sc.nextInt();
            sc.nextLine();

            switch(b) {
                case 1:
                    usuario.RegistrarUsuario();
                    break;
                case 2:
                    System.out.println("Saliendo del programa...");
                    break;
            }

        }while(b != 2);
    }
    
}
