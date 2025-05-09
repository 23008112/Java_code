public class symmetric {
    public static void main(String[] args) {
        int [][] arr = {{2,3,6},{3,4,5},{6,5,9}};
        int flag = 0;
        for (int i =0 ; i< 3 ; i++)
        {
            for (int j = 0 ; j< 3; j++)
            {
                if(arr[i][j]!=arr[j][i])
                flag = 1;
                break;
            }
            if(flag == 1)
            break;
        }
        if(flag == 0)
        System.out.println("it is a diognal mat");
        else
        System.out.println(" It is not a diognal matrix");
    }
    
}
