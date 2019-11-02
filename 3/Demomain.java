class Str{
    String s;
    Str(Str obj)
    {
       s=obj.s;
    }
    
    Str(String s)
    {
            this.s=s;
    }
    void show()
    {
        System.out.println(s);
    }
}

class Demomain
{
    public static void main(String args[]) {

        Str n=new Str("Hello");
        Str a=new Str(n);
       // String l="Second String";
       // String m=l;
       
        n.show();
        a.show(); 
       // System.out.println(l);
       // System.out.println(m);
    }
}