import java.util.*;

public class AnimalCalculator{


public static void print(ArrayList<Animal> animals){

for (Animal a : animals){
        System.out.println("NAME: " + a.getName() + " LEGS: " + a.getLegs() + " FURRY?: " + a.isFurry());
    }

}
    
public static double avgLegs(ArrayList<Animal> animals){

int c = 0;

for (Animal a : animals){
    c = c + a.getLegs();
}
    return c/animals.size();
}

public static Animal leastLegs(ArrayList<Animal> animals){

int c = 50;
Animal x = null;

for (Animal a : animals){
    if (a.getLegs() < c){
    c = a.getLegs();
    x = a;
    }
}
System.out.println("LEAST LEGS: " + x.getName());
return x;

}

public static void main(String[] args){

Cat c = new Cat("cat", 4, true);
Cat c1 = new Cat("cat", 4, true);
    
Snake s = new Snake("snake", 0, false);
Snake s1 = new Snake("snake", 0, false);
Snake s2 = new Snake("snake", 0, false);

Human h = new Human("human", 2, false);
Human h1 = new Human("human", 2, false);
    
Tarantula t = new Tarantula("tarantula", 8, true);
Tarantula t1 = new Tarantula("tarantula", 8, true);
    
ArrayList<Animal> test = new ArrayList<Animal>();
test.add(c);
test.add(c1);
test.add(h);
test.add(s);
test.add(t);

ArrayList<Animal> test1 = new ArrayList<Animal>();
test1.add(s1);
test1.add(s2);
test1.add(t1);
test1.add(h1);

System.out.println("TEST 1");
print(test);
System.out.println("Average Legs: " + avgLegs(test));
leastLegs(test);
System.out.println("TEST 2");
print(test1);
System.out.println("Average Legs: " + avgLegs(test1));
leastLegs(test1);

}
}