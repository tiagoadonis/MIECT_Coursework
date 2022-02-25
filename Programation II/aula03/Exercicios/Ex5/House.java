public class House {
	
	private final String[] types = {"house", "apartment"};
	private String type;
	private Room[] rooms;
	private int additionalRooms, size = 0;
	private int numRooms = 0;
	
	House(String type){
		this(type,8,4);
	}
	
	House (String type, int size, int additionalRooms) {
		for(String a : types){
			if (a.equals(type)){
				this.type = type;
			}
		}
		rooms = new Room[size];
		this.size = size;
		this.additionalRooms = additionalRooms;
	}
	
	public void addRoom(Room r){
		if(numRooms == size){
			Room[]tmp = new Room[size+additionalRooms];
			for(int i = 0; i < rooms.length; i++){
				tmp[i]=rooms[i];
			}
			tmp[tmp.length-1]=r;
			this.size = size+additionalRooms;
		}else{
			rooms[numRooms]=r;
		}
		this.numRooms++;
	}
	
	public int size(){
		return numRooms;
	}
	
	public int maxSize(){
		return this.size;
	}
	
	public Room room(int i){
		return rooms[i];
	}
	
	public double area(){
		double totArea = 0;
		for (int i = 0; i < rooms.length; i++){
			totArea = totArea + rooms[i].area();
		}
		return totArea;
	}
	
	/*getRoomTypeCounts(){
		
	}*/
	
	public double averageRoomDistance(){
		int numDistancias = 0;
		double totalDistancias = 0;
		for(int i = 0; i < numRooms; i++){
			for (int j = 0; i < numRooms; j++){
				totalDistancias += rooms[i].geomCenter().distTo(rooms[j].geomCenter());
				numDistancias++;
			}
		}
		return totalDistancias/numDistancias;
	}
}

