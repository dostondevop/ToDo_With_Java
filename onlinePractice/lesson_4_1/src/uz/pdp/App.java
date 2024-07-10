package uz.pdp;

public class App {
    public static void main(String[] args) {
        Calculator calculator = new Calculator();
        int x = 90;
        int y = 10;
        System.out.println(calculator.summ(x, y));
        System.out.println(calculator.summ(x, 12.F));
        System.out.println(calculator.summ(x, 12L)); // automatic type promotion


    }
}
