package aula08_ex2;

public class BitmapFileHeader {
	short type;			// must be 'BM' to declare a bmp-file
	int size;			// specifies the size of the file in bytes
	short reserved1;	// must always be set to zero
	short reserved2;	// must always be set to zero
	int offBits;		// specifies the offset from the beginning of the file to the bitmap data
	
	public BitmapFileHeader(short type, int size, short reserved1, short reserved2, int offBits) {
		this.type = type;
		this.size = size;
		this.reserved1 = reserved1;
		this.reserved2 = reserved2;
		this.offBits = offBits;
	}
	
	@Override
	public String toString() {
		return String.format("-- File Header --\n" + "Type: %d\n" + "File Size: %d\n" + "Reserved1: %d\n" + "Reserved2: %d\n"+
							 "OffBits: %d\n", type, size, reserved1, reserved2, offBits);
	}
}
