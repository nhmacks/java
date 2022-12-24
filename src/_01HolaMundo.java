public class _01HolaMundo {
    public static void main (String args[]){
        System.out.println("Hola Mundo desde Java");
        int n = 10;
        System.out.println("Edad: " + n);

        n=5;
        System.out.println(n);

        String vLetra="Hola Mundo";
        System.out.println(vLetra);
        vLetra = "Hola Mundo aquí estoy";
        System.out.println(vLetra);

        var num = 10;
        System.out.println(num);

        var miVariableCadena2= "Text example";
        System.out.println("concatena cadenas" + miVariableCadena2);

        var conCat = num + " " + miVariableCadena2;
        System.out.println("Nueva Linea:\n " + conCat);
        System.out.println("Tabulador:\t " + conCat);
        System.out.println("Retroceso:\b\b " + conCat);
        System.out.println("Print Comilla simple: \'" + conCat +"\'");
        System.out.println("Print Comilla doble:  \"" + conCat + "\"");
    }
}
