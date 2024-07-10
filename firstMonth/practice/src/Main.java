import model.Student;
import service.StudentService;

import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        StudentService studentService = new StudentService();
        Scanner scannerStr = new Scanner(System.in);
        Scanner scannerInt = new Scanner(System.in);

        int stepCode = 10;
        while (stepCode != 0) {

            Student student = new Student();
            System.out.println("Enter name: ");
            student.setName(scannerStr.nextLine());
            System.out.println("Enter age: ");
            student.setAge(scannerInt.nextInt());
            System.out.println("Enter phoneNumber: ");
            student.setPhoneNumber(scannerStr.nextLine());
            System.out.println("Enter email: ");
            student.setEmail(scannerStr.nextLine());
            System.out.println("Enter numberOfCourse: ");
            student.setNumberOfCourse(scannerInt.nextInt());
            System.out.println("Enter nameOfGroup: ");
            student.setNameOfGroup(scannerStr.nextLine());
            studentService.addStudent(student);
            for (int i = 0; i < studentService.students.length; i++) {

                if (studentService.students[i] != null){
                    System.out.println(studentService.students[i]);
                }
            }
            System.out.println("enter stepcode: ");
            stepCode = scannerInt.nextInt();
        }
    }
}