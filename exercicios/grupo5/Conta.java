package exercicios.grupo5;

public class Conta 
{

    private String cpf;
    private String nome;
    private double saldo;

    // dados da classe Conta
    public Conta(String cpf, String nome) {
        this.cpf = cpf;
        this.nome = nome;
        this.saldo = 0.0;
    }
    // metodo depositar
    public void depositar(double valor) {
        if (valor > 0) {
            saldo += valor;           
        }
    }

    // metodo sacar
    public boolean sacar(double valor) {
        if (valor > 0 && valor <= saldo) {
            saldo -= valor;
            return true;
        } 
        return false;        
    }

    public double getSaldo(){
        return saldo;
    }

    public String geCPF() {
        return cpf;
    }

    public String getNome() {
        return nome;
    }
}
