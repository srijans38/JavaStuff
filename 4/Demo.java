import java.util.Scanner;

class Shape
{
int l,b; 
Shape()                             //Default Constructor
 {
  l=0;b=0;
 }
 Shape(int x,int y)                   //Parameterised Constructor
 {
     l=x;
     b=y;
 }
 Shape(Shape obj)                    //Copy Constructor
 {
     l=obj.l;
     b=obj.b;
 }

 public void get_xyvalue()
 {
     Scanner scan=new Scanner(System.in);
     l=scan.nextInt();
     b=scan.nextInt();
     scan.close();
 }
 public void show_xyvalue()
 {
     System.out.println(l);
     System.out.println(b);
 }

}

class Rectangle extends Shape                              
{
    public void show_xyvalue()                            //overriding method
    {
        System.out.println("Length "+l);
        System.out.println("Breadth "+b);
    }
    
}

class Demo                               //class where main method is called
{
    public static void main(String args[]) {
        Rectangle r=new Rectangle();
        r.get_xyvalue();
        r.show_xyvalue();
    }
}