import java.util.*;

public class ReverseAll{

public static String reverse(String s){
  String result = "";
  for(int i=s.length(); i>0; i=i-1){

    String x = s.substring(i-1, i);

    result = result + x;
  }
  return result;
}

public static ArrayList<String> reverseAll(ArrayList<String> words){

ArrayList<String> result = new ArrayList<String>();

for(int i=0; i<words.size(); i++){
result.add(reverse(words.get(i)));
}

return result;
}

public static void testReverseAll(ArrayList<String> words, ArrayList<String> expected){

ArrayList<String> result = reverseAll(words);

System.out.print("Words: ");
for (int i=0; i<words.size(); i++){
System.out.print(words.get(i) + " ");
}

System.out.println("Expected: " + expected + " Result: " + result);

if (result == expected)
  System.out.println("Sucess!");

else System.out.println("Failiure.");

}

public static void main(String[] args){




}
}
