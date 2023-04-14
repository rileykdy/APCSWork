public class Student
{
    public Student(String name, int favNumber)
    {
        this.name = name;
        this.favNumber = favNumber;
    }

    public String getName() {return name;}
    public int getFavNumber() {return favNumber;}
    public String toString() {return name + " " + favNumber;}

    
    private String name;
    private int favNumber;
}

