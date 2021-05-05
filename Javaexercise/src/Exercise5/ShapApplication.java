package Exercise5;

public class ShapApplication {

	public static void main(String[] args) {
		//Q1
		Polygon triangle = new Polygon(3, "red");
		Polygon rectangle = new Polygon(4, "orange");
		Polygon polygon = new Polygon(7, "pink");
		//Q3
	    triangle.getsides();
	    triangle.getcolor();
	    
	    rectangle.getsides();
	    rectangle.getcolor();
	    
	    polygon.getsides();
	    polygon.getcolor();
	    
	//Q5	
		ThreeDimensional box = new ThreeDimensional(4,"black", 10);
		box.getsides();
		box.getcolor();
		box.getHeight();
		

	}

}
