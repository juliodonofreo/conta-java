package banco_exercicio;

public class Conta {
	
	private static final double TAXA = 5.0;
	
	private int numero;
	private String nome;
	private double saldo;
	
	public Conta(int numero, String nome,  double depositoInicial) {
		this.numero = numero;
		this.nome = nome;
		depositar(depositoInicial);
	}

	public Conta(int numero, String nome) {
		this.numero = numero;
		this.nome = nome;
	}
	
	public int getNumero() {
		return this.numero;
	}
	
	public String getNome() {
		return this.nome;
	}
	
	public void setNome(String nome) {
		this.nome = nome;
	}

	public double getSaldo() {
		return saldo;
	}
	
	public void depositar(double deposito) {
		this.saldo += deposito;
	}
	
	public void sacar(double saque) {
		saque += TAXA;
		this.saldo -= saque;
	}
	
	public String toString() {
		return String.format("Nome do titular: %s \nNúmero da conta: %d \nSaldo: R$%.2f", this.nome, this.numero, this.saldo);
	}
	
}
