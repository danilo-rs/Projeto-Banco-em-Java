package br.com.casa.banco.dados;
public class Data {
	private int dia;
	private int mes;
	private int ano;

	//Getters and Setters
	public int getDia(){
		return this.dia;
	}
	public void setDia(int dia){
		this.dia = dia;
	}
	public int getMes(){
		return this.mes;
	}
	public void setMes(int mes){
		this.mes = mes;
	}
	public int getAno(){
		return this.ano;
	}
	public void setAno(int ano){
		this.ano = ano;
	}

	//metodos
	public void mostraData(){
		System.out.println("Data de admissao: " +dia+ "/" +mes+ "/" +ano);
	}
}