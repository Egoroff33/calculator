public class BoolLogic {
    public static void main(String[] args) {
        boolean a = true, b = false;
        boolean c = a | b;
        boolean d = a & b;
        boolean e = a ^ b;
        boolean f = (!a & b) | (a & !b);
        boolean g = !a;

        System.out.println("c = " + c);
        System.out.println("d = " + d);
        System.out.println("e = " + e);
        System.out.println("f = " + f);
        System.out.println("g = " + g);

        int i = 1, x = 1, z = 0;
        if (i == 1 & x++ < 100) {
            z = 100;
            System.out.println("x = " + x);
            System.out.println("z = " + z);
        } else {
            System.out.println("Ошибка, условие не выполняется");
        }

        int denom = 2, num = 200;
        if (denom != 0 && num / denom > 10) {
            System.out.println("denom = " + denom);
            System.out.println("num = " + num);
        } else {
            System.out.println("Ошибка, условие не выполняется");
        }

    }
}
