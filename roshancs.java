

class Area {
	int a,b;
	Area(int x,int y)
	{a=x;
	b=y;
	}
	double Area()
	{
		System.out.println("area not defined");
		return 0;
		
	}
}
class rect extends Area
{
	rect(int x,int y)
	{
		super(x,y);
	}
	double Area()
	{
		return a*b;
	}
	
}
class Triangle extends Area{
	Triangle(int x,int y)
	{
		super(x,y);
	}
	double Area() 
	{
		return(0.5*a*b);
	}
}
class dispatch
{
	public static void main(String args[])
	{
		Area a1=new Area(0,0);
		rect r1=new rect(15,30);
		Triangle t1=new Triangle(20,30);
		Area r;
		r=a1;
		System.out.println("Area of area is:"+r.Area());
		r=a1;
		System.out.println("Area of rectangle is:"+r.Area());
		r=t1;
		System.out.println("Area of tringle is:"+r.Area());
	}
}