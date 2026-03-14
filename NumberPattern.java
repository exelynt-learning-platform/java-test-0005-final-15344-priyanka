import java.util.Scanner;

public class NumberPattern {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of rows: ");
        int totalRows = sc.nextInt();

        printPattern(totalRows);
    }

    public static void printPattern(int totalRows) {
        int num = 1;

        for (int i = 1; i <= totalRows; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(num);
                if (j < i) {
                    System.out.print(" ");
                }
                num++;
            }
            System.out.println();
        }
    }
}