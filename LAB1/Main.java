import shapes.HinhVuong;
import shapes.HinhTron;

public class Main {
    public static void main(String[] args) {
        System.out.println("=== KIEM TRA HINH VUONG ===");
        HinhVuong hv = new HinhVuong(5.0);
        System.out.println("Canh ban dau: " + hv.getCanh());
        hv.setCanh(8.5);
        System.out.println("Canh sau khi set: " + hv.getCanh());
        System.out.print("Thu dat canh = -3: ");
        hv.setCanh(-3);
        System.out.println("\n=== KIEM TRA HINH TRON ===");
        HinhTron ht = new HinhTron(3.0);
        System.out.println("Ban kinh ban dau: " + ht.getBanKinh());
        ht.setBanKinh(6.2);
        System.out.println("Ban kinh sau khi set: " + ht.getBanKinh());
        System.out.print("Thu dat ban kinh = -1: ");
        ht.setBanKinh(-1);
    }
}