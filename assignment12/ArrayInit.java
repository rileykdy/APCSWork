public class ArrayInit
{
    public static void main(String[] args)
    {
        
        
        //
        //DIAGONAL
        //
        
        
        int n = 10;
        int[][] diagonal = new int[n][n];

        for (int i=0; i<n; i++)
        {
            for (int j=0; j<n; j++)
            {
                if(i==j){
                    diagonal[i][j] = 1;
                }
                
                else 
                diagonal [i][j] = 0;
            }
        }

        System.out.println("DIAGONAL:");

        for (int[] row : diagonal)
        {
            for (int value : row)
            {
                System.out.print(value + " ");
            }
            System.out.println();
        }

        //
        //STRINGS
        //
        
        
        String[][] names = new String[3][3];
        
        names [0][0] = "Eloise";
        names [0][1] = "Crystal";
        names [0][2] = "";
        names [1][0] = "Alene";
        names [1][1] = "Madeline";
        names [1][2] = "Sarah";
        names [2][0] = "Chase";
        names [2][1] = "Riley";
        names [2][2] = "Kailyn";
        
        System.out.println("NAMES:");

        for (String[] row : names)
        {
            for (String name : row)
            {
                System.out.print(name + " ");
            }
            System.out.println();
        }
        
        
        //
        //DOUBLES
        //
        
        int a = 5;
        double[][] numbers = new double[a][a];

        for (int i=0; i<a; i++)
        {
            for (int j=0; j<a; j++)
            {
                
                    numbers[i][j] = 0.0 + (10.0 + (10.0*i)) + (1.0 + j);
                
            }
        }

        System.out.println("DOUBLES:");

        for (double[] row : numbers)
        {
            for (double value : row)
            {
                System.out.print(value + " ");
            }
            System.out.println();
        }
        
        
        //
        //INTS
        //
        
        
        int[][] ints = new int[6][5];

        for (int i=0; i<6; i++)
        {
            for (int j=0; j<5; j++)
            {
                
                    ints[i][j] = i+1;
                
            }
        }

        System.out.println("INTEGERS:");

        for (int[] row : ints)
        {
            for (int value : row)
            {
                System.out.print(value + " ");
            }
            System.out.println();
        }
        
    }
}