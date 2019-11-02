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
            
        }      //end of if

     }     // end of try
     catch (NewException e)
     {
         System.out.println(e);
         throw e;
     }      //end of catch
     
    }         //end of method MAIN

   // scan.close();
}      //end of class UserException



class NewException extends Exception
{
  public NewException(String s)      //parameter is string cuz the exception message is of type string
  {
      super(s);
  }                                      //end of constructor NewException
}                                        //end of class NewException