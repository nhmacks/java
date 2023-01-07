import java.util.Scanner;

public class _31tareaNumeroMayor {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Proporciona el número 1: ");
        var a = Integer.parseInt(scanner.nextLine());
        System.out.println("Proporciona el número 2: ");
        var b = Integer.parseInt(scanner.nextLine());
        var resultado = a > b ? a : b;
        System.out.println("El número mayor es: " + resultado);

    }
}
