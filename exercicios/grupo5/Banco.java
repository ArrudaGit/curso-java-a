package exercicios.grupo5;
import java.util.ArrayList;

// import java.util.ArrayList;


public class Banco {
    // Lista para armazenar as contas
    private ArrayList<Conta> contas;

    // construtor da lista de contas
    public Banco() {
        contas = new ArrayList<>();
    }
    
    // Método para cadastrar uma nova conta com cpf e nome
    public void CadastrarConta(String cpf, String nome) {
        Conta novaConta = new Conta(cpf, nome);
        contas.add(novaConta); // adiciona a nova conta
    }

    // Método de busca da conta pelo CPF
    public Conta buscarConta(String cpf) {
        for (Conta conta : contas) {
            if (conta.geCPF().equals(cpf)) { //verifica se o CPF bate
                return conta; 
            }
        }
        return null; // caso nao encontre a conta.
    }

    // Método para listar todas as contas, mostrando os detalhes da conta
    public void listarContas() {
        for (Conta conta : contas) {
            System.out.println("Nome: " + conta.getNome() + 
                                ", CPF: " + conta.geCPF()+ 
                                ", Saldo: " + conta.getSaldo());
        }
    }
}