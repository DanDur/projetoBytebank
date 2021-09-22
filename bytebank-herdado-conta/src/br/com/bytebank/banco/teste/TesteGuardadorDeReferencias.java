package br.com.bytebank.banco.teste;

import br.com.bytebank.banco.modelo.Conta;
import br.com.bytebank.banco.modelo.ContaCorrente;

public class TesteGuardadorDeReferencias {

	public static void main(String[] args) {
		
		TesteGuardadorDeReferencias guardador = new TesteGuardadorDeReferencias();
		
		Conta cc = new ContaCorrente(22,11);
		guardador.adiciona(cc);
		
		Conta cc2 = new ContaCorrente(22,22);
		guardador.adiciona(cc2);
		
		int tamanho = guardador.getQuantidadeDeElementos();
		System.out.println(tamanho);
		
		Conta ref = (Conta) guardador.getReferencia(1);//tem de fazer o cast
		System.out.println(ref.getNumero());
		

	}

}
