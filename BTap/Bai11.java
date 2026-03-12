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
public class Bai11 {
    public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    System.out.print("Nhap vao mang 2 chieu: ");
    int n = sc.nextInt();
    int[][]arr = new int[n][n];
    for(int i = 0; i < n; i++){
        for(int j = 0; j < n; j++){
            arr[i][j] = sc.nextInt();
        }
    }
    //1 
    System.out.println("Mang 2 chieu la: ");
    for(int i = 0; i < n; i++){
        for(int j = 0; j < n; j++){
            System.out.print(arr[i][j] + " ");
        }
        System.out.println();
    }
    
    //2 
    int gtnn = arr[0][0];
    for(int i = 0; i < n; i++){
        for(int j = 0; j < n; j++){
        gtnn = Math.min(gtnn, arr[i][j]);
        }
    }
    System.out.println("gia tri nho nhat trong mang 2 chieu la: " + gtnn);
    
    //3 
    for(int i = 0; i < n;i++){
        Arrays.sort(arr[i]);
    }
  
    System.out.println("Mang sau khi sap xep tang dan la: ");
    for(int i = 0; i < n; i++){
        for(int j = 0; j < n; j++){
            System.out.print(arr[i][j] + " ");
        }
        System.out.println();
    }
    // 4. Sắp xếp các phần tử trên đường chéo chính tăng dần 
        // Bước A: Trích xuất các phần tử trên đường chéo chính ra một mảng 1 chiều tạm thời
    int[] dct = new int[n];
    for(int i = 0; i < n;i++){
        dct[i] = arr[i][i];
    }
    // Bước B: Sắp xếp mảng tạm thời đó tăng dần
    Arrays.sort(dct);
    // Bước C: Gán ngược lại các giá trị đã sắp xếp vào đúng vị trí trên đường chéo chính
    for(int i = 0; i < n;i++){
        arr[i][i] = dct[i];
    }
    
    System.out.println("Mang sau khi sap xep duong cheo chinh tang dan: ");
    for(int i = 0; i < n; i++){
        for(int j = 0; j < n; j++){
            System.out.print(arr[i][j] + " ");
        }
        System.out.println();
    }
    
    }
}
