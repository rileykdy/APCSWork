public class FindMax{

public static double findMax(double[] values){

double result = 0.0;

for(int i = 0; i < values.length; i++){
if(result < values[i])
result = values[i];
}

return result;
}

public static void testFindMax(double[] values, double expected){

double result = findMax(values);

System.out.print("Numbers: ");
for (int i=0; i<values.length; i++){
System.out.print(values[i] + " ");
}

System.out.println("Expected: " + expected + " Result: " + result);

if (result == expected)
  System.out.println("Sucess!");

else System.out.println("Failiure.");

}

public static void main(String[] args){

double[] nums = new double[1];
nums[0] = 3.0;

double[] nums1 = new double[5];
nums1[0] = 5.3;
nums1[1] = 5.5;
nums1[2] = 3.0;
nums1[3] = 1.6;
nums1[4] = 7.8;

double[] nums2 = new double[3];
nums2[0] = 9.2;
nums2[1] = 4.1;
nums2[2] = 7.5;

double[] nums3 = new double[4];
nums3[0] = 3.8;
nums3[1] = 6.8;
nums3[2] = 2.2;
nums3[3] = 0.3;

double[] nums4 = new double[4];
nums4[0] = 0.4;
nums4[1] = 0.8;
nums4[2] = 1.4;
nums4[3] = 0.2;

testFindMax(nums, 3.0);
testFindMax(nums1, 7.8);
testFindMax(nums2, 9.2);
testFindMax(nums3, 6.8);
testFindMax(nums4, 1.4);

}
}
