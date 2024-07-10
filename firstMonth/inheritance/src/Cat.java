public class Cat extends Animal {
    private int mustachesCount;

    public Cat() {
        System.out.println("child constructor");
    }

    public Cat(String name, int age, String type, int mustachesCount) {
        super(name, age, type);
        this.mustachesCount = mustachesCount;
    }

    public int getMustachesCount() {
        return mustachesCount;
    }

    public void setMustachesCount(int mustachesCount) {
        this.mustachesCount = mustachesCount;
    }

    @Override
    public String toString() {
        return "Cat{" +
                 super.toString() +
                "mustachesCount=" + mustachesCount +
                '}';
    }

    public void sound() {
        super.sound();
    }


}
