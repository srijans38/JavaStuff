//the program will perform multiplication of 3*3 matrix 
import java.util.Scanner;

class Demomatrix
{
    public static void main(String args[]) {
        
        Scanner scan=new Scanner(System.in);
        int sum=0;
        int a[][]=new int[3][3];
        int b[][]=new int[3][3];
        int ans[][]=new int[3][3];
        for(int i=0;i<3;i++)                           //input the 1st matrix
        {
            for(int j=0;j<3;j++)
            {
              a[i][j]=scan.nextInt();
            }
        }

        
        for(int i=0;i<3;i++)                           //input the 2nd matrix
        {
            for(int j=0;j<3;j++)
            {
              b[i][j]=scan.nextInt();
            }
        }

        for (int c = 0; c < 3; c++) {                            //calculate the matrix multiplication
            for (int d = 0; d < 3; d++) {
              for (int k = 0; k < 3; k++) {
                sum = sum + a[c][k]*b[k][d];
              }
       
              ans[c][d] = sum;
              sum = 0;
            }
          }



     System.out.println("Product of the matrices:");
 
    for (int i = 0; i < 3; i++) {
      for (int j = 0; j < 3; j++)
        System.out.print(ans[i][j]);
 
      System.out.println(" ");
    }
  
 
    }
}