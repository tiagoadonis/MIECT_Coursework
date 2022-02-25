package aula09Ex3;
import java.util.*;

public class ListaPessoasIterator {
	private List<Pessoa> listaPessoas = new LinkedList<>();
	
	public boolean addPessoa(Pessoa p) {
		return listaPessoas.add(p);
	}
	
	public boolean removePessoa(Pessoa p) {
		return listaPessoas.remove(p);
	}
	
	public int totalPessoas() {
		return listaPessoas.size();
	}
	
	public Iterator iterator() {
		ListaIterator iterator = new ListaIterator();
		return iterator;
	}
	
	public BFIterator bfIterator() {
		ListaBFIterator bfIterator = new ListaBFIterator();
		return bfIterator;
	}
	
	private class ListaIterator implements Iterator{
		
		private int index;
		
		public ListaIterator() {
			this.index = 0;
		}

		@Override
		public boolean hasNext() {
			return index < totalPessoas();
		}

		@Override
		public Object next() {
			if(hasNext()) {
				Object obj = listaPessoas.get(index);
				this.index++;
				return obj;
			}
			throw new IndexOutOfBoundsException("ERROR!! The list doesn't have more elements!!");
		}

		@Override
		public void remove() {
			listaPessoas.remove(index);
		}
	}
	
	private class ListaBFIterator implements BFIterator{

		private int index;
		
		public ListaBFIterator() {
			this.index = totalPessoas();
		}
		
		@Override
		public boolean hasPrevious() {
			return index > 0;
		}

		@Override
		public Object previous() {
			if(hasPrevious()) {
				Object obj = listaPessoas.get(index-1);
				this.index--;
				return obj;
			}
			throw new IndexOutOfBoundsException("ERROR!! The list doesn't have more elements!!");
		}

		@Override
		public boolean hasNext() {
			return index < totalPessoas();
		}

		@Override
		public Object next() {
			if(hasNext()) {
				Object obj = listaPessoas.get(index);
				this.index++;
				return obj;
			}
			throw new IndexOutOfBoundsException("ERROR!! The list doesn't have more elements!!");
		}
		
	}
	
}
