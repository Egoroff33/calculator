package JavaRush;

public class Artifact {

    /*
    Твоя задача — спроектировать класс Artifact.

Артефакты, которые хранятся в музее, бывают трех видов.

Первый — о которых неизвестно ничего, кроме порядкового номера, присвоенному музеем (например: 212121).
Второй — о которых известен порядковый номер и культура, которой он был создан (например: 212121, "Ацтеки").
Третий вид — о которых известен порядковый номер, культура, которой он был создан, и точный век его создания (например: 212121, "Ацтеки", 12).

Создай класс Artifact, описывающий хранящиеся в музее древности, и напиши необходимое количество конструкторов для него. В методе main() создай по одному артефакту каждого вида.
     */
    int number;
    String cultures;
    int age;

    Artifact(int number){
        this.number = number;
    }
    Artifact(int number, String cultures){
        this.number = number;
        this.cultures = cultures;
    }

    Artifact(int number, String cultures, int age){
        this.number = number;
        this.cultures = cultures;
        this.age = age;

    }


    public static void main(String[] args) {

        Artifact artifact1 = new Artifact(1);
        Artifact artifact2 = new Artifact(2, "Aztec");
        Artifact artifact3 = new Artifact(3, "Aztec", 12);

        System.out.println(artifact1.number);

    }
}
