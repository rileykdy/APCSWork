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

public static void testFilterGoodScores(ArrayList<Integer> values, ArrayList<Integer> expected){

ArrayList<Integer> result = filterGoodScores(values);

System.out.print("Numbers: ");
for (int i=0; i<values.size(); i++){
System.out.print(values.get(i) + " ");
}

System.out.println("Expected: " + expected + " Result: " + result);

if (result == expected)
  System.out.println("Sucess!");

else System.out.println("Failiure.");

}

public static void main(String[] args){




}
}
