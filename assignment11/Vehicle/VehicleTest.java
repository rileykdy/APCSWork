import java.util.*;


public class VehicleTest
{
    public static void main(String[] args)
    {

        ArrayList<Vehicle> vehicles = new ArrayList<Vehicle>();

        Car c = new Car();
        vehicles.add(c);

        Motorcycle m = new Motorcycle();
        vehicles.add(m);

        Bicycle b = new Bicycle();
        vehicles.add(b);

        Unicycle u = new Unicycle();
        vehicles.add(u);

        for (Vehicle v : vehicles)
            System.out.println(v.name() + " " + v.wheelCount() +
                    " " + v.isHumanPowered());

    }
}

