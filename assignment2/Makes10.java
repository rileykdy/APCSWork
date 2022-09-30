//
//Makes10.java
//



public class Makes10
{


public static boolean makes10(int a, int b) {
  return(a==10 || b==10 || a+b==10);
}

public static void testMakes10(int a, int b, boolean expected){

boolean result = makes10(a, b);

System.out.println("a:" + a + "b:" + b + "expected:" + expected + "result:" + result);

if (result == expected)
  System.out.println("Sucess!");

else
  System.out.println("Failiure.");

}

 public static void main(String[] args){

testMakes10(10, 3, true);
testMakes10(4, 5, false);
testMakes10(2, 10, true);
testMakes10(7, 8, false);
testMakes10(1, 3, false);
testMakes10(7, 3, true);
testMakes10(5, 5, true);


 }





}
