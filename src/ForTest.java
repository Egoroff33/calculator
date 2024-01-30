public class ForTest {
    public static void main (String[] args) {

        for (int i = 0; i < 10; i++) {
            System.out.println("Знaчeниe i : " + i);
            if (i < 8) {
                System.out.println("Продолжай");
            } else {
                System.out.println("Ну все хватит");
            }
        }
    }
}
