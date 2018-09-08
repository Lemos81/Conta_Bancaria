/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package conta_bancaria;

/**
 *
 * @author Flávio
 */
public class Conta_Corrente {
    
    //Atributos 
    private int NumConta;
    private String NomeCliente;
    private double Saldo=0;
    private double Saques;
    
    //Métodos
    public void setNumConta(int NumConta) {
        this.NumConta = NumConta;
    }
    public void setNomeCliente(String NomeCliente) {
        this.NomeCliente = NomeCliente;
    }
    public void setSaldo(double Saldo) {
        this.Saldo = Saldo;
    }

    public void Deposito(double Valor){                 //No método Deposito, apenas acrescenta o valor ao Saldo.
        Saldo += Valor;                                 //retorna o valor depositado e o saldo atual.
        System.out.println("Depositado: " + Valor);
        System.out.println("Novo saldo: " + Saldo + "\n");
    }
        
    public void Sacar(double valor){                    //criei o método Sacar para verificar se possui saldo suficiente na conta.
        if(Saldo >= valor){                             //caso possua, efetua o saque e subtrai o valor do saldo.
            Saldo -= valor;
            Saques++;
            System.out.println("Sacado: " + valor);
            System.out.println("Novo saldo: " + Saldo + "\n");
        } else {
            System.out.println("Saldo insuficiente. Faça um depósito\n");
        }
    }
        
    public void setAlterarNome(String AlterarNome){                       //Neste método, terá a opção de alterar o nome do cliente.
        if (AlterarNome!= NomeCliente){
            this.NomeCliente = AlterarNome;                            //retorna o novo nome.
        }else{
            System.out.println("Digite um nome diferente do cadastrado: ");
        }
    }
}