package br.com.bytebank.banco.teste;

import br.com.bytebank.banco.modelo.Conta;
import br.com.bytebank.banco.modelo.ContaCorrente;
import br.com.bytebank.banco.modelo.ContaPoupanca;

public class TesteArrayReferencias {

	public static void main(String[] args) {

		//int[] idades = new int[];
		Conta[] referencias = new Conta[5];
		
		
		ContaCorrente cc1 = new ContaCorrente(22,11);
		
		referencias[0] = cc1;

		ContaPoupanca cc2 = new ContaPoupanca (22,22);
		referencias[1] = cc2;
		
		//System.out.println(cc2.getNumero());
	
		System.out.println(referencias[1].getNumero());
		//vai de uma ref generica pra uma mais especifica
		ContaPoupanca ref = (ContaPoupanca) referencias[1];//type cast, fala pro compilador não fazer nada
		System.out.println(ref.getNumero());
		System.out.println(cc2.getNumero());
		
	}

}
