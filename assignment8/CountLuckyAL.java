import java.util.*;


public class CountLuckyAL{

public static int countlucky(ArrayList<Integer> nums){
int count = 0;
for(int i=0; i < nums.size(); i++){
int a = nums.get(i);
if(a % 7 == 0)
  count++;
else if((a-7) % 10 == 0)
  count++;
}

  return count;
}

public static void testCountLucky(ArrayList<Integer> nums, int expected){

int result = countlucky(nums);

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

ArrayList<Integer> values = new ArrayList<Integer>();
values.add(49);

ArrayList<Integer> values1 = new ArrayList<Integer>();
values1.add(20);
values1.add(40);
values1.add(36);

ArrayList<Integer> values2 = new ArrayList<Integer>();
values2.add(49);
values2.add(35);
values2.add(27);
values2.add(77);

ArrayList<Integer> values3 = new ArrayList<Integer>();
values3.add(30);
values3.add(47);
values3.add(70);
values3.add(33);
values3.add(14);

ArrayList<Integer> values4 = new ArrayList<Integer>();
values4.add(1);
values4.add(6);
values4.add(21);


testCountLucky(values, 1);
testCountLucky(values1, 0);
testCountLucky(values2, 4);
testCountLucky(values3, 3);
testCountLucky(values4, 1);

}

}
