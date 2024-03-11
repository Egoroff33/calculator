public class BitLogic {
    public static void main(String[] args) {
        //String[] binary = {
        //        "0000", "0001", "0010", "0011", "0100", "0101", "0110", "0111",
        //        "1000", "1001", "1010", "1011", "1100", "1101", "1110", "1111"
        //  };
        int a = 3, b = 6, //0011,0110 в двоичной системе
                c, d, e, f, g;
        c = a | b;
        d = a & b;
        e = a ^ b;
        f = (~a & b) | (a & ~b);
        g = ~a & 0x0f;

        System.out.println("a равно " + String.format("%4s", Integer.toBinaryString(a)).replace(" ", "0"));
        System.out.printf("b равно %04d\n", Long.parseLong(Integer.toBinaryString(b)));
        System.out.println("a | b равно " + Integer.toBinaryString(c));
        System.out.println("a & b равно " + Integer.toBinaryString(d));
        System.out.println("a ^ b равно " + Integer.toBinaryString(e));
        System.out.println("(~a & b) | (a & ~b) равно " + Integer.toBinaryString(f));
        System.out.println("~a & 0x0f равно " + Integer.toBinaryString(g));

    }
}