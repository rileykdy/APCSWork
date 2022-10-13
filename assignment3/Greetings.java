public class Greetings{

public static String greetings(String name){
  return("Hello, " + name + ", how are you?");

}

public static void testGreetings(String name, String expected){

String result = greetings(name);

System.out.println("name: " + name + " expected: " + expected + " result: " + result);

if (result.equals(expected))
  System.out.println("Sucess!");

else
  System.out.println("Failiure.");

}

public static void main(String[] args){

testGreetings("Riley", "Hello, Riley, how are you?");
testGreetings("John Doe", "Hello, John Doe, how are you?");
testGreetings("Casey", "Hello, Casey, how are you?");
testGreetings("Steve", "Hello, Steve, how are you?");
testGreetings("name", "Hello, name, how are you?");

}
}
