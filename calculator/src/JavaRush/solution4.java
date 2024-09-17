package JavaRush;

public class solution4 {
    public static void main(String[] args) {
        System.out.println(convertCelsiusToFahrenheit(41));
    }

    public static double convertCelsiusToFahrenheit(int celsius) {
        //напишите тут ваш код

        return (9 / 5d) * celsius + 32; //d переводит литерал в double
    }
}
