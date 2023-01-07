public class _30operadorTernario {
    public static void main(String arg[]) {
        //Validar si 1 es mayor a 2
        var resultado = 1 > 2 ? "Verdadero" : "Falso";
        System.out.println("Resultado: " + resultado);

        //validar si el valor ingresado es par o impar
        var numero = 9;
        var resultado1 = (numero % 2 == 0) ? "PAR" : "IMPAR";
        System.out.println("Resultado: " + resultado1);
    }
}
