public class Main {
    public static void main(String[] args) {
        Student student = new Student(1,"Madina","Madina", Gender.FEMALE,20);
        Student student1 = new Student(1,"Madina","Madina", Gender.FEMALE,20);
        System.out.println(student.equals(student1));


    }
}