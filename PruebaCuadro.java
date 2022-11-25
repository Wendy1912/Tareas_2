import java.util.Scanner;

public class PruebaCuadro

{ // Abre clase Cuadro

    public static void main(String args[]) { // Abre main
        System.out.print("\nEste programa recibe un entero e imprime ");
        System.out.println("un cuadrado de asteriscos con ese numero de lado.");

        int lado;
        Scanner entrada = new Scanner(System.in);
        Cuadro miObjeto = new Cuadro();

        System.out.println("\nPor favor introduzca un entero: ");
        lado = entrada.nextInt();

        miObjeto.Cuadrado(lado);

    } // Cierra main
} // Cierra clase Cuadro