// Concrete Visitor
public class PaintVisitor implements HouseVisitor {
    public void visitWall(Wall wall) {
        System.out.println("Wall paint: " + wall.getArea() / 10 + " liters");
    }
    public void visitRoof(Roof roof) {
        System.out.println("Roof paint: " + roof.getArea() / 5 + " liters");
    }
}
