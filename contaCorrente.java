package contaCorrente;


public class contaCorrente {
	
	 
	private String Conta;
	 protected double saldo; 
	 private String nome;
	 
	 
	 public String getNome() {
		return nome;
	}

	public void menu() {
		System.out.println(" Sistema Bancário Unipaulistana ");
		System.out.println();
		System.out.println(" Selecione a sua operação :");
		System.out.println(" 1-Deposito");
		System.out.println(" 2-Saque");
		System.out.println(" 3-Saldo ");
		System.out.println(" 0-Sair do App ");
		System.out.println();
	}
	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getConta() {
		return Conta;
	}

	public void setConta(String Conta) {
		this.Conta = Conta;
	}
	
	public void Deposito(double d) 
	
	{
		
	
	 
	 this.saldo=(d+this.saldo);
	 
	 if ( d < 0) 
	 {
		 System.out.println(" valor invalido, digite um valor valido para continuar !");
	 }
	 else {
		 System.out.println(" Deposito realizado com sucesso !!");
		 System.out.println(" valor depositado : "+d);
	 }
	
	}
	
	public void verSaldo () 
	{
		System.out.println(" O seu saldo atual é :  ");
		System.out.println("R$ : "+this.saldo);
	}

	public void sacar( double t )
	{
		if (t>saldo) {
			System.out.println(" valor indisponivel para saque!");
		}
		else {
		System.out.println(" Saque sendo efetuado...  : ? ");
		this.saldo= this.saldo-t+t*0.0005;
		System.out.println(" valor sacado ="+t);
	}
		}
		
		
	
	public void sair () {
		
		System.out.println(" Obrigado por usar o sistema do Banco Unipaulista.");
		
	}
	
	
	
}

