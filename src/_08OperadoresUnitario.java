import java.sql.SQLOutput;

public class _08OperadoresUnitario {
    public static void main(String arg[]) {
        var c = true;
        var d = !c;
        System.out.println("c = " + c);
        System.out.println("d = " + d);
        //incremento
        //pre incremento (Simbolo antes del incremento)
        var e = 3;
        var f = ++e; //Primero se incrementa la variable y despues su valor;
        System.out.println(" e = " + e);
        System.out.println(" f = " + f);
        //Postincremento  (Simbolo despues de la variable)
        var g = 5;
        var h = g++;
        System.out.println("g= " +g);
        System.out.println("h=" + h);

        var i = 2;
        var j = --i;
        System.out.println("i =" + i);
        System.out.println("j =" + j);
    }
}
