public class lowTriMat {
    public static void main(String[] args) {
        int[][] arr = {{1,0,0},{5,3,0},{6,9,7}};

        int flag = 0;
        for(int i = 0;i<3;i++)
        {
            for(int j = i+1; j<3;j++)
            {
                if(arr[i][j] != 0)
                flag = 1;
                break;
            }
            if(flag ==1)
            break;
        }
        if(flag ==1)
        {
            System.out.println("It is not an lower triangular matrix");

        }
        else
        System.out.println("It is a lower triangular matrix");
    }
    
}
