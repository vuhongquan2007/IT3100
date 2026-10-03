import java.util.Arrays;
import java.util.Scanner;

public class array {
    public static void main (String args[]) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] a = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = scanner.nextInt();
        }
        scanner.close();
        for (int i = 0; i < n; i++) {
            System.out.print(a[i]);
            if (i < n - 1) {
                System.out.print(" ");
            }
            if (i == n - 1) {
                System.out.println();
            }
        }
        Arrays.sort(a);
        System.out.print(Arrays.toString(a));
    }
}
