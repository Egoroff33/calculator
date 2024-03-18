public class TernaryDemo {
    public static void main(String[] args) {
        int i = 10, k;
        k = i < 0 ? -i : i; //получить абсолютную величину i
        System.out.println("Абсолютная величина " + i + " равна " + k);

        i=-10;
        k = i < 0 ? -i : i; //получить абсолютную величину i
        System.out.println("Абсолютная величина " + i + " равна " + k);

        i=-i;
        System.out.println(i);
    }
}
