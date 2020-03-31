package orientacaoObjeto;

import java.util.Scanner;

public class Main {

	private static Scanner input;

	public static void main(String[] args) {
		//criando um objeto
		//Conta minhaConta = new Conta();
		// minhaConta.setTitular("Luan");
		//String nome = minhaConta.getTitular();
		//System.out.printf("Conta do %s", nome);

		input = new Scanner(System.in);
		
		//Criar um objeto do tipo Conta
		Conta minhaConta = new Conta();
		System.out.printf("Nome do titular é: %s%n%n", minhaConta.getTitular());
		
		//Mensagem para inserção do nome do Titular do nome
		System.out.println("Por favor entre com seu nome");
		String nomeTitular = input.nextLine(); //Lê uma linha do console
		minhaConta.setTitular(nomeTitular);
		System.out.println();
		System.out.printf("Seja bem vindo: %n%s%n", minhaConta.getTitular());
	}

}
