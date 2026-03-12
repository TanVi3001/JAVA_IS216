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
public class Bai10 {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        System.out.print("Nhap vao so phan tu trong mang: ");
        int n = in.nextInt();
        int [] arr = new int[n];
        for(int i = 0; i < n; i++){
            System.out.print("Nhap phan tu thu: " + (i + 1) + ": ");
            arr[i] = in.nextInt();
        }
        System.out.println("Mang vua nhap: " + Arrays.toString(arr));
        
        // 2
        int gtln = arr[0];
        int gtnn = arr[0];
        for(int i = 0; i < n; i++){
            gtln = Math.max(gtln, arr[i]);
            gtnn = Math.min(gtnn, arr[i]);
        }
        System.out.println("Gia tri lon nhat trong mang: " + gtln);
        System.out.println("Gia tri nho nhat trong mang: " + gtnn);
        
        // 3
        System.out.print("Nhap vao phan tu can kiem tra ton tai trong mang: ");
        int x = in.nextInt();
        int vtriX = Arrays.binarySearch(arr,x);
        if(vtriX >= 0){
            System.out.println("So " + x + " co nam trong mang tai vi tri + " + vtriX);
        }
        else{
            System.out.println("So " + x + " khong nam trong mang");
        }
        //4
        int count = 0;
        for(int i = 0; i < n; i++){
            if(x == arr[i]){
                count++;
            }
        }
        System.out.println("So phan tu co gia tri bang " + x + " la: " + count);
        
        //5
        for(int i = 0; i < n;i++){
            Arrays.sort(arr);
        }
        System.out.print("Mang sau khi sap xep: ");
        for(int i = 0; i < n; i++){
            System.out.print(arr[i] + " ");
        }
    }

}
