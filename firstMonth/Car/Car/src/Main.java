import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    static User users[] = new User[2];

    public static void main(String[] args) {
        Scanner scStr = new Scanner(System.in);
        Scanner scInt = new Scanner(System.in);
        for (int i = 0; i < users.length; i++) {
            users[i] = new User();
            users[i].name = scStr.nextLine();
            users[i].password = scStr.nextLine();
            users[i].age = scInt.nextInt();
            users[i].gender = scStr.nextLine();
            System.out.println("Next user: ");
            if(i == users.length+1){
                break;

            }

        }

        for (int i = 0; i < users.length; i++) {
            System.out.println((users[i].name + " " + users[i].password + " " + users[i].age + " " + users[i].gender));
        }


        Search(scStr.nextLine());

        /*User obj = new User();
        obj.age = 18;
        obj.name = "Jamol";
        obj.username = "Jamoliddin24";
        System.out.println(obj.age);
        System.out.println(obj.name);
        System.out.println(obj.username);

        Car car = new Car();
        car.name = "Audi";
        car.colour = "Yellow";
        car.year = 2020;
        System.out.println(car.name);
        System.out.println(car.colour);
        System.out.println(car.year);*/
    }

    public static void Search(String str){
        for (int i = 0; i < users.length; i++) {
        if(users[i].name.equals(str)){
            System.out.println(users[i].age + " " + users[i].password + " " + users[i].gender);
        }
        }
    }

}