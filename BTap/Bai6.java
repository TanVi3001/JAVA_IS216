package BTap;

import java.util.Scanner;

/**
 *
 * @author Le Tan Vi
 */
import java.util.*;
public class Bai6 {

    public static void main(String[] args) {
        Scanner nhapDuLieu = new Scanner(System.in);
        int suLuaChon = 0;

        do {
            // In ra menu theo đúng mẫu
            System.out.println("##################################");
            System.out.println("1. Bài 1");
            System.out.println("2. Bài 2");
            System.out.println("3. Bài 3");
            System.out.println("4. Bài 4");
            System.out.println("5. Bài 5");
            System.out.println("6. Thoát");
            System.out.println("##################################");
            System.out.print("Chọn chức năng: ");

            // Kiểm tra xem người dùng có nhập số hay không để tránh lỗi văng chương trình
            if (nhapDuLieu.hasNextInt()) {
                suLuaChon = nhapDuLieu.nextInt();
                
                switch (suLuaChon) {
                    case 1:
                        System.out.println("\n--- Đang chạy Bài 1 ---");
                        // Gọi hàm main của Bai1
                        Bai1.main(null); 
                        break;
                    case 2:
                        System.out.println("\n--- Đang chạy Bài 2 ---");
                         Bai2.main(null);
                        break;
                    case 3:
                        System.out.println("\n--- Đang chạy Bài 3 ---");
                         Bai3.main(null);
                        break;
                    case 4:
                        System.out.println("\n--- Đang chạy Bài 4 ---");
                        Bai4.main(null);
                        break;
                    case 5:
                        System.out.println("\n--- Đang chạy Bài 5 ---");
                         Bai5.main(null);
                        break;
                    case 6:
                        System.out.println("Đã thoát chương trình. Tạm biệt!");
                        break;
                    default:
                        System.out.println("Lựa chọn không hợp lệ. Vui lòng chọn từ 1 đến 6.");
                }
            } else {
                System.out.println("Vui lòng chỉ nhập số tự nhiên!");
                nhapDuLieu.next(); // Xóa dữ liệu bị lỗi trong bộ đệm của Scanner
            }
            System.out.println(); 
            
        } while (suLuaChon != 6);
        
        nhapDuLieu.close();
    }
}