package contaCorrente;

import java.util.Scanner;

public class Teste {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner ler = new Scanner(System.in);
		ContaPremium  CP = new ContaPremium();
        int opcao=0;
       
		do {
			CP.menu();
			opcao = ler.nextInt();
        switch(opcao) {
			
        case 1:
        	System.out.println(" Digite o Valor a ser depositado : ");
        	CP.Deposito(ler.nextDouble());
        	break;
			}
			
			
		}while(opcao!=0);
		
	
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
