package aula07Ex2;

public class BitmapFileHeader {
	short type;			// must be 'BM' to declare a bmp-file
	int size; 			// specifies the size of the file in bytes
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
}
