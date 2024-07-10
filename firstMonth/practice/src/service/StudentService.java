package service;

import model.Student;

public class StudentService {
    public Student[] students = new Student[10];
    static int index = 0;
    public void addStudent(Student student){
        if (index < 10) {
            students[index++] = student;
        }
    }



}
