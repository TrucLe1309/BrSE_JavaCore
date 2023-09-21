package com.vti.backend;

import com.vti.entity.Student;

public class Exercise04 {
    public static void question01(){
        Student student = new Student();
        student.setScore(5.0);
        student.showInfor();
        student.plusScore(5.0);
        student.showInfor();

    }

}
