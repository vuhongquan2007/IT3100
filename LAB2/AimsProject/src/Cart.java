public class Cart {
    public static final int MAX = 20;
    private DigitalVideoDisc[] cart = new DigitalVideoDisc[MAX];

    private int qtyOrdered = 0;

    public void addDisc (DigitalVideoDisc disc) {
        if (qtyOrdered >= MAX) {
            System.out.println("The cart has been full!");
        }
        else {
            cart[qtyOrdered] = disc;
            qtyOrdered++;
            System.out.println("The disc has been added!");
        }
    }

    public float totalCost () {
        float total = 0f;
        for (int i = 0; i < qtyOrdered; i++) {
            total += cart[i].getCost();
        }
        return total;
    }
}
