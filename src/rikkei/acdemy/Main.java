package rikkei.acdemy;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[][] matrix = new int[5][5];
        int collumn;
        int sum = 0;
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                matrix[i][j] = (int) (Math.random() * 99) + 1;
            }
        }
        System.out.println("Cột 1\t" + "Cột 2\t" + "Cột 3\t" + "Cột 4\t" + "Cột 5\t");
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                System.out.print(" " + matrix[i][j] + "\t\t");
            }
            System.out.println(" ");
        }
        do {
            System.out.println("Nhập cột muốn tính tổng:");
            collumn = sc.nextInt();
            if (collumn < 0 || collumn > 5) {
                System.out.println("Ngoài khả năng thực hiện! Vui lòng nhập lại.");
            }
        } while (collumn < 0 || collumn > 5);
        for (int i = 0; i < 5; i++) {
            sum += matrix[i][collumn - 1];
        }
        System.out.println("Tổng của cột " + collumn + " = " + sum);
    }
}
