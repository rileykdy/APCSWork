public class SumOfSquares{

public static int sumOfSquares(int n) {

  int result = 0;

  for(int i=0; i<=n; i++){
    result = result + (i*i);

  }

  return result;
}


public static void testSumOfSquares(int n, int expected){

  int result = sumOfSquares(n);

  System.out.println("N: " + n + " expected: " + expected + " result: " + result);

if (result == expected)
  System.out.println("Sucess!");

else
  System.out.println("Failiure.");
}

public static void main(String[] args){

testSumOfSquares(0, 0);
testSumOfSquares(1, 1);
testSumOfSquares(2, 5);
testSumOfSquares(3, 14);
testSumOfSquares(4, 30);
testSumOfSquares(5, 55);
testSumOfSquares(6, 91);
testSumOfSquares(7, 140);
testSumOfSquares(8, 204);

}
}
