public class ifSample {
    public static void main (String[] args){
        int x=10,у=20;
        if (x < у) System.out.println ("Знaчeниe х меньше у ") ;
        x = x * 2 ;
        if (x == у) System.out.println ("Tenepь значение х равно у ") ;
        x = x * 2 ;
        if (x > у) System.out.println ("Teпepь значение х больше у ") ;
        // Здесь ничего не отобразится
        if (x == у) System.out.println ("Этoт вывод вы не увидите ") ;
    }
}
