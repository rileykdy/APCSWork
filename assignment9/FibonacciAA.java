import java.util.*;

public class FibonacciAA{

public static ArrayList<Integer> fibonacciAA(int n){

ArrayList<Integer> result = new ArrayList<Integer>();
int a = 1;
int b = 1;
int c;

for(int i=0; i<n; i++){
c=a+b;
a=b;
b=c;
result.add(b);
}

return result;
}

public static void testFibonacciAA(int n, ArrayList<Integer> expected){

ArrayList<Integer> result = fibonacciAA(n);

System.out.print("Sequence: ");
for (int i=0; i<result.size(); i++){
System.out.print(result.get(i) + " ");
}

System.out.println("Expected: " + expected + " Result: " + result);

if (result == expected)
  System.out.println("Sucess!");

else System.out.println("Failiure.");

}

public static void main(String[] args){




}
}
