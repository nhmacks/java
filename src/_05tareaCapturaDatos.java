import java.util.Scanner;

public class _05tareaCapturaDatos {
    public static void main(String[] args) {
        var vName = new Scanner(System.in);
        System.out.println("Proporciona el nombre: ");
        var name = String.valueOf(vName.nextLine());

        var vId = new Scanner(System.in);
        System.out.println("Proporciona el Id: ");
        var id = Integer.parseInt(vId.nextLine());

        var vPrice = new Scanner(System.in);
        System.out.println("Proporciona el precio");
        var precio = Double.parseDouble(vPrice.nextLine());

        var vFreeShipping = new Scanner(System.in);
        System.out.println("Proporciona el envio gratuito");
        var freeShipping = Boolean.parseBoolean(vFreeShipping.nextLine());

        System.out.println(name + "#"+id );
        System.out.println("Precio: $"+precio);
        System.out.println("Envio Gratuito: " + freeShipping);
    }
}
