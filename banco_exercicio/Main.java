package banco_exercicio;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		int numero;
		String nome;
		char condicao;
		double deposito, saque;
		Conta conta;
		
		System.out.println("Digite o número da conta: ");
		numero = input.nextInt();
		input.nextLine();
		System.out.println("Digite o nome completo do titular: ");
		nome = input.nextLine();
		System.out.println("Haverá um deposito inicial? (S/N) ");
		condicao = input.next().toUpperCase().charAt(0);
		
		while(condicao != 'S' && condicao != 'N'){
			System.out.println("Por favor digite apenas S ou N ");
			condicao = input.next().toUpperCase().charAt(0);
		} 
		
		if(condicao == 'S') {
			System.out.println("Deposito inicial: ");
			deposito = input.nextDouble();
			conta = new Conta(numero, nome, deposito);
		}
		else {
			conta = new Conta(numero, nome);
		}
		System.out.println(conta);
		
		System.out.println("Digite o valor do depósito: ");
		deposito = input.nextDouble();
		conta.depositar(deposito);
		System.out.println(conta);
		
		System.out.println("Digite o valor do saque: ");
		saque = input.nextDouble();
		conta.sacar(saque);
		System.out.println(conta);
		
		input.close();
	}

}
