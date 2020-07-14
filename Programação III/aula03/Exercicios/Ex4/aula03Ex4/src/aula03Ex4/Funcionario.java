package aula03Ex4;
@SuppressWarnings("all")

public class Funcionario extends Cliente{
	private int numFuncionario;
	private int numFiscal;
	
	public Funcionario (String nome, int cc, Data nascimento, int numFunc, int numFisc) {
		super (nome, cc, nascimento);
		this.numFuncionario = numFunc;
		this.numFiscal = numFisc;
	}
	
	@Override
	public String toString() {
		return super.getNumSocio()+") "+super.getNome()+" cc: "+super.getCC()+" ("
				+super.getDataNascimento()+") N�m. Funcion�rio: "+this.numFuncionario+" N�m. Fiscal: "+this.numFiscal;
	}
}