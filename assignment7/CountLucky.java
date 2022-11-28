public class CountLucky{

public static int countlucky(int[] nums){
int count = 0;
for(int i=0; i < nums.length; i++){
int a = nums[i];
if(a % 7 == 0)
  count++;
else if((a-7) % 10 == 0)
  count++;
}

  return count;
}

public static void testCountLucky(int[] nums, int expected){

int result = countlucky(nums);

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
values[0] = 49;

int[] values1 = new int[3];
values1[0] = 20;
values1[1] = 40;
values1[2] = 36;

int[] values2 = new int[4];
values2[0] = 49;
values2[1] = 35;
values2[2] = 27;
values2[3] = 77;

int[] values3 = new int[5];
values3[0] = 30;
values3[1] = 47;
values3[2] = 70;
values3[3] = 33;
values3[4] = 14;

int[] values4 = new int[3];
values4[0] = 1;
values4[1] = 6;
values4[2] = 21;


testCountLucky(values, 1);
testCountLucky(values1, 0);
testCountLucky(values2, 4);
testCountLucky(values3, 3);
testCountLucky(values4, 1);

}

}
