public class BitOperations {
    public static void main(String[] args) {
        int a = 2, b = 3, c;
        {
            a = ~a + 1; //конвертация бит
            // a++;
            {
                if (a == -2) {
                    System.out.println("а равно " + a);
                }
                else {
                    System.out.println("ошибка конвертации, a не равно -2");
                }

            }
        }
        c=a|b; //Побитовое ИЛИ
        {
            System.out.println("c равно " +c);
        }
    }
}