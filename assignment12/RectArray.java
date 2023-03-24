public class RectArray{

public static double avgPerim(Rectangle[][] rects){

double n = 0.0;
double count = 0.0;

for (Rectangle[] row : rects)
        {
            for (Rectangle x : row)
            {
                double p = x.perimeter();
                
                n = n + p;
                count = count + 1.0;
            }
            
        }
    System.out.println("Average Perimeter: " + n/count);
    return n/count;
  
}

public static double mostArea(Rectangle[][] rects){

double n = 0.0;


for (Rectangle[] row : rects)
        {
            for (Rectangle x : row)
            {
                double p = x.area();
                
                if(p > n){
                    n = p;
                }
                
            }
            
        }
    System.out.println("Greatest Area: " + n);
    return n;
  
}



public static void main(String[] args)
    {


Rectangle[][] test = new Rectangle[2][2];
        
        test [0][0] = new Rectangle("r1", 2.4, 4.2);
        test [0][1] = new Rectangle("r2", 12.0, 4.0);        
        test [1][0] = new Rectangle("r3", 7.5, 3.6);
        test [1][1] = new Rectangle("r4", 11.0, 10.0);
       
avgPerim(test);
mostArea(test);





}
}