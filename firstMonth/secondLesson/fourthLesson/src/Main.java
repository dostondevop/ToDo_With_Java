import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scanner =  new Scanner(System.in);
        System.out.println("Enter array size: ");
        int size = scanner.nextInt();
        int numbers[] = new int[size];

        for (int i = 0; i < size; i++) {
            System.out.print("a[" + i + "] = ");
            int value = scanner.nextInt();
            numbers[i] = value;
        }

        for (int i = 0; i < size; i++) {
            System.out.println(numbers[i]);
        }
    }
}