package aula08_ex2;

public class Pixel {
	final byte R;
	final byte G;
	final byte B;
	
	public Pixel(byte b, byte g, byte r) {
		this.R = r;
		this.G = g;
		this.B = b;
	}
	
	@Override
	public String toString() {
		return "RGB("+(R & 0xff)+","+(G & 0xff)+","+(B & 0xff)+")";
	}
}
