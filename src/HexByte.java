public class HexByte {
    public static void main(String[] args) {
        char[] hex = {
                '0', '1', '2', '3', '4', '5', '6', '7',
                '8', '9', 'a', 'b', 'c', 'd', 'e', 'f'
        };
        byte b = (byte) 0xf1, i = (byte) 0x0f;

        System.out.println("i равно " + i + " = " + Integer.toBinaryString(i));
        System.out.println("b (0xf1) равно " + b + " = " + Integer.toBinaryString(b));
        System.out.println("b>>4 = " + (b >> 4) + " = " + Integer.toBinaryString(b >> 4));
        System.out.println("(b >> 4) & 0x0f = " + ((b >> 4) & i) + " = " + Integer.toBinaryString((b >> 4) & i));
        System.out.println("b & 0x0f = " + (b & i) + " = " + Integer.toBinaryString(b & i));
        System.out.println("b=0x" + hex[(b >> 4) & i] + hex[b & i]);
    }
}
