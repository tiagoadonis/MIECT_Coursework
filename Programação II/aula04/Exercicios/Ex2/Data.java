import static java.lang.System.*;
import java.util.Calendar;

public class Data {
	private int dia, mes, ano;

	/** Inicia esta data com o dia de hoje. */
	public Data() {
		// Aqui usamos a classe Calendar da biblioteca standard para obter a data atual.
		Calendar today = Calendar.getInstance();
		dia = today.get(Calendar.DAY_OF_MONTH);
		mes = today.get(Calendar.MONTH) + 1;
		ano = today.get(Calendar.YEAR);
	}

	/** Inicia a data a partir do dia, mes e ano dados. */
	public Data(int dia, int mes, int ano) {
		this.dia = dia;
		this.mes = mes;
		this.ano = ano;
		assert (dataValida(dia,mes,ano)):"Error - Invalid Date";
	}
	
	public Data(String data){
		String iso[] = data.split("-");
		if (iso.length!=3){
			System.exit(1);
		}else{
			int ano = Integer.parseInt(iso[0]);
			int mes = Integer.parseInt(iso[1]);
			int dia = Integer.parseInt(iso[2]);
			if (!dataValida(dia,mes,ano)){
				System.exit(2);
			}
			this.dia = dia;
			this.mes = mes;
			this.ano = ano;
		}
	}

	/** Devolve esta data segundo a norma ISO 8601. */
	public String toString() {
		return String.format("%04d-%02d-%02d", ano, mes, dia);
	}

	/** Indica se ano é bissexto. */
	public static boolean bissexto(int ano) {
		return ano%4 == 0 && ano%100 != 0 || ano%400 == 0;
	}

	public int dia (){ return dia; }
	public int mes (){ return mes; }
	public int ano (){ return ano; }

	/** Dimensões dos meses num ano comum. */
	private static final
	int[] diasMesComum = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};

	/** Devolve o número de dias do mês dado. */
	public static int diasDoMes(int mes, int ano) {
		assert ( (0<mes && mes<=12) && (0<ano) ): "Error - Incorrect Month or Year";
		int dias;
		if(!bissexto(ano)){
			dias = diasMesComum[mes-1];
		}else{
			if (mes==2){
				dias = 29;
			}
			else{
				dias = diasMesComum[mes-1];
			}
		}
		return dias;
	}
	
	private static final
	String[] meses = {"Janeiro", "Fevereiro", "Março", "Abril", "Maio", "Junho", "Julho", "Agosto", "Setembro", "Outubro", "Novembro", "Dezembro"};
	
	/** Devolve o mes da data por extenso. */
	public String mesExtenso() {
		int i = this.mes;
		return meses[i-1];
	}

	/** Devolve esta data por extenso. */
	public String extenso() {
		return dia() + " de "+mesExtenso()+" de "+ ano();
	}

	/** Indica se um terno (dia, mes, ano) forma uma data válida. */
	public static boolean dataValida(int dia, int mes, int ano) {
		if(!bissexto(ano)){
			if(mes==2){
				if (1 <= dia && dia <= 28){
					return true;
				}else{
					return false;
				}
			}else if(1 <= mes && mes <= 12){
				for(int i = 0; i < diasMesComum.length; i++){
					if (1 <= dia && dia <= diasMesComum[mes-1]){
						return true;
					}
					else{
						return false;
					}
				}
			}else{
				return false;
			}
		}else if (bissexto(ano))
		{
			if(mes==2){
				if (1 <= dia && dia <= 29){
					return true;
				}else{
					return false;
				}
			}else if(1 <= mes && mes <= 12){
				for(int j = 0; j < diasMesComum.length; j++){
					if (1 <= dia && dia <= diasMesComum[mes-1]){
						return true;
					}
					else{
						return false;
					}
				}
			}else{
				return false;
			}
		}else if(ano<0){
			return false;
		}
		return false;
	}


	public void seguinte() {
		this.dia++;
		if (this.dia>diasDoMes(this.mes, this.ano)){
			this.mes++;
			if(this.mes > 12){
				this.ano++;
				this.mes = 1;
			}
			this.dia=1;
		}
	}
	
	public int compareTo(Data data){
		int compare = 0;
		int anos = this.ano - data.ano;
		if (anos != 0){
			compare = anos;
		} else {
			int meses = this.mes - data.mes;
			if (meses != 0){
				compare = meses;
			}
			else{
				int dias = this.dia - data.dia;
				if (dias != 0){
					compare = dias;
				}
				else{
					compare = 0;
				}
			}
		}
		return compare;
	}

}

