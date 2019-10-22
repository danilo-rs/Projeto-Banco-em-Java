package br.com.casa.banco.dados;
public class Empresa {
	String nome;
	String cnpj;
	Funcionario[] funcionarios = new Funcionario[10];
	//metodos
	public void adiciona(Funcionario f){
		for(int x=0;x<funcionarios.length;x++){
			if(funcionarios[x]==null){
				funcionarios[x]=f;
				break;
			}
		}
	}
	public void mostraEmpregados(){
	for (int i = 0; i < funcionarios.length; i++){
		if(funcionarios[i] != null){
			System.out.println("Nome: "+funcionarios[i].getNome());
			System.out.println("Salario: "+funcionarios[i].getSalario());
			System.out.println("Ganho anual: R$ "+funcionarios[i].ganhoAnual());
			System.out.println("Entrou na empresa no dia: "+funcionarios[i].getDataAdmissao().getDia()+ "/" +funcionarios[i].getDataAdmissao().getMes()+ "/" +funcionarios[i].getDataAdmissao().getAno());
			System.out.println("Funcionario na posicao: " +i);
			System.out.println("---------------------------------");
		}
	}
	}

}
