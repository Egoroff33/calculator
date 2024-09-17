package shit;

public class OpBitEquals {
    public static void main(String[] args) {
        int a = 1, b = 2, c = 3;

        System.out.println("а равно " + String.format("%4s", Integer.toBinaryString(a)).replace(" ","0"));
        System.out.println("b равно " + String.format("%4s", Integer.toBinaryString(b)).replace(" ","0"));
        System.out.println("c равно " + String.format("%4s", Integer.toBinaryString(c)).replace(" ","0"));

        a |= 4;
        b >>= 1;
        c <<= 1;

        System.out.println("\na = " + a + " = " + String.format("%4s",Integer.toBinaryString(a)).replace(" ","0"));
        System.out.println("b = " + b + " = " + String.format("%4s",Integer.toBinaryString(b)).replace(" ","0"));
        System.out.println("с = " + c + " = " + String.format("%4s",Integer.toBinaryString(c)).replace(" ","0"));

        a ^= c;

        System.out.println("\na = " + a + " = " + String.format("%4s",Integer.toBinaryString(a)).replace(" ","0"));;

    }
}
