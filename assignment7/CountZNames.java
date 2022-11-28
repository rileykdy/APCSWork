public class CountZNames{

public static int countznames(String[] nums){
int count = 0;
for(int i=0; i < nums.length; i++){
  String a = nums[i];
  String b = a.substring(0,1);
  if(b.equals("z") || b.equals("Z")){
    count = count + a.length();
  }
}

  return count;
}

public static void testCountZNames(String[] nums, int expected){

int result = countznames(nums);

System.out.print("Names: ");
for (int i=0; i<nums.length; i++){
  System.out.print(nums[i] + " ");
}

System.out.println("Expected: " + expected + " Result: " + result);

if (result == expected)
  System.out.println("Sucess!");

else System.out.println("Failiure.");

}

public static void main(String[] args){

String[] values = new String[1];
values[0] = "Riley";

String[] values1 = new String[3];
values1[0] = "Zebra";
values1[1] = "xyz";
values1[2] = "zax";

String[] values2 = new String[4];
values2[0] = "hello";
values2[1] = "hzyasdf";
values2[2] = "zach";
values2[3] = "Zsdfhalk";

String[] values3 = new String[3];
values3[0] = "Casey";
values3[1] = "Zion";
values3[2] = "yay";


testCountZNames(values, 0);
testCountZNames(values1, 8);
testCountZNames(values2, 12);
testCountZNames(values3, 4);

}


}
