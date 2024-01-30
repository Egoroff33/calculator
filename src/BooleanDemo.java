public class BooleanDemo {
    // Демонстрация использования значений boolean .
    public static void main(String[] args) {
        boolean b = false;
        System.out.println ("Ь равно " + b);
        b = true;
        System.out.println ("b равно " + b);
        // Значение boolean может управлять оператором if.
        if (b) System.out.println ("Этo выполняется.");
        b = false;
        if (b) System.out.println ("Этo не выполняется.");
// Результатом операции отношения является значение boolean .
        System.out.println ("10 > 9 равно " + (10 > 9));
    }
}
