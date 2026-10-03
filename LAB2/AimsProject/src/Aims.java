public class Aims {
    public static void main(String[] args) {
        Cart anOrder = new Cart();
        DigitalVideoDisc disc1 = new DigitalVideoDisc ("Vat ly dai cuong", "Khoa hoc", "Luong Duyen Binh", 30, 29.95f);
        anOrder.addDisc(disc1);
        System.out.println("The total of the cost: " + anOrder.totalCost());
    }
}
