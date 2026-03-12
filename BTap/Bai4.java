/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package BTap;

import java.util.*;
public class Bai4 {
    
    public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    System.out.print("Nhap vao chuoi x:");
    String x = sc.nextLine();
    System.out.print("Nhap vao chuoi y:");
    String y = sc.nextLine();
    
    int chieuDaiX = x.length();
    //a
    System.out.println("Tong do dai cua chuoi la: " + chieuDaiX);
    
    //b
    if(chieuDaiX >= 3){
        String baKiTuDau = x.substring(0,3);
        System.out.println("3 ki tu dau tien cua chuoi x la: " + baKiTuDau);
    }
    else{
        System.out.println(x + " khong du 3 ki tu");
    }
    
    //c
    if(chieuDaiX >=3 ){
        String baKiTuCuoi = x.substring(chieuDaiX - 3);
        System.out.println("3 ki tu cuoi cung cua chuoi x la: " + baKiTuCuoi);
    }
    else{
        System.out.println(x + " khong du 3 ki tu");
    }
    
    //d
    if(chieuDaiX >= 6){
        char kt6 = x.charAt(5);
        System.out.println("Ki tu thu 6 cua x la: " + kt6);
    }
    else{
        System.out.println(x + " khong du 6 ki tu");
    }
    
    // e
    int chieuDaiY = y.length();
    if(chieuDaiX >= 3 && chieuDaiY>=3){
        String baktdauX = x.substring(0,3);
        String baktcuoiY = y.substring(chieuDaiY - 3);
        String news = baktdauX + baktcuoiY;
        System.out.println( "Chuoi moi la: "+ news);
    }
    else{
        System.out.println("Khong thoa man ycdb");
    }
    
    //f PhanBiet chu hoa
    if(x.equals(y)){
        System.out.println("Chuoi " + x + " = " + y + "theo phan biet chu hoa va chu thuong");
    } 
    else{
        System.out.println("Chuoi " + x + " != " + y + "theo phan biet chu hoa va chu thuong");
    }
    
    //g Khong phan biet chu hoa
    if(x.equalsIgnoreCase(y)){
        System.out.println("Chuoi " + x + " = " + y + "khong theo phan biet chu hoa va chu thuong");
    } 
    else{
        System.out.println("Chuoi " + x + " != " + y + " khong theo phan biet chu hoa va chu thuong");
    }
    //h 
    int viTriXuatHienDauTien = x.indexOf(y);
    if(viTriXuatHienDauTien != -1){
        System.out.println("Chuoi y co xuat hien trong x, Vi tri dau tien xuat hien tai Index la: " + viTriXuatHienDauTien);
    }
    else{
        System.out.println("y khong xuat hien trong x");
    }
    
    //i
    System.out.print("Tất cả các vị trí chuỗi y xuất hiện trong x là: ");
        if (!y.isEmpty() && viTriXuatHienDauTien != -1) {
            int viTriTimKiem = viTriXuatHienDauTien;
            while (viTriTimKiem != -1) {
                System.out.print(viTriTimKiem + " ");
                // Tiếp tục tìm từ vị trí sau vị trí vừa tìm thấy
                viTriTimKiem = x.indexOf(y, viTriTimKiem + 1);
            }
            System.out.println(); // Xuống dòng cho đẹp
        } else {
            System.out.println("Không có.");
        }
}
}