package contaCorrente;

public class Poupança  extends contaCorrente{

	@Override
	public void sacar( double t )
	{
		if (t>saldo) {
			System.out.println(" valor indisponivel para saque!");
		}
		else {
		System.out.println(" Saque sendo efetuado...  : ? ");
		this.saldo= t;
		System.out.println(" valor sacado ="+t);
	    }
	 }
	}


