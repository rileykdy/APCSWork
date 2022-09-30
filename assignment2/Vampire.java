public class Vampire {


public static boolean isVampire(float hour, boolean awake){

if (awake == false && (hour<22 && hour>6))
  return true;

else if (awake == true && (hour>22 || hour<6))
  return true;

else
  return false;

}

public static void testIsVampire(float hour, boolean awake, boolean expected){

boolean result = isVampire(hour, awake);

System.out.println("awake:" + awake + "hour:" + hour + "expected:" + expected + "result:" + result);

if (result == expected)
  System.out.println("Sucess!");

else
  System.out.println("Failiure.");

}

public static void main(String[] args){

testIsVampire(7, true, false);
testIsVampire(21, true, false);
testIsVampire(23, true, true);
testIsVampire(4, true, true);
testIsVampire(2, false, false);
testIsVampire(24, false, false);
testIsVampire(12, false, true);
testIsVampire(8, false, true);

}
}
