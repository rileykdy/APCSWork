public class Factorial{

public static int factorial(int n) {

  int result = 1;

  for(int i=1; i<=n; i++){
    result = result * i;

  }

  return result;
}


public static void testFactorial(int n, int expected){

  int result = factorial(n);

  System.out.println("N: " + n + " expected: " + expected + " result: " + result);

if (result == expected)
  System.out.println("Sucess!");

else
  System.out.println("Failiure.");
}

public static void main(String[] args){

testFactorial(0, 1);
testFactorial(1, 1);
testFactorial(2, 2);
testFactorial(3, 6);
testFactorial(4, 24);
testFactorial(5, 120);

}
}
