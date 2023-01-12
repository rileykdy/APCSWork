import java.util.*;

public class PersonStats{

  public static double petsAverage(ArrayList<Person> people){

  int total = 0;

  for (Person a : people){
    total = total + a.getPets();
  }

  return total/people.size();
}

public static String mostPets(ArrayList<Person> people){

  String b = " ";
  int c = 0;

  for(Person a : people){
    if(a.getPets() > c)
    b = a.getName();
    c = a.getPets();
  }
  return b;
}

public static ArrayList<Person> twoPets(ArrayList<Person> people){

ArrayList<Person> stand = new ArrayList<Person>();

for(Person a : people){
if(a.getPets() > 1)
stand.add(a);
}

return stand;
}


public static void main(String[] args){

ArrayList<Person> people = new ArrayList<Person>();

people.add(new Person("Riley", 2));
people.add(new Person("Steve", 0));
people.add(new Person("Jane", 7));
people.add(new Person("John", 4));
people.add(new Person("Cal", 1));

System.out.println("Average number of pets: " + petsAverage(people));
System.out.println("Person with the most pets: " + mostPets(people));
System.out.print("People with two or more pets:");
for(Person b : twoPets(people)){
  System.out.print(" " + b.getName());
}
}
}
