/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package register_system;

import java.io.*;
import java.util.*;
class menu {

    public static Scanner keyboard = new Scanner(System.in);
    static int choice;

    public int PrintMenu() {
        System.out.println("\n\n**** ระบบลงทะเบียน");
        System.out.println("****  -----------");
        System.out.println("**** 1. เพิ่มรายวิชา");
        System.out.println("**** 2. แสดงรายวิชา ");
        System.out.println("**** 3. เพิ่มรายวิชาล่าช้า append");
        System.out.println("**** 4. อัพเดทรายการลงทะเบียน");
        System.out.println("**** 5. แสดงรายชื่อนิสิต");
        System.out.println("**** 6. สร้างไฟล์นิสิต");
        System.out.println("**** 7. เพิ่มนิสิต");
        System.out.println("**** 8. แสดงผลการลงทะเบียน");
        System.out.println("**** 9. รายงานการลงทะเบียน");
        System.out.println("**** 10. ออก");
        System.out.print("**** กรุณาใส่เลขรายการที่ต้องการ");
        choice = keyboard.nextInt();
        return (choice);
    }
};
