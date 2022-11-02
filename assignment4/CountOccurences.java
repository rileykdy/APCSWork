public class CountOccurences{

public static int countOccurences(String a, String b) {
  int count = 0;

  for (int i =0; i < a.length() - b.length() + 1; i++){
    String aSub = a.substring(i, (i + b.length()));
    if (aSub.equals(b)) {
      count++;
    }
  }

  return count;
}


public static void testCountOccurences(String a, String b, int expected){

  int result = countOccurences(a, b);

  System.out.println("A: " + a + " B: " + b + " expected: " + expected + " result: " + result);

if (result == expected)
  System.out.println("Sucess!");

else
  System.out.println("Failiure.");

}

public static void main(String[] args){

testCountOccurences("Mississippi", "iss", 2);
testCountOccurences("hahaha", "ha", 3);
testCountOccurences("banananana", "na", 4);
testCountOccurences("cat", "q", 0);
testCountOccurences("gaggle", "g", 3);

}

}
