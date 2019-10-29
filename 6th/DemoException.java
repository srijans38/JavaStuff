class DemoException
{
    public static void main(String args[]) 
 {
    int c,a=10,b=0;
    Let l=new Let();
    try{
        c=l.cal(10,2);
        System.out.print(c);
    }
    catch(ArithmeticException e)
    {
    System.out.println(e);
    }
 }
}


class Let
{
    public static int cal(int x,int y) throws ArithmeticException
    {   int c;
        if(y==0)
        throw new ArithmeticException("/ by zero");
        else
        c=x/y;
        return c; 

    }
}