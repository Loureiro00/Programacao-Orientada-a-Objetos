package contaCorrente;


public class ContaPremium extends contaCorrente {

@Override
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
}





