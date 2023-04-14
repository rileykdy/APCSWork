public class Shape
{
    public Shape(String name, int sideCount)
    {
        this.name = name;
        this.sideCount = sideCount;
    }

    public String getName() {return name;}
    public int getSideCount() {return sideCount;}
    public String toString() {return name + " " + sideCount;}

    
    private String name;
    private int sideCount;
}

