/*
Crie uma classe para implementar uma conta corrente. 
A classe deve possuir os seguintes atributos: 
número da conta, nome do correntista e saldo. 
Os métodos são os seguintes:
alterarNome, deposito e saque.
No construtor, saldo é opcional, com valor default zero e os demais atributos são obrigatórios.
 */
package conta_bancaria;
import java.util.Scanner;

/**
 *
 * @author Flávio
 */
public class Conta_Bancaria {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Conta_Corrente ret1 = new Conta_Corrente();           //instancia a class Conta.
        
        //Solicitar ao usuário as medidas do local.
        Scanner teclado = new Scanner(System.in);
        System.out.print("Digite o Número da Conta: ");
        int NumConta = teclado.nextInt();
        System.out.print("Digite o nome do cliente: \n");
        String NomeCliente = teclado.nextLine();
        
        //Retorna à class Retangulo para que os metodos sejam executados.
        ret1.setNumConta(NumConta);                     
        ret1.setNomeCliente(NomeCliente);
        
        //Exibe o resultado para o usuário
        System.out.println("O Correntista "+NomeCliente+" é titular da Conta Corrente: "+NumConta+" e possui em sua conta bancária o saldo de: R$ \n");   //... R$ "+Saldo+"\n");
        
        System.out.print("Digite o nome do novo titular da conta: ");
        String AlterarNome = teclado.nextLine();
        
        ret1.setAlterarNome(AlterarNome);
        
        System.out.println("O Correntista "+AlterarNome+" é o novo titular da Conta Corrente: "+NumConta+" e possui em sua conta bancária o saldo de: R$ \n");   //... R$ "+Saldo+"\n");
                                       
    }
}       