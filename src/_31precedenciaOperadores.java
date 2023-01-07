public class _31precedenciaOperadores {
    public static void main (String arg[]){
        var x = 5;
        var y = 6;
        var z = ++x + y--;
        System.out.println("valor de x: " + x);
        System.out.println("Valor de y: " + y);
        System.out.println("Valor de z: " + z);

        var resultado = 4+ 5 * 6 / 3;
        System.out.println("Resultado: " + resultado);
        resultado = (4+5) * 6/3;
        System.out.println("Resultado :" + resultado);
    }
}
