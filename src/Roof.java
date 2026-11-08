// Concrete Element
public class Roof implements HouseElement {
    private int area = 60;
    private boolean damaged = true;

    public int getArea() { return area; }
    public boolean isDamaged() { return damaged; }

    public void accept(HouseVisitor visitor) {
        visitor.visitRoof(this);
    }
}
