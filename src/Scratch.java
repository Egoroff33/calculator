public class Scratch {

    public static void main(String[] args) {
        byte b = -6;
        System.out.printf("Число: %8s%n", Integer.toBinaryString(b));
        System.out.printf("Число: %d%n", toBinaryValue("11111111111111111111111111111010"));
    }

    public static int toBinaryValue(String binary) {
        int decimal = 0;
        int power = 0;

        if (binary.charAt(0) == '1' && binary.length() == 32) {
            StringBuilder builder = new StringBuilder();
            for (int i = 0; i < binary.length(); i++) {
                builder.append((binary.charAt(i) == '1' ? '0' : '1'));
            }

            while (!binary.isEmpty()) {
                int temp = Integer.parseInt(builder.charAt((binary.length()) - 1) + "");
                decimal += (int) (temp * Math.pow(2, power++));
                binary = binary.substring(0, binary.length() - 1);
            }
            return (decimal + 1) * (-1);
        } else {
            while (!binary.isEmpty()) {
                int temp = Integer.parseInt(binary.charAt((binary.length()) - 1) + "");
                decimal += (int) (temp * Math.pow(2, power++));
                binary = binary.substring(0, binary.length() - 1);
            }
            return decimal;

        }
    }

}

