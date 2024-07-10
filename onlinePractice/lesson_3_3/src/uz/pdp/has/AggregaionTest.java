package uz.pdp.has;

public class AggregaionTest {
    public static void main(String[] args) {
        Address address =  new Address("Uzbekistan", "Tashkent", "Beruniy");
        Student student =  new Student("Akbarov Akbar", 22 ,address );
        System.out.println(student)     ;
    }
}
