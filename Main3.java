import java.util.Scanner;

public class Main3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] numbers = new int[10];

        // รับค่าตัวเลขจำนวนเต็ม 10 จำนวน เก็บใน Array
        for (int i = 0; i < 10; i++) {
            System.out.print("Enter integer " + (i + 1) + ": ");
            numbers[i] = scanner.nextInt();
        }

        // กำหนดค่าเริ่มต้นสำหรับค่าต่ำสุดและสูงสุดด้วยข้อมูลตัวแรกใน Array
        int min = numbers[0];
        int max = numbers[0];

        // วนลูปเพื่อเปรียบเทียบหาค่าต่ำสุดและสูงสุด
        for (int i = 1; i < 10; i++) {
            if (numbers[i] < min) {
                min = numbers[i];
            }
            if (numbers[i] > max) {
                max = numbers[i];
            }
        }

        // แสดงผลลัพธ์ตาม Output ที่โจทย์กำหนด
        System.out.println("Minimum number = " + min);
        System.out.println("Maximum number = " + max);

        scanner.close();
    }
}

