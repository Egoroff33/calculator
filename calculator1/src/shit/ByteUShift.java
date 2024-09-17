package shit;

public class ByteUShift {
    public static void main(String[] args) {
        char[] hex = {
                '0', '1', '2', '3', '4', '5', '6', '7',
                '8', '9', 'a', 'b', 'c', 'd', 'e', 'f'
        };
        byte b = (byte) 0xf1;
        byte c = (byte) (b >> 4);
        byte d = (byte) (b >>> 4);
        byte e = (byte) ((b & 0xff) >> 4);

        System.out.println("b равно " + b + " = " + Integer.toBinaryString(b));
        System.out.println("с равно " + c + " = " + Integer.toBinaryString(c));
        System.out.println("d равно " + d + " = " + Integer.toBinaryString(d));
        System.out.println("e равно " + e + " = " + Integer.toBinaryString(e));

    }
}
