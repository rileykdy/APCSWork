public class SumSquares{

public static int sumsquares(int[] nums){
int count = 0;
for(int i=0; i < nums.length; i++){
  int a = nums[i];
  count = count + (a*a);
}

  return count;
}

public static void testSumSquares(int[] nums, int expected){

int result = sumsquares(nums);

System.out.print("Numbers: ");
for (int i=0; i<nums.length; i++){
  System.out.print(nums[i] + " ");
}

System.out.println("Expected: " + expected + " Result: " + result);

if (result == expected)
  System.out.println("Sucess!");

else System.out.println("Failiure.");

}

public static void main(String[] args){

int[] values = new int[1];
values[0] = 2;

int[] values1 = new int[3];
values1[0] = 1;
values1[1] = 2;
values1[2] = 3;

int[] values2 = new int[4];
values2[0] = 4;
values2[1] = 5;
values2[2] = 2;
values2[3] = 10;

int[] values3 = new int[3];
values3[0] = 2;
values3[1] = 2;
values3[2] = 2;


testSumSquares(values, 4);
testSumSquares(values1, 14);
testSumSquares(values2, 145);
testSumSquares(values3, 12);

}

}
