import java.util.Scanner;

public class _31tareaRectangulo {
    public static void main(String args[]) {
        Scanner consola = new Scanner(System.in);
        System.out.println("Proporciona el alto: ");
        var a = Integer.parseInt(consola.nextLine());
        System.out.println("Proporciona el ancho: ");
        var b = Integer.parseInt(consola.nextLine());
        var area = b * a;
        var perimetro = (a + b) * 2;
        System.out.println("Area :" + area);
        System.out.println("Perimetro: " + perimetro);
    }
}
