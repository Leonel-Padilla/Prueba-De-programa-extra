package GitHub;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Scanner teclado = new Scanner(System.in).useDelimiter("\\n");

        System.out.println("Ingrese su numero favorito");
        double numeroDeCliente = teclado.nextDouble();


        System.out.println("Su numero favorito es: " +numeroDeCliente);
    }
}
