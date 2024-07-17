package shit;

public class BitOperations {
    public static void main(String[] args) {
        int a = 2, b = 3, c;
        process(a);
        System.out.println("a равно " + a);
        c = a | b; //Побитовое ИЛИ
        System.out.println("c равно " + c);
    }

    private static void process(int a) {
        a = ~a + 1; //конвертация бит
        // a++;

        if (a == -2) {
            System.out.println("а равно " + a);
        } else {
            System.out.println("ошибка конвертации, a не равно -2");
        }
    }
}