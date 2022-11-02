public class StringMatch{

public static int stringMatch(String a, String b) {
  int length = Math.min(a.length(), b.length());
  int count = 0;

  for (int i =0; i<length-1; i++){
    String aSub = a.substring(i, i+2);
    String bSub = b.substring(i,i+2);
    if (aSub.equals(bSub)) {
      count++;
    }
  }

  return count;
}


public static void testStringMatch(String a, String b, int expected){

  int result = stringMatch(a, b);

  System.out.println("A: " + a + " B: " + b + " expected: " + expected + " result: " + result);

if (result == expected)
  System.out.println("Sucess!");

else
  System.out.println("Failiure.");

}

public static void main(String[] args){

testStringMatch("Casey", "Riley", 1);
testStringMatch("hahaha", "hahaha", 5);
testStringMatch("thereafter", "thrheafkly", 3);
testStringMatch("cat", "dog", 0);
testStringMatch("sunny", "funny", 3);

}

}
