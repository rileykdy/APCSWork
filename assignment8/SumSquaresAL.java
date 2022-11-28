import java.util.*;


public class SumSquaresAL{

public static double sumsquares(ArrayList<Double> nums){
double count = 0;
for(int i=0; i < nums.size(); i++){
  double a = nums.get(i);
  count = count + (a*a);
}

  return count;
}

public static void testSumSquares(ArrayList<Double> nums, double expected){

double result = sumsquares(nums);

System.out.print("Numbers: ");
for (int i=0; i<nums.size(); i++){
  System.out.print(nums.get(i) + " ");
}

System.out.println("Expected: " + expected + " Result: " + result);

if (result == expected)
  System.out.println("Sucess!");

else System.out.println("Failiure.");

}

public static void main(String[] args){

ArrayList<Double> values = new ArrayList<Double>();
values.add(2.0);

ArrayList<Double> values1 = new ArrayList<Double>();
values1.add(1.0);
values1.add(2.0);
values1.add(3.0);

ArrayList<Double> values2 = new ArrayList<Double>();
values2.add(4.0);
values2.add(5.0);
values2.add(2.0);
values2.add(10.0);

ArrayList<Double> values3 = new ArrayList<Double>();
values3.add(2.0);
values3.add(2.0);
values3.add(2.0);


testSumSquares(values, 4.0);
testSumSquares(values1, 14.0);
testSumSquares(values2, 145.0);
testSumSquares(values3, 12.0);

}

}
