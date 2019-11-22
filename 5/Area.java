abstract class Dimension
{

    int l , b ;
    int dis,base;

}

class Rectangle extends Dimension
{   int area1;
   Rectangle(int x,int y)
   {
       l=x;
       b=y;
   }
  void areaRectangle()
  {
      
      area1=l*b;
  }
  void displayRectanglearea()
  {
      System.out.println("Rectangle area " +area1);
  }


}


class Triangle extends Dimension
{
     int area2;
 Triangle(int d,int ba)
 {
  dis=d;
  base=ba;
 }

 void areaTriangle()
 {
    
     area2=(dis*base)/2;
 }
 void displayTrianglearea()
 {
     System.out.println("Triangle area "+area2);
 }
}


class Area
{
    public static void main(String args[]) {
        Triangle t1=new Triangle(3,4);
        t1.areaTriangle();
        t1.displayTrianglearea();
        Rectangle r1=new Rectangle(4, 8);
        r1.areaRectangle();
        r1.displayRectanglearea();
        
    }
}
