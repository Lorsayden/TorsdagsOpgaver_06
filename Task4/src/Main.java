import java.util.ArrayList;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        Circle a = new Circle(134);
        Square b = new Square(20);

        ShapeBuilder shapeBuilder = new ShapeBuilder();
        shapeBuilder.addShape(a);
        shapeBuilder.addShape(b);

        System.out.println(shapeBuilder.getTotalArea());
    }
}