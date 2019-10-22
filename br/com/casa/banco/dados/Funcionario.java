package br.com.casa.banco.dados;
public abstract class Funcionario{
	private String nome;
	private String departamento;
	protected double salario;
	private Data dataAdmissao;
	private String rg;
	
	//construtor
	public Funcionario(String nome, String departamento){
		this.nome = nome;
		this.departamento = departamento;
		System.out.println("Funcionario(a) criado(a) com sucesso!!!");
	}

	//getters and setters
	public String getNome(){
		return this.nome;
	}
	public void setNome(String nome){
		this.nome = nome;
	}
	public String getDepartamento(){
		return this.departamento;
	}
	public void setDepartamento(String departamento){
		this.departamento = departamento;
	}
	public double getSalario() {
		return this.salario;
	}
	public void setSalario(double salario) {
		this.salario = salario;
	}
	public Data getDataAdmissao(){
		return this.dataAdmissao;
	}
	public void setDataAdmissao(Data dataAdmissao){
		this.dataAdmissao = dataAdmissao;
	}
	public String getRg(){
		return this.rg;
	}
	public void setRg(String rg){
		this.rg = rg;
	}

	//metodos da classe
	public void aumentoSalarial(double valor){
		this.salario += valor;
	}
	double ganhoAnual(){
		return salario*12;
	}
	abstract double bonifica();
	
	public void mostra(){
		System.out.println("-----------------------------------------------------------------");
		System.out.println("Nome do funcionario: "+this.nome);
		System.out.println("Departamento: "+this.departamento);
		System.out.println("Salario atual: R$ "+this.salario);
		System.out.println("Ganho anual: R$ "+this.ganhoAnual());
		System.out.println("Ganha uma Bonificacao de: R$ "+this.bonifica());
		System.out.println("Entrou na empresa no dia: "+this.dataAdmissao.getDia()+ "/" +dataAdmissao.getMes()+ "/" +dataAdmissao.getAno());
		System.out.println("-----------------------------------------------------------------");

	}

	public void umentoSalarial(int i) {
		// TODO Auto-generated method stub
		
	}
}