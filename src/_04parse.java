import java.util.Scanner;

public class _04parse {
    public static void main (String[] args){

        var edad = Integer.parseInt("20");
        System.out.println("edad = " + (edad+1));

        var valorPI = Double.parseDouble("3.1416");
        System.out.println("Valor PI: " + valorPI);

        var consola = new Scanner(System.in);
        System.out.println("Proporciona tu edad:");
        edad = Integer.parseInt(consola.nextLine());
        System.out.println("edad = " + edad);

        var edadTexto = String.valueOf(10);
        System.out.println("edadTexto = " + edadTexto);

        // Para obtener un solo valor de un String podemos utilizar charAt
        var caracter = "hola".charAt(0);
        System.out.println("caracter" + caracter);
    }
}
