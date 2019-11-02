class Demo
{
    public static void main(String args[])
    {
       float vol,vol2;
        Box obj=new Box();
        Box obj2=new Box(obj);
       
       vol=obj.calvol();
       vol2=obj.calarea();

       System.out.println(vol);
       System.out.println(vol2);

    }

}