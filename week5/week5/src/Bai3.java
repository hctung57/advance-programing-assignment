import java.util.Random;
import java.util.Scanner;
public class Bai3 {
    public static void main(String[] args) {
        int[] arr = new int[100];
        Random random = new Random();
        for (int i = 0; i < 100; i++) {
            arr[i] = random.nextInt(1000); // giới hạn giá trị của phần tử từ 0 đến 999
        }

        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhập chỉ số của mảng: ");
        int index = scanner.nextInt();
        try {
            int value = arr[index];
            System.out.println("Giá trị của phần tử tại chỉ số " + index + " là " + value);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Ngoài giới hạn");
        }

        scanner.close();
    }
}
