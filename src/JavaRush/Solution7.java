package JavaRush;

public class Solution7 {
    public static void main(String[] args) {
        //напишите тут ваш код
        Cat cat = new Cat();
        Dog dog = new Dog();
        Fish fish = new Fish();
        Woman woman = new Woman();
        cat.owner = woman;
        dog.owner = woman;
        fish.owner = woman;
        System.out.println(woman.name);

    }

    public static class Cat {
        public Woman owner;
    }

    public static class Dog {
        public Woman owner;
    }

    public static class Fish {
        public Woman owner;
    }

    public static class Woman {
        String name = "Sofiya";
    }

}
