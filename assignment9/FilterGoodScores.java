import java.util.*;

public class FilterGoodScores{

public static ArrayList<Integer> filterGoodScores(ArrayList<Integer> values){

ArrayList<Integer> result = new ArrayList<Integer>();

for(int i=0; i<values.size(); i++){
if(values.get(i) > 90)
result.add(values.get(i));
}

return result;
}

public static void testFilterGoodScores(ArrayList<Integer> values){

ArrayList<Integer> result = filterGoodScores(values);

System.out.println("Input: ");
for (int i=0; i<values.size(); i++){
System.out.print(values.get(i) + " ");
}
System.out.println("");
System.out.println("Output: ");
for (int i=0; i<result.size(); i++){
System.out.print(result.get(i) + " ");
}
System.out.println("");
}

public static void main(String[] args){

ArrayList<Integer> test = new ArrayList<Integer>();
test.add(70);
test.add(90);
test.add(95);
test.add(100);

ArrayList<Integer> test1 = new ArrayList<Integer>();
test1.add(93);
test1.add(87);
test1.add(97);
test1.add(68);

testFilterGoodScores(test);
testFilterGoodScores(test1);




}
}
