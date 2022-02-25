import p2utils.*;

// Altere esta classe para implementar um tipo de dados abstrato que funciona
// como um array, com métodos de put e get.
// A implementação fornecida cria um único array, mas queremos substituí-lo
// por uma lista de blocos (arrays de tamanho blocksize), que poderá crescer
// juntando progressivamente mais blocos à lista.

public class BlockArrayInt{
	
	private int blockSize = 0;
	private int numBlocks = 0;
	private BlockArrayInt.NodeInt first;
	private BlockArrayInt.NodeInt last;
	private BlockArrayInt.NodeInt current;
	private int currentBlock;
	
	public BlockArrayInt(int paramInt1, int paramInt2){
		assert (paramInt1 > 0);
		assert (paramInt2 > 0);
		
		this.blockSize = paramInt1;
		this.numBlocks = 0;
		incrementNumberOfBlocks();
		this.first = (this.current = this.last);
		this.currentBlock = 0;
		for (int i = 1; i < paramInt2; i++) {
			incrementNumberOfBlocks();
		}
	}
  
	public int get(int paramInt){
		assert (validIndex(paramInt));
    
		int i = searchBlockIndex(paramInt);
		return this.current.a[i];
	}
  
	public void put(int paramInt1, int paramInt2){
		assert (validIndex(paramInt2));
		
		int i = searchBlockIndex(paramInt2);
		this.current.a[i] = paramInt1;
	}
  
	public void incrementNumberOfBlocks(){
		this.last = new BlockArrayInt.NodeInt(this.blockSize, this.last);
		this.numBlocks += 1;
	}
  
	public int size(){
		return numberOfBlocks() * blockSize();
	}
  
	public int numberOfBlocks(){
		return this.numBlocks;
	}
  
	public int blockSize(){
		return this.blockSize;
	}
  
	public boolean validIndex(int paramInt){
		return (paramInt >= 0) && (paramInt < size());
	}
  
	private int searchBlockIndex(int paramInt){
		int i = paramInt / this.blockSize;
		if (i < this.currentBlock){
			this.current = this.first;
			this.currentBlock = 0;
		}
		while (i > this.currentBlock){
			this.current = this.current.next;
			this.currentBlock += 1;
		}
		assert (i == this.currentBlock);
		assert (this.current != null);
		assert ((this.current != this.first) || (this.currentBlock == 0));
		assert ((this.current != this.last) || ((this.current.next == null) && (this.currentBlock == numberOfBlocks() - 1)));

		return paramInt % this.blockSize;
	}
	
	class NodeInt{
		int[] a;
    
		NodeInt(int paramInt, NodeInt paramNodeInt){
			assert (paramInt > 0);
      
			this.a = new int[paramInt];
			if (paramNodeInt != null) {
				paramNodeInt.next = this;
			}
		}
    
		NodeInt next = null;
	}
}
