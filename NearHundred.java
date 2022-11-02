public class NearHundred{

public static boolean nearHundred(int n) {
  return((Math.abs(100-n)<=10) || (Math.abs(200-n)<=10));
}


public static void testNearHundred(int n, boolean expected){

boolean result = nearHundred(n);

System.out.println("n: " + n + " expected: " + expected + " result: " + result);


if (result == expected)
  System.out.println("Sucess!");

else
  System.out.println("Failiure.");
}

public static void main(String[] args){

testNearHundred(100, true);
testNearHundred(90, true);
testNearHundred(195, true);
testNearHundred(206, true);
testNearHundred(103, true);
testNearHundred(211, false);
testNearHundred(30, false);
testNearHundred(89, false);
testNearHundred(150, false);
testNearHundred(115, false);

}



}
