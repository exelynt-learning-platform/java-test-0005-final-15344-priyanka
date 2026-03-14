public class NumberPattern {

    private static final int ROWS = 5;

public static void main(String[] args) {
    int num = 1;

    for (int i = 1; i <= ROWS; i++) {
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