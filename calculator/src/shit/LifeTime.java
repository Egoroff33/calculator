package shit;

public class LifeTime {
    public static void main(String[] args) {

        for (int x = 0; x < 3; x++) {
            int у = -1; // переменная у инициализируется
            System.out.println(" Знaчeниe у равно " + у);
            у = 100;
            // при каждом входе в блок
            // всегда выводится -1
            System.out.println("Teпepь значение у равно " + у);
        }
    }
}
