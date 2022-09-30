public class GoodDeal
{


public static boolean goodDeal(double original, double sale) {
  if (sale < .75*original)
    return true;

  else
    return false;
}


public static void testGoodDeal(double original, double sale, boolean expected){

boolean result = goodDeal(original, sale);

System.out.println("Original Price: " + original + " Sale Price: " + sale + " expected: " + expected + " result: " + result);

if (result == expected)
  System.out.println("Sucess!");

else
  System.out.println("Failiure.");

}

public static void main(String[] args){

testGoodDeal(100, 80, false);
testGoodDeal(100, 70, true);
testGoodDeal(20, 14, true);
testGoodDeal(20, 18, false);
testGoodDeal(40, 35, false);
testGoodDeal(10, 2, true);

}
}
