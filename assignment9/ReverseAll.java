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

public static void testReverseAll(ArrayList<String> words){

ArrayList<String> result = reverseAll(words);

System.out.println("");

System.out.print("Words: ");
for (int i=0; i<words.size(); i++){
System.out.print(words.get(i) + " ");
}

System.out.println("");

System.out.print("Result: ");
for (int i=0; i<result.size(); i++){
System.out.print(result.get(i) + " ");
}
System.out.println("");
}

public static void main(String[] args){

ArrayList<String> test = new ArrayList<String>();
test.add("Riley");
test.add("frog");
test.add("abcdefghijklmnop");
test.add("qrstuvwxyz");

ArrayList<String> test1 = new ArrayList<String>();
test1.add("tacocat");
test1.add("hannah");
test1.add("reverse");


testReverseAll(test);
testReverseAll(test1);




}
}
