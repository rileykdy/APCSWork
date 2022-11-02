public class Reverse{

public static String reverse(String str) {
  String result = "";
  for(int i=str.length(); i>0; i=i-1){

    String x = str.substring(i-1, i);

    result = result + x;
  }
  return result;
}

public static void testReverse(String str, String expected){

  String result = reverse(str);

  System.out.println("str: " + str + " expected: " + expected + " result: " + result);

if (result.equals(expected))
  System.out.println("Sucess!");

else
  System.out.println("Failiure.");

}

public static void main(String[] args){

testReverse("hello", "olleh");
testReverse("Riley", "yeliR");
testReverse("Casey", "yesaC");
testReverse("tacocat", "tacocat");
testReverse("dog", "god");

}

}
