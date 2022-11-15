package br.com.fecaf.encapsulamento;

public class AlunoColegio extends Aluno{
	//Atributos			//extends realiza o processo de heran�a da classe Aluno
	private String nomeResponsavel;
	private String emailResponsavel;
	private String telefoneResponsavel;
	private String celularResponsavel;
	
	//Construtor
	public AlunoColegio () {
		//A classe AlunoColegio obrigatoriamente j� atribui o tipo curso como sendo col�gio 
		this.setTipoCurso("Col�gio");
	}
	
	//set nome resposanvel
	public void setNomeResponsavel (String nomeResponsavel) {
		this.nomeResponsavel  = nomeResponsavel;
	}
	//get nome resposanvel
	public String getNomeResponsavel () {
		return this.nomeResponsavel;
	}
	
	//set email responsavel
	public void setEmailResponsavel (String emailResponsavel) {
		this.emailResponsavel  = emailResponsavel;
	}
	//get email responsavel
	public String getEmailResponsavel () {
		return this.emailResponsavel;
	}
	
	//set telefone resposanvel
	public void setTelefoneResponsavel (String telefoneResponsavel) {
		this.telefoneResponsavel  = telefoneResponsavel;
	}
	//get telefone resposanvel
	public String getTelefoneResponsavel () {
		return this.telefoneResponsavel;
	}
	
	//set celular resposanvel
	public void setCelularResponsavel (String celularResponsavel) {
		this.celularResponsavel  = celularResponsavel;
	}
	//get celular resposanvel
	public String getCelularResponsavel () {
		return this.celularResponsavel;
	}
	
	//Retorna os dados do aluno
	public void getDadosAlunoColegio () {
		
		//Retorna os dados principais da classe do aluno
		getDadosAluno();
		
		System.out.println("Nome do Respons�vel: " + this.getNomeResponsavel());
		System.out.println("E-mail do Respons�vel: " + this.getEmailResponsavel());
		System.out.println("Telefone do Respons�vel: " + this.getTelefoneResponsavel());
		System.out.println("Celular do Respons�vel: " + this.getCelularResponsavel());
	}
	
	
	
}
