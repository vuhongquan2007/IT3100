package shapes;

public class HinhVuong {
    private double canh;
    public HinhVuong() {
        this.canh = 0.0;
    }
    public HinhVuong(double canh) {
        if (canh >= 0) {
            this.canh = canh;
        } else {
            this.canh = 0.0;
        }
    }
    public double getCanh() {
        return this.canh;
    }
    public void setCanh(double canh) {
        if (canh >= 0) {
            this.canh = canh;
        } else {
            System.out.println("Do dai canh khong hop le (phai >= 0).");
        }
    }
}