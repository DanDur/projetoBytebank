package br.com.bytebank.banco.teste;

public class TestString {

	public static void main(String[] args) {
		String vazio = "Alura";//se tiver um espaço o java já considera 

		System.out.println(vazio.contains("Alu"));
		
		
		
		//String vazio = "Alura";//se tiver um espaço o java já considera 
		//System.out.println(vazio.isEmpty());
		System.out.println(vazio.contains("Alu"));
//		String vazio = " ";
//		String outroVazio = vazio.trim();
//		System.out.println(outroVazio.isEmpty());
String nome = "Alura";//object literal, nome aqui é uma ref. que pode executar metodos
		//String outro = new String ("Alura"); não precisa de um new pra ser criado

		char c = nome.charAt(2);//o dois é posição, a contar do zero
		//System.out.println(c);
		//int pos = nome.indexOf("ur");
		//System.out.println(pos);
		
		System.out.println(nome.length());
		
		for (int i = 0; i<nome.length(); i++) {
			System.out.println(nome.charAt(i));
		}
		
		
//		String sub = nome.substring(1);		
//		System.out.println(sub);
//		char c = 'A';
//		char d = 'a';
//		String outra = nome.replace(c, d);
		
		//String outra = nome.replace("Al","aL");// usando o charSequence
		//String outra = nome.toUpperCase();
//		//nome.toLowerCase();
//		System.out.println(nome);
//		System.out.println(outra);
//		
		
	}

}
