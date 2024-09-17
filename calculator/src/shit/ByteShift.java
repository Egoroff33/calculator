package shit;

public class ByteShift {
    public static void main(String[] args) {
        byte a = 64, b;
        int i;
        i = a << 2;
        b = (byte) (a << 2);

        System.out.println("а равно " + a);
        System.out.println("i равно " + i);
        System.out.println("b равно " + b);

        System.out.println("a равно " + String.format("%4s", Integer.toBinaryString(a)).replace(" ", "0"));
        System.out.println("i равно " + String.format("%4s", Integer.toBinaryString(i)).replace(" ", "0"));
        System.out.println("b равно " + String.format("%4s", Integer.toBinaryString(b)).replace(" ", "0"));

    }
}
