import p2utils.Queue;
import p2utils.HashTable;
import static java.lang.System.*;

public class SupermarketOrdering {
	
	/*private*/ Queue<Order> fila = new Queue();
	/*private*/ HashTable<Integer> produtos = new HashTable(10);
	
	/*public SupermarketOrdering(){
		fila = new Queue();
		produtos = new HashTable(10);
	}*/
	
	public void enterOrder(Order order){
		fila.in(order);
		int i = 0;
		if(produtos.contains(order.prodName)){
			i = produtos.get(order.prodName);
		}
		produtos.set(order.prodName, i + order.quantity);
	}
	
	public Order serveOrder(){
		assert !fila.isEmpty();
		Order last = fila.peek();
		assert produtos.contains(last.prodName);
		int count = produtos.get(last.prodName);
		assert last.quantity <= count;
		fila.out();
		if (last.quantity < count){
			produtos.set(last.prodName, count - last.quantity);
		}else{
			produtos.remove(last.prodName);
		}
		return last;
	}
	
	public int query(String produto){
		return produtos.contains(produto)? produtos.get(produto) : 0;
	}
	
	public void displayOrders(){
		out.printf("List of orders: %s\n", fila.toString());
		out.print("Summary by product: ");
		String[] keys = produtos.keys();
		for (int i = 0; i < keys.length; i++){
			out.print(keys[i]+":"+produtos.get(keys[i])+" ");
		}
		out.println("");
	}
	
	public int numOrders(){
		return fila.size();
	}
}
