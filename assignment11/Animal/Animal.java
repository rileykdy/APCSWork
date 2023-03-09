public class Animal
{
    public Animal(String name, int legs, boolean furry)
    {
        this.name = name;
        this.legs = legs;
        this.furry = furry;
    }

    public String getName()
    {
        return name;
    }
    
    public int getLegs()
    {
        return legs;
    }
    
    public boolean isFurry()
    {
        return furry;
    }

    public String name;
    public int legs;
    public boolean furry;
}

