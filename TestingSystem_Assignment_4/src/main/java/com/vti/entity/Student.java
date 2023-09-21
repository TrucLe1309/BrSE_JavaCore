package com.vti.entity;

import java.util.Scanner;

public class Student {
    private int id;
    private String name;
    private String hometown;
    private double score;


    public Student() {
        Scanner scanner= new Scanner(System.in);
        System.out.println("Nhap vao thong tin sinh vien ");
        System.out.println("Nhap vao ten: ");

        this.name = scanner.next();

        System.out.println("Nhap vao hometown: ");

        scanner.nextLine();
        this.hometown = scanner.nextLine();

        this.score = 0.0;

    }

    public void setScore(double score) {

        this.score = score;
    }
    public void plusScore(double score) {
        this.score += score;
    }

    public void showInfor(){

        String rank;
        if(score < 4.0){
            rank = "Yeu ";
        }
        else if(score < 6.0){
            rank = "Trung binh ";
        }
        else if (score < 8.0){
            rank= "Kha ";
        }
        else {
            rank=   "Gioi";
        }
        System.out.printf("%s:  %s %n", name, rank);
    }
}
