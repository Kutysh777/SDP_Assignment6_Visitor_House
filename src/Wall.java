// Concrete Element
public class Wall implements HouseElement {
    private int area = 40;
    private boolean damaged = false;

    public int getArea() { return area; }
    public boolean isDamaged() { return damaged; }

    public void accept(HouseVisitor visitor) {
        visitor.visitWall(this);
    }
}
