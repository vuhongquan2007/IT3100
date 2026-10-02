package example1;

import java.util.Scanner;

public class Test {
    public static void main(String args[]) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhap so sinh vien: ");
        int n = scanner.nextInt();
        scanner.nextLine();
        Student[] a = new Student[n];
        for (int i = 0; i < n; i++) {
            System.out.println("Nhap sinh vien thu " + (i + 1) + ": ");
            System.out.print("Name: ");
            String name = scanner.nextLine();
            System.out.print("Year: ");
            int year = scanner.nextInt();
            scanner.nextLine();
            a[i] = new Student(name, year);
        }
        scanner.close();
        int ageTotal = 0;
        System.out.println("Danh sach sinh vien: ");
        for (int i = 0; i < n; i++) {
            System.out.println("Sinh vien thu " + (i + 1) + ": " + a[i].getName() + " - " + a[i].getYear());
            ageTotal += a[i].getYear();
        }
        System.out.println("Tong so tuoi cua cac sinh vien la: " + ageTotal);
    }
}
