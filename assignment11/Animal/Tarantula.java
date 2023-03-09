public class Tarantula extends Animal
{
    public Tarantula(String name, int legs, boolean furry)
    {
        super(name, legs, furry); 
    }

   public String getName()
    {
        return "tarantula";
    }
    
    public int getLegs()
    {
        return 8;
    }
    
    public boolean isFurry()
    {
        return true;
    }
}

