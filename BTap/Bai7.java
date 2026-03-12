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
public class Bai7 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhap vao n: ");
        int n = sc.nextInt();
        boolean check = true;
        if(n < 2){
            check = false;
        }
        else{
        for(int i = 2; i*i <= n; i++){
            if(n % i == 0){
                check = false;
                break;
            }
        }
        }
        if(check == true){
            System.out.println(n + " la so nguyen to");
        }
        else{
            System.out.println(n + " khong la so nguyen to");
        }
    }
}
