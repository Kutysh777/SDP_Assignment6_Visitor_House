// Client
public class Main {
    public static void main(String[] args) {
        HouseElement[] house = {new Wall(), new Roof()};
        HouseVisitor paint = new PaintVisitor();
        HouseVisitor inspection = new InspectionVisitor();

        for (HouseElement element : house) {
            element.accept(paint);
        }
        for (HouseElement element : house) {
            element.accept(inspection);
        }
    }
}
