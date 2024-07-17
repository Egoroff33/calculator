package shit;

public class Conversion {
    public static void main(String[] args) {
        byte b;
        int i = 257;
        double d = 323.142;
        System.out.println("\nПpeoбpaзoвaниe int в byte.");
        b = (byte) i;
        System.out.println(" i и Ь : " + i + " " + b);
        System.out.println("\nПpeoбpaзoвaниe doube в int.");
        i = (int) d;
        System.out.println("d и i : " + d + " " + i);
        System.out.println("\nПреобразование doube в byte.");
        b = (byte) d;
        System.out.println(" d и Ь : " + d + " " + b);
    }
}
