import java.sql.SQLOutput;

public class _06OperadoresAritmeticos {
    public static void main (String arg[]){
    int a=3, b=2;
    var resultado = a + b;
        System.out.println("Resultado de la suma" + resultado);
        resultado = a - b;
        System.out.println("Resultado de la resta" + resultado);
        resultado = a * b;
        System.out.println("Resultado de la multiplicación" + resultado);

        // en este caso la variable resultado se crea con tipo de dato entero, esto por que los valores iniciales son todos enteros.
        // es por eso que en la división el valor siempre sera de tipo entero.
        resultado= a / b;
        System.out.println("Resultado de la división" + resultado);
        //Para que el sistema considere a la variable resultado como un tipo flotante se deve indicar en la carga incial los valores en decimal.
        var resultado2 = 3.0 / 2;
        System.out.println("resultado de la 2da división" + resultado2);

        resultado = a%b;
        System.out.println("Resultado de modulo: " + resultado);
        if (a%b==0)
            System.out.println("El numero es PAR");
        else
            System.out.println("El numero es IMPAR");

    }
}
