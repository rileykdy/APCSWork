import java.util.*;

public class ItemCalculator{

public static void List(ArrayList<Item> items){

for (Item a : items){
System.out.println("Name: " + a.getName() + "   Price: " + a.getPrice());
}
}

public static float priceAverage(ArrayList<Item> items){

float total = 0.0f;

for (Item a : items){
  total = total + a.getPrice();
}

return total/items.size();

}

public static String mostExpensive(ArrayList<Item> items){

  String b = " ";
  float c = 0.0f;

  for(Item a : items){
    if(a.getPrice() > c)
    b = a.getName();
    c = a.getPrice();
  }
  return b;
}


public static void main(String[] args){

ArrayList<Item> items = new ArrayList<Item>();

items.add(new Item("apple", 1.75f));
items.add(new Item("banana", 2.25f));
items.add(new Item("toaster", 64.50f));
items.add(new Item("fork", 4.25f));
items.add(new Item("rat", 0.0f));

List(items);

System.out.println("Average Price: " + priceAverage(items));

System.out.println("Most Expensive Item: " + mostExpensive(items));
}



}
