/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package BTap;

import java.util.*;
public class Bai5 {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        System.out.print("Nhap vao so dien: ");
        int sodien = in.nextInt();
        double tien = 0;
        
        if(sodien <= 50){
            tien = sodien * 2000;
        }
        if(sodien > 50 && sodien <= 100){
            tien = sodien * 2500;
        }
        if(sodien > 100){
            tien = sodien * 3500;
        }
        
        System.out.println("Tong tien dien cua thang la: " +  tien);
        
    }
}
