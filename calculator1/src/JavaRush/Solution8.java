package JavaRush;

public class Solution8 {
    public static int min(int a, int b, int c) {
        //напишите тут ваш код
        return min(min(a, b), c);

    }

    public static int min(int a, int b) {
        return a < b ? a : b;
    }

    public static void main(String[] args) {
        System.out.println(min(1, 2, 3));
        System.out.println(min(-1, -2, -3));
        System.out.println(min(3, 5, 3));
        System.out.println(min(5, 5, 10));
    }
}
