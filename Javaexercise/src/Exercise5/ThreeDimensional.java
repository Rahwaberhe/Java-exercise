package Exercise5;
//Q4
public class ThreeDimensional extends Polygon{
	  private int height;
	  
	  public ThreeDimensional(int sides, String color, int height) {
		    super(sides, color);
		    this.height = height;
	}
	public void getHeight() {
		System.out.println(this.height);
	}
	}
	  

	
	

