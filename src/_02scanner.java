import java.util.Scanner;

public class _02scanner {
    public static void main (String args[]){

        Scanner consola = new Scanner(System.in);
        System.out.println ("Proporciona el titulo: ");
        var vTitulo = consola.nextLine();
        System.out.println ("Proporciona el autor: ");
        var vAutor = consola.nextLine();

        System.out.println( vTitulo + " fue escrito por " + vAutor);
    }
}
