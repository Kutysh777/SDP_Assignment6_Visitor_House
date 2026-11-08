// Concrete Visitor: inspect condition
public class InspectionVisitor implements HouseVisitor {
    public void visitWall(Wall wall) {
        if (wall.isDamaged())
            System.out.println("Wall needs repair");
        else
            System.out.println("Wall is in good condition");
    }

    public void visitRoof(Roof roof) {
        if (roof.isDamaged())
            System.out.println("Roof needs repair");
        else
            System.out.println("Roof is in good condition");
    }
}
