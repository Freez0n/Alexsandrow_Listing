package listing_3;

interface Moveable {
    void move(int left, int top);
}
public class listing3_25 {
    public static void main(String[] args) {
        Auto a = new Auto(4, 4, 200, 12, true);
        Vehicle v = new Vehicle();

        Vehicle[] va = {a, v};
        for (int i = 0; i < va.length; i++) {
            System.out.println(va[i].toString());
            if (va[i] instanceof Moveable) {
                Moveable m = (Moveable) va[i];
                m.move(10+i*34, 34);
            }
        }
    }
}
