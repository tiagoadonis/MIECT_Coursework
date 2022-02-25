package aula01Ex2;
import static java.lang.System.*;

public class Data {
	private int dia;
	private int mes;
	private int ano;
	private static int[] diasMes = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};	//dias dos meses do ano comum
	
	public Data(int dia, int mes, int ano) {
		assert dia > 0 && mes > 0 && mes < 13 && ano > 0 : "ERRO!! Dados inv�lidos!";
		
		this.ano = ano;
		this.mes = mes;
		
		if ( (ano % 4 == 0) && (ano % 400 == 0) ) {		//anos bissextos
			if (mes == 2) {
				if (dia < 30 ) {
					this.dia = dia;
				}
				else {
					err.println("ERRO!! Dia incorreto!");
				}
			}
			else {
				if (dia <= diasMes[mes-1]) {
					this.dia = dia;
				}
				else {
					err.println("ERRO!! Dia incorreto!");
				}
			}
		}else {
			if (dia <= diasMes[mes-1]) {
					this.dia = dia;
			}
			else {
				err.println("ERRO!! Dia incorreto!");
			}
			
		}
	}
	
	public int getDia() {
		return dia;
	}

	public void setDia(int dia) {
		this.dia = dia;
	}

	public int getMes() {
		return mes;
	}

	public void setMes(int mes) {
		this.mes = mes;
	}

	public int getAno() {
		return ano;
	}

	public void setAno(int ano) {
		this.ano = ano;
	}

	@Override
	public String toString() {
		return dia+"/"+mes+"/"+ano;
	}
}