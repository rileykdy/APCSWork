import java.util.*;


public class CountZNamesAL{

public static int countznames(ArrayList<String> nums){
int count = 0;
for(int i=0; i < nums.size(); i++){
  String a = nums.get(i);
  String b = a.substring(0,1);
  if(b.equals("z") || b.equals("Z")){
    count = count + a.length();
  }
}

  return count;
}

public static void testCountZNames(ArrayList<String> nums, int expected){

int result = countznames(nums);

System.out.print("Names: ");
for (int i=0; i<nums.size(); i++){
  System.out.print(nums.get(i) + " ");
}

System.out.println("Expected: " + expected + " Result: " + result);

if (result == expected)
  System.out.println("Sucess!");

else System.out.println("Failiure.");

}

public static void main(String[] args){

ArrayList<String> values = new ArrayList<String>();
values.add("Riley");

ArrayList<String> values1 = new ArrayList<String>();
values1.add("Zebra");
values1.add("xyz");
values1.add("zax");

ArrayList<String> values2 = new ArrayList<String>();
values2.add("hello");
values2.add("hzyasdf");
values2.add("zach");
values2.add("Zsdfhalk");

ArrayList<String> values3 = new ArrayList<String>();
values3.add("Casey");
values3.add("Zion");
values3.add("yay");


testCountZNames(values, 0);
testCountZNames(values1, 8);
testCountZNames(values2, 12);
testCountZNames(values3, 4);

}


}
