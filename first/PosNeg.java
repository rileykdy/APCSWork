public class PosNeg
{


public static boolean posNeg(int a, int b, boolean negative) {
  if (negative == true)
    return (a<0 && b<0);

  else
      return((a<0 && b>0) || (a>0 && b<0));
}


public static void testPosNeg(int a, int b, boolean negative, boolean expected){

boolean result = posNeg(a, b, negative);

System.out.println("a:" + a + "b:" + b + "negative:" + negative + "expected:" + expected + "result:" + result);

if (result == expected)
  System.out.println("Sucess!");

else
  System.out.println("Failiure.");

}
public static void main(String[] args){

testPosNeg(-1, -1, false, false);
testPosNeg(1, 1, false, false);
testPosNeg(5, -3, false, true);
testPosNeg(24, 15, false, false);
testPosNeg(-1, -1, true, true);
testPosNeg(1, 1, true, false);
testPosNeg(5, -8, true, false);
testPosNeg(-4, -15, true, true);

}
}
