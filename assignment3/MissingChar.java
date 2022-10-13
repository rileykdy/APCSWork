public class MissingChar{

public static String missingChar(String str, int n) {
  String front = str.substring(0,n);
  String back = str.substring(n+1,str.length());

  return front + back;
}


public static void testMissingChar(String str, int n, String expected){

String result = missingChar(str, n);

System.out.println("str: " + str + " n: " + n + " expected: " + expected + " result: " + result);

if (result.equals(expected))
  System.out.println("Sucess!");

else
  System.out.println("Failiure.");

}

public static void main(String[] args){

testMissingChar("cat", 1, "ct");
testMissingChar("riley", 0, "iley");
testMissingChar("riley", 3, "rily");
testMissingChar("riley", 1, "rley");
testMissingChar("hello", 4, "hell");
testMissingChar("hello", 2, "helo");

}
}
