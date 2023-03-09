public class Snake extends Animal
{
    public Snake(String name, int legs, boolean furry)
    {
        super(name, legs, furry);
    }

   public String getName()
    {
        return "snake";
    }
    
    public int getLegs()
    {
        return 0;
    }
    
    public boolean isFurry()
    {
        return false;
    }
}

