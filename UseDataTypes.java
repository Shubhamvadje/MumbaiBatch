package shubham;


public class UseDataTypes {
	
	public void areaRectangel() {
		
		int length = 70;
		int width = 40;
		int area = 0;
		
		area = length * width;
		
		System.out.println("area of rectangle="+area);
		
	}
	
	public void areaTraingle() 
	{
		  
		float b=4, h=16,area;
		area= (b*h)/2;
		System.out.println("area of Triangle is= " +area);
		
	}

	public void areacircle() 
	{
		  int radius = 5;
		  double pi=3.142,area;		
		  area= pi*radius*radius;
		  System.out.println("area of circle is= " +area);
		
	}
	public static void main(String[] args) {
		UseDataTypes u = new UseDataTypes();
		u.areaRectangel();
		u.areaTraingle();
		u.areacircle();
	}

}

