public class blockTest {
    public static void main(String[] args) {
        int x, y;
        y = 20;
        // целью этого цикла является блок
        for (x = 0; x <= 10; x++) {
            System.out.println("Знaчeниe х = " + x);
            System.out.println("Значение у : " + y);
            y = y - 2;
        }
    }
}