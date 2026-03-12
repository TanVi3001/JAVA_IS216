/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package BTap;

/**
 *
 * @author Le Tan Vi
 */
import java.util.*;
public class Bai3 {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        double tu1 = in.nextDouble();
        double mau1 = in.nextDouble();
        double tu2 = in.nextDouble();
        double mau2 = in.nextDouble();
        double tong = (tu1*mau2 + tu2*mau1)/(mau1*mau2);
        double hieu = (tu1*mau2 - tu2*mau1)/(mau1*mau2);
        double tich = (tu1*tu2)/(mau1*mau2);
        double thuong = (tu1*mau2)/(mau1*tu2);
        
        System.out.printf("Tong la: %.3f%n", tong);
        System.out.printf("Hieu la: %.3f%n", hieu);
        System.out.printf("Tich la: %.3f%n", tich);
        System.out.printf("Thuong la: %.3f%n", thuong);
        
    }
}
