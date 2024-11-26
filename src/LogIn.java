import java.util.Scanner;

public class LogIn {
    public static void main(String[] args) {
        //Escribe un programa que pida al usuario ingresar un nombre de usuario y una constraseña, escribe un bucle que siga ejecutándose y devuelva 'Datos incorrectos por favor vuelve a intentar' mientras el nombre de usuario o la contraseña sean incorrectos.
        //Cuando el usuario y la constraseña sean correctos imprime en terminal: ¡Acceso concedido!

        String correctUsername = "Pepita";
        String correctPassword = "pepi123";

        Scanner scan = new Scanner(System.in);
        System.out.println("\nLog In\n");
        System.out.print("- Usuario: ");
        String name = scan.nextLine();
        System.out.print("- Contraseña: ");
        String pass = scan.nextLine();


        while (!name.equals(correctUsername) || !pass.equals(correctPassword)) {
            System.out.println("\nDatos incorrectos por favor vuelve a intentar");
            System.out.print("- Usuario: ");
            name = scan.nextLine();
            System.out.print("- Contraseña: ");
            pass = scan.nextLine();
        }
        System.out.println("\n¡Acceso concedido!");

        scan.close();
    }
}