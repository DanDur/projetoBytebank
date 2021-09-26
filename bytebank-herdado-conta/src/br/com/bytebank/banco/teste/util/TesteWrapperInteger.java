package br.com.bytebank.banco.teste.util;

import java.util.ArrayList;
import java.util.List;

public class TesteWrapperInteger {
	
	public static void main(String[] args) {
		
		int[] idades = new int[5];//exemplos
		String[] nomes = new String[5];//exemplos
		
		//Listas so aceitam referencias
		
		int idade = 29;//Interger
		
		Integer idadeRef = Integer.valueOf(29);//autoboxing
		int valor = idadeRef.intValue();//unboxing
		
		System.out.println(idadeRef.doubleValue());
		
		System.out.println(Integer.SIZE);
		System.out.println(Integer.BYTES);
		
		String s = args[0];//10
		
		//Integer numero = Integer.valueOf(s);
		int numero = Integer.parseInt(s);
		System.out.println(numero);
		
		List<Integer> numeros = new ArrayList<Integer>();
		numeros.add(29); //Autoboxing, muda de primitivo pra objeto, add um primitivo a uma lista de ref.
		
	}

}
