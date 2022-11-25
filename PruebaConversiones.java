import java.util.Scanner;
public class PruebaConversiones {
    
public static void main( String args[] )

{            // Abre main


int numero; 
double temperatura;
Scanner entrada = new Scanner(System.in);
Conversiones miObjeto = new Conversiones();

 
System.out.print("\nEste programa recibe temperaturas en grados centigrados ");
System.out.println(" o en grados fahrenheit y la presenta en el otro sistema.\n" );

System.out.println("Por favor introduzca la temperatura. ");
temperatura = entrada.nextInt();

do
{       // Abre do
System.out.print("\nLa temperatura esta en grados centigrados ( Introduzca 1 )");
System.out.println(" o en grados fahrenheit (Introduzca 0 )? ");
numero = entrada.nextInt(); 
}  while ( 0 != numero && 1 != numero );  //cierra do 

if ( 0 == numero )
{          // Abre if
System.out.printf("\nEl equivalente de %.2f grados fahrenheit", temperatura);
System.out.printf("es %.2f grados centigrados. ", miObjeto.Centigrados(temperatura));
}          // Cierra if


if ( 1 == numero )
{           // Abre if
System.out.printf("\nEl equivalente de %.2f grados centigrados ", temperatura);
System.out.printf("es %.2f grados fahrenheit. ", miObjeto.Fahrenheit(temperatura));
}           // Cierra if

System.out.println("\n");

}            // Cierra main
}    