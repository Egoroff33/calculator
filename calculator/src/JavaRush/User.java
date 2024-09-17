package JavaRush;

public class User {

    /*
    Вы создаете базу данных пользователей для сайта знакомств.

Да вот беда — вы подзабыли в каком порядке их нужно указывать, а технического задания под рукой нет.

Спроектируйте класс User,  у которого будут поля — имя (String) возраст (short) и рост (int).

Создайте для него необходимое количество конструкторов, чтобы имя, возраст и рост можно было указывать в любом порядке.
     */

    String name;
    short age;
    int height;

    User(String name, short age, int height) {

    }
    User(String name, int height, short age) {

    }
    User(short age, String name, int height) {

    }
    User(short age, int height, String name) {

    }
    User(int height, String name, short age) {

    }
    User(int height, short age, String name) {

    }


//    public static void main(String[] args) {
//        User user1 = new User("Саша", (short) 21, 180);
//        User user2 = new User("Маша", 150, 25);
//        User user3 = new User();
//        User user4 = new User();
//        User user5 = new User();
//        User user6 = new User();
//    }

}
