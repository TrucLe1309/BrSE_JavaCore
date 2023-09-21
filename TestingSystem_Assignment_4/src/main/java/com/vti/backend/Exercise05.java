package com.vti.backend;

import com.vti.entity.QLCB;

import java.util.Scanner;

import static java.awt.SystemColor.menu;


public class Exercise05 {
    public static void question02() {
        Scanner scanner = new Scanner(System.in);
        QLCB qlcb = new QLCB();
        while (true) {
            System.out.println("1. Thêm mới cán bộ.");
            System.out.println("2. Tìm kiếm theo họ tên.");
            System.out.println("3. Hiển thị thông tin về danh sách các cán bộ.");
            System.out.println("4. Nhập vào tên của cán bộ và delete cán bộ đó");
            System.out.println("5. Thoát khỏi chương trình.");
            System.out.println("Chọn chức năng: ");
            int menu = scanner.nextInt();

        }


    }
}
