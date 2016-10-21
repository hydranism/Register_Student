/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package register_system;

import java.util.Scanner;
import java.io.*;
import java.util.*;
/**
 *
 * @author Spectre
 */
public class operation {
    public static Scanner keyboard = new Scanner(System.in);
    public int N;
    public static float datas[] = new float[20];
     public static String IdCourse,Str,ID;
     public static String NameCourse,Name,fac,major,year,addresss,phone,lastt;
     public static int Credit,last;
     public static String Day,Room,Time;
     //out.write(ID+"  "+Name+"  "+last+"  "+fac+"  "+major+"  "+year+" "+addresss+" "+phone+"  \r\n");
    private Object Course_Reg;

    public operation(int x) {      // Constructor ไม่มี  ไม่ใช้ ก็ได้
        N = x;
    }

   
    public void SubjectScheduler() {  //เพิ่มรายวิชา 
         
     BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	 Scanner sc = new Scanner(System.in);
        try {
            BufferedWriter out = new  BufferedWriter(new FileWriter("Course_Reg.txt"));
              System.out.println("\nใส่จำนวนวิชาที่ทำการลงทะเบียน : ");
             N = keyboard.nextInt();
            
             for(int i=1; i<=N; i++)
             {  System.out.print(1+"> รหัสวิชา : ");
                //IdCourse = sc.next();
                    IdCourse = br.readLine();
                System.out.print("   ชื่อวิชา : ");
                    NameCourse = br.readLine();
                //NameCourse = sc.next();
                System.out.print("   จำนวนหน่วยกิต : ");
                    Str = br.readLine();
                Credit=Integer.parseInt(Str);
                System.out.print("   วันที่เรียน : ");
                    Day = br.readLine();
                 System.out.print("   ห้องเรียน : ");
                    Room =br.readLine();
                  System.out.print("   เวลาเรียน : ");
                    Time = br.readLine();
                out.write(IdCourse+"  "+NameCourse+"  "+Credit+"  "+Day+"  "+Room+"  "+Time+"  \r\n");
             }
            
            out.close();
            System.out.println("\n** File created successfully\n");
            
         }
        catch (IOException e) {
      }
    }
    
           
        public void Display_SubjectScheduler() { //แสดงข้อมูลที่ลงทะเบียน
        System.out.println("\nรายวิชาที่ลงทะเบียน");
                try {
            BufferedReader in = new BufferedReader (new FileReader("Course_Reg.txt"));
            String str;
            while ((str = in.readLine()) != null) {
                System.out.println(str);
            }
            System.out.println(str);
         }
       catch (IOException e) {
         }
    }
}
