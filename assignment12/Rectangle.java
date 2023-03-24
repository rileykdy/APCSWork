public class Rectangle {


    public Rectangle(String nameA, double widthA, double heightA)
    {
        name = nameA;
        width = widthA;
        height = heightA;
    }

    private String name; 
    private double width;
    private double height;

    

    public String getName()
    {
        return name;
    }
    
    public double getWidth()
    {
        return width;
    }
    
    public double getHeight()
    {
        return height;
    }
    
    public double area()
    {
        return width*height;
    }
    
    public double perimeter()
    {
        return width*2 + height*2;
    }
}

