import java.util.*;


public class ShapeCollection
{
    public ShapeCollection()
    {
        shapes = new ArrayList<Shape>();
    }

    public void addShape(String name, int sideCount)
    {
        Shape shape = new Shape(name, sideCount);
        shapes.add(shape);
    }

    public int getCount(String shapeName)
    {
    int result = 0;
    
        for (Shape s : shapes)
            if (s.getName().equals(shapeName))
                result = s.getSideCount();

        return result;
    }
    
    public double getAverage()
    {
        double total = 0.0;
        for (Shape s : shapes)
            total = total + s.getSideCount();
            
        
        return total/shapes.size();
    }
    
     public ArrayList<Shape> evenShapes()
    {
        ArrayList<Shape> result = new ArrayList<Shape>();

        for (Shape s : shapes)
            if (s.getSideCount() % 2 == 0)
                result.add(s);

        return result;
    }


    
    private ArrayList<Shape> shapes;


    public static void main(String[] args)
    {
        ShapeCollection collection = new ShapeCollection();

        collection.addShape("Rectangle", 4);
        collection.addShape("Triangle", 3);
        collection.addShape("Pentagon", 5);
        collection.addShape("Hexagon", 6);
        collection.addShape("Octagon", 8);

        System.out.println("Rectangle Side Count: " + collection.getCount("Rectangle"));
        System.out.println("Triangle Side Count: " + collection.getCount("Triangle"));
        System.out.println("Pentagon Side Count: " + collection.getCount("Pentagon"));
        System.out.println("Hexagon Side Count: " + collection.getCount("Hexagon"));
        System.out.println("Octagon Side Count: " + collection.getCount("Octagon"));
        
        
        System.out.println("Average: " + collection.getAverage());
        System.out.println("Even Shapes: " + collection.evenShapes());
    }
}

