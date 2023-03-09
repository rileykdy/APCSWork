public class Human extends Animal
{
    public Human(String name, int legs, boolean furry)
    {
        super(name, legs, furry); 
    }

   public String getName()
    {
        return "human";
    }
    
    public int getLegs()
    {
        return 2;
    }
    
    public boolean isFurry()
    {
        return false;
    }
}

