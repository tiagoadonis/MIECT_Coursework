package aula10Ex1;

import static java.lang.System.*;
import java.time.format.DateTimeFormatter;
import java.time.LocalDate;

public class Data {
	private int dia;
	private int mes;
	private int ano;
	private static int[] diasMes = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};	//dias dos meses do ano comum
	
	public Data(int dia, int mes, int ano) {
		assert dia > 0 && mes > 0 && mes < 13 && ano > 0 : "ERRO!! Dados inválidos!";
		
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
	
	public Data () {
		String[] dataActual = currentDate().split("-");
		this.dia = Integer.parseInt(dataActual[0]);
		this.mes = Integer.parseInt(dataActual[1]);
		this.ano = Integer.parseInt(dataActual[2]);
	}
	
	private static String currentDate() {
        return DateTimeFormatter.ofPattern("dd-MM-yyyy").format(LocalDate.now());
	}
	

	@Override
	public String toString() {
		return dia+"/"+mes+"/"+ano;
	}
}
