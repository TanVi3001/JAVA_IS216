package BTap;

public class Bai8 {
    public static void main(String[] args) {
        System.out.println("--- Bảng tính Pythagoras ---");
        
        for (int hang = 1; hang <= 10; hang++) {
            for (int cot = 1; cot <= 10; cot++) {
                System.out.print((hang * cot) + "\t");
            }
            System.out.println(); // Xuống dòng khi hết một hàng
        }
    }
}

