public class _03varTiposPrimitivos {
    public static void main (String args[]){
        byte vByte = 127;
        System.out.println("Valor Byte MIN: " + Byte.MIN_VALUE);
        System.out.println("Valor Byte MAX: " + Byte.MAX_VALUE);

        short vShort = 32767;
        System.out.println("Valor Shourt MIN: " + Short.MIN_VALUE);
        System.out.println("Valor Shourt MAX: " + Short.MAX_VALUE);

        int vInt = 2147483647;
        System.out.println("Valor Integer MIN: " + Integer.MIN_VALUE);
        System.out.println("Valor Integer MAX: " + Integer.MAX_VALUE);

        long vLong = 9223372036854775807L;
        System.out.println("Valor Long MIN: " + Long.MIN_VALUE);
        System.out.println("Valor Long MAX: " + Long.MAX_VALUE);

        double vDouble = 12311;
        System.out.println("Valor Double MIN: " + Double.MIN_VALUE);
        System.out.println("Valor Double MAX: " + Double.MAX_VALUE);
    }
}
