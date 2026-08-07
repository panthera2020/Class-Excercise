public class Rectangle {
	private double width;
	private double height;
	private double area;

	public Rectangle(double width, double height){
		if(width > 0){
			this.width = width;
		}
		if(height > 0){
			this.height = height;
		}
	}

	public void setWidth(double width){
		if(width > 0){
			this.width = width;
		}
	}

	public void setHeight(double height){
		if(height > 0){
			this.height = height;
		}
	}

	public void calculateArea(){
		this.area = this.width * this.height;
	}

	public double getArea(){
		return area;
	}
}