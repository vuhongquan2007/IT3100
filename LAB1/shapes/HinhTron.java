package shapes;

public class HinhTron {
    private double banKinh;
    public HinhTron() {
        this.banKinh = 0.0;
    }
    public HinhTron(double banKinh) {
        if (banKinh >= 0) {
            this.banKinh = banKinh;
        } else {
            this.banKinh = 0.0;
        }
    }
    public double getBanKinh() {
        return this.banKinh;
    }
    public void setBanKinh(double banKinh) {
        if (banKinh >= 0) {
            this.banKinh = banKinh;
        } else {
            System.out.println("Ban kinh khong hop le (phai >= 0).");
        }
    }
}