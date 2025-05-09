public class nQueen {
    public static void main(String[] args) {
        int a =4;

        // if n < 4 no solution


        int[] queen = new int[a];
        int row = 0;
        placeMyQueen(queen ,row);

        
    }
    public static void placeMyQueen(int[] queen, int row)
    {
        
        if(row >= queen.length)
        {
        System.out.println("_______________________________________________");
        
        
            for(int i = 0;i< queen.length;i++)
            {
                System.out.println("[" + i +","+queen[i]+ "]");

            }
            return;
            
        }
        
        for(int col =0; col < queen.length;col++)//every single time we place a queen we will check if the placed queen 
        //is in the path of other queen therefor we create a method is safe we are going to pass 3 data quees row and col
        {
            if(isSafe(queen,row,col))
            {
                queen[row]=col;//placing the queen
                placeMyQueen(queen, row+1);
            }
        }

        
        
    }
    private static boolean isSafe(int[] queen, int row, int col)
    {
        //should check row col and diognal
        for(int i = 0;i<row;i++)
        {
            //no need to iterate fully just check the rows which will interfere
            //checking for same col
            if(queen[i]== col)
                return false;
            
            if((i-row) == (queen[i]-col))//left to right (top left to bottom right diaognal)
                return false;


            //top right to bottom left
            if((i-row) == (col- queen[i]))
                return false;

            
        }
        return true;

    }
    
}
