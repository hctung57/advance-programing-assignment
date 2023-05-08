import java.util.Scanner;
import java.util.InputMismatchException;
public class Bai2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num1 = 0;
        int num2 = 0;

        boolean validInput = false;
        while (!validInput) {
            try {
                System.out.print("Nhập số nguyên thứ nhất: ");
                num1 = scanner.nextInt();
                System.out.print("Nhập số nguyên thứ hai: ");
                num2 = scanner.nextInt();
                validInput = true;
            } catch (InputMismatchException e) {
                System.out.println("Đầu vào không chính xác. Vui lòng nhập lại.");
                scanner.next();
            }
        }

        int sum = num1 + num2;
        System.out.println("Tổng của hai số là: " + sum);
        scanner.close();
    }
}
