package br.com.banco;
import br.com.negocio.*;
import java.util.Scanner;
public class TestandoBanco2 {
    
    public static void main(String[] args) {
        
        int entradaMenu = 0;
        int numConta=0;
        float numSaque=0;
        System.out.println("\n   *** Bem vindo ao Banco SI ***\n");
        Scanner entrada = new Scanner(System.in); 
        System.out.println("====================================");
        System.out.println("SI SI SI SI SI SI SI SI SI SI SI SI");
        System.out.println("====================================\n");
        System.out.println("Qual operação deseja efetuar?\n");
        System.out.println("1 - Cadastrar Nova Conta\n2 - Consultar Conta\n3 - "
            + "Depositar na Conta\n4 - Sacar da Conta\n5 - Listar Contas "
            + "e Saldos\n6 - Sair\n");
        System.out.print("Digite um número conforme o menu: "); 
        entradaMenu = entrada.nextInt();
        System.out.println("------------------------------------\n");
        //vetor com 3 tipos de contas setadas e seus atributos básicos  
        Conta[] minhasContas = new Conta[3];
        minhasContas[0] = new ContaCorrente();
        minhasContas[1] = new ContaPoupanca();
        minhasContas[2] = new ContaEspecial();
        
        minhasContas[0].setNumeroAgencia(99);
        minhasContas[0].setNumeroConta(2003);
        minhasContas[0].setSaldo(200);
        
        minhasContas[1].setNumeroAgencia(99);
        minhasContas[1].setNumeroConta(2004);
        minhasContas[1].setSaldo(300);
        
        minhasContas[2].setNumeroAgencia(99);
        minhasContas[2].setNumeroConta(2005);
        minhasContas[2].setSaldo(400);
        
            switch (entradaMenu){
                case  1:NovaConta nova = new NovaConta();
                        nova.criar();
                break;
                case 2: //consulta os dados da conta, busca o metodo toString do tipo de conta instanciada
                    System.out.println("Informe o numero da conta");
                    numConta = entrada.nextInt();
                    for (Conta minhasConta : minhasContas) {
                        if (numConta == minhasConta.getNumeroConta()) {
                            System.out.println(minhasConta.toString());
                        }                
                    }
                break;
                case 3:// realiza o deposito na conta passada
                    System.out.println("Informe o numero da conta");
                    numConta = entrada.nextInt();                                    
                    for (Conta minhasConta : minhasContas) {
                        if (numConta == minhasConta.getNumeroConta()) {                           
                            minhasConta.depositar(minhasConta.getSaldo());
                            System.out.println(minhasConta.toString());
                        }                
                    }
                break;
                case 4://realiza o saque na conta se houver saldo
                    System.out.println("Informe o numero da conta");
                    numConta = entrada.nextInt();
                    System.out.println("Informe o valor do saque");
                    numSaque = entrada.nextFloat();
                    for (Conta minhasConta : minhasContas) {
                        if (numConta == minhasConta.getNumeroConta()) {                           
                            minhasConta.sacar(numSaque);
                            System.out.println(minhasConta.toString());
                        }                
                    }
                break;
                case 5://Listar Contas e saldos
                     System.out.println("Listando todas as Contas : ");
                     for (Conta minhasConta : minhasContas) {  
                        System.out.println(minhasConta.toString());                 
                    }
                break;
                case 6://sair da aplicação
                    System.out.println("Operações finalizadas.\n");
                    System.out.println("Sessão encerrada."); 
                break;
            }   
    }//fim main            
}//fim classe
