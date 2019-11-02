class Str{
    String s;
    Str(Str obj)
    {
       s=obj.s;
    }
    
    Str(String s1)
    {
            s=s1;
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
        String l="Second String";
        String m=l;
       
        n.show();
        a.show(); 
        System.out.println(l);
        System.out.println(m);
    }
}