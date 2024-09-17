package JavaRush;

public class Solution6 {
    public static void main(String[] args) {
        hackSalary(700);        //зарплата
    }

    public static void hackSalary(int salary) {
        // напишите тут ваш код
        salary += 100;
        System.out.print("Твоя зарплата составляет: " +
                salary + " долларов в месяц");
    }
}
