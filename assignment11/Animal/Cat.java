public class Cat extends Animal
{
    public Cat(String name, int legs, boolean furry)
    {
        super(name, legs, furry); 
         
    }

   public String getName()
    {
        return "cat";
    }
    
    public int getLegs()
    {
        return 4;
    }
    
    public boolean isFurry()
    {
        return true;
    }
}

