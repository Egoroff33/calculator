package JavaRush;

public class Solution10 {
    public static void print3(String text) {
        //напишите тут ваш код
        for (int i = 0; i < 3; i++){
            System.out.print(text + " ");
        }

        System.out.println();
    }

    public static void main(String[] args) {
        print3("window");
        print3("file");
    }
}
