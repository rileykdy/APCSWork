public class Attention{

public static boolean attention(String str){

String start = str.substring(0,9);

return(start.equals("Hey, you!"));

}

public static void testAttention(String str, boolean expected){

boolean result = attention(str);

System.out.println("str: " + str + " expected: " + expected + " result: " + result);

if (result == expected)
  System.out.println("Sucess!");

else
  System.out.println("Failiure.");
}

public static void main(String[] args){

  testAttention("Hey, you! Insert test sentence here!", true);
  testAttention("Hey, you! Words.", true);
  testAttention("My name is Riley!", false);
  testAttention("This is a program", false);

}
}
