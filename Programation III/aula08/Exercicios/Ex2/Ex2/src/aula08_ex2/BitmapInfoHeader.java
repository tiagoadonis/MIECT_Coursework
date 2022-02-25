package aula08_ex2;

public class BitmapInfoHeader {
	int size; 			// the size of this header (40 bytes)
	int width; 			// the bitmap width in pixels
	int height; 		// the bitmap height in pixels
	short planes;		// the number of color planes being used. Must be set to 1
	short bitCount;		// the number of bits per pixel (color depth) - 1, 4, 8, 16, 24, 32
	int compression; 	// the compression method being used
	int sizeImage; 		// the image size. This is the size of the raw bitmap data
	int xPelsPerMeter; 	// the horizontal resolution of the image (pixel per meter)
	int yPelsPerMeter; 	// the vertical resolution of the image (pixel per meter)
	int clrUsed; 		// the number of colors in the color palette, or 0 to default to 2n
	int clrImportant; 	// the number of important colors used, or 0 when every color is important
	
	public BitmapInfoHeader(int size, int width, int height, short planes, short bitCount, int compression,int sizeImage, 
							int xPelsPerMeter, int yPelsPerMeter, int clrUsed, int clrImportant) {
		this.size = size;
		this.width = width;
		this.height = height;
		this.planes = planes;
		this.bitCount = bitCount;
		this.compression = compression;
		this.sizeImage = sizeImage;
		this.xPelsPerMeter = xPelsPerMeter;
		this.yPelsPerMeter = yPelsPerMeter;
		this.clrUsed = clrUsed;
		this.clrImportant = clrImportant;
	}
	
	@Override
	public String toString() {
		return String.format("-- Info Header --\n" + "Header Size: %d\n" + "Width: %d\n" + "Height: %d\n"+ "Planes: %d\n" + "BitCount: %d\n" + 
							 "Compression: %d\n" + "Image Size: %d\n" + "Horizontal Resolution: %d\n" + "Vertical Resolution: %d\n"+
							 "Number of Colors: %d\n"+ "Number of Important Colors: %d\n",
							 size,width,Math.abs(height),planes,bitCount,compression,sizeImage,xPelsPerMeter,yPelsPerMeter,clrUsed,clrImportant);
	}
}
