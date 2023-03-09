import java.util.*;

public class VehicleStats{


public static void humanPower(ArrayList<Vehicle> vehic){

ArrayList<Vehicle> result = new ArrayList<Vehicle>();

for (Vehicle v : vehic){
    if (v.isHumanPowered() == true)
        result.add(v);
    
}

    for (Vehicle v : result){
        System.out.println(v.name());
    }

}
    
public static void countWheels(ArrayList<Vehicle> vehic){

int a = 0;

for (Vehicle v : vehic){
    a = a + v.wheelCount();
}
    
    System.out.println("Wheel Count: " + a);
}

public static void main(String[] args){

Car c = new Car();
Car c1 = new Car();

Motorcycle m = new Motorcycle();
Motorcycle m1 = new Motorcycle();

Bicycle b = new Bicycle();
Bicycle b1 = new Bicycle();

Unicycle u = new Unicycle();

    
    
ArrayList<Vehicle> test = new ArrayList<Vehicle>();
test.add(c);
test.add(c1);
test.add(m);
test.add(u);

ArrayList<Vehicle> test1 = new ArrayList<Vehicle>();
test1.add(b);
test1.add(b1);
test1.add(m1);


countWheels(test);
humanPower(test);
countWheels(test1);
humanPower(test1);




}
}