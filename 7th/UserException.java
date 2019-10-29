import java.util.Scanner;

class UserException
{
    public static void main(String args[]) throws NewException
    {
        Scanner scan=new Scanner(System.in);
        System.out.println("Enter the marks");
        int a=scan.nextInt();
        try{
        if(a>100)
        {
            throw new NewException("the number is greater than 100");
            
        }

     }
     catch (NewException e)
     {
         System.out.println(e);
         throw e;
     }
     
    }

   // scan.close();
}



class NewException extends Exception
{
  public NewException(String s)
  {
      super(s);
  }
}