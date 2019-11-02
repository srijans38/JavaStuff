class Box
{
    int l,b,h,vol;
    Box()
    {
        l=-1;
        b=-1;
        h=-1;
    }
    Box(int x,int y,int z)
    {
        l=x;
        b=y;
        h=z;
    }
    Box(Box obj)
    {
        l=obj.l;
        b=obj.b;
        h=obj.h;

    }
    int calvol()
    {
       // float vol;
        vol=l*b*h;
        return vol;
    }
    int calarea()
    {
        int area=2*((l*b)+(b*h)+(h*l));
        return area;
    }
}