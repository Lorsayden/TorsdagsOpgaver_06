import java.util.ArrayList;

public class ShapeBuilder {
    private ArrayList<Shape> shapes;

    ShapeBuilder(){
        shapes = new ArrayList<>();
    }

    public void addShape(Shape shape){
        shapes.add(shape);
    }

    public double getTotalArea(){
        double totalArea = 0;
        for(Shape element : shapes){
            totalArea += element.getArea();
        }
        return totalArea;
    }
}
