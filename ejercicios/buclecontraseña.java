package ejercicios;

import java.util.Scanner;

public class buclecontraseña {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String contrasinal = "abc123.";
        String contrasinal_usuario = "";
        int intentos = 0;
       
        while (!contrasinal_usuario.equals(contrasinal)) {
            System.out.println("Introduzca la contraseña: ");
            contrasinal_usuario = sc.next();
            intentos++;
        }
        System.out.println("Contraseña correcta, lo has intentado " + intentos + " veces.");
        sc.close();
    }
}
