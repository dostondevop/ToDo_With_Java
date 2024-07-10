public class Main {
    public static void main(String[] args) throws InterruptedException {
        Cat cat = new Cat();
        cat.setId();
        cat.setName("Misha");
        cat.setAge(3);
        cat.setColor("Ola bula");
        cat.setGender("Mujik");
        cat.setType("Domashniy");

        cat.setMustachesCount(10);

        System.out.println(cat);
        cat.sound();

        Turtle turtle = new Turtle();
        turtle.sound();


        Animal animal = new Cat(); // inheritance

        int a = 10;
        long aL = (long) a;

        Animal cat1 = new Animal();
        Cat cat11 = (Cat) cat1;

        Thread.sleep(100);

    }
}