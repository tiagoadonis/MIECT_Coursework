public class Room {
	
	private String roomType;
	private Point bottomLeft;
	private Point topRight;
	
	Room(Point topRight, Point bottomLeft, String roomType){
		this.roomType = roomType;
		this.bottomLeft = bottomLeft;
		this.topRight = topRight;
	}
	
	public Point geomCenter(){
		return new Point((bottomLeft.x()+topRight.x()) / 2, (bottomLeft.x()+topRight.x()) / 2);
	}
	
	public double area(){
		return (Math.abs(bottomLeft.y()- topRight.y()) * Math.abs(bottomLeft.x()- topRight.x()));
	}
	
	public String roomType(){ return roomType; }
	public Point bottomLeft(){ return bottomLeft; }
	public Point topRight(){ return topRight; }
	
}

