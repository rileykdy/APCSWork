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

public static void testFibonacciAA(int n){

ArrayList<Integer> result = fibonacciAA(n);
System.out.println("");
System.out.println("Number: " + n);
System.out.println("Sequence: ");
for (int i=0; i<result.size(); i++){
System.out.print(result.get(i) + " ");
}

System.out.println("");

}

public static void main(String[] args){

int test = 2;
int test1 = 3;
int test2 = 4;
int test3 = 5;
int test4 = 10;

testFibonacciAA(test);
testFibonacciAA(test1);
testFibonacciAA(test2);
testFibonacciAA(test3);
testFibonacciAA(test4);

}
}
