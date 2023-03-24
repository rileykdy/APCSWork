public class ArrayComp{

public static int least(int[][] nums){

int n = nums [0][0];

for (int i=0; i< nums.length; i++)
        {
            for (int j=0; j<nums[i].length; j++)
            {
                
                    if (nums[i][j] < n){
                        n = nums[i][j];
                    }
                
            }
        }
    System.out.println("Least: " + n);
    return n;
  
}

public static float sum(float[][] nums){

float n = 0.0f;

for (int i=0; i< nums.length; i++)
        {
            for (int j=0; j<nums[i].length; j++)
            {
                
                n = n + nums[i][j];
                
            }
        }
    System.out.println("Sum: " + n);
    return n;
  
}

public static int countA(String[][] words){

int count = 0;

for (int i=0; i< words.length; i++)
        {
            for (int j=0; j<words[i].length; j++)
            {
                String y = words[i][j];
                String x = y.substring(0,1);
            
                if(x.equals("A")){
                    count = count + 1; 
                }
            }
        }
    System.out.println("Count: " + count);
    return count;
  
}

public static void main(String[] args)
    {


int[][] integers = new int[3][3];
        
        integers [0][0] = 123;
        integers [0][1] = 5;
        integers [0][2] = 4;
        integers [1][0] = 25;
        integers [1][1] = 10;
        integers [1][2] = 16;
        integers [2][0] = 13;
        integers [2][1] = 42;
        integers [2][2] = 37;

least(integers);





float[][] floats = new float[3][3];
        
        floats [0][0] = 12.3f;
        floats [0][1] = 5.2f;
        floats [0][2] = 0.5f;
        floats [1][0] = 10.3f;
        floats [1][1] = 3.2f;
        floats [1][2] = 6.4f;
        floats [2][0] = 2.6f;
        floats [2][1] = 4.3f;
        floats [2][2] = 7.8f;

sum(floats);
//should be 52.6

String[][] names = new String[3][3];
        
        names [0][0] = "Ali";
        names [0][1] = "Axel";
        names [0][2] = "School";
        names [1][0] = "also";
        names [1][1] = "Awesome!";
        names [1][2] = "java";
        names [2][0] = "hello";
        names [2][1] = "Arkansas";
        names [2][2] = "code";
    
countA(names);
//should be 4


}
}