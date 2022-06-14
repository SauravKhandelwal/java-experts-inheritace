package com.org.hibernate.example;

import java.util.List;

/**
 * @author Saurav_Khandelwal
 *
 */
public class Runner {

	public static void main(String[] args) {
        StudentDao studentDao = new StudentDao();
        Student student = new Student("shyam", "kh", "shyam@gmail.com");
        studentDao.saveStudent(student);

        List <Student> students = studentDao.getStudents();
        students.forEach(s -> System.out.println(s.getFirstName()));
        
        
        
    }
}
